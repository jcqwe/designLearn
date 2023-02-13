package prototype.order.common;

/***
 *@title OrderBusiness
 *@description
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/13 10:35
 **/
public class OrderBusiness {
    /**
     *  现在有一个订单处理的系统，里面有个保存订单的业务功能，在这个业务功能里面，客户有这么一个需求：每当订单的预定产品数量超过1000的时候，就需要把订单拆成两份订单来保存，如果拆成两份订单后，还是超过1000，那就继续拆分，直到每份订单的预定产品数量不超过1000。至于为什么要拆分，原因是好进行订单的后续处理，后续是由人工来处理，每个人工工作小组的处理能力上限是1000。
     * 根据业务，目前的订单类型被分成两种：一种是个人订单，一种是公司订单。现在想要实现一个通用的订单处理系统，也就是说，不管具体是什么类型的订单，都要能够正常的处理。
     */

    /**
     *   不使用原型对象
     *  根据订单对象的产品数量进行判断是否需要拆分新的订单
     * @param order 订单对象
     */
    public void saveOrder(OrderApi order){
        //判断订单中产品数量是否大于1000, 大于1000时拆分成两个订单对象
        while (order.getOrderProductNum() > 1000){
            //新的对象
            OrderApi newOrder = null;
            //判断订单对象类型
            if(order instanceof PersonalOrder){
                //创建新的个人订单对象
                PersonalOrder p1 = new PersonalOrder();
                PersonalOrder p2 = (PersonalOrder) order;

                p1.setOrderPersonName(p2.getOrderPersonName());
                p1.setProductId(p2.getProductId());
                p1.setOrderProductNum(1000);
                newOrder = p1;
            }else if(order instanceof EnterpriseOrder){
                //创建新的企业订单对象
                EnterpriseOrder e1 = new EnterpriseOrder();
                EnterpriseOrder e2 = (EnterpriseOrder) order;

                e1.setEnterpriseName(e2.getEnterpriseName());
                e1.setProductId(e2.getProductId());
                e1.setOrderProductNum(1000);
                newOrder = e2;
            }
            order.setOrderProductNum(order.getOrderProductNum() - 1000);
            System.out.println("拆分成订单=" + newOrder);
        }
        System.out.println("订单=" + order);
    }
}
