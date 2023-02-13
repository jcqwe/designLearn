package factory.abstractFactory;

/***
 *@title AMDCPU
 *@description <TODO description class purpose>
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/9 14:28
 **/
public class AMDCPU implements CPUApi{
    private int pins = 0;

    public AMDCPU(int pins){
        this.pins = pins;
    }
    @Override
    public void calculate() {
        System.out.println("AMDCPU"+pins);
    }
}
