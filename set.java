import java.util.HashSet;

class library{
    int Id ;
    String name;
    double cg;
    library(int Id,String name,double cg){
        this.Id=Id;
        this.name=name;
        this.cg=cg;
    }
}

public class set {
    public static void main(String[] args) {
        HashSet<library> s = new HashSet<library>();
        
        library s1 =new library(1814,"Abir", 3.66);
        library s2 =new library(1917, "Rafi", 3.90);

        s.add(s1);
        s.add(s2);

        for(library sa : s){
            System.out.println(sa.Id+" "+sa.name+" "+sa.cg);
        }
        //System.out.println(s);
    }
}
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean available;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = true;
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class LibraryMember {
    private String memberId;
    private String name;

    public LibraryMember(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }
}

class Transaction {
    private Book book;
    private LibraryMember member;
    private Date dueDate;
    private double lateFee;

    public Transaction(Book book, LibraryMember member, Date dueDate, double lateFee) {
        this.book = book;
        this.member = member;
        this.dueDate = dueDate;
        this.lateFee = lateFee;
    }

    public Book getBook() {
        return book;
    }

    public LibraryMember getMember() {
        return member;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public double getLateFee() {
        return lateFee;
    }
}

class Library {
    private List<Book> books;
    private List<LibraryMember> members;
    private List<Transaction> transactions;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void borrowBook(Book book, LibraryMember member, Date dueDate) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            Transaction transaction = new Transaction(book, member, dueDate, 0.0);
            transactions.add(transaction);
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }

    public void returnBook(Book book) {
        book.setAvailable(true);
        System.out.println("Book returned successfully.");
    }

    public void displayBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    public void displayMembers() {
        System.out.println("Library Members:");
        for (LibraryMember member : members) {
            System.out.println(member.getName() + " (ID: " + member.getMemberId() + ")");
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", "978-0-316-76948-0");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");
        library.addBook(book1);
        library.addBook(book2);

        // Adding members to the library
        LibraryMember member1 = new LibraryMember("M001", "John Doe");
        LibraryMember member2 = new LibraryMember("M002", "Jane Smith");
        library.addMember(member1);
        library.addMember(member2);

        // Displaying available books and library members
        library.displayBooks();
        library.displayMembers();

        // Borrowing and returning books
        library.borrowBook(book1, member1, new Date());
        library.borrowBook(book2, member2, new Date());

        library.displayBooks();

        library.returnBook(book1);

        library.displayBooks();
    }
}

