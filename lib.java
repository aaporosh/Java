import java.util.*;

class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean available;

    public Book(String title, String author, String ISBN, boolean available) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean getAvailable() {
        return available;
    }
}

class LibraryMember {
    private int Id;
    private String name;

    public LibraryMember(int Id, String name) {
        this.Id = Id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }
}

class Transaction {
    private Book book;
    private LibraryMember member;
    private String date;
    private double lateFees;

    public Transaction(Book book, LibraryMember member, String date, double lateFees) {
        this.book = book;
        this.member = member;
        this.date = date;
        this.lateFees = lateFees;
    }

    public Book getBook() {
        return book;
    }

    public LibraryMember getMember() {
        return member;
    }

    public String getDate() {
        return date;
    }

    public double getLateFees() {
        return lateFees;
    }
}

public class lib {

    private ArrayList<Book> books;
    private ArrayList<LibraryMember> members;
    private ArrayList<Transaction> transactions;

    public lib() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public void displayAvailableBooks() {
        System.out.println("Available books:");
        for (Book book : books) {
            if (book.getAvailable()) {
                System.out.println(book.getTitle() + "\t" + book.getAuthor() + "\t" + book.getISBN());
            } else {
                System.out.println("Book " + book.getTitle() + "   is not available for sale.");
            }
        }
    }

    public static void main(String[] args) {
        lib librarySystem = new lib();

       
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4", false);
        librarySystem.books.add(book1);

       
        LibraryMember member1 = new LibraryMember(1951, "rafi");
        librarySystem.members.add(member1);

      
        Transaction transaction1 = new Transaction(book1, member1, "10-11-2023", 120.5);
        librarySystem.transactions.add(transaction1);

      
        librarySystem.displayAvailableBooks();
    }
}
