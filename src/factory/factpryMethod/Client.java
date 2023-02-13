package factory.factpryMethod;

/***
 *@title Client
 *@description <TODO description class purpose>
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/9 13:51
 **/
public class Client {
    public static void main(String[] args){
        ExportTextFileOperator exportTextFileOperator = new ExportTextFileOperator();
        exportTextFileOperator.export("ddd");
    }
}
