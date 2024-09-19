import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getters and Setters

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }
}

class Librarian {
    private String name;
    private String phoneNo;
    private List<Transaction> transactions;

    public Librarian(String name, String phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.transactions = new ArrayList<>();
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }
}

class Transaction {
    private Book book;
    private Librarian librarian;
    private Date date;

    public Transaction(Book book, Librarian librarian, Date date) {
        this.book = book;
        this.librarian = librarian;
        this.date = date;
    }

    // Getters

    public Book getBook() {
        return book;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public Date getDate() {
        return date;
    }
}

public class librarySystem {
    private List<Book> books;
    private List<Librarian> librarians;
    private List<Transaction> transactions;

    public librarySystem() {
        this.books = new ArrayList<>();
        this.librarians = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    // Methods to add books and librarians

    public void addBook(Book book) {
        books.add(book);
    }

    public void addLibrarian(Librarian librarian) {
        librarians.add(librarian);
    }

    // Methods to handle transactions

    public void checkOutBook(Book book, Librarian librarian, Date date) {
        if (books.contains(book) && librarians.contains(librarian)) {
            Transaction transaction = new Transaction(book, librarian, date);
            transactions.add(transaction);
            librarian.addTransaction(transaction);
            System.out.println("Book checked out successfully.");
        } else {
            System.out.println("Book or librarian not found.");
        }
    }

    public void returnBook(Book book, Librarian librarian, Date date) {
        if (books.contains(book) && librarians.contains(librarian)) {
            Transaction transaction = new Transaction(book, librarian, date);
            transactions.add(transaction);
            librarian.addTransaction(transaction);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book or librarian not found.");
        }
    }

    public static void main(String[] args) {
        librarySystem librarySystem = new librarySystem();

        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", "978-0-316-76948-0");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");

        librarySystem.addBook(book1);
        librarySystem.addBook(book2);

        Librarian librarian = new Librarian("John Doe", "123-456-7890");
        librarySystem.addLibrarian(librarian);

        Date currentDate = new Date();

        librarySystem.checkOutBook(book1, librarian, currentDate);
        librarySystem.returnBook(book2, librarian, currentDate);

        // Print transaction history for the librarian
        for (Transaction transaction : librarian.getTransactions()) {
            System.out.println("Transaction: Book - " + transaction.getBook().getTitle()
                    + ", Librarian - " + transaction.getLibrarian().getName()
                    + ", Date - " + transaction.getDate());
        }
    }
}

