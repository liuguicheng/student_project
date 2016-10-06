package facade.facade;

import facade.ModuleA;
import facade.ModuleB;
import facade.ModuleC;

public class Facade {
	/**
	 * √≈√Ê¿‡
	 */
	
	public void test(){
		ModuleA ma=new ModuleA();
		ma.testA();
		ModuleB mb=new ModuleB();
		mb.testB();
		ModuleC mC=new ModuleC();
		mC.testC();
	}
}
