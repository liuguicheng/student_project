package polymorphicfactory;

public class HtmlExport implements ExportFile {

	@Override
	public boolean export(String data) {
		System.out.println("���ݣ�"+data+"������html��ʽ");
		return true;
	}

}
