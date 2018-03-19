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
		if(naziv!=null && !naziv.isEmpty())
			this.naziv = naziv;
		else
			System.out.println("Nepravilan unos");
	}
	
	public String getSkracenica() {
		return skracenica;
	}
	
	public void setSkracenica(String skracenica) {
		if(skracenica!=null && !skracenica.isEmpty())
			this.skracenica = skracenica;
		else
			System.out.println("Nepravilan unos");
	}
	
	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}
	
	public void setKursevi(LinkedList<Kurs> kursevi) {
		if(kursevi.isEmpty())
			System.out.println("Prazna lista");
		else
			this.kursevi = kursevi;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kursevi == null) ? 0 : kursevi.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skracenica == null) ? 0 : skracenica.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (kursevi == null) {
			if (other.kursevi != null)
				return false;
		} else if (!kursevi.equals(other.kursevi))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skracenica == null) {
			if (other.skracenica != null)
				return false;
		} else if (!skracenica.equals(other.skracenica))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Naziv valute: " + naziv + ", skracenica: " + skracenica+"\n";
	}
	
	
}