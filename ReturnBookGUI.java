import javax.swing.*;

public class ReturnBookGUI extends JFrame {

    public ReturnBookGUI(Library library) {
        setTitle("Return Book");
        setSize(300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel idLbl = new JLabel("Book ID:");
        JTextField idField = new JTextField();
        JButton returnBtn = new JButton("Return");

        idLbl.setBounds(20, 20, 80, 25);
        idField.setBounds(100, 20, 150, 25);
        returnBtn.setBounds(100, 60, 100, 30);

        add(idLbl);
        add(idField);
        add(returnBtn);

        returnBtn.addActionListener(e -> {
            int id = Integer.parseInt(idField.getText());
            boolean result = library.returnBook(id);

            if (result)
                JOptionPane.showMessageDialog(null, "Book Returned!");
            else
                JOptionPane.showMessageDialog(null, "Book not issued!");

            dispose();
        });

        setVisible(true);
    }
}
