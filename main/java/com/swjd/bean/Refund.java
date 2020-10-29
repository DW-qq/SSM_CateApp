package com.swjd.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName
public class Refund {

  @TableId(value = "refundId",type = IdType.AUTO)
  private long refundId;
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
  @TableField("refundDate")
  private String refundDate;
  @TableField(exist = false)
  private Goodsall goodsalls;

  public Refund() {
  }

  public Refund(long userId, long goodsId, long count, String tasteChoice, String specsChoice, String refundDate) {
    this.userId = userId;
    this.goodsId = goodsId;
    this.count = count;
    this.tasteChoice = tasteChoice;
    this.specsChoice = specsChoice;
    this.refundDate = refundDate;
  }

  public long getRefundId() {
    return refundId;
  }

  public void setRefundId(long refundId) {
    this.refundId = refundId;
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


  public String getRefundDate() {
    return refundDate;
  }

  public void setRefundDate(String refundDate) {
    this.refundDate = refundDate;
  }

  public Goodsall getGoodsalls() {
    return goodsalls;
  }

  public void setGoodsalls(Goodsall goodsalls) {
    this.goodsalls = goodsalls;
  }

  @Override
  public String toString() {
    return "Refund{" +
            "refundId=" + refundId +
            ", userId=" + userId +
            ", goodsId=" + goodsId +
            ", count=" + count +
            ", tasteChoice='" + tasteChoice + '\'' +
            ", specsChoice='" + specsChoice + '\'' +
            ", refundDate='" + refundDate + '\'' +
            ", goodsalls=" + goodsalls +
            '}';
  }
}
