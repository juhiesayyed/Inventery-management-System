
package PACK;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class CLASS3 {

    public static void main(String[] args) {
        new CLASS3();
    }

    public CLASS3() {
        EventQueue.invokeLater(new Runnable() {//eve
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

                JFrame frame = new JFrame("Search iteam");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(new TestPane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setSize(800,700);
            }
        });
    }

    public class TestPane extends JPanel {

        private JTextField findText;
        private JButton search,back;
        private DefaultListModel<String> model;

        public TestPane() {
            setLayout(new BorderLayout());
            JPanel searchPane = new JPanel(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.insets = new Insets(2, 2, 2, 2);
            searchPane.add(new JLabel("Find: "), gbc);
            gbc.gridx++;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.weightx = 2;
            findText = new JTextField(30);
            searchPane.add(findText, gbc);
            //tyuguh
            searchPane.setBackground(Color.red);

            gbc.gridx++;
            gbc.fill = GridBagConstraints.NONE;
            gbc.weightx = 0;
            search = new JButton("Search");
            searchPane.add(search, gbc);
            
            gbc.gridx++;
            gbc.fill = GridBagConstraints.NONE;
            gbc.weightx = 0;
           // search = new JButton("Search");
            back = new JButton("Back");
            searchPane.add(back,gbc);

            add(searchPane, BorderLayout.NORTH);

            model = new DefaultListModel<>();
            JList list = new JList(model);
            add(new JScrollPane(list));

            ActionHandler handler = new ActionHandler();

            search.addActionListener(handler);
            findText.addActionListener(handler);
            back.addActionListener(handler);
        }

        public class ActionHandler implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==search)
                { model.removeAllElements();
//                    BufferedReader reader = null;

                String searchText = findText.getText();
                try (BufferedReader reader = new BufferedReader(new FileReader(new File("inventory.txt")))) {

                    String text = null;
                    while ((text = reader.readLine()) != null) {

                        if (text.contains(searchText)) {

                            model.addElement(text);

                        }

                    }

                } catch (IOException exp) {

                    exp.printStackTrace();
                    JOptionPane.showMessageDialog(TestPane.this, "Could not finds items ", "Error", JOptionPane.ERROR_MESSAGE);

                }}
                else
                {
                  
                   X s=new X();
                   
                }
            }

        }
    }
}