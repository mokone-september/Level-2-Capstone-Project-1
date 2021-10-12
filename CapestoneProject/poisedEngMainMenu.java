package CapestoneProject;



// Importing code section to import modules to get a Date, GUI interface, ParseException and a date format module.
import java.util.Date;
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.text.SimpleDateFormat;


// Main class for the poisedEngMainMenu.
public class poisedEngMainMenu { 
	
	// Main method for the poisedEngMainMenu.
	public static void main(String[] args) throws ParseException {  
		
		// Declaring variables to be used in this program.
		int projectNumber;
		String projectName;
		String buildingType;
		String projectAddress;
		String erfNumber;
		double totalChargedFee;
		double amountPaidToDate;
		Date projectDeadline;
		final String personType = "Contractor"; //To be changed to public for the later implementation of our code  
		
		 
		// Introduction message to user to greet and provide information
		System.out.println("Welcome to the Poised Engineering Project Management Software. Please note that you will now be prompted to create a new project.");
		
		//Declaring a new project code section which will capture and store the user input having answered a series of question through a GUI interface  
		// Project name GUI user interface and terminal print out.
		String inputProjectName; 
		inputProjectName = JOptionPane.showInputDialog("Please enter the project name: ");
		projectName = inputProjectName;
		System.out.println("\nProject Name: " + projectName);
		
		
		
		// Project number GUI user interface and terminal print out..
		String inputProjectNumber; 
		inputProjectNumber = JOptionPane.showInputDialog("Please enter the project number: "); 
		projectNumber = Integer.parseInt(inputProjectNumber);
		System.out.println("Project Number: " + projectNumber);
		
		
		
		// Building type GUI user interface and terminal print out.
		String inputBuildingType; 
		inputBuildingType = JOptionPane.showInputDialog("Please enter the building type: ");
		buildingType = inputBuildingType;
		System.out.println("Project Building Type: " + buildingType);
		
		
		// Physical address GUI user interface and terminal print out.
		String inputProjectAddress; 
		inputProjectAddress = JOptionPane.showInputDialog("Please enter the address for the project: ");
		projectAddress = inputProjectAddress;
		System.out.println("Project Address: " + projectAddress);
		 
		
		// ERF number GUI user interface and terminal print out.
		String inputErfNumber; 
		inputErfNumber = JOptionPane.showInputDialog("Please enter the ERF number: ");
		erfNumber = inputErfNumber;
		System.out.println("Project ERF Number: " + erfNumber);
		
		
		
		// Total fee for the project GUI user interface and terminal print out.
		String inputTotalChargedFee; 
		inputTotalChargedFee = JOptionPane.showInputDialog("Please the total fee charged for the project: "); 
		totalChargedFee = Double.parseDouble(inputTotalChargedFee);
		System.out.println("Project Total Charged Fee: R" + totalChargedFee);
		
		
		
		// Amount paid to date by the customer GUI user interface and terminal print out.
		String inputAmountPaidToDate; 
		inputAmountPaidToDate = JOptionPane.showInputDialog("Please the total amount paid to date: "); 
		amountPaidToDate = Double.parseDouble(inputAmountPaidToDate);
		System.out.println("Project Amount Paid To Date: R" + amountPaidToDate);
		
		
		
		// Project deadline GUI user interface and terminal print out.
		 String inputProjectDeadline; 
		 inputProjectDeadline = JOptionPane.showInputDialog("Please enter the project deadline: dd-mm-yyyy");
		 //System.out.print(inputProjectDeadline);
		 Date unifiedDateFormat=new SimpleDateFormat("dd-MM-yyyy").parse(inputProjectDeadline); 
		 projectDeadline = unifiedDateFormat;
		 System.out.println("Project Deadline: " + projectDeadline);
		 
		
		 
		// code section for project object creation using the above inputed information by a newProject() Method called from NewProject Class
		newProject newProjectCreation = new newProject(projectNumber, projectName, buildingType, projectAddress, 
				erfNumber, totalChargedFee, amountPaidToDate, projectDeadline);
		
		// Code section for calling the DisplayProject() method in the NewProject class to display the new project using the swing GUI interface .
				JOptionPane.showMessageDialog(null, newProjectCreation.DisplayProject());
				
		//User Successes message GUI Display 
		JOptionPane.showMessageDialog(null, "Your project was successfully created. You will now be taken to the Edit Menu");
		
		
	   
		// The user is then shown the edit menu section with options to edit, update or finalize.
		System.out.println("\nPlease select an option from the edit menu by ENTERING the corresponding number: \n"
			+ "\n1. Edit existing projects" + "\n2. Update contractor details"
			+ "\n3. Finalize the project");

				// Project number.
				String editMenuInput; 
				editMenuInput = JOptionPane.showInputDialog("Please enter your selection from the edit menu"); 
				int userSelectionEditMenu = Integer.parseInt(editMenuInput);
				System.out.println("\nYour selection was " + userSelectionEditMenu);
				
				
					// code section that uses if conditional statements to determine if the user choice was option "1", and display the project update menu .
					if (userSelectionEditMenu  == 1)
					{	
						
						// They are then given a choice of either editing the due date or the amount paid to date.
						System.out.println("Edit Menu Options:" + 
								    "\n\nEnter '1' or '2' to make your selection" +
									"\n1. Edit the project due date or" +
									"\n2. Edit the total amount paid of the fee to date?"
									);
								
						// Their choice is stored in the 'editChoice' variable.
						//Scanner choice = new Scanner(System.in);
						//int editChoice = choice.nextInt();
						String projectUpdateMenu; 
						projectUpdateMenu = JOptionPane.showInputDialog("Please enter your selection from the edit menu"); 
						int projectUpdateUserSelection = Integer.parseInt(projectUpdateMenu);
						System.out.println("\nYour selection was " + projectUpdateUserSelection);
						
						
						if (projectUpdateUserSelection == 1)
						{ 
							
							// code section for user GUI Input information capture for a new due date selection.
							 String inputProjectDeadlineUpdated; 
							 inputProjectDeadlineUpdated = JOptionPane.showInputDialog("Please enter a new due date for the project: dd-mm-yyyy");
							 
							 // code section for using the simpleDateFormat to ensure a unified format for date display across all projects stored 
							 Date unifiedDateFormatUpdated=new SimpleDateFormat("dd-MM-yyyy").parse(inputProjectDeadlineUpdated); 
							 
							 //Terminal printout message 
							 System.out.print("\nYou have chaged the project due date to " + unifiedDateFormatUpdated + "from the previous due date that was " + projectDeadline);
							 
							 
							 
							
							// code section for a deadline variable used to update and store the new due date.
							 projectDeadline = unifiedDateFormatUpdated;  
							
							// code section for project object update using the above inputed projectDeadline variable, to store new date
							 // by a newProject() called projevtRevisionV Method called from NewProject Class 
								newProject projevtRevisionV = new newProject(projectNumber, projectName, buildingType, projectAddress,
										erfNumber, totalChargedFee, amountPaidToDate, projectDeadline);
								JOptionPane.showMessageDialog(null, projevtRevisionV.DisplayProject());  // Edited project object displayed.
								
								}
								// code section that uses if conditional statements to determine if the user choice was option "2", and display the project update menu 
								else if (projectUpdateUserSelection == 2)
							  
								{	
						
									// The user is prompted to enter a new amount paid to date.
									String inputAmountPaidToDateUpdate = JOptionPane.showInputDialog("Please enter a new total amount of the fee paid to date: "); 
							
									// amountPaid variable is updated to store the new value.
									amountPaidToDate = Double.parseDouble(inputAmountPaidToDateUpdate); 
							
									// New project object created to include the updated amount paid value.
									newProject projectRevisionV1 = new newProject(projectNumber, projectName, buildingType, projectAddress  ,
											erfNumber, totalChargedFee, amountPaidToDate, projectDeadline);
									JOptionPane.showMessageDialog(null, projectRevisionV1.DisplayProject());  // swing GUI Edited project object displayed.	
							
								}
						
								
					else if (userSelectionEditMenu == 2)  
					{	
						// code section for the user to enter the contractor's details to update the information through a swing GUI interface.
						
						// Constructor name GUI user interface and terminal print out
						String inputContractorName; 
						inputContractorName = JOptionPane.showInputDialog("Please enter the contractor's name: ");
						System.out.print(inputContractorName);
						String name = inputContractorName; 
						
						
						
						// Constructor number GUI user interface and terminal print out
						String inputContractorContactNumber; 
						inputContractorContactNumber = JOptionPane.showInputDialog("Please enter the contractor's contact number: "); 
						int contactNumber = Integer.parseInt(inputContractorContactNumber); 
						
						
						// Constructor email GUI user interface and terminal print out
						String inputContractorEmail; 
						inputContractorEmail = JOptionPane.showInputDialog("Please enter the contractor's email address: "); 
						System.out.print(inputContractorEmail);
						String email = inputContractorEmail; 
						
						
						// Constructor address GUI user interface and terminal print out
						String inputContractorAddress; 
						inputContractorAddress = JOptionPane.showInputDialog("Please enter the contractor's home address: ");
						System.out.print(inputContractorAddress);
						String address = inputContractorAddress; 
						
						// New person object created with the updated details for the contractor.
						newPerson contractorEdit = new newPerson(personType, name, contactNumber, email, address);
						
						// Successful message printed out, as well as the details for the updated contractor.
						JOptionPane.showMessageDialog(null, inputContractorName + " is now a recognised contractor and their details have been updated successfully.");
						JOptionPane.showMessageDialog(null, contractorEdit.DisplayPerson());
						
					}
					
				else if (userSelectionEditMenu == 3)  
				{
						if (totalChargedFee == amountPaidToDate)  
						
					{	
							
							//TODO Implement Code to determine if customer has settled all the necessary project bill
							
							
						}
						
						else if (totalChargedFee != amountPaidToDate)  
						
						{	
							
							//TODO Implement code to determine if customer has an outstanding balance 
							
						}
					}
				
				if (userSelectionEditMenu == 1 || userSelectionEditMenu == 2 || userSelectionEditMenu == 3 )  // If the user chooses 4 from the menu.
					
				{	
					// Successful logout message.
					JOptionPane.showMessageDialog(null, "You have entered an invalid option");
				}
				
				
				
				
				
				
			}

		
		
	
		
	}
	
}




