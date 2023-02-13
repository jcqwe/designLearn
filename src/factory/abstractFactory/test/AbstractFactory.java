package factory.abstractFactory.test;

import factory.abstractFactory.CPUApi;
import factory.abstractFactory.MainBoardApi;

/***
 *@title AbstractFactory
 *@description <TODO description class purpose>
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/9 14:48
 **/
public interface AbstractFactory {
    public CPUApi createCPUApi();
    public MainBoardApi createMainBoardApi();
}
