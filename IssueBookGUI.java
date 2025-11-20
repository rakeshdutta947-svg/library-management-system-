import javax.swing.*;

public class IssueBookGUI extends JFrame {

    public IssueBookGUI(Library library) {
        setTitle("Issue Book");
        setSize(300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel idLbl = new JLabel("Book ID:");
        JTextField idField = new JTextField();
        JButton issueBtn = new JButton("Issue");

        idLbl.setBounds(20, 20, 80, 25);
        idField.setBounds(100, 20, 150, 25);
        issueBtn.setBounds(100, 60, 100, 30);

        add(idLbl);
        add(idField);
        add(issueBtn);

        issueBtn.addActionListener(e -> {
            int id = Integer.parseInt(idField.getText());
            boolean result = library.issueBook(id);

            if (result)
                JOptionPane.showMessageDialog(null, "Book Issued!");
            else
                JOptionPane.showMessageDialog(null, "Cannot issue book!");

            dispose();
        });

        setVisible(true);
    }
}
