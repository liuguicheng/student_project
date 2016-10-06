package abstractfactory.factory;

import abstractfactory.cpu.Cpu;
import abstractfactory.mainborad.MainBoard;

public interface Abstractfactory {

	public MainBoard createMainBorad();
	
	public Cpu createCpu();
}
