package demos;

public class Race {
	public static void main(String[] args){
		MountainBike red = new MountainBike(2, 1, 1, 1);
		red.speedUp(5);
		red.setGear(2);
		System.out.println("Increase speed to " + red.getSpeed());
		
		System.out.println("Coming to a turn in the track...");
		red.applyBrake(3);
		red.setGear(1);
		System.out.println("Decrease speed to " + red.getSpeed());
	}
}
