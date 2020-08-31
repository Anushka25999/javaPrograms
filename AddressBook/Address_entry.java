import java.util.*;
public class Address_entry {

	String name, address, city, state;
	int zip;
	long phone_number;

	//define constructor to initialize object
	Address_entry() {
		// Create a Scanner object
		Scanner myObj = new Scanner(System.in);

		// Get name from user
        	System.out.println("enter your name");
        	this.name = myObj.nextLine();

		// Get address from user
		System.out.println("enter your address");
		this.address = myObj.nextLine(); // Read user input

		// Get city from user
		System.out.println("enter your city");
		this.city = myObj.nextLine(); // Read user input

		// Get state from user
		System.out.println("enter your state");
		this.state = myObj.nextLine(); // Read user input

		// Get zip code from user
		System.out.println("enter your Zip code");
		this.zip = myObj.nextInt(); // Read user input

		// Get phone number from user
		System.out.println("enter your phone number");
		this.phone_number = myObj.nextLong(); // Read user input

        }
    	public void print_entry() {

		System.out.println("name \t city \t state \t ZipCode \t Phone_number");
		//display values
		System.out.println(name+"\t"+city+"\t"+state+"\t"+zip+"\t"+phone_number);

    }

}
