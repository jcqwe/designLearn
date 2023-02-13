package prototype.order.prototype;


/***
 *@title PersonalOrder
 *@description 企业订单对象
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/13 10:39
 **/
public class EnterpriseOrder implements OrderApi {
    /**
     * 企业人员姓名
     */
    private String enterpriseName;
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

    @Override
    public OrderApi clone() {
        EnterpriseOrder enterpriseOrder = new EnterpriseOrder();
        enterpriseOrder.setEnterpriseName(this.getEnterpriseName());
        enterpriseOrder.setOrderProductNum(this.getOrderProductNum());
        enterpriseOrder.setProductId(this.getProductId());
        return enterpriseOrder;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }


    @Override
    public String toString() {
        return "企业订单：企业名称：" + getEnterpriseName() + ",产品编码=" + getProductId() + ",产品数量=" + getOrderProductNum();
    }


}
