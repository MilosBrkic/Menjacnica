package valuta;

import java.util.LinkedList;

import kurs.Kurs;

public class Valuta {
	private String naziv;
	private String skracenica;
	private LinkedList<Kurs> kursevi = new LinkedList<Kurs>();
	
	
	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public String getSkracenica() {
		return skracenica;
	}
	
	public void setSkracenica(String skracenica) {
		this.skracenica = skracenica;
	}
	
	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}
	
	public void setKursevi(LinkedList<Kurs> kursevi) {
		this.kursevi = kursevi;
	}
}