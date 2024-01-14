package business;
import java.util.ArrayList;

public class Buergeramt {
	
	// Name des Buergeramtes
    private String name;
    // Oeffnungszeiten
    private float geoeffnetVon;
    private float geoeffnetBis;
    // Strasse und Hausnummer des Buergeramtes
    private String strasseHNr;
    // Dienstleistungen des Buergeramtes
    //private String[] dienstleistungen;
    private ArrayList<String> dienstleistungen = new ArrayList<String>();

    public Buergeramt(String name, float geoeffnetVon, float geoeffnetBis,
    	String strasseHNr, String[] dienstleistungen){
        if(dienstleistungen == null) {
            throw new IllegalArgumentException("Dienstleistungen duerfen nicht null sein.");
        }
   		this.name = name;
  	    this.geoeffnetVon = geoeffnetVon;
   	    this.geoeffnetBis = geoeffnetBis;
   	    this.strasseHNr = strasseHNr;
   	    setDienstleistungenAusStringArray(dienstleistungen);
    }
    
    public void setDienstleistungenAusStringArray(String[] dienstleistungen) {
        for(String value: dienstleistungen) {
            if(value != null) {
                this.dienstleistungen.add(value);
            }
        }
    }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getGeoeffnetVon() {
		return geoeffnetVon;
	}

	public void setGeoeffnetVon(float geoeffnetVon) {
		this.geoeffnetVon = geoeffnetVon;
	}

	public float getGeoeffnetBis() {
		return geoeffnetBis;
	}

	public void setGeoeffnetBis(float geoeffnetBis) {
		this.geoeffnetBis = geoeffnetBis;
	}

	public String getStrasseHNr() {
		return strasseHNr;
	}

	public void setStrasseHNr(String strasseHNr) {
		this.strasseHNr = strasseHNr;
	}

	public ArrayList<String> getDienstleistungen() {
		return this.dienstleistungen;
	}

	public void setDienstleistungen(String[] dienstleistungen) {
		for(String value: dienstleistungen) {
		    if(value != null) {
		        this.dienstleistungen.add(value);
		    }
		}
	}
	
	public String getDienstleistungenAlsString(char trenner) {
		String ergebnis = "";
		for(String current: this.dienstleistungen) {
		    ergebnis += current + trenner;
		}
		/*for(i = 0; i < this.getDienstleistungen().length - 1; i++) {
			ergebnis = ergebnis + this.getDienstleistungen()[i] + trenner; 
		}*/
		return ergebnis;
	}
	
	public String gibBuergeramtZurueck(char trenner){
  		return this.getName() + trenner 
  			+ this.getGeoeffnetVon() + trenner
  		    + this.getGeoeffnetBis() + trenner
  		    + this.getStrasseHNr() + trenner + "\n"
  		    + this.getDienstleistungenAlsString(trenner) + "\n";
  	}
}

