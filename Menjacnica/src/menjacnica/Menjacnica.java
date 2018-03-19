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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brisanjeKursa(String valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Kurs pronalazenjeKursa(String valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}