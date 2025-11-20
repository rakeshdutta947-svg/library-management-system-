import javax.swing.*;

public class SearchBookGUI extends JFrame {

    public SearchBookGUI(Library library) {
        setTitle("Search Book");
        setSize(300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel idLbl = new JLabel("Book ID:");
        JTextField idField = new JTextField();
        JButton searchBtn = new JButton("Search");

        idLbl.setBounds(20, 20, 80, 25);
        idField.setBounds(100, 20, 150, 25);
        searchBtn.setBounds(100, 60, 100, 30);

        add(idLbl);
        add(idField);
        add(searchBtn);

        searchBtn.addActionListener(e -> {
            try {
                int id = Integer.parseInt(idField.getText());
                Book b = library.searchBook(id);

                if (b == null)
                    JOptionPane.showMessageDialog(null, "Book Not Found!");
                else
                    JOptionPane.showMessageDialog(null, b.toString());

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Invalid Input!");
            }
        });

        setVisible(true);
    }
}

