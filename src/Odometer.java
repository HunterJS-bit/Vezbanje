
public class Odometer {

	
	
	private int milleage;
	
	
	public Odometer() {
		
	}
	
	public int getMilleage(){
		return this.milleage;
	}
	
	public void incrementMilleage(){
		if(milleage>9999){
			this.milleage = 0;
			milleage++;
		}else {
			milleage++;
		}
	}
	
	
	
	
	public void decreseFuelGauge(FuelGuage g){
int counter = this.milleage;
int n = counter/24;

if(counter==24*n){
			g.decrementFuel();
			
}		
		
	}
}
