package polymorphicfactory.client;

import polymorphicfactory.ExportFile;
import polymorphicfactory.factory.ExportFactory;
import polymorphicfactory.factory.SvcExportFactory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String type="zhangsan";
		String data="12353453";
		try{
		
		ExportFactory ef=new SvcExportFactory();
		ExportFile efile=ef.export(type);
		efile.export(data);
		}catch(Exception e ){
			System.out.println(e.getMessage());
		}
	}

}
