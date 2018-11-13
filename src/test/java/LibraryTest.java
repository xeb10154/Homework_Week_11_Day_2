import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book1;
    private Book book2;
    private Book book3;
    private Library library;


    @Before
    public void setup() {
        book1 = new Book("The Lean Startup", "Eric Ries", "Business");
        book2 = new Book("Beginning Javascript", "McPeak Wilton", "Reference");
        book3 = new Book("The Chamber of Secrets", "J.K. Rowling", "Fictional");
        library = new Library();
    }

    @Test
    public void add(){
        library.add(book1);
        assertEquals(1, library.getStock());
    }

    @Test
    public void getStock(){
        assertEquals(0, library.getStock());
    }

    @Test
    public void checkCapacityBeforeAddingMoreStock(){
        library.add(book1);
        library.add(book1);
        library.add(book2);
        library.add(book2);
        library.add(book3);
        library.add(book3);
        assertEquals(5, library.getStock());
    }

}
