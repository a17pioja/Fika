
public class Fika {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void energyDecrease(Person person1) {
		
		int currentEnergy = person1.setEnergy(-10);
		if (currentEnergy >= 0) {
			person1=null;
		}
		
	}
	
	public void energyIncrease(Person person1) {
		
		int currentEnergy = person1.setEnergy(-10);
		
	}

}
