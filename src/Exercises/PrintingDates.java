package Exercises;

public class PrintingDates {

	/*
	 * Printing Dates in Various Formats) Dates are printed in several common formats. Two of
the more common formats are
04/25/1955 and April 25, 1955
Write an application that reads a date in the first format and prints it in the second format.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		formatDate("22/25/1955");
		
		
	}
	
	public static void formatDate(String date){
		
		String [] arr = date.split("/");
		
	int n = Integer.parseInt(arr[0]);
	String s = new String();
	switch (n) {
	case 1:
		s="January";
		break;
	case 2:
		s="February";
		break;
	case 3:
	    s="March";
		break;
	case 4:
	   s= "April";
		break;
	case 5:
		s="May";
		break;
	case 6:
		s = "June";
		break;
	case 7:
		s="July";
		break;
	case 8:
		s="August";
		break;
		case 9:
		s="September";
			break;
	case 10:
		s="October";
		break;
	case 11:
		s="November";
		break;
	case 12:
		s="December";
	break;
	default:
		s="Invalid Month";
		break;
	}
		
	StringBuilder builder = new StringBuilder();
	builder.append(s+" "+arr[1]+","+" "+arr[2]);
	System.out.println(builder);
	}
}
