package Code;


import System.Lendbook;
import java.io.Serializable;


public class User implements Serializable{

    private String name;
    private String surname;
    private String email;
    private String password;
    private String block;
    private String room;
  /**
     * User Constructor.
     * @param name The name of the user.
     * @param surname The surname of the user.
     * @param email The email of the user.
     * @param password The password of the user.
     * @param block The block in which the user works.
     * @param room The user room.
     * @throws Exception Throws exception if one of the parameters are invalid
     * such as a empty name.
     */
    public User(String name, String surname, String email, String password, String block, String room) throws Exception{
        
        if(verifyData(name, surname, email, password, block, room)){
            this.name = name;
            this.surname = surname;
            this.email = email;
            this.password = password;
            this.block = block;
            this.room = room;
            
        } 
        
    }
      /**
     * @return Returns the user's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Change the user's name.
     * @return The new name.
     */
    public void setName(String name) throws Exception{
        if(name == null || name.equals(""))
            throw new Exception("Preencha o nome corretamente!");
        this.name = name;
    }

    /**
     * @return Returns the user's surname.
     */
    public String getSurname(){
        
        return surname;
    }

    /**
     * Change the user's surname.
     * @return The new surname.
     */
    public void setSurname(String surname) throws Exception {
        if(surname == null || surname.equals(""))
            throw new Exception("Preencha o sobrenome corretamente!");
        this.surname = surname;
    }

    /**
     * @return Returns the user's email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Change the user's email.
     * @return The new email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return Returns the user's password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Change the user's password.
     * @return The new password.
     */
    public void setPassword(String password) throws Exception{
        if(password == null || password.equals(""))
            throw new Exception("Preencha a senha corretamente!");
        this.password = password;
    }

    /**
     * @return Returns the user's block.
     */
    public String getBlock() {
        return block;
    }

    /**
     * Change the user's block.
     * @return The new block.
     */
    public void setBlock(String block) throws Exception {
        if(block == null || block.equals(""))
            throw new Exception("Preencha o bloco corretamente!");
        this.block = block;
    }

    /**
     * @return Returns the user's room.
     */
    public String getRoom() {
        return room;
    }

    /**
     * Change the user's room.
     * @return The new room.
     */
    public void setRoom(String room)throws Exception {
        if(room == null || room.equals(""))
            throw new Exception("Preencha o nome da sala corretamente!");
        this.room = room;
    }

   /**
     * Verify the email's consistence.
     * @return Boolean of consistence.
     */
    private boolean verifyEmailAddress(String emailAddress){
                return emailAddress.matches("\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}") && !emailAddress.equals("");

    }
   /**
     * Verify all input parameters.
     * @return Boolean of tests.
     */
    private boolean verifyData(String name, String surname, String email, String password, String block, String room) throws Exception{
        if(name == null || name.equals("")){
            throw new Exception("Preencha o nome !");
        }
        else if(surname == null || surname.equals("")){
            throw new Exception("Preencha o sobrenome !");
        }
        else if(!verifyEmailAddress(email)){
            throw new Exception("Preencha o email corretamente!");
        }
        else if(password == null || password.equals("")){
            throw new Exception("Preencha a senha !");
        }
         else if(block == null || block.equals("")){
            throw new Exception("Preencha o bloco !");
        }
         else if(room == null || room.equals("")){
            throw new Exception("Preencha a sala !");
        }
        else if((Lendbook.system.userValidation(email))){
            throw new Exception("Usuário já existe!"); 
        }
       
        return true;
    }
    
}

