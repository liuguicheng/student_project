package polymorphicfactory;

public class HtmlExport implements ExportFile {

	@Override
	public boolean export(String data) {
		System.out.println("数据："+data+"，导出html格式");
		return true;
	}

}
