/*
 * Equipe:	Erick de Azevedo Alcântara
 * 			Gabriel Joseph Ramos Rafael
 * 			José Lucas Silva Freitas
 * 			Wesley Nunes Marques Torres
 */

package Code;


public class SystemManager {

	private Controler systemControler;
	private User currentUser;
       /**
         * SystemManager constructor.
         */
	public SystemManager(){
		this.systemControler = new Controler();
	}
       /**
         * Register a new book in to the system.
         * @param book The new book.
         */
	public void add(Book book) throws Exception{
		systemControler.register(book);
	}
	       /**
         * Register a new user at the system.
         * @param newUser The new user.
         * @return Returns true if the registration was successfully made.
         */
	public boolean signUp(User newUser){
		if(!(userValidation(newUser.getEmail()))){
			systemControler.register(newUser);
			return true;
		}return false;
	}
       /**
         * Allow the user to log into the system.
         * @param email The user's email.
         * @param password The user's password.
         * @return Returns true if the process was successfully made.
         */
	public User login(String email, String password){
		
		User newUser = systemControler.userSearch(email); 
		if( newUser != null && newUser.getPassword().equals(password) ){
			this.currentUser = newUser;
                        return currentUser;
		}
                return null;
	}
        
       
	/**
         * Remove a user from the system.
         * @param newUser The user.
         */
	public void remove(User newUser){	
			systemControler.remove(newUser);
	}
      /**
         * Check out if the user exists.
         * @param email The user's email.
         * @return Returns true if the user exists.
         */
	public boolean userValidation(String email){
		return (systemControler.userSearch(email) != null);
	}
       /**
         * Return the current controler.
         * @param email The user's email.
         * @return Returns the controler.
         */
        public Controler getController(){
            return systemControler;
        }
	
	
}
