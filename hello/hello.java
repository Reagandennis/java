import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
// to-do list complete

public class hello extends JFrame {
    private ArrayList<String> itemList;
    private DefaultListModel<String> listModel;
    private JList<String> jList;

    public hello() {
        itemList = new ArrayList<>();
        listModel = new DefaultListModel<>();
        jList = new JList<>(listModel);

        initializeUI();
    }

    private void initializeUI() {
        setTitle("List GUI Example");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        panel.add(new JScrollPane(jList), BorderLayout.CENTER);

        JButton addButton = new JButton("Add Item");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newItem = JOptionPane.showInputDialog(hello.this, "Enter item to add:");
                if (newItem != null && !newItem.isEmpty()) {
                    itemList.add(newItem);
                    listModel.addElement(newItem);
                }
            }
        });

        JButton removeButton = new JButton("Remove Item");
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = jList.getSelectedIndex();
                if (selectedIndex != -1) {
                    itemList.remove(selectedIndex);
                    listModel.removeElementAt(selectedIndex);
                }
            }
        });

        JButton updateButton = new JButton("Update Item");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = jList.getSelectedIndex();
                if (selectedIndex != -1) {
                    String updatedItem = JOptionPane.showInputDialog(hello.this, "Enter updated item:");
                    if (updatedItem != null && !updatedItem.isEmpty()) {
                        itemList.set(selectedIndex, updatedItem);
                        listModel.setElementAt(updatedItem, selectedIndex);
                    }
                }
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        buttonPanel.add(updateButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                hello example = new hello();
                example.setVisible(true);
            }
        });
    }
}
