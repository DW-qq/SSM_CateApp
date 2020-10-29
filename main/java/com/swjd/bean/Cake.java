package com.swjd.bean;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.List;

@TableName
public class Cake {

  @TableId(value = "cakeId",type = IdType.AUTO)
  private long cakeId;
  private long dessertId;
  private long sellId;
  private String cakeName;
  private double cakePrice;
  private String cakePhoto;
  @TableField(exist = false)
  private List<Cakesell> cakesells;
  private String materials;
  public Cake() {
  }

  public Cake(long dessertId, long sellId, String cakeName, double cakePrice, String cakePhoto, List<Cakesell> cakesells, String materials) {
    this.dessertId = dessertId;
    this.sellId = sellId;
    this.cakeName = cakeName;
    this.cakePrice = cakePrice;
    this.cakePhoto = cakePhoto;
    this.cakesells = cakesells;
    this.materials = materials;
  }

  public long getCakeId() {
    return cakeId;
  }

  public void setCakeId(long cakeId) {
    this.cakeId = cakeId;
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


  public String getCakeName() {
    return cakeName;
  }

  public void setCakeName(String cakeName) {
    this.cakeName = cakeName;
  }


  public double getCakePrice() {
    return cakePrice;
  }

  public void setCakePrice(double cakePrice) {
    this.cakePrice = cakePrice;
  }


  public String getCakePhoto() {
    return cakePhoto;
  }

  public void setCakePhoto(String cakePhoto) {
    this.cakePhoto = cakePhoto;
  }

  public List<Cakesell> getCakesells() {
    return cakesells;
  }

  public void setCakesells(List<Cakesell> cakesells) {
    this.cakesells = cakesells;
  }

  public String getMaterials() {
    return materials;
  }

  public void setMaterials(String materials) {
    this.materials = materials;
  }

  @Override
  public String toString() {
    return "Cake{" +
            "cakeId=" + cakeId +
            ", dessertId=" + dessertId +
            ", sellId=" + sellId +
            ", cakeName='" + cakeName + '\'' +
            ", cakePrice=" + cakePrice +
            ", cakePhoto='" + cakePhoto + '\'' +
            ", cakesells=" + cakesells +
            ", materials='" + materials + '\'' +
            '}';
  }
}
