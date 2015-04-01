package lendbook;

import Code.Item;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class ItemTest {
    
    Item item;
    
    @Before
    public void createNewItem()throws Exception{
        
        item = new Item("Test", "Sb");
        
    }
    
    @Test
    public void exceptionTest(){
        
        try{
            Item item = new Item("", "sb");
            Assert.fail("An error was expected.");
        }catch(Exception e){
            Assert.assertEquals("The object's name cannot be empty.", e.getMessage());
        }
       
       try{
           Item item = new Item("Item", "");
           Assert.fail("An error was expected.");
       }catch(Exception e){
           Assert.assertEquals("The owner's name cannot be empty.", e.getMessage());
       }
       
    }
    
    @Test 
    public void getsAndSetsTest(){
        
        Assert.assertEquals("Test", item.getName());
        item.setName("Book");
        Assert.assertEquals("Book", item.getName());
        
        Assert.assertEquals("Y", item.getAvailability());
        item.setAvailability();
        Assert.assertEquals("N", item.getAvailability());
        item.setAvailability();
        Assert.assertEquals("Y", item.getAvailability());
        
        Assert.assertEquals("Sb", item.getOwner());
        item.setOwner("Other");
        Assert.assertEquals("Other", item.getOwner());
        
        
        
    }
    
}
