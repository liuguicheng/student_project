package abstractfactory.factory;

import abstractfactory.cpu.Cpu;
import abstractfactory.cpu.IntelCpu;
import abstractfactory.mainborad.IntelMainBoard;
import abstractfactory.mainborad.MainBoard;

public class IntelFactory implements Abstractfactory {

	@Override
	public MainBoard createMainBorad() {
		
		return new IntelMainBoard(755);
	}

	@Override
	public Cpu createCpu() {
		return new IntelCpu(755);
	}

}
