package lesson9.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ExpenseTrackerApp extends JFrame {

    private JTextField expenseField;
    private JList expenseList;
    private DefaultListModel listModel;

    @SuppressWarnings("unchecked")
    public ExpenseTrackerApp() {
        // important
        setTitle("Expense Tracker");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();

        // textField
        JPanel inputJPanel = new JPanel();
        JLabel expenseLabel = new JLabel("Expense: ");
        expenseField = new JTextField(20);

        // button
        listModel = new DefaultListModel<>();
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new addButtonListener());

        inputJPanel.add(expenseLabel);
        inputJPanel.add(expenseField);
        inputJPanel.add(addButton);

        // scroll list
        expenseList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(expenseList);

        // delete button
        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new DeleteButtonListener());

        // last part
        panel.add(inputJPanel);
        panel.add(scrollPane);
        panel.add(deleteButton);
        add(panel);
    }

    @SuppressWarnings("unchecked")
    private class addButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String expense = expenseField.getText().trim();
            if (!expense.isEmpty()) {
                listModel.addElement(expense);
                expenseField.setText("");
            }
        }
    }

    private class DeleteButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int selectIndex = expenseList.getSelectedIndex();
            if (selectIndex != -1) {
                listModel.remove(selectIndex);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ExpenseTrackerApp app = new ExpenseTrackerApp();
            app.setVisible(true);
        });
    }
}
