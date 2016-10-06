package polymorphicfactory.factory;

import polymorphicfactory.ExportFile;
import polymorphicfactory.HtmlExport;

public class HtmlExportFactory implements ExportFactory {

	@Override
	public ExportFile export(String type) {
		if("zhangsan".equals(type)){
			return new HtmlExport();
		}else if("lisi".equals(type)){
			return new HtmlExport();
		}else{
			throw new RuntimeException("¿‡–Õ¥ÌŒÛ");
		}
	}

}
