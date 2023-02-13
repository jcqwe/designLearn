package factory.abstractFactory;

/***
 *@title IntelMainBoard
 *@description <TODO description class purpose>
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/9 14:33
 **/
public class IntelMainBoard implements MainBoardApi {
    private int cpus = 0;
    public IntelMainBoard(int cpus){
        this.cpus = cpus;
    }

    @Override
    public void installCpu() {
        System.out.println("主板:IntelMainBoard"+cpus);
    }
}
