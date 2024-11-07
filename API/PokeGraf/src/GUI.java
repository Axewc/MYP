import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pokemon Info");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        JLabel userLabel = new JLabel("Nombre Pokemon:");
        JTextField pokemonNameText = new JTextField(20);
        JButton searchButton = new JButton("Buscar");
        JTextArea resultArea = new JTextArea();
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        ActionListener searchAction = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pokemonName = pokemonNameText.getText();
                try {
                    JsonObject jsonObject = PokeApiController.getPokemonData(pokemonName);
                    String type = jsonObject.getAsJsonArray("types").get(0).getAsJsonObject().getAsJsonObject("type").get("name").getAsString().toLowerCase().trim();
                    System.out.println("Tipo del Pokémon: " + type); // Impresión de depuración
                    resultArea.setText(
                        "Nombre: " + jsonObject.get("name").getAsString() + "\n" +
                        "Altura: " + jsonObject.get("height").getAsInt() + "\n" +
                        "Peso: " + jsonObject.get("weight").getAsInt() + "\n" +
                        "Tipo: " + type + "\n" +
                        "Habilidad: " + jsonObject.getAsJsonArray("abilities").get(0).getAsJsonObject().getAsJsonObject("ability").get("name").getAsString() + "\n" +
                        "Movimientos aprendidos subiendo de nivel: " + "\n" +
                        PokeApiClient.getLevelUpMoves(jsonObject.getAsJsonArray("moves"))
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
                        case "ice":
                            searchButton.setBackground(Color.CYAN);
                            break;
                        case "fighting":
                            searchButton.setBackground(Color.ORANGE);
                            break;
                        case "poison":
                            searchButton.setBackground(Color.MAGENTA);
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

        searchButton.addActionListener(searchAction);

        pokemonNameText.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    searchButton.doClick();
                }
            }
        });

        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(userLabel)
                    .addComponent(searchButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(pokemonNameText)
                    .addComponent(scrollPane))
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel)
                    .addComponent(pokemonNameText))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(scrollPane))
        );
    }
}