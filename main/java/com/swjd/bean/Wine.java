package com.swjd.bean;


import java.util.List;

public class Wine {

  private long wineId;
  private long dessertId;
  private long sellId;
  private String wineName;
  private double winePrice;
  private String winePhoto;
  private List<Winsell> wines;
  private String materials;

  public Wine() {
  }

  public Wine(long dessertId, long sellId, String wineName, double winePrice, String winePhoto, List<Winsell> wines, String materials) {
    this.dessertId = dessertId;
    this.sellId = sellId;
    this.wineName = wineName;
    this.winePrice = winePrice;
    this.winePhoto = winePhoto;
    this.wines = wines;
    this.materials = materials;
  }

  public long getWineId() {
    return wineId;
  }

  public void setWineId(long wineId) {
    this.wineId = wineId;
  }


  public long getDessertId() {
    return dessertId;
  }

  public void setDessertId(long dessertId) {
    this.dessertId = dessertId;
  }


  public long getSellId() {
    return sellId;
  }

  public void setSellId(long sellId) {
    this.sellId = sellId;
  }


  public String getWineName() {
    return wineName;
  }

  public void setWineName(String wineName) {
    this.wineName = wineName;
  }


  public double getWinePrice() {
    return winePrice;
  }

  public void setWinePrice(double winePrice) {
    this.winePrice = winePrice;
  }


  public String getWinePhoto() {
    return winePhoto;
  }

  public void setWinePhoto(String winePhoto) {
    this.winePhoto = winePhoto;
  }

  public List<Winsell> getWines() {
    return wines;
  }

  public void setWines(List<Winsell> wines) {
    this.wines = wines;
  }

  public String getMaterials() {
    return materials;
  }

  public void setMaterials(String materials) {
    this.materials = materials;
  }

  @Override
  public String toString() {
    return "Wine{" +
            "wineId=" + wineId +
            ", dessertId=" + dessertId +
            ", sellId=" + sellId +
            ", wineName='" + wineName + '\'' +
            ", winePrice=" + winePrice +
            ", winePhoto='" + winePhoto + '\'' +
            ", wines=" + wines +
            ", materials='" + materials + '\'' +
            '}';
  }
}
