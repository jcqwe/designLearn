package factory.abstractFactory;

/***
 *@title MainBoardFactory
 *@description 创建主板的工厂
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/9 14:38
 **/
public class MainBoardFactory {

    public static MainBoardApi creatorMainBoard(int type){
        MainBoardApi mainBoardApi = null;
        if(type == 1){
            mainBoardApi = new IntelMainBoard(1156);
        } else if (type == 2) {
            mainBoardApi = new AMDMainBoard(939);
        }
        return mainBoardApi;
    }
}
