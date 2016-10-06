package abstractfactory.client;

import abstractfactory.factory.Abstractfactory;
import abstractfactory.factory.AdmFactory;

public class Test {

	
	
	public static void main(String[] args) {
		ComputerEngineer  ce=new ComputerEngineer();
		Abstractfactory ab=new AdmFactory();
		ce.makeComputer(ab);
	}
}
