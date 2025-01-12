/* This program will preform various tasks that we will need methods and instance fields to work.
 * We need to consider what tasks the droids will preform so we can create the correct methods for them.
 * - The droids when created will receive a name and 100% energy when they are initially created.
 * - Droids will preform tasks which cost 10% energy each.
 * - Droids should be able to call energy status at any time.
 * - Droids should be able to transfer energy between each other */

public class Droid{
// The variables stored in the public class will act to initiate a name and energy to all new droids 
	int batteryLife = 100;
	String name;
// This construtor method holds the string droidName that will be used when we create a new instance of the Droid this is how we will give the droid's names
	public Droid(String droidName){
		name = droidName;
	}
// The taskEnergy method will be used inside the preformTask method to remove the energy used when a task is preformed
	public void taskEnergy(){
		batteryLife = batteryLife -= 10;
	}
// This String is designed to be called any time a new droid is created.
	public String toString(){
		return "Hello my name is " + name + ", I am at your service";
	}
// This Method is designed to print out two statements the first one confirms the task has been recieved. Then it is past through our taskEnergy method which removes the 10% then to the second print statement that informs us of the new battery status.
	public void preformTask(String task){
		System.out.println("Objective Confirmed! " + name + " will now begin " + task + ".");
		taskEnergy();
		System.out.println(name + " now has " + batteryLife + "% remaining");
	}	
// This Method is a little out of our league for what we have learnt so far so I will add comments in a attempt to prove my understanding.
	public void energyTransfer(Droid otherDroid, int energyAmount){
		int maxBattery = 100; // this variable 
		int batteryLeft = 100 % otherDroid.batteryLife;
		if (this.batteryLife < energyAmount){
			System.out.println("Sorry " + this.name + " does not have enough power to make the transfer. The maximum transfer for  " + this.name + " is " + this.batteryLife + "%.");
				
		}
		else if (batteryLeft < energyAmount){
			System.out.println("Failure! Too much energy is being transfered. The maximum amount " + otherDroid.name + " can recieve is " + batteryLeft + "%."); 
		}
		else {
			otherDroid.batteryLife += energyAmount;
			this.batteryLife -= energyAmount;
			System.out.println("Success! " + this.name + " sent " + energyAmount + "% to " + otherDroid.name + "." + this.name + " now has " + this.batteryLife + "% and " + otherDroid.name + " now has " + otherDroid.batteryLife + "%."); 
		}	
	}
	// simple method to pull the energy from droids
	public void energyReport(){
		System.out.println(name + " energy report: Battery " + batteryLife + "%.");
	}
// In the main method you can see how new Droids are created and how we can get them to preform task.
	public static void main(String[] args){
		Droid xeon = new Droid("Xeon");// Creates new droid
		Droid neo = new Droid("Neo");
		System.out.println(xeon);//Prints the toString statement
		System.out.println(neo);
		xeon.preformTask("cleaning"); // This instance field triggers the preformTask method
		xeon.preformTask("dancing");
		xeon.preformTask("singing");
		xeon.preformTask("programming");
		neo.energyTransfer(xeon, 30);// This instance field triggers the energyTranfer method
		neo.energyTransfer(xeon, 20);
		xeon.energyTransfer(neo, 40);
		xeon.energyTransfer(neo, 120);
		neo.energyReport();
		xeon.energyReport();
	}
}
