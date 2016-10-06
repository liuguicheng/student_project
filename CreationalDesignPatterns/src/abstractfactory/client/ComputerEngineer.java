package abstractfactory.client;

import abstractfactory.cpu.Cpu;
import abstractfactory.factory.Abstractfactory;
import abstractfactory.mainborad.MainBoard;

public class ComputerEngineer {

	private Cpu cpu=null;
	private MainBoard mainboard=null;
	
	public void makeComputer(Abstractfactory ab){
		prepareHardwares(ab);
	}
	
	private void prepareHardwares(Abstractfactory ab){
		
		this.cpu=ab.createCpu();
		this.mainboard=ab.createMainBorad();
		this.cpu.calulate();
		this.mainboard.installCPU();
	}
	
}
