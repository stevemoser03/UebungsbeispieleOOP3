package beispiel2_verwaltungsstrafe;

public class Verwaltungsstrafe {

	private String vorname;
	private String nachname;
	private String kennzeichen;
	private int strafnummer;
	private double strafe;
	private byte anzahl;
	private int nummer = 0;
	
	public Verwaltungsstrafe(String vorname, String nachname, String kennzeichen) {
		nummer+=1;
		this.vorname = vorname;
		this.nachname = nachname;
		this.kennzeichen = kennzeichen;
		this.strafnummer = nummer;
	}

	public String getKennzeichen() {
		return kennzeichen;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public int getStrafnummer() {
		return strafnummer;
	}
	
	public byte getAnzahl() {
		return anzahl;
	}
	
	public void strafe(int geschwindigkeitsueberschreitung){
		anzahl++;
		if(geschwindigkeitsueberschreitung <= 20){
			strafe += 30;
		}
		else if (geschwindigkeitsueberschreitung >20 && geschwindigkeitsueberschreitung <=30){
			strafe += 50;
		}
		else if (geschwindigkeitsueberschreitung >30 && geschwindigkeitsueberschreitung <=50){
			strafe += 100;
		}
		else if (geschwindigkeitsueberschreitung >50 && geschwindigkeitsueberschreitung <=100){
			strafe += 500;
		}
		else if (geschwindigkeitsueberschreitung > 100){
			strafe += 1500;
		}
	}
	
	public void verbandspaket(){
		anzahl++;
		strafe += 25;
	}
	
	public void alkohol(double promille){
		anzahl+=2;
		if(promille < 0.5){
			strafe+=0;
		}
		else if(promille >= 0.5 && promille <= 1.0){
			strafe+=100;
		}
		else if(promille > 1.0 && promille <= 2.0){
			strafe+=400;
		}
		else if(promille > 2.0 && promille <= 3.0){
			strafe+=1000;
		}
		else if(promille > 3.0){
			strafe+=5000;
		}
	}
	
	public void sonstiges(double wert){
		anzahl++;
		strafe+=wert;
	}
	
	public void getStrafe(){
		
		if(anzahl==1){
			System.out.println(strafe+" "+"- 30% "+" = "+strafe*0.7);
		}
		else if(anzahl==2){
			System.out.println(strafe+" "+"- 20% "+" = "+strafe*0.8);
		}
		else if(anzahl==3){
			System.out.println(strafe+" "+"- 10% "+" = "+strafe*0.9);
		}
		else if(anzahl<=4){
			System.out.println(strafe+" "+"- 0% "+" = "+strafe);
		}
	}
	
	
}
