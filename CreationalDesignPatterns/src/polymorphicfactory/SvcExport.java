package polymorphicfactory;

public class SvcExport implements ExportFile {

	@Override
	public boolean export(String data) {
		System.out.println("数据："+data+"，导出svc格式");
		return true;
	}

}
