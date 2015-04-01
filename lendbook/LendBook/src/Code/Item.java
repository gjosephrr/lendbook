package Code;

import java.io.Serializable;


public class Item implements Serializable{

        private final String AVAILABLE = "Y";
        private final String UNAVAILABLE = "N";
    
	private String name;
        private String availability;
        private String owner;
	
       /**
         * Item constructor.
         * @param name The item's name.
         * @param owner The item's owner.
         * @throws Exception Throws exception 
         * whenever the user tries to creat a new item with invalid parameters
         * such as a empty name.
         */
	public Item(String name, String owner) throws Exception{
		if (name == null || name.equals("")){
                    throw new Exception("The object's name cannot be empty.");
                }
               
                if (owner == null || owner.equals(""))
                    throw new Exception("The owner's name cannot be empty.");
		this.name = name;
                this.availability = AVAILABLE;
                this.owner = owner;
	}
       /**
         * @return Returns the name of the item.
         */
	public String getName() {
		return name;
	}
       /**
         * Change the name of the item.
         * @param name The new name.
         */
	public void setName(String name) {
		this.name = name;
	}
        /**
         * @return Returns whether the item is available or not.
         */
        public String getAvailability() {
		return availability;
        }
        /**
         * Change the availability of the item.
         */
        public void setAvailability() {
		if(this.availability.equals(AVAILABLE))
                    this.availability = UNAVAILABLE;
                else
                    this.availability = AVAILABLE;
	}
       /**
         * @return Returns item's owner name.
         */ 
        public String getOwner() {
		return owner;
        }
       /**
         * Change the book's owner.
         * @param nome The new owner's name.
         */
        public void setOwner(String nome) {
		this.owner = nome;
	}
	
}

