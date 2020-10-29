package com.swjd.bean;


public class Sell {

  private long sellId;
  private long goodsId;
  private long sellNum;
  private long dessertId;
  private long surplusNum;

  public Sell(long goodsId, long sellNum, long dessertId, long surplusNum) {
    this.goodsId = goodsId;
    this.sellNum = sellNum;
    this.dessertId = dessertId;
    this.surplusNum = surplusNum;
  }

  public Sell() {
  }

  public long getSellId() {
    return sellId;
  }

  public void setSellId(long sellId) {
    this.sellId = sellId;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public long getSellNum() {
    return sellNum;
  }

  public void setSellNum(long sellNum) {
    this.sellNum = sellNum;
  }


  public long getDessertId() {
    return dessertId;
  }

  public void setDessertId(long dessertId) {
    this.dessertId = dessertId;
  }


  public long getSurplusNum() {
    return surplusNum;
  }

  public void setSurplusNum(long surplusNum) {
    this.surplusNum = surplusNum;
  }

  @Override
  public String toString() {
    return "Sell{" +
            "sellId=" + sellId +
            ", goodsId=" + goodsId +
            ", sellNum=" + sellNum +
            ", dessertId=" + dessertId +
            ", surplusNum=" + surplusNum +
            '}';
  }
}
