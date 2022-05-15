package week1.day1;

public class TwoWheeler {

int noOfWheels = 2;
short noOfMirrors = 2;
long chassisNumber = 123456789876543215L;
boolean isPunctured;
String bikeName = "Honda Aviator";
double runningKM = 489.78;

	public static void main(String[] args) {
		TwoWheeler myBike = new TwoWheeler();
		System.out.println("The name of my two wheeler is: " +myBike.bikeName);
		System.out.println("No. of Mirrors are: " +myBike.noOfMirrors);
		System.out.println("The Chasis Number is: " +myBike.chassisNumber);
		System.out.println("My Tyre Check: " +myBike.isPunctured);
		System.out.println("No. of wheels: " +myBike.noOfWheels);
		System.out.println("The running KM: " +myBike.runningKM);

	}

}
