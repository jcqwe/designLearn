package prototype.order;


import prototype.order.prototype.OrderBusiness;
import prototype.order.prototype.PersonalOrder;
import prototype.order.prototype.YOrder;

/***
 *@title Client
 *@description 客户端
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/13 10:55
 **/
public class Client {
    public static void main(String[] args){
        //不适用原型对象
//        OrderBusiness orderBusiness = new OrderBusiness();
//
//        PersonalOrder personalOrder = new PersonalOrder();
//        personalOrder.setOrderProductNum(2996);
//        personalOrder.setOrderPersonName("jc");
//        personalOrder.setProductId("225536");
//
//        orderBusiness.saveOrder(personalOrder);
        //根据运行结果1份订单被拆分成了3份、这样会出现新的问题就是：难以扩展新的订单类型。

        //使用原型对象
        OrderBusiness orderBusiness = new OrderBusiness();

        PersonalOrder personalOrder = new PersonalOrder();
        personalOrder.setOrderProductNum(2996);
        personalOrder.setOrderPersonName("jc");
        personalOrder.setProductId("225536");

        YOrder yOrder = new YOrder();

        yOrder.setOrderProductNum(2996);
        yOrder.setyName("jc");
        yOrder.setProductId("225536");

        orderBusiness.saveOrder(personalOrder);
    }
}
