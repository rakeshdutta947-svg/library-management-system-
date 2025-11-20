import javax.swing.*;
import java.awt.*;

public class LibraryManagementSystemGUI extends JFrame {

    public LibraryManagementSystemGUI() {
        setTitle("Library Management System");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 1, 10, 10));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton addBookBtn = new JButton("Add Book");
        JButton searchBookBtn = new JButton("Search Book");
        JButton issueBookBtn = new JButton("Issue Book");
        JButton returnBookBtn = new JButton("Return Book");
        JButton bookListBtn = new JButton("View Book List");
        JButton exitBtn = new JButton("Exit");

        add(addBookBtn);
        add(searchBookBtn);
        add(issueBookBtn);
        add(returnBookBtn);
        add(bookListBtn);
        add(exitBtn);

        addBookBtn.addActionListener(e -> new AddBookGUI(Main.library));
        searchBookBtn.addActionListener(e -> new SearchBookGUI(Main.library));
        issueBookBtn.addActionListener(e -> new IssueBookGUI(Main.library));
        returnBookBtn.addActionListener(e -> new ReturnBookGUI(Main.library));
        bookListBtn.addActionListener(e -> new BookListGUI(Main.library));
        exitBtn.addActionListener(e -> System.exit(0));

        setVisible(true);
    }
}
