public class BookRecord {
    String title = ""; // Method 1: Literal for unknown title
    String author = new String(); // Method 2: Constructor for unknown author

    public BookRecord() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {
        BookRecord book = new BookRecord();
    }
}