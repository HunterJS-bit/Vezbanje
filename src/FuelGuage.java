
public class FuelGuage {

	
	
	
	private int gallons;
	
	public FuelGuage() {
		this.gallons = 0;
	}
	
	public FuelGuage(int gallons) {
		if(gallons<=15){
		this.gallons = gallons;}
		else{
			System.out.println("You have to put less fuel");
		}
	}
	
	
	public int getCurrentFuel(){
	return this.gallons;
	}
	
	
	public void incrementFuel(){
		if(this.gallons<15){
		gallons++;}
	}
	
	
	public void decrementFuel(){
		if(this.gallons>0){
			this.gallons--;
		}
	}
	
	
	
}
