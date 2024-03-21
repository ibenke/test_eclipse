package test;

public class Osoba {

	String ime;
	String prezime;
	String oib;
	String adresa_prebivalista;
	String datum_rodenja;
	
	public Osoba() {
		
	}
	
	public Osoba(String i, String p, String o) {
		ime = i;
		prezime = p;
		oib = o;
	}
	
	public Osoba(String i, String p, String o, String a, String d) {
		ime = i;
		prezime = p;
		oib = o;
		adresa_prebivalista = a;
		datum_rodenja = d;
	}
	
	public void Ispis() {
		System.out.println("Ime: " +ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("OIB: " + oib);
		System.out.println("Adresa prebivališta: " + adresa_prebivalista);
		}
	
	public void AzurirajAdresu(String a) {
		if(a != null && !a.isEmpty())
		adresa_prebivalista = a;
		else System.out.println("Pogresan unos!");;
		}
	
	public void ProvjeraOIB() {
		try {
			long l = Long.parseLong(oib);
			if(l < 0) {
				System.out.println("OIB ne smije biti negativan broj!");
				return;
			}
		}
		catch(NumberFormatException nfe){
			System.out.println("OIB mora sadržavati samo znamenke!");
			return;
		}
		if( oib.length()!=11) {
			System.out.println("OIB mora sadržavati 11 znamenaka!");
			return;
		}
		else {
			System.out.println("OIB je ispravnog formata.");
			}
		}
	public static void main(String[] args) {
		Osoba o1 = new Osoba();
		// ispis imena, prezimena i OIB-a objekta o1, to su prazni stringovi zbog poziva konstruktora bez argumenata:
		System.out.println("Ime: " + o1.ime);
		System.out.println("Prezime: " + o1.prezime);
		System.out.println("OIB: " + o1.oib);
		System.out.println("Adresa prebivališta: " + o1.adresa_prebivalista);
		System.out.println("Datum rođenja: " + o1.datum_rodenja);
		System.out.println("-----------------");
		o1.ime = "Marko"; // definiramo ime objekta o1
		o1.prezime = "Maric"; // definiramo prezime objekta o1
		o1.oib = "01234567891"; // definiramo OIB objekta o1
		o1.adresa_prebivalista = "Matije Gupca 78";
		o1.datum_rodenja = "11.08.1991.";
		System.out.println("Ime: " + o1.ime);
		System.out.println("Prezime: " + o1.prezime);
		System.out.println("OIB: " + o1.oib);
		System.out.println("Adresa prebivališta: " + o1.adresa_prebivalista);
		System.out.println("Datum rođenja: " + o1.datum_rodenja);
		System.out.println("-----------------");
		 // kreiramo objekt o2 klase Osoba pozivom drugog konstruktora:
		Osoba o2 = new Osoba("Ivan", "Horvat", "98765432100");
		o2.adresa_prebivalista = "Matije Gupca 78";
		System.out.println("Ime: " + o2.ime);
		System.out.println("Prezime: " + o2.prezime);
		System.out.println("OIB: " + o2.oib);
		System.out.println("Adresa prebivališta: " + o2.adresa_prebivalista);
		System.out.println("Datum rođenja: " + o2.datum_rodenja);
		System.out.println("-----------------");
		Osoba o3 = new Osoba("Ivan", "Horvat", "98765432100", "Petra Preradovića 12", "12.10.1994");
		System.out.println("Ime: " + o3.ime);
		System.out.println("Prezime: " + o3.prezime);
		System.out.println("OIB: " + o3.oib);
		System.out.println("Adresa prebivališta: " + o3.adresa_prebivalista);
		System.out.println("Datum rođenja: " + o3.datum_rodenja);
		System.out.println("-----------------");
		o3.Ispis();
		o3.AzurirajAdresu("Ilica 111, 10000 Zagreb");
		o3.AzurirajAdresu("");
		o3.Ispis();
		o3.ProvjeraOIB();


		

	}

}
