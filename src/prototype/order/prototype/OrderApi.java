package prototype.order.prototype;

import com.sun.org.apache.xpath.internal.operations.Or;

/***
 *@title OrderApi
 *@description 订单接口
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/13 10:36
 **/
public interface OrderApi {
    /**
     * 获取订单产品数量
     * @return 订单中产品数量
     */
    public int getOrderProductNum();

    /**
     * 设置订单产品数量
     * @param orderProductNum 订单产品数量
     */
    public void setOrderProductNum(int orderProductNum);

    /**
     * 克隆自己
     * @return 返回当前对象
     */
//    OrderApi clone();
}
