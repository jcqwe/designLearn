package factory.abstractFactory.test;

import factory.abstractFactory.AMDMainBoard;
import factory.abstractFactory.CPUApi;
import factory.abstractFactory.IntelCPU;
import factory.abstractFactory.MainBoardApi;

/***
 *@title CPUFactory
 *@description 配置：IntelCPU+AMD主板
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/9 14:49
 **/
public class Type1 implements AbstractFactory{
    @Override
    public CPUApi createCPUApi() {

        return new IntelCPU(1156);
    }

    @Override
    public MainBoardApi createMainBoardApi() {
        return new AMDMainBoard(939);
    }
}
