/*
 * Equipe:	        Erick de Azevedo Alcântara
 * 			Gabriel Joseph Ramos Rafael
 * 			José Lucas Silva Freitas
 * 			Wesley Nunes Marques Torres
 */
package Code;

import java.io.*;
import java.util.ArrayList;
import java.util.List;



public class DataBase {
    
    private static List<User> users;
    private static List<Item> items;
    private static List<Book> books;
   /**
     * 
     * @param file
     * @return 
     */
    public static boolean saveData(String file){
        ObjectOutputStream out = null;
        try { 
                try { 
                 out = new ObjectOutputStream(new FileOutputStream(file)); 
                 } catch (FileNotFoundException e) { 
                       return false; 
                 }
                if(file.equals("dbusers.dat"))
                    out.writeObject(users);
                else{
                    items.addAll(books);
                    out.writeObject(items);
                }
                out.close(); 
            } catch (Exception e) { 
                System.err.println(e); 
                System.exit(1); 
        }
        return true;
    }
    
    /**
     * Read a file.
     * @param file Name of the file.
     * @return An object list, with the information about the file.
     */
    private static List<Object> readData(String file){
        ObjectInputStream in = null;
        List<Object> dataObject = null;
        try {
            try{
            in = new ObjectInputStream(new FileInputStream(file));
            }catch(FileNotFoundException e){
                System.err.println("Nao cria arquivo"); 
            }
            try {
               dataObject = (ArrayList<Object>) in.readObject();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            in.close();
        } catch (IOException ex) {
            System.err.println("Erro no carregamento do arquivo");
        }
        return dataObject;
        }


    /**
     * Load users from file
     * @return Returns a users list.
     */
    public static List<User> loadUsers(){
        List<Object> listUsers = readData("dbusers.dat");
        users = new ArrayList<User>();
        //Downcast from user's list from type Object to User
             if (listUsers!=null){
                 for (Object object : listUsers) {
                 users.add((User) object);
             }  
        }
             
        return users;
    }
    
    /**
     * Load itens from file.
     * @return Returns one list of items.
     */
    public static List<Item> loadItens() {
        List<Object> aux = readData("dbitems.dat");
        items = new ArrayList<Item>();
        // Items downcast from type Object to Item.
        if (aux!=null){
            for (Object object : aux) {
                if(object != null)
                    items.add((Item) object);
            } 
        }
        
        return items;
    }
    
    /**
     * Separate the books from within the items list.
     * @return A books list.
     */
    public static List<Book> loadBooks() {
        books = new ArrayList<Book>();
        if(loadItens() != null){
            for(Item item: loadItens()){
                if(item instanceof Book){
                    Book book = (Book) item;
                    books.add(book);
                    }
                }
            }
        items.removeAll(books);
        return books;
        }
}
