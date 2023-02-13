package factory.factpryMethod;

/***
 *@title ExportTextFile
 *@description <TODO description class purpose>
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/9 13:48
 **/
public class ExportTextFile implements ExportFileApi{

    @Override
    public boolean export(String data) {
        System.out.println("导出数据" + data + "到文本中");
        return true;
    }
}
