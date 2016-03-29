
public class Zadatak {
public static void main(String[] args) {
	
	
	countvowels("asbfiusadfliabdluifalsiudbf");
}


public static void countvowels(String word){
	
	int a = 0;
	int e = 0;
	int i = 0;
	int o = 0;
	int u = 0;
	for(int j = 0;j<word.length();j++){
		switch (word.charAt(j)) {
		case 'a':
			a++;
			break;
		case 'e':
			e++;
			break;
		case 'i':
	        i++;
			break;
		case 'o':
	         o++;
			break;
		case 'u':
	         u++;
			break;
		default:
			break;
		}
	}
	
	System.out.println(" number of a "+a +" number of e "+e );
	System.out.println(" number of i "+i +" number of o "+o );
	System.out.println(" and number of u "+u  );
	
	
}
}
