package factory.abstractFactory.test;

import factory.abstractFactory.*;

/***
 *@title Type2
 *@description 配置：AMDCPU+Intel主板
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/9 14:51
 **/
public class Type2 implements AbstractFactory{
    @Override
    public CPUApi createCPUApi() {
        return new AMDCPU(939);
    }

    @Override
    public MainBoardApi createMainBoardApi() {
        return new IntelMainBoard(1156);
    }
}
