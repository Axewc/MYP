import javax.swing.*;
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
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Nombre Pokemon:");
        userLabel.setBounds(10, 20, 120, 25);
        panel.add(userLabel);

        JTextField pokemonNameText = new JTextField(20);
        pokemonNameText.setBounds(150, 20, 165, 25);
        panel.add(pokemonNameText);

        JButton searchButton = new JButton("Buscar");
        searchButton.setBounds(10, 80, 150, 25);
        panel.add(searchButton);

        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(10, 110, 350, 150);
        panel.add(resultArea);

        ActionListener searchAction = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pokemonName = pokemonNameText.getText();
                try {
                    String jsonResponse = PokeApiController.getPokemonData(pokemonName);
                    JsonObject jsonObject = JsonParser.parseString(jsonResponse).getAsJsonObject();
                    resultArea.setText(
                        "Nombre: " + jsonObject.get("name").getAsString() + "\n" +
                        "Altura: " + jsonObject.get("height").getAsInt() + "\n" +
                        "Peso: " + jsonObject.get("weight").getAsInt() + "\n" +
                        "Tipo: " + jsonObject.getAsJsonArray("types").get(0).getAsJsonObject().getAsJsonObject("type").get("name").getAsString() + "\n" +
                        "Habilidad: " + jsonObject.getAsJsonArray("abilities").get(0).getAsJsonObject().getAsJsonObject("ability").get("name").getAsString() + "\n" +
                        "Movimientos aprendidos subiendo de nivel: " + "\n" +
                        PokeApiClient.getLevelUpMoves(jsonObject.getAsJsonArray("moves"))
                    );
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
    }
}