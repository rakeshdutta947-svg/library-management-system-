import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class BookListGUI extends JFrame {

    public BookListGUI(Library library) {
        setTitle("Book List");
        setSize(500, 300);
        setLocationRelativeTo(null);

        String[] columns = {"ID", "Title", "Author", "Status"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        for (Book b : library.getBooks()) {
            Object[] row = {
                    b.getId(),
                    b.getTitle(),
                    b.getAuthor(),
                    b.isIssued() ? "Issued" : "Available"
            };
            model.addRow(row);
        }

        JTable table = new JTable(model);
        JScrollPane scroll = new JScrollPane(table);

        add(scroll);
        setVisible(true);
    }
}
