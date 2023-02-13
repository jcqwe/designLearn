package factory.abstractFactory;

/***
 *@title IntelCpu
 *@description <TODO description class purpose>
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/9 14:28
 **/
public class IntelCPU implements CPUApi{
    private int pins = 0;
    public IntelCPU(int pins){
        this.pins = pins;
    }
    @Override
    public void calculate() {
        System.out.println("IntelCPU测试"+pins);
    }
}
