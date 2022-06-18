package AssigmentClassAndMethods;

public class AmusementRideMainClass {

	public static void main(String[] args) {

		AmusementParkRide giantWheel = new AmusementParkRide();
		giantWheel.parkName = "Wonderland";

		AmusementParkRide slide = new AmusementParkRide();

		Person sam = new Person();
		sam.height = 110;
		sam.weight = 10;

		Person tom = new Person();
		tom.height = 95;
		tom.weight = 40;

		boolean isEligibleToRide = giantWheel.isEligibleForRide(sam.height, sam.weight);

		System.out.println("Sam is eligible to board giantwheel = " + isEligibleToRide);

		System.out.println("Tom is eligible to board giantwheel = \n " + giantWheel.isEligibleForRide(tom.height, tom.weight));

		System.out.println("Sam is eligible to board slide= " + slide.isEligibleForRide(sam.height, sam.weight));

		System.out.println("Tom is eligible to board slide = " + slide.isEligibleForRide(tom.height, tom.weight));

		String printParkname = sam.printParkname(giantWheel.parkName);

		System.out.println("Sam is in " + printParkname);

		System.out.println("Sam is in " + sam.printParkname(giantWheel.parkName));

	}

}
