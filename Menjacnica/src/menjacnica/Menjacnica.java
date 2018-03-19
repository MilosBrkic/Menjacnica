package menjacnica;


import java.util.LinkedList;
import valuta.Valuta;

public class Menjacnica {
	
	private LinkedList<Valuta> valute = new LinkedList<Valuta>();

	
	public LinkedList<Valuta> getValute() {
		return valute;
	}

	public void setValute(LinkedList<Valuta> valute) {
		this.valute = valute;
	}
}