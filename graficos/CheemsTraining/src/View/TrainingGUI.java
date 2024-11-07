package View;

import Controller.TrainingController;
import Model.Routine;
import Model.StrengthRoutine;
import Observer.GoalNotifier;
import Observer.Coach;
import Strategy.EnduranceTraining;
import Strategy.SpeedTraining;
import Strategy.StrengthTraining;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase que representa la interfaz gráfica de usuario de la aplicación.
 */
public class TrainingGUI extends JFrame {
    private JTextField athleteNameField;
    private JComboBox<String> trainingTypeComboBox;
    private JTextArea logArea;

    private TrainingController controller;
    private GoalNotifier notifier;

    /**
     * Constructor de la clase TrainingGUI.
     * 
     * @param controller Controlador de entrenamientos.
     * @param notifier Notificador de objetivos.
     */
    public TrainingGUI(TrainingController controller, GoalNotifier notifier) {
        this.controller = controller;
        this.notifier = notifier;

        setTitle("Gestión de Entrenamientos Deportivos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        JLabel nameLabel = new JLabel("Atleta:");
        athleteNameField = new JTextField(10);

        JLabel trainingTypeLabel = new JLabel("Tipo de Entrenamiento:");
        String[] trainingTypes = { "Fuerza", "Resistencia", "Velocidad" };
        trainingTypeComboBox = new JComboBox<>(trainingTypes);

        JButton startButton = new JButton("Iniciar Entrenamiento");
        startButton.addActionListener(new StartTrainingListener());

        inputPanel.add(nameLabel);
        inputPanel.add(athleteNameField);
        inputPanel.add(trainingTypeLabel);
        inputPanel.add(trainingTypeComboBox);
        inputPanel.add(startButton);

        add(inputPanel, BorderLayout.NORTH);

        logArea = new JTextArea();
        logArea.setEditable(false);
        add(new JScrollPane(logArea), BorderLayout.CENTER);
    }
    /**
     * Clase que representa un escuchador de eventos de inicio de entrenamiento.    
     */
    private class StartTrainingListener implements ActionListener {
        
        /**
         * Método que se ejecuta cuando se produce un evento de inicio de entrenamiento.
         * 
         * @param e Evento de inicio de entrenamiento.
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            String athleteName = athleteNameField.getText();
            if (!athleteName.isEmpty()) {
                Routine routine = new StrengthRoutine(athleteName);
                controller.setRoutine(routine);

                String trainingType = (String) trainingTypeComboBox.getSelectedItem();
                switch (trainingType) {
                    case "Fuerza" -> controller.setTrainingStrategy(new StrengthTraining());
                    case "Resistencia" -> controller.setTrainingStrategy(new EnduranceTraining());
                    case "Velocidad" -> controller.setTrainingStrategy(new SpeedTraining());
                }

                controller.startTraining();
                logArea.append("Entrenamiento iniciado para " + athleteName + " en modalidad " + trainingType + ".\n");
            }
        }
    }

    public static void main(String[] args) {
        GoalNotifier notifier = new GoalNotifier();
        TrainingController controller = new TrainingController(notifier);
        TrainingGUI gui = new TrainingGUI(controller, notifier);

        notifier.addObserver(new Coach("Carlos"));

        SwingUtilities.invokeLater(() -> gui.setVisible(true));
    }
}
