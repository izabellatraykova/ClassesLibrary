public class Library {
    public static void main(String[] args) {
        Book book1 = new Book ("1984","George Orwell","328");
        book1.displayDetails();
        Book book2 = new Book ("Animal Farm","George Orwell", "176");
        book2.displayDetails();
    }
}
class Book {
    private String title;
    private String author;
    private int numberOfPages;

    public Book(String title, String author, String numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = Integer.parseInt(numberOfPages);
    }

    public void displayDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " + numberOfPages);
    }
}

