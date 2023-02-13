package factory.abstractFactory;

import sun.applet.Main;

/***
 *@title AMDMainBoard
 *@description <TODO description class purpose>
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/9 14:31
 **/
public class AMDMainBoard implements MainBoardApi {
    private int cpus = 0;
    public AMDMainBoard(int cpus){
        this.cpus = cpus;
    }
    @Override
    public void installCpu() {
        System.out.println("主板:AMDMainBoard"+cpus);
    }
}
