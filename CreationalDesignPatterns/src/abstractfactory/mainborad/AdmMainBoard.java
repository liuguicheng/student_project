package abstractfactory.mainborad;

public class AdmMainBoard implements MainBoard {

	private int cpunum=0;
	public AdmMainBoard(int cpunum) {
		this.cpunum=cpunum;
	}
	
	@Override
	public void installCPU() {

		System.out.println("ADMµÄcpu½ÅÊı:"+cpunum);
	}

}
