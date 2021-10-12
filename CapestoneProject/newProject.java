package CapestoneProject;

// This class forms part of the bigger Capstone project I for Object-oriented programming, task 7.
// The overall project is to design a project management system for an engineering firm called 'Poised'.
// The program is meant to keep track of the projects that are dealt with in the company.
// The current class is used to define methods needed to add new project info.
import java.util.Date;

// Main class declaration.
public class newProject {

		// Listing variable attributes for the 'NewProject' class.
		public int projectNumber;
		public String projectName;
		public String buildingType;
		public String address;
		public String erfNumber;
		public double totalChangedFee;
		public double amountPaidToDate;
		public Date projectDeadline;
		
		// Writing a constructor method to create a new project object.
		// This takes in all the attributes of the project above.
		public newProject(int projectNumber, String projectName, String buildingType, 
				String address, String erfNumber, double totalChangedFee, double amountPaidToDate, Date projectDeadline) {
		
		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.buildingType = buildingType;
		this.address = address;
		this.erfNumber = erfNumber;
		this.totalChangedFee = totalChangedFee;
		this.amountPaidToDate = amountPaidToDate;
		this.projectDeadline = projectDeadline;
		
	}
		
		// Writing a method to display the project in an easy-to-read format.
		// This method returns a string 'output' with all the project details.
		public String DisplayProject() {
			
			System.out.println("\nThe information captured for " + projectName  + " is as follows" + ": \n");
			String output = "Project Number: " + projectNumber;
			output += "\nProject Name: " + projectName;
			output += "\nBuilding Type: " + buildingType;
			output += "\nHome Address: " + address;
			output += "\nERF Number: " + erfNumber;
			output += "\nProject Fee Total: R" + totalChangedFee;
			output += "\nAmount Paid to Date: R" + amountPaidToDate;
			output += "\nProject Deadline: " + projectDeadline;
			
			return output;  // Output string returned.
			
			
			
		}

}
