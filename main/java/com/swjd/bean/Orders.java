package com.swjd.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.List;

@TableName
public class Orders {

  @TableId(value ="ordersId",type = IdType.AUTO)
  private long ordersId;
  @TableField("orderDate")
  private String orderDate;
  @TableField("userId")
  private long userId;
  @TableField("goodsId")
  private long goodsId;
  @TableField("count")
  private long count;
  @TableField("tasteChoice")
  private String tasteChoice;
  @TableField("specsChoice")
  private String specsChoice;
  @TableField(exist = false)
  private Goodsall goodsalls;

  public Orders(String orderDate, long userId, long goodsId, long count, String tasteChoice, String specsChoice) {
    this.orderDate = orderDate;
    this.userId = userId;
    this.goodsId = goodsId;
    this.count = count;
    this.tasteChoice = tasteChoice;
    this.specsChoice = specsChoice;
  }

  public Orders() {
  }

  public long getOrdersId() {
    return ordersId;
  }

  public void setOrdersId(long ordersId) {
    this.ordersId = ordersId;
  }


  public String getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(String orderDate) {
    this.orderDate = orderDate;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }


  public String getTasteChoice() {
    return tasteChoice;
  }

  public void setTasteChoice(String tasteChoice) {
    this.tasteChoice = tasteChoice;
  }

  public String getSpecsChoice() {
    return specsChoice;
  }

  public void setSpecsChoice(String specsChoice) {
    this.specsChoice = specsChoice;
  }


  public Goodsall getGoodsalls() {
    return goodsalls;
  }

  public void setGoodsalls(Goodsall goodsalls) {
    this.goodsalls = goodsalls;
  }

  @Override
  public String toString() {
    return "Orders{" +
            "ordersId=" + ordersId +
            ", orderDate='" + orderDate + '\'' +
            ", userId=" + userId +
            ", goodsId=" + goodsId +
            ", count=" + count +
            ", tasteChoice='" + tasteChoice + '\'' +
            ", specsChoice='" + specsChoice + '\'' +
            ", goodsalls=" + goodsalls +
            '}';
  }
}
