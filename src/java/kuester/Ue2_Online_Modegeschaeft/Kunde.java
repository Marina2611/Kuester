package kuester.Ue2_Online_Modegeschaeft;

/**
* Nutzer des Modegesch�fts. Haben einen Warenkorb in den
* sie Artikel hinzuf�gen und l�schen k�nnen. K�nnen aus 
* dem Warenkorb Bestellungen ausl�sen.
*/
public class Kunde implements IKunde {

	private int kundenID;
	private String nachname;
	private String vorname;
	private Warenkorb waren = new Warenkorb(this);

	public Kunde getReplacementKunde() {
		return replacementKunde;
	}

	public void setReplacementKunde(Kunde replacementKunde) {
		this.replacementKunde = replacementKunde;
	}

	private Kunde replacementKunde;

	public Kunde(String s){
		String[] teil = s.split(";");
		this.kundenID = Integer.parseInt(teil[0]);
		this.nachname = teil[1];
		this.vorname = teil[2];	
	}
	
	@Override
	public int getKundenID() {
		return kundenID;
	}

	@Override
	public void setKundenID(int kundenID) {
		this.kundenID = kundenID;
	}

	@Override
	public String getNachname() {
		return nachname;
	}

	@Override
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	@Override
	public String getVorname() {
		return vorname;
	}

	@Override
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	@Override
	public Warenkorb getWarenkorb() {
		return waren;
	}
	
}
