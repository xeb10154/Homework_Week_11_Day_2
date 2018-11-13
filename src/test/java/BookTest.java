import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;

    @Before
    public void setup(){

        book1 = new Book("The Lean Startup", "Eric Ries","Business");

    }

    @Test
    public void getTitle(){
        assertEquals("The Lean Startup", book1.getTitle());
    }

    @Test
    public void getAuthor(){
        assertEquals("Eric Ries", book1.getAuthor());
    }

    @Test
    public void getTGenre(){
        assertEquals("Business", book1.getGenre());
    }
}
