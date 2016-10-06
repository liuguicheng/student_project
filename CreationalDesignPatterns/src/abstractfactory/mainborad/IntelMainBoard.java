package abstractfactory.mainborad;

public class IntelMainBoard implements MainBoard {
	
	/**
    * CPU插槽的孔数
    */
   private int cpuHoles = 0;
   /**
    * 构造方法，传入CPU插槽的孔数
    * @param cpuHoles
    */
   public IntelMainBoard(int cpuHoles){
       this.cpuHoles = cpuHoles;
   }

	@Override
	public void installCPU() {
		
		System.out.println("intel的cpu插槽脚数："+cpuHoles);

	}

}
