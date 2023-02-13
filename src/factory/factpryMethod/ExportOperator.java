package factory.factpryMethod;

/***
 *@title ExportOperator
 *@description 实现导出业务的对象
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/9 13:45
 **/
public abstract class ExportOperator {

    /**
     * 工厂方法，创建导出的文件对象的接口对象
     *
     * @return 导出的文件对象的接口对象
     */
    public abstract ExportFileApi factoryMethod();

    /**
     * 导出文件
     *
     * @param data 需要保存的数据
     * @return 是否成功导出文件
     */
    public boolean export(String data) {
        ExportFileApi exportFileApi = factoryMethod();
        return exportFileApi.export(data);
    }
}
