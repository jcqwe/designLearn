package factory.factpryMethod;

/***
 *@title ExportFileApi
 *@description 文件导出对象接口
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/9 13:36
 **/
public interface ExportFileApi {
    /**
     * 将数据导出成文件
     * @param data 需要导出的数据
     * @return 是否导出成功
     */
    public boolean export(String data);
}
