import java.util.*;
public class Address {
	List<Address_entry> addressList = new ArrayList<Address_entry>();

	public void add_entry(Address_entry entry) {
		//add entry to address book
		this.addressList.add(entry);

	}

	public void remove_entry(int entry) {
		//remove entry from address book
			this.addressList.remove(entry);
	}


	public void print_all() {
		//get length of array
		int length = this.addressList.size();

		//display all entries
		for (int i=0;i<length;i++){
			System.out.println("Entry number : "+(i+1));
			addressList.get(i).print_entry();
		}
	}

	public static void main(String[] args) {
		Address address_book = new Address();
		Scanner user_input = new Scanner(System.in);
		while (true) {
			System.out.println("Enter 1 to Add new contact");
			System.out.println("Enter 2 to View contacts");
			System.out.println("Enter 3 to Delete a contact");
			System.out.println("Enter 4 to Search a contact");
			System.out.println("Enter 5 to Edit a contact");
			int user_choice=user_input.nextInt();
		}

		switch(user_choice) {

				//Add new contact
			case 1:
				Address_entry address = new Address_entry();
				address_book.addressList.add(address);
				break;

			//View Contacts
			case 2:
				address_book.print_all();
				break;

			//Delete a contact
			case 3:
				System.out.println("Enter the entry number to delete");
				int contact = user_input.nextInt();
				address_book.remove_entry(contact-1);
				break;

			//Search a contact
			case 4:
				System.out.println("Enter entry number to be searched:");
				int contact = user_input.nextInt();
				address_book.search_entry(contact-1);
				break;

			//Edit a contact
			case 5:
				address_book.edit_contact();
				break;

			//Exit
			default:
				System.exit(0);

		}

	}
}
