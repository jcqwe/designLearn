package factory.abstractFactory;

/***
 *@title Client
 *@description <TODO description class purpose>
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/9 14:40
 **/
public class Client {
    public static void main(String[] args){
        ComputerEngine computerEngine = new ComputerEngine();
        computerEngine.makeComputer(2,2);
    }
}
