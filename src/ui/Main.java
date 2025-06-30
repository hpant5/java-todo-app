package ui;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Set look and feel to system default
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Warning: Failed to set Look and Feel.");
        }

        // Create and show the UI on Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            new TodoAppFrame().setVisible(true);
        });
    }
}
