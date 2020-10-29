package com.swjd.bean;


public class Winsell {

  private long wSellId;
  private long dessertId;
  private long wSellNum;
  private long wSurplusNum;
  private long wineId;

  public Winsell() {
  }

  public Winsell(long dessertId, long wSellNum, long wSurplusNum, long wineId) {
    this.dessertId = dessertId;
    this.wSellNum = wSellNum;
    this.wSurplusNum = wSurplusNum;
    this.wineId = wineId;
  }

  public long getWSellId() {
    return wSellId;
  }

  public void setWSellId(long wSellId) {
    this.wSellId = wSellId;
  }


  public long getDessertId() {
    return dessertId;
  }

  public void setDessertId(long dessertId) {
    this.dessertId = dessertId;
  }


  public long getWSellNum() {
    return wSellNum;
  }

  public void setWSellNum(long wSellNum) {
    this.wSellNum = wSellNum;
  }


  public long getWSurplusNum() {
    return wSurplusNum;
  }

  public void setWSurplusNum(long wSurplusNum) {
    this.wSurplusNum = wSurplusNum;
  }


  public long getWineId() {
    return wineId;
  }

  public void setWineId(long wineId) {
    this.wineId = wineId;
  }

  @Override
  public String toString() {
    return "Winsell{" +
            "wSellId=" + wSellId +
            ", dessertId=" + dessertId +
            ", wSellNum=" + wSellNum +
            ", wSurplusNum=" + wSurplusNum +
            ", wineId=" + wineId +
            '}';
  }
}
