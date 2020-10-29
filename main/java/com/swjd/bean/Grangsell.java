package com.swjd.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("grangsell")
public class Grangsell {
@TableId(value = "gSellId",type = IdType.AUTO)
  private long gSellId;
@TableField("dessertId")
  private long dessertId;
  @TableField("gSellNum")
  private long gSellNum;
  @TableField("gSurplusNum")
  private long gSurplusNum;
  @TableField("grangId")
  private long grangId;

  public Grangsell() {
  }

  public Grangsell(long dessertId, long gSellNum, long gSurplusNum, long grangId) {
    this.dessertId = dessertId;
    this.gSellNum = gSellNum;
    this.gSurplusNum = gSurplusNum;
    this.grangId = grangId;
  }

  public long getGSellId() {
    return gSellId;
  }

  public void setGSellId(long gSellId) {
    this.gSellId = gSellId;
  }


  public long getDessertId() {
    return dessertId;
  }

  public void setDessertId(long dessertId) {
    this.dessertId = dessertId;
  }


  public long getGSellNum() {
    return gSellNum;
  }

  public void setGSellNum(long gSellNum) {
    this.gSellNum = gSellNum;
  }


  public long getGSurplusNum() {
    return gSurplusNum;
  }

  public void setGSurplusNum(long gSurplusNum) {
    this.gSurplusNum = gSurplusNum;
  }


  public long getGrangId() {
    return grangId;
  }

  public void setGrangId(long grangId) {
    this.grangId = grangId;
  }

  @Override
  public String toString() {
    return "Grangsell{" +
            "gSellId=" + gSellId +
            ", dessertId=" + dessertId +
            ", gSellNum=" + gSellNum +
            ", gSurplusNum=" + gSurplusNum +
            ", grangId=" + grangId +
            '}';
  }
}
