import org.testng.annotations.Test;

public class TestBook {

    @Test
    public void testBook() {
        Book book = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getYear());
    }

}
