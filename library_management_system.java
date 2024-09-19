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
    
    ArrayList<Book> books = new ArrayList<Book>();
    ArrayList<LibraryMember> members = new ArrayList<LibraryMember>();
    ArrayList<Transaction> transactions = new ArrayList<Transaction>();


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
            System.out.println("ID: " + member.getMemberId() + member.getName());
        }
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

public class library_management_system {
    

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("JAVA A Building Approach through Object Oriented Programming", "Dr Shaik Akbar and Ch Hari Prasad", "978-81-933199-0-1", true);
        Book book2 = new Book("An Eco-Critical Appraisal of the Selected", "Rabia Mukhtar", "978-81-933904-9-8", false);
        library.addBook(book1);
        library.addBook(book2);

        LibraryMember member1 = new LibraryMember("1951", "Sadman sakib");
        LibraryMember member2 = new LibraryMember("1608", "Raduan Ahmed");
        library.addMember(member1);
        library.addMember(member2);

        

        library.displayBooks();
        library.displayMembers();

        library.borrowBook(book1, member1, new Date());
        library.borrowBook(book2, member2, new Date());

        library.displayBooks();

        library.returnBook(book1);

        library.displayBooks();
    }
}
