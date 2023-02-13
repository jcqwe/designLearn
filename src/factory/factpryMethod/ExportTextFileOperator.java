package factory.factpryMethod;

/***
 *@title ExportTextFileOperator
 *@description <TODO description class purpose>
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/9 13:51
 **/
public class ExportTextFileOperator extends ExportOperator{
    @Override
    public ExportFileApi factoryMethod() {
        return new ExportTextFile();
    }
}
