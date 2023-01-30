public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("TITLE1", "author1");
        Book book2 = new Book("TITLE2", "author2");
        Book book3 = new Book("TITLE3", "author3");
        Book[] books = {book1, book2, book3};
        for (Book book : books) {
            System.out.println(book);
        }
    }
}