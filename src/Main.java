
public class Main {

	/*
	 * 	Na programskom jeziku Java kreirati klasu Datum koja sadrži:
		atribute instanci:dan i mesec;
		atribut klase:indikator da li je godina prestupna,
		metode instanci za:postavljanje tekućeg datuma i prikaz datuma na standardni izlaz,
		metode klase za:odredjivanje broja dana u zadatom mesecu, odredjivanje razlike (u danima) izmedju dva datuma,uredjivanje 2 datuma u neopadajući redosled i
		medjusobnu razmenu vrednosti dvoma datumima.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
	
		
		Datum datum = new Datum(2, 6, 1989);
	
		Datum datum2 = new Datum(27, 11, 2015);
		
		datum.prikazDatuma();
		datum2.prikazDatuma();
		
		System.out.println("Razlika u danima je "+datum.uporediDatume(datum2)+" dana");
		System.out.println("Broj dana u mesecu "+datum.odrediBrojDana(datum.getMesec()));
		
		
		Datum datum3 = new Datum();
		datum3.setDan(5);
		datum3.setMesec(5);
		datum3.setGodina(1994);
		datum3.prikazDatuma();
		System.out.println("Da li je godina prestupna --"+datum3.Isprestupna());
		
		
		datum3.razmena(datum);
		datum3.prikazDatuma();
		
		
		
	
		
		
	}
}
