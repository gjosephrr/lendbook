package Code;

import java.io.Serializable;

public class Book extends Item implements Serializable{
    public static final String ON = "Disponivel";
    public static final String OFF = "Ocupado";
    
    private String author;
    private String gender;
    private String publisher;
    private int ISBN;
    private int ID;
    private String status;
    
    /**
     * Book constructor
     * @param name Book's name
     * @param owner Book's owner.
     * @param author Book's author.
     * @param ISBN Book's ISBN code.
     * @param publisher Book's publisher.
     * @param gender Book's gender.
     * @throws Exception Throws exception if the user attempts to create a new book with invalid parameters, such as a empty name.
     */
    
    public Book(String nome, String owner, String autor, int ISBN, String publisher, String genero,int id) throws Exception{
        super(nome, owner);
        verifyData(autor, publisher, ISBN, genero);
        this.ISBN = ISBN;
        this.author = autor;
        this.publisher = publisher;
        this.gender = genero;
        this.ID = id;
        this.status = OFF;
	}
     
    /**
     * 
     * @param author
     * @param publisher
     * @param ISBN
     * @return
     * @throws Exception 
     */
     private boolean verifyData(String author,String publisher, int ISBN, String genero)throws Exception{
         if (author == null || author.equals("")){
             System.out.println("we");
             throw new Exception("Preencha o campo autor corretamente !");   
         }   
         else if(ISBN <= 0)
             throw new Exception("Preencha o campo ISBN corretamente !");
         else if(genero== null || genero.equals(""))
             throw new Exception("Preencha o campo Editora corretamente !");
         else if(publisher == null || publisher.equals(""))
             throw new Exception("Preencha o campo Editora corretamente !");
         return true;
     }

  /**
    * @return Return the book's author. 
    */
    public String getAuthor() {
        return author;
    }
   /**
    * @param author Change the book's author.
    */
    public void setAuthor(String author) {
        this.author = author;
    }
    /**
     * @return Return the book's gender.
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender Change the gender of the book.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

   
    public String getPublisher() {
        return publisher;
    }

   /**
    * @return Return the book's publisher.
    */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

   /** 
     * @return Return the book's ISBN.
     */
    public int getISBN() {
        return ISBN;
    }

  /**
     * @param ISBN Change the book's ISBN.
     */
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    
    /**
     * 
     * @return 
     */
    public int getID(){
        return ID;
    }
    
    public void changeStatus(){
        status = status.equals(ON)?OFF:ON;        
    }
    
    public String getStatus(){
        return status;
    }

	
}
