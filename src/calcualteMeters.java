import java.util.Scanner;


public class calcualteMeters {
public calcualteMeters() {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("enter distance in meters");
	int n = scan.nextInt();
	int choice;
	
	Key key = new Key(n);
	
do {
	key.menu();
	System.out.println("enter your choice");
	choice = scan.nextInt();
	switch (choice) {
	case 1:
		double km =key.convertToKilometers(n);
		System.out.println(n+" meters is "+km +" kilometers.");
		break;
	case 2:
		double inc = key.calculateInches(n);
		System.out.println(n+" meters is "+inc +" inches.");
		break;
	case 3:
		double feet = key.calculateFeet(n);
		System.out.println(n+" meters is "+feet +" feet.");
		break;
	case 4:
		key.quit();
		break;
	default:
		System.out.println("No such thing");
		break;
	}
	
} while (choice !=4);
}
}
