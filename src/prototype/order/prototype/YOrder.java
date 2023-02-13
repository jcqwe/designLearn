package prototype.order.prototype;

/***
 *@title YOrder
 *@description <TODO description class purpose>
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/13 15:16
 **/
public class YOrder implements OrderApi{
    private String yName;

    private String productId;

    private int orderProductNum = 0;

    @Override
    public int getOrderProductNum() {
        return this.orderProductNum;
    }

    @Override
    public void setOrderProductNum(int orderProductNum) {
        this.orderProductNum = orderProductNum;
    }

    @Override
    public OrderApi clone() {
        YOrder yOrder = new YOrder();
        yOrder.setyName(this.getyName());
        yOrder.setProductId(this.getProductId());
        yOrder.setOrderProductNum(this.orderProductNum);
        return yOrder;
    }
    public String getyName() {
        return yName;
    }

    public void setyName(String yName) {
        this.yName = yName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {

        return "个人订单：订购人员：" + getyName() + ",产品编码=" + getProductId() + ",产品数量=" + getOrderProductNum();
    }


}
