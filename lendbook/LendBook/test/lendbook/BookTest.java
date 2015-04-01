package lendbook;

import Code.Book;
import org.junit.*;

public class BookTest {
    
    Book book;
    
    @Before
    public void createNewBook() throws Exception{
        book = new Book("Test", "Sb", "Some", 123456,"Editor", "Fantasy",1);
        
    }

    @Test
    public void exceptionsTest(){
        
        try{
            Book testBook = new Book("Book","sb","", 123,"Editor","Fantasy",1);
            Assert.fail("An error was expected.");
        }catch(Exception e){
            Assert.assertEquals("Preencha o campo autor corretamente !", e.getMessage());
        }
        
        try{
            Book testBook = new Book("Book","sb","some", -152,"Editor","Fantasy",1);
            Assert.fail("An error was expected.");
        }catch(Exception e){
            Assert.assertEquals("Preencha o campo ISBN corretamente !", e.getMessage());
        }
        
    }
    @Test
    public void getsAndSetsTest() {
        
        Assert.assertEquals("Some", book.getAuthor());
        book.setAuthor("Other Author");
        Assert.assertEquals("Other Author", book.getAuthor());
        
        Assert.assertEquals("Fantasy", book.getGender());
        book.setGender("Comedy");
        Assert.assertEquals("Comedy", book.getGender());
        
        Assert.assertEquals(123456, book.getISBN());
        book.setISBN(654321);
        Assert.assertEquals(654321, book.getISBN());
        
        Assert.assertEquals("Editor", book.getPublisher());
        book.setPublisher("Other publisher");
        Assert.assertEquals("Other publisher", book.getPublisher());
        
        Assert.assertEquals(book.getID(),1);
        
        Assert.assertEquals(book.getStatus(), "Ocupado");
        book.changeStatus();
        Assert.assertEquals(book.getStatus(), "Disponivel");
    }

   
}