package CapstoneProject;
// This class was written to create a new person object and display the details.
// This class is called on in the main 'PoisedMenu' program.

// Main class declaration.
public class newPerson {
	
	// Attribute variables declared for use in this class.
	private String personType;
	private String name;
	private int contactNumber;
	private String email;
	private String address;
	
	// Writing a constructor method to create a new person object.
	// This takes in all the attributes of the person above.
	public newPerson(String personType, String name, int contactNumber, String email, String address) {
		
		this.personType = personType;
		this.name = name;
		this.contactNumber = contactNumber;
		this.email = email;
		this.address = address;
		
	}
	
	// This method displays the person object details in an easy-to-read format.
	// It returns the string 'output' with all of the person's details.
	public String DisplayPerson() {
		
		System.out.println(personType + " details are as follows: \n");
		String output = "Occupation: " + personType;
		output += "\nName: " + name;
		output += "\nContact Number: " + contactNumber;
		output += "\nEmail Address: " + email;
		output += "\nHome Address: " + address;
		
		return output;  // String output returned.
	}
}
