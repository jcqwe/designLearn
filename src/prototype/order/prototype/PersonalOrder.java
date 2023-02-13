package prototype.order.prototype;


import java.io.*;

/***
 *@title PersonalOrder
 *@description 个人订单对象
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/13 10:39
 **/
public class PersonalOrder implements OrderApi, Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

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

//    @Override
//    public OrderApi clone() {
//        PersonalOrder personalOrder = new PersonalOrder();
//        personalOrder.setOrderPersonName(this.getOrderPersonName());
//        personalOrder.setOrderProductNum(this.getOrderProductNum());
//        personalOrder.setProductId(this.getProductId());
//        return personalOrder;
//    }
    //使用Object的clone方法
//    @Override
//    public OrderApi clone() {
//        //直接调用父类的clone方法
//        OrderApi cloneOrder = null;
//        try {
//            cloneOrder = (OrderApi) super.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return cloneOrder;
//    }

    /**
     *
     * @return
     */
    public Object cloneBySeriable() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);//当前对象以流的方式输出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);

            //反序列化后的新对象
            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //关闭流
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
        return null;
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
