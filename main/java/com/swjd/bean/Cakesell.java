package com.swjd.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("cakeSell")
public class Cakesell {
@TableId(value = "cSellId",type = IdType.AUTO)
  private long cSellId;
@TableField("dessertId")
  private long dessertId;
  @TableField("cSellNum")
  private long cSellNum;
  @TableField("cSurplusNum")
  private long cSurplusNum;
  @TableField("cakeId")
  private long cakeId;

  public Cakesell() {
  }

  public Cakesell(long dessertId, long cSellNum, long cSurplusNum, long cakeId) {
    this.dessertId = dessertId;
    this.cSellNum = cSellNum;
    this.cSurplusNum = cSurplusNum;
    this.cakeId = cakeId;
  }

  public long getCSellId() {
    return cSellId;
  }

  public void setCSellId(long cSellId) {
    this.cSellId = cSellId;
  }


  public long getDessertId() {
    return dessertId;
  }

  public void setDessertId(long dessertId) {
    this.dessertId = dessertId;
  }


  public long getCSellNum() {
    return cSellNum;
  }

  public void setCSellNum(long cSellNum) {
    this.cSellNum = cSellNum;
  }


  public long getCSurplusNum() {
    return cSurplusNum;
  }

  public void setCSurplusNum(long cSurplusNum) {
    this.cSurplusNum = cSurplusNum;
  }


  public long getCakeId() {
    return cakeId;
  }

  public void setCakeId(long cakeId) {
    this.cakeId = cakeId;
  }

  @Override
  public String toString() {
    return "Cakesell{" +
            "cSellId=" + cSellId +
            ", dessertId=" + dessertId +
            ", cSellNum=" + cSellNum +
            ", cSurplusNum=" + cSurplusNum +
            ", cakeId=" + cakeId +
            '}';
  }
}
