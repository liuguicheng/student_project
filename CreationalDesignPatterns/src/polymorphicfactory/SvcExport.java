package polymorphicfactory;

public class SvcExport implements ExportFile {

	@Override
	public boolean export(String data) {
		System.out.println("���ݣ�"+data+"������svc��ʽ");
		return true;
	}

}
