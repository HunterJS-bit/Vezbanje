package Exercises;

public class MorseCode {

	/*
	 * Morse Code) Perhaps the most famous of all coding schemes is the Morse code, developed
by Samuel Morse in 1832 for use with the telegraph system. The Morse code assigns a series of dots
and dashes to each letter of the alphabet, each digit, and a few special characters (e.g., period, comma,
colon, semicolon). In sound-oriented systems, the dot represents a short sound and the dash a
long sound.
Write an application that reads an English-language phrase and encodes it into Morse code.
Use one blank between each Morse-coded letter and three blanks between each
Morse-coded word.
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		convertToMorseCode("idemo najaci");
	}
	
	
	public static void convertToMorseCode(String word){
		
		String [] arr = word.split("\\s+");
		for(String s:arr){
			System.out.println(s);
		}
		String s = new String();
		StringBuilder builder = new StringBuilder();
		for(int j = 0;j<arr.length;j++){
			
		for(int i = 0;i<arr[j].length();i++){
			switch (arr[j].charAt(i)) {
			case 'a':
				s = ".-";
				break;
			case 'b':
				s="-...";
				break;
			case 'c':
				s="-.-.";
				break;
			case 'd':
				s="-..";
				break;
			case 'e':
				s=".";
				break;
			case 'f':
				s="..-.";
				break;
			case 'g':
				s="--.";
				break;
			case 'h':
				s="....";
				break;
			case 'i':
				s="..";
				break;
			case 'j':
				s=".---";
				break;
			case 'k':
				s="-.-";
				break;
			case 'l':
				s=".-..";
				break;
			case 'm':
				s="--";
				break;
			case 'n':
				s="-.";
				break;
			case 'o':
				s="---";
				break;
			case 'p':
				s=".--.";
				break;
			case 'q':
				s="--.-";
				break;
			case 'r':
				s=".-.";
				break;
			case 's':
				s="...";
				break;
			case 't':
				s="-";
				break;
			case 'u':
				s="..-";
				break;
			case 'v':
				s="...-";
				break;
			case 'w':
				s=".--";
				break;
			case 'x':
				s="-..-";
				break;
			case 'y':
				s="-.--";
				break;
			case 'z':
				s="--..";
				break;
			case '1':
				s=".----";
				break;
			case '2':
				s="..---";
				break;
			case '3':
				s="...--";
				break;
			case '4':
				s="....-";
				break;
			case '5':
				s=".....";
				break;
			case '6':
				s="-....";
				break;
			case '7':
				s="--...";
				break;
			case '8':
				s="---..";
				break;
			case '9':
				s="----.";
				break;
			case '0':
				s="-----";
				break;
			default:
				break;
			}
			builder.append(s+" ");
			
		}
		builder.append("  ");
		
		
	}
		System.out.println(builder);
		
		
}
	
	
	
	
	
	
	
	
	
	
}
