package polymorphicfactory.factory;

import polymorphicfactory.ExportFile;

public interface ExportFactory {

	public ExportFile export(String type);
}
