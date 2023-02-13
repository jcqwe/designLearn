package factory.factpryMethod;

/***
 *@title ExportXmlFile
 *@description <TODO description class purpose>
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/9 13:50
 **/
public class ExportXmlFile implements ExportFileApi{
    @Override
    public boolean export(String data) {
        System.out.println("导出数据" + data + "到XML文件中");
        return true;
    }
}
