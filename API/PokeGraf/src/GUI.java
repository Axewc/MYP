import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonArray;

public class GUI {

    /**
     * Método principal que crea la ventana de la interfaz gráfica
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // Establecer el look and feel del sistema
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Pokemon Info");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }


    /**
     * Método que coloca los componentes en el panel
     * @param panel Panel en el que se colocarán los componentes
     */
    private static void placeComponents(JPanel panel) {

        // Crear un GroupLayout para el panel
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Crear los componentes
        JLabel userLabel = new JLabel("Nombre Pokemon:");
        userLabel.setFont(new Font("Arial", Font.BOLD, 14));
        JTextField pokemonNameText = new JTextField(20);
        pokemonNameText.setFont(new Font("Arial", Font.PLAIN, 14));

        // Crear un JComboBox para seleccionar la versión del juego
        JLabel versionLabel = new JLabel("Versión del Juego:");
        versionLabel.setFont(new Font("Arial", Font.BOLD, 14));
        JComboBox<String> versionComboBox = new JComboBox<>();
        versionComboBox.setFont(new Font("Arial", Font.PLAIN, 14));

        // Crear un botón para realizar la búsqueda
        JButton searchButton = new JButton("Buscar");
        searchButton.setFont(new Font("Arial", Font.BOLD, 14));
        searchButton.setBackground(Color.LIGHT_GRAY);
        searchButton.setOpaque(true);
        searchButton.setBorderPainted(false);

        // Crear un JTextArea para mostrar los resultados
        JTextArea resultArea = new JTextArea();
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);
        resultArea.setEditable(false);
        resultArea.setFont(new Font("Arial", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(resultArea);

        // Llenar el JComboBox con las versiones del juego obtenidas de la API
        try {
            String[] versions = PokeApiController.getGameVersions();
            for (String version : versions) {
                versionComboBox.addItem(version);
            }
            // Añadir manualmente las versiones "scarlet" y "violet"
            versionComboBox.addItem("scarlet-violet");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Acción que se ejecuta al presionar el botón de búsqueda
        ActionListener searchAction = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pokemonName = pokemonNameText.getText();
                String version = versionComboBox.getSelectedItem().toString().toLowerCase().trim();
                try {
                    JsonObject jsonObject = PokeApiController.getPokemonData(pokemonName);
                    String type = jsonObject.getAsJsonArray("types").get(0).getAsJsonObject().getAsJsonObject("type").get("name").getAsString().toLowerCase().trim();
                    System.out.println("Tipo del Pokémon: " + type); // Impresión de depuración

                    // Obtener las estadísticas base
                    JsonArray statsArray = jsonObject.getAsJsonArray("stats");
                    StringBuilder stats = new StringBuilder();
                    for (int i = 0; i < statsArray.size(); i++) {
                        JsonObject statObject = statsArray.get(i).getAsJsonObject();
                        String statName = statObject.getAsJsonObject("stat").get("name").getAsString();
                        int baseStat = statObject.get("base_stat").getAsInt();
                        stats.append(statName).append(": ").append(baseStat).append("\n");
                    }

                    resultArea.setText(
                        "Nombre: " + jsonObject.get("name").getAsString() + "\n" +
                        "Altura: " + jsonObject.get("height").getAsInt() + "\n" +
                        "Peso: " + jsonObject.get("weight").getAsInt() + "\n" +
                        "Tipo: " + type + "\n" +
                        "Habilidad: " + jsonObject.getAsJsonArray("abilities").get(0).getAsJsonObject().getAsJsonObject("ability").get("name").getAsString() + "\n" +
                        "Estadísticas base: \n" + stats.toString() +
                        "Movimientos aprendidos subiendo de nivel: " + "\n" +
                        PokeApiClient.getLevelUpMoves(jsonObject.getAsJsonArray("moves"), version)
                    );

                    // Cambiar el color del botón según el tipo del Pokémon
                    switch (type) {
                        case "fire":
                            searchButton.setBackground(Color.RED);
                            break;
                        case "water":
                            searchButton.setBackground(Color.BLUE);
                            break;
                        case "grass":
                            searchButton.setBackground(Color.GREEN);
                            break;
                        case "electric":
                            searchButton.setBackground(Color.YELLOW);
                            break;
                        case "ground":
                            searchButton.setBackground(Color.LIGHT_GRAY);
                            break;
                        case "flying":
                            searchButton.setBackground(Color.PINK);
                            break;
                        case "psychic":
                            searchButton.setBackground(Color.DARK_GRAY);
                            break;
                        case "bug":
                            searchButton.setBackground(Color.GREEN.darker());
                            break;
                        case "rock":
                            searchButton.setBackground(Color.GRAY);
                            break;
                        case "ghost":
                            searchButton.setBackground(Color.BLACK);
                            break;
                        case "dragon":
                            searchButton.setBackground(Color.MAGENTA.darker());
                            break;
                        case "dark":
                            searchButton.setBackground(Color.BLACK);
                            break;
                        case "steel":
                            searchButton.setBackground(Color.GRAY);
                            break;
                        case "fairy":
                            searchButton.setBackground(Color.PINK);
                            break;
                        default:
                            searchButton.setBackground(null);
                            break;
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        };

        // Asignar la acción al botón de búsqueda
        searchButton.addActionListener(searchAction);

        // Permitir buscar al presionar la tecla Enter
        pokemonNameText.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    searchButton.doClick();
                }
            }
        });

        // Responsivo para el eje X
        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(userLabel)
                    .addComponent(versionLabel)
                    .addComponent(searchButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(pokemonNameText)
                    .addComponent(versionComboBox)
                    .addComponent(scrollPane))
        );

        // Responsivo para el eje Y
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel)
                    .addComponent(pokemonNameText))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(versionLabel)
                    .addComponent(versionComboBox))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(scrollPane))
        );
    }
}