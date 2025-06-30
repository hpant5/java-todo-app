package ui;

import java.awt.*;
import javax.swing.*;

public class TodoAppFrame extends JFrame {

    private JTextField taskInput;
    private JButton addButton;
    private DefaultListModel<String> taskListModel;
    private JList<String> taskList;

    public TodoAppFrame() {
        setTitle("📝 Java To-Do App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null); // Center the window

        // Main panel layout
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Top panel with input + button
        JPanel topPanel = new JPanel(new BorderLayout(5, 5));
        taskInput = new JTextField();
        addButton = new JButton("Add Task");

        topPanel.add(taskInput, BorderLayout.CENTER);
        topPanel.add(addButton, BorderLayout.EAST);

        // Task list in the center
        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);
        JScrollPane scrollPane = new JScrollPane(taskList);

        // Add dummy task for now
        taskListModel.addElement("✅ Sample Task: Set up project");

        // Add panels to main panel
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        add(mainPanel);
    }
}
