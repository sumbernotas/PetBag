import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    //private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)

    public static void main(String[] args) {


        initializeDogList();
        initializeMonkeyList();
        
        // creates a scanner class in order to take user input
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        
        // a while loop that will allow the user to access the menu screen
        while(!userInput.equals("q")) {
        	displayMenu();
        	userInput = scanner.nextLine();
        	
        	if(userInput.equals("1")) {
        		intakeNewDog(scanner);
        	} else if (userInput.equals("2")) {
        		intakeNewMonkey(scanner);
        	} else if (userInput.equals("3")) {
        	   reserveAnimal(scanner);
        	} else if (userInput.equals("4")) {
        	   printAnimals("dog");
        	} else if (userInput.equals("5")) {
        	   printAnimals("monkey");
        	} else if (userInput.equals("6")) {
        	   printAnimals("available");
        	} else if (userInput.equals("q")) {
        	   System.out.println("Quitting application.");
        	} else {
        	   System.out.println("Invalid input. Please enter a different option.");
        	}
        }
        

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Bingo", "male", "3", "40.0", "09-21-2018", "Australia", "intake", false, "Unites States", "2.3", "6.0", "4.2", "Tamarin");
    	Monkey monkey2 = new Monkey("Layla", "female", "2", "40.0", "01-15-2018", "Brazil", "Phase I", true, "Unites States", "2.5", "6.3", "4.0", "Capuchin");
    	Monkey monkey3 = new Monkey("Nanas", "male", "3", "41.0", "10-21-2019", "Africa", "intake", false, "Unites States", "2.0", "5.2", "3.5", "Guenon");
    	
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	monkeyList.add(monkey3);

    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
        System.out.println("What is the dog's breed?"); 
        String breed = scanner.nextLine();
        
        System.out.println("What is the dog's gender?"); 
        String gender = scanner.nextLine();
        
        System.out.println("What is the dog's age?"); 
        String age = scanner.nextLine();
        
        System.out.println("What is the dog's weight?"); 
        String weight = scanner.nextLine();
        
        System.out.println("When is the dog's acquisition date?"); 
        String acquisitionDate = scanner.nextLine();
        
        System.out.println("When is the dog's acquisition country?"); 
        String acquisitionCountry = scanner.nextLine();
        
        System.out.println("What is the dog's training status?"); 
        String trainingStatus = scanner.nextLine();
        
        System.out.println("Is the dog reserved? [T/F]"); 
        String reserved = scanner.nextLine();
        
        System.out.println("What is the dog's service country?"); 
        String inServiceCountry = scanner.nextLine();
        
        Dog newDog = new Dog(name, breed, gender, age,
       weight, acquisitionDate, acquisitionCountry,
       trainingStatus, (reserved.equals("T")), inServiceCountry);
        dogList.add(newDog);
    }
    


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
            
            for (Monkey monkey: monkeyList) {
            	if(monkey.getName().equalsIgnoreCase(name)) {
            		System.out.println("\n\nThis monkey is already in our system\n\n");
            		return;
            	}
            }
            
            System.out.println("What is the monkey's gender?"); 
            String gender = scanner.nextLine();
            
            System.out.println("What is the monkey's age?"); 
            String age = scanner.nextLine();
            
            System.out.println("What is the monkey's weight?"); 
            String weight = scanner.nextLine();
            
            System.out.println("When is the monkey's acquisition date?"); 
            String acquisitionDate = scanner.nextLine();
            
            System.out.println("When is the monkey's acquisition country?"); 
            String acquisitionCountry = scanner.nextLine();
            
            System.out.println("What is the monkey's training status?"); 
            String trainingStatus = scanner.nextLine();
            
            System.out.println("Is the monkey reserved?"); 
            String reserved = scanner.nextLine();
            
            System.out.println("What is the monkey's service country?"); 
            String inServiceCountry = scanner.nextLine();
            
            System.out.println("How long is the monkey's tail length?"); 
            String tailLength = scanner.nextLine();
            
            System.out.println("What is the monkey's height?"); 
            String height = scanner.nextLine();
            
            System.out.println("How long is the monkey's body length?"); 
            String bodyLength = scanner.nextLine();
            
            System.out.println("What is the monkey's species?"); 
            String species = scanner.nextLine();
            
            Monkey newMonkey = new Monkey(name, gender, age, weight, acquisitionDate, acquisitionCountry,
            							trainingStatus, (reserved.equals("T")), inServiceCountry, tailLength, 
            							height, bodyLength, species);
            
            monkeyList.add(newMonkey);
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("What is the animal type");
            String animalType = scanner.nextLine();
            
            System.out.println("What is the animal's service country?");
            String serviceCountry = scanner.nextLine();
            
            if(animalType.equals("Dog")) {
            	for(Dog dog: dogList) {
            		if(dog.getInServiceLocation().equals(serviceCountry)) {
            			dog.setReserved(true);
            		}
            	}
            } else if(animalType.equals("Monkey")) {
            	for(Monkey monkey: monkeyList) {
            		if(monkey.getInServiceLocation().equals(serviceCountry)) {
            			monkey.setReserved(true);
            		}
            	}
            }

        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(String animal) {
            if(animal.equals("dog")) {
            	for(Dog dog: dogList) {
            		System.out.println("Dog " + dog.getName());
            	}
            } else if(animal.equals("monkey")) {
            	for(Monkey monkey : monkeyList) {
            		System.out.println("Monkey " + monkey.getName());   
            	}
            } else if(animal.equals("available")){
            	for(Dog dog : dogList) {
            		if(!dog.getReserved()) {
            			System.out.println("Dog " + dog.getName());
            		}
            	}
            	for(Monkey monkey : monkeyList) {
            		if(!monkey.getReserved())
            			System.out.println("Monkey " + monkey.getName());   
   
            
            
            	}
            }
        }
}
