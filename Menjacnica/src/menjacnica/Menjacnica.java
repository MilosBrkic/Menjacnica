package menjacnica;


import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.InterfejsMenjacnica;
import kurs.Kurs;
import valuta.Valuta;

public class Menjacnica implements InterfejsMenjacnica {
	
	private LinkedList<Valuta> valute = new LinkedList<Valuta>();

	
	public LinkedList<Valuta> getValute() {
		return valute;
	}

	public void setValute(LinkedList<Valuta> valute) {
		if(valute.isEmpty())
			System.out.println("Lista je prazna");
		else
			this.valute = valute;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((valute == null) ? 0 : valute.hashCode());
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
		Menjacnica other = (Menjacnica) obj;
		if (valute == null) {
			if (other.valute != null)
				return false;
		} else if (!valute.equals(other.valute))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Valute:\n" + valute;
	}

	@Override
	public void dodavnjeKursa(String valuta, Kurs kurs) {
		for(int i=0; i<valute.size();i++)
		{
			if(valute.get(i).getNaziv().equals(valuta)) {			
				valute.get(i).getKursevi().add(kurs);
				System.out.println("Kurs je uspesno dodat");
				return;
			}
		}
		System.out.println("Ne postoji valuta pod tim nazivom");		
	}

	@Override
	public void brisanjeKursa(String valuta, GregorianCalendar datum) {
		GregorianCalendar pom;
		for(int i=0; i<valute.size();i++)
		{
			if(valute.get(i).getNaziv().equals(valuta)) {
				Valuta v = valute.get(i);
				for(int j=0; j<v.getKursevi().size(); j++) {
					pom=v.getKursevi().get(j).getDatum();
					if(pom.get(GregorianCalendar.YEAR)==datum.get(GregorianCalendar.YEAR)
					&& pom.get(GregorianCalendar.MONTH)==datum.get(GregorianCalendar.MONTH)
					&& pom.get(GregorianCalendar.DAY_OF_MONTH)==datum.get(GregorianCalendar.DAY_OF_MONTH)) {
						v.getKursevi().remove(j);
						System.out.println("Kurs je uspesno izbrisan");
						return;
					}
				}
				System.out.println("Ne postoji kurs za uneti datum");
				return;
			}
		}
		System.out.println("Ne postoji valuta pod tim nazivom");	
	}

	@Override
	public Kurs pronalazenjeKursa(String valuta, GregorianCalendar datum) {
		GregorianCalendar pom;
		for(int i=0; i<valute.size();i++)
		{
			if(valute.get(i).getNaziv().equals(valuta)) {
				Valuta v = valute.get(i);
				for(int j=0; j<v.getKursevi().size(); j++) {
					pom=v.getKursevi().get(j).getDatum();
					if(pom.get(GregorianCalendar.YEAR)==datum.get(GregorianCalendar.YEAR)
					&& pom.get(GregorianCalendar.MONTH)==datum.get(GregorianCalendar.MONTH)
					&& pom.get(GregorianCalendar.DAY_OF_MONTH)==datum.get(GregorianCalendar.DAY_OF_MONTH)) {
						return v.getKursevi().get(j);
					}
				}
				throw new RuntimeException("Ne postoji kurs za uneti datum");
			}
		}
		throw new RuntimeException("Ne postoji valuta pod tim nazivom");
	}
	
}