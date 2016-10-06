package abstractfactory.cpu;

public class AdmCpu implements Cpu {

	private int cpunum=0;
	
	public AdmCpu(int cpunum) {
		this.cpunum=cpunum;
	}
	
	@Override
	public void calulate() {
		// TODO Auto-generated method stub
		System.out.println("AdmµÄCPU,½ÅÊý£º"+cpunum);
	}

}
