package abstractfactory.cpu;

public class IntelCpu implements Cpu {

	private  int cpunum=0;
	public  IntelCpu(int cpunum) {
		this.cpunum=cpunum;
	}	
	@Override
	public void calulate() {
		System.out.println("IntelµÄCPU,½ÅÊý£º"+cpunum);
	}

}
