
public class Datum {

	
	private int dan;
	private int mesec;
	private int godina;
	private static boolean prestupna;
	
	public Datum() {
		this(1, 1,1);
	}
	
	
	public Datum(int dan,int mesec,int godina){
		boolean b = proveriDatum(dan, mesec,godina);
		if(b){
			this.dan = dan;
			this.mesec = mesec;
			this.godina = godina;
		}else{
			System.out.println("Uneli ste los datum");
		}
	}
	
	
	
	public boolean proveriDatum(int dan,int mesec,int godina){
		int brojDana = this.odrediBrojDana(mesec);
		if(godina>=0 && dan<=brojDana  ){
			return true;
		}
		
				return false;
	}
	
	
	

	public int brojDanaUMesecu(int mesec){
		int sum = 0;
		for(int i = 1;i<mesec;i++){
			sum +=odrediBrojDana(i);
		}
		
		return sum;
	}
	
	public int brojDanaUGodini(int godina){
		int sum = 0;
		for(int i = 1;i<godina;i++){
			if(Isprestupna(i)){
				sum+=366;
			}else{
				sum+=365;
			}
		}
		
		return sum;
	}
	
	
	public int uporediDatume(Datum d1){
		int dan = d1.dan;
		int mesec = d1.mesec;
		int godina = d1.godina;
		
	int brojDana1 = brojDanaUGodini(godina) + brojDanaUMesecu(mesec) + dan;
	int brojDana2 = brojDanaUGodini(this.godina) + brojDanaUMesecu(this.mesec) + this.dan;
	
	
	if(brojDana1>brojDana2){
		return brojDana1-brojDana2;
	}else if(brojDana1<brojDana2){
		return brojDana2-brojDana1;
	}else{
		return 0;
	}
		
	}
	
	
	
	public int odrediBrojDana(int mesec){
		
		this.prestupna = this.Isprestupna();
		int brojDana = 0;
		switch (mesec) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			brojDana = 31;
			
			
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			brojDana = 30;
			;
			break;
		case 2:
			if(prestupna){
				
				brojDana = 29;
				
			}else{
				brojDana = 28;
				
			}
			break;
			
			default:
				System.out.println("Nevazeci mesec");
			break;
		}
		return brojDana;
	}
	
	public boolean Isprestupna(){
	return this.Isprestupna(this.godina);
	}
	
	public boolean Isprestupna(int godina){
	
		
		if (godina % 4 != 0) {
			   return false;
			 } else if (godina % 400 == 0) {
			    return true;
			 } else if (godina % 100 == 0) {
			    return false;
			 } else {
			    return true;
			 }
	}
	
	
	
	
	public void razmena(Datum d1){
	this.dan = d1.dan;
	this.mesec = d1.mesec;
	this.godina = d1.godina;
	
	
	}
	
	
	public void prikazDatuma(){
		System.out.println("Dan je "+this.dan + ", Mesec je "+this.mesec +", godina je "+this.godina);
	}
	
	
	
	
	public int getDan() {
		return dan;
	}


	public void setDan(int dan) {
		this.dan = dan;
	}


	public int getMesec() {
		return mesec;
	}


	public void setMesec(int mesec) {
		this.mesec = mesec;
	}


	public int getGodina() {
		return godina;
	}


	public void setGodina(int godina) {
		this.godina = godina;
	}


	
	public static void setPrestupna(boolean prestupna) {
		Datum.prestupna = prestupna;
	}
	
}
