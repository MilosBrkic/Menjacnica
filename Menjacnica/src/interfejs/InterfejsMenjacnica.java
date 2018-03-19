package interfejs;

import java.util.GregorianCalendar;

import kurs.Kurs;

public interface InterfejsMenjacnica {
	
	public void dodavnjeKursa(String valuta, Kurs kurs);
	public void brisanjeKursa(String valuta, GregorianCalendar datum);
	public Kurs pronalazenjeKursa(String valuta, GregorianCalendar datum);
}