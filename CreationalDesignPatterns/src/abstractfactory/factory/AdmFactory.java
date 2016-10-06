package abstractfactory.factory;

import abstractfactory.cpu.AdmCpu;
import abstractfactory.cpu.Cpu;
import abstractfactory.mainborad.AdmMainBoard;
import abstractfactory.mainborad.MainBoard;

public class AdmFactory implements Abstractfactory {

	@Override
	public MainBoard createMainBorad() {
		return new AdmMainBoard(955);
	}

	@Override
	public Cpu createCpu() {
		return new AdmCpu(955);
	}

}
