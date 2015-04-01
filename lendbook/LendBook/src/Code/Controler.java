/*
 * Equipe:	        Erick de Azevedo Alcântara
 * 			Gabriel Joseph Ramos Rafael
 * 			José Lucas Silva Freitas
 * 			Wesley Nunes Marques Torres
 */


package Code;

import java.util.*;

public class Controler {

	private List<Book> books;
	private List<User> users;
	
        /**
         * Controller constructor.
         */
	public Controler(){
		users = DataBase.loadUsers();
		books = DataBase.loadBooks();
	}
        /**
         * @return Return an array with all of the books, whose have already been registered in the system.
         */
	public List<Book> getBooks() {
		return books;
	}
        /**
         * @return Return an array with all of the system's users.
         */
	public List<User> getUsers() {
            
		return users;
	}
	 /**
         * Add a new user to the user's array.
         * @param newUser The new user.
         */
	public void register(User newUser){
		users.add(newUser);
	}
       /**
         * Add a new book to the book's array.
         * @param book The new book.
         */
        public void register(Book book){
		books.add(book);
	}
       /**
         * Removes a user from the user's array.
         * @param newUser The user to be removed.
         */
	public void remove(User newUser){
            books.removeAll(bookSearch(newUser.getEmail(),"owner"));
            users.remove(newUser);		
	}

        /**
         * Iterate over the book's array, in order to find a certain book.
         * @param searchParameter The book's reference to the search.
         * @param searchType The type in which the search will be performed.
         * @return 
         */
	public List<Book> bookSearch(String searchParameter, String searchType){
		List<Book> tempBooks = new ArrayList();
                searchParameter = searchParameter.toLowerCase();
		switch(searchType.toLowerCase()){
			case "title":
                            for(Book myItem : this.books) {
                                if(myItem.getName().equals(searchParameter) || myItem.getName().contains(searchParameter) || myItem.getName().equals("")){
                                    tempBooks.add(myItem);
                                }
		            }
				break;
			case "author":
                            for(Book myItem : this.books) {
                                if(myItem.getAuthor().equals(searchParameter) || myItem.getAuthor().contains(searchParameter)){
                                    tempBooks.add(myItem);
                                }
		            }
				break;
			case "isbn":
                            for(Book myItem : this.books) {
                                if(Integer.toString(myItem.getISBN()).equals(searchParameter) || Integer.toString(myItem.getISBN()).contains(searchParameter)){
                                    tempBooks.add(myItem);
                                }
		            }
				break;
			case "gender":
                            for(Book myItem : this.books) {
                                if(myItem.getGender().equals(searchParameter) || myItem.getGender().contains(searchParameter)){
                                    tempBooks.add(myItem);
                                }
		            }
				break;
			case "publisher":
                            for(Book myItem : this.books) {
                                if(myItem.getPublisher().equals(searchParameter) || myItem.getPublisher().contains(searchParameter)){
                                    tempBooks.add(myItem);
                                }
		            }
				break;
                        case "owner":
                            for(Book myItem : this.books) {
                                if(myItem.getOwner().equals(searchParameter) || myItem.getOwner().contains(searchParameter)){
                                    tempBooks.add(myItem);
                                }
		            }
				break;
                         case "id":
                            for(Book myItem : this.books) {
                                if(Integer.toString(myItem.getID()).equals(searchParameter)){
                                    tempBooks.add(myItem);
                                }
		            }
				break;
		}
                return tempBooks;
	}
	      /**
         * Iterate over the user's array, in order to find a certain user.
         * @param email user's email to the search.
         * @return user
         */
	public User userSearch(String email){
		for(User user : this.users) {
                    if(user.getEmail().equals(email))
                        return user;
		}return null;
	}
	
	


}
