package Exercises;

import java.util.Arrays;

import java.util.HashSet;
import java.util.Iterator;



/*
 * 
 * 
 * a) Write an application that reads a line of text from the keyboard and prints a table indicating
the number of occurrences of each letter of the alphabet in the text. For example,
the phrase
To be, or not to be: that is the question:
contains one “a,” two “b’s,” no “c’s,” and so on.
b) Write an application that reads a line of text and prints a table indicating the number
of one-letter words, two-letter words, three-letter words, and so on, appearing in the
text. For example, Fig. 14.25 shows the counts for the phrase
Whether 'tis nobler in the mind to suffer
c) Write an application that reads a line of text and prints a table indicating the number
of occurrences of each different word in the text. The application should include the
words in the table in the same order in which they appear in the text. For example, the
lines
To be, or not to be: that is the question:
Whether 'tis nobler in the mind to suffer
contain the word “to” three times, the word “be” two times, the word “or” once, etc.
 */


public class TextAnalyzis {

	
	private String text;
	
	public TextAnalyzis(String text){
		this.text = text;
	}
	
	
	
	public void numberOfLetters(){
		int [] num = new int[26];
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for(int i = 0;i<text.length();i++){
			switch (text.charAt(i)) {
			case 'a':
				num[0]++;
				break;
			case 'b':
				num[1]++;
				break;
			case 'c':
				num[2]++;
				break;
			case 'd':
				num[3]++;
				break;
			case 'e':
				num[4]++;
				break;
			case 'f':
				num[5]++;
				break;
			case 'g':
				num[6]++;
				break;
			case 'h':
				num[7]++;
				break;
			case 'i':
				num[8]++;
				break;
			case 'j':
				num[9]++;
				break;
			case 'k':
				num[10]++;
				break;
			case 'l':
				num[11]++;
				break;
			case 'm':
				num[12]++;
				break;
			case 'n':
				num[13]++;
				break;
			case 'o':
				num[14]++;
				break;
			case 'p':
				num[15]++;
				break;
			case 'q':
				num[16]++;
				break;
			case 'r':
				num[17]++;
				break;
			case 's':
				num[18]++;
				break;
			case 't':
				num[19]++;
				break;
			case 'u':
				num[20]++;
				break;
			case 'v':
				num[21]++;
				break;
			case 'w':
				num[22]++;
				break;
			case 'x':
				num[23]++;
				break;
			case 'y':
				num[24]++;
				break;
			case 'z':
				num[25]++;
				break;
		
			default:
				break;
			}
		}
		
		
		for(int i=0;i<num.length;i++){
			System.out.println("Number of occurences of char "+alphabet[i]+" is "+num[i]);
		}
	}
	
	

	
	
	public void numberOfWords(){
		String [] arr = text.split("\\s+");
		int [] num = new int[20];
		int n = 0;
		for(int i = 0;i<arr.length;i++){
			n = arr[i].length();
			switch (n) {
			case 1:
				num[1]++;
				break;
			case 2:
				num[2]++;
				break;
			case 3:
				num[3]++;
				break;
			case 4:
				num[4]++;
				break;
			case 5:
				num[5]++;
				break;
			case 6:
				num[6]++;
				break;
			case 7:
				num[7]++;
				break;
			case 8:
				num[8]++;
				break;
			case 9:
				num[9]++;
				break;
			case 10:
				num[10]++;	
				break;
			case 11:
				num[11]++;
				break;
			case 12:
				num[12]++;
				break;
			case 13:
				num[13]++;
				break;
			case 14:
				num[14]++;
				break;
			case 15:
				num[15]++;
				break;
			case 16:
				num[16]++;
				break;
			case 17:
				num[17]++;
				break;
			case 18:
				num[18]++;
				break;
			case 19:
				num[19]++;
				break;

			default:
				break;
			}
		
		}
		for(int i= 1;i<num.length;i++){
			System.out.println("With "+i+" word letter there is "+num[i]+" words");
		}
	
		
	}
	
	
	
	public void compareWords(){
		String [] arr = text.split("\\s+");
		HashSet<String> set1 = new HashSet<String>();
		for(int i = 0;i<arr.length;i++){
			set1.add(arr[i]);
		}
	
		String [] noDuplicates = new String[set1.size()];
		Iterator<String> it = set1.iterator();
		int iterate = 0;
		while(it.hasNext()){
			noDuplicates[iterate] = it.next();
			iterate++;
		}
		
		
		int [] nums = new int[set1.size()];
		for(int j = 0;j<noDuplicates.length;j++){
		for(int i = 0;i<arr.length;i++){
			if(noDuplicates[j].equals(arr[i])){
				nums[j]++;
			}
		}
	}
		
		for(int i = 0;i<set1.size();i++){
			System.out.println("Contains word  "+noDuplicates[i]+" "+nums[i]+" times");
		}
		
		
		
	}
	
	
	
}
