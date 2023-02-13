package factory.abstractFactory.test;

/***
 *@title Client
 *@description <TODO description class purpose>
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/9 14:55
 **/
public class Client {
    public static void main(String[] args){
        Type1 type1 = new Type1();
        ComputerEngine computerEngine = new ComputerEngine();
        computerEngine.makeComputer(type1);
    }
}
