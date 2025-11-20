import java.util.Scanner;

public class Main {

    static Library library = new Library();

    public static void main(String[] args) {
        new LibraryManagementSystemGUI(); 
    }

    public static void showConsoleMenu() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Library Management ---");
            System.out.println("1. Add Book");
            System.out.println("2. Show Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("ID: "); int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Title: "); String title = sc.nextLine();
                    System.out.print("Author: "); String author = sc.nextLine();

                    library.addBook(new Book(id, title, author));
                    break;

                case 2:
                    library.showBooks();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    Book b = library.searchBook(sc.nextInt());
                    System.out.println(b == null ? "Not found" : b);
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    library.issueBook(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter ID: ");
                    library.returnBook(sc.nextInt());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
