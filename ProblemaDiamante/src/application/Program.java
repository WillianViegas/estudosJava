package application;

import model.entities.ComboDevice;
import model.entities.ConcretePrinter;
import model.entities.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		
		ConcretePrinter p = new ConcretePrinter("1000");
		p.processDoc("My letter");
		p.Print("My letter");
		
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My email");
		System.out.println("Scan result: " + s.scan());
		
		ComboDevice c = new ComboDevice("2001");
		c.processDoc("My dissertation");
		c.Print("My dissertation");
		System.out.println("Scan result: " + c.scan());
	}

}
