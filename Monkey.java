
public class Monkey extends RescueAnimal {

	// instance variables specific to Monkeys
	private String species;
	private String tailLength;
	private String height;
	private String bodyLength;
	
	// class constructors, using the same method from the Dog class
	public Monkey(String name, String gender, String age,
		    String weight, String acquisitionDate, String acquisitionCountry,
			String trainingStatus, boolean reserved, String inServiceCountry,
			String tailLength, String height, String bodyLength,String species) {
		        setName(name);
		        setGender(gender);
		        setAge(age);
		        setWeight(weight);
		        setAcquisitionDate(acquisitionDate);
		        setAcquisitionLocation(acquisitionCountry);
		        setTrainingStatus(trainingStatus);
		        setReserved(reserved);
		        setInServiceCountry(inServiceCountry);
		        setTailLength(tailLength);
		        setHeight(height);
		        setBodyLength(bodyLength);
		        setSpecies(species);
			}
	
	// accessor methods for Monkey specific variables
	public String getTailLength() {
		return tailLength;
	}
	
	public String getHeight() {
		return height;
	}
	
	public String getBodyLength() {
		return bodyLength;
	}
	
	public String getSpecies() {
		return species;
	}
	
	// mutator methods for Monkey specific variables
	public void setTailLength(String tailLength) {
		 this.tailLength = tailLength;
	}


		public void setHeight(String height) {
		 this.height = height;
	}


		public void setBodyLength(String bodyLength) {
		 this.bodyLength = bodyLength;
	}


		public void setSpecies(String species) {
		 this.species = species;
	}
}
