package factory.abstractFactory;

/***
 *@title ComputerEngine
 *@description <TODO description class purpose>
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/9 14:41
 **/
public class ComputerEngine {
    /**
     * 定义组装机器需要的CPU
     */
    private CPUApi cpu= null;
    /**
     * 定义组装机器需要的主板
     */
    private MainBoardApi mainboard = null;
    /**
     * 装机过程
     * @param cpuType 客户选择所需CPU的类型
     * @param mainboardType 客户选择所需主板的类型
     */
    public void makeComputer(int cpuType,int mainboardType){
        //1：首先准备好装机所需要的配件
        prepareHardwares(cpuType,mainboardType);
        //2：组装机器
        //3：测试机器
        //4：交付客户
    }
    /**
     * 准备装机所需要的配件
     * @param cpuType 客户选择所需CPU的类型
     * @param mainboardType 客户选择所需主板的类型
     */
    private void prepareHardwares(int cpuType,int mainboardType){
        //这里要去准备CPU和主板的具体实现，为了示例简单，这里只准备这两个
        //可是，装机工程师并不知道如何去创建，怎么办呢？

        //直接找相应的工厂获取
        this.cpu = CPUFactory.creatorCPU(cpuType);
        this.mainboard = MainBoardFactory.creatorMainBoard(mainboardType);

        //测试一下配件是否好用
        this.cpu.calculate();
        this.mainboard.installCpu();
    }
}
