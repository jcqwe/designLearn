package factory.abstractFactory;

/***
 *@title Factory
 *@description 创建CPU对象的工厂
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/9 14:34
 **/
public class CPUFactory {


    public static CPUApi creatorCPU(int type){
        CPUApi cpuApi = null;
        if(type == 1){
            cpuApi = new IntelCPU(1156);
        } else if (type == 2) {
            cpuApi = new AMDCPU(939);
        }
        return cpuApi;
    }
}
