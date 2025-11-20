import javax.swing.*;

public class AddBookGUI extends JFrame {

    public AddBookGUI(Library library) {
        setTitle("Add Book");
        setSize(300, 250);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel idLbl = new JLabel("ID:");
        JLabel titleLbl = new JLabel("Title:");
        JLabel authorLbl = new JLabel("Author:");

        JTextField idField = new JTextField();
        JTextField titleField = new JTextField();
        JTextField authorField = new JTextField();

        JButton addBtn = new JButton("Add");

        idLbl.setBounds(20, 20, 80, 25);
        titleLbl.setBounds(20, 60, 80, 25);
        authorLbl.setBounds(20, 100, 80, 25);

        idField.setBounds(100, 20, 150, 25);
        titleField.setBounds(100, 60, 150, 25);
        authorField.setBounds(100, 100, 150, 25);

        addBtn.setBounds(100, 150, 100, 30);

        add(idLbl);
        add(titleLbl);
        add(authorLbl);
        add(idField);
        add(titleField);
        add(authorField);
        add(addBtn);

        addBtn.addActionListener(e -> {
            try {
                int id = Integer.parseInt(idField.getText());
                String title = titleField.getText();
                String author = authorField.getText();

                library.addBook(new Book(id, title, author));
                JOptionPane.showMessageDialog(null, "Book Added Successfully!");
                dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Invalid Input!");
            }
        });

        setVisible(true);
    }
}
