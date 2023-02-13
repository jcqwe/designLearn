package prototype.order.common;

/***
 *@title PersonalOrder
 *@description 个人订单对象
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/13 10:39
 **/
public class PersonalOrder implements OrderApi{
    /**
     * 订购人员姓名
     */
    private String orderPersonName;
    /**
     * 产品编码
     */
    private String productId;

    /**
     * 订单中产品数量
     */
    private int orderProductNum = 0;

    @Override
    public int getOrderProductNum() {
        return orderProductNum;
    }

    @Override
    public void setOrderProductNum(int orderProductNum) {
        this.orderProductNum = orderProductNum;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getOrderPersonName() {
        return orderPersonName;
    }

    public void setOrderPersonName(String orderPersonName) {
        this.orderPersonName = orderPersonName;
    }

    @Override
    public String toString() {
        return "个人订单：订购人员：" + getOrderPersonName() + ",产品编码=" + getProductId() + ",产品数量=" + getOrderProductNum();
    }
}
