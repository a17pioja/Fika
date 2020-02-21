
public class Person {

	String name;
	int energy;
	String location;
	
	public Person(String name) {
		
		this.name = name;
		this.energy = 100;
		this.location = "Office";
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public int getEnergy() {
		
		return energy;
		
	}
	
	public int setEnergy(int updateEnergy) {
		
		if (updateEnergy >=0) {
			energy = energy + updateEnergy;
		}
		else {
			energy = energy - updateEnergy;
		}
		
		return energy;
	}
	
	public void setLocation() {
		
	}
	
}
