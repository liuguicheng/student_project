package polymorphicfactory.factory;

import polymorphicfactory.ExportFile;
import polymorphicfactory.SvcExport;

public class SvcExportFactory implements ExportFactory {

	@Override
	public ExportFile export(String type) {
		if("zhangsan".equals(type)){
			return new SvcExport();
		}else if("lisi".equals(type)){
			return new SvcExport();
		}else{
			throw new RuntimeException("¿‡–Õ¥ÌŒÛ");
		}
	}

}
