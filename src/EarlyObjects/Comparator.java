package EarlyObjects;

public class Comparator implements java.util.Comparator<Double>{

	@Override
	public int compare(Double o1, Double o2) {
	if(o1 <o2){
		return 1;
	} if(o1>o2){
		return -1;
	}else{
		return 0;
	}
	}

}
