package com.swjd.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.List;

@TableName
public class Goodsall {

  @TableField("dessertId")
  private long dessertId;
  @TableField("goodsName")
  private String goodsName;
  @TableField("goodsPrice")
  private double goodsPrice;
  @TableField("goodsPhoto")
  private String goodsPhoto;
  @TableField("materials")
  private String materials;
  @TableId(value = "goodsId",type = IdType.AUTO)
  private long goodsId;
  @TableField(exist = false)
  private List<Sell> sells;

  public Goodsall() {
  }

  public Goodsall(long dessertId, String goodsName, double goodsPrice, String goodsPhoto, String materials) {
    this.dessertId = dessertId;
    this.goodsName = goodsName;
    this.goodsPrice = goodsPrice;
    this.goodsPhoto = goodsPhoto;
    this.materials = materials;
  }

  public long getDessertId() {
    return dessertId;
  }

  public void setDessertId(long dessertId) {
    this.dessertId = dessertId;
  }


  public String getGoodsName() {
    return goodsName;
  }

  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }


  public double getGoodsPrice() {
    return goodsPrice;
  }

  public void setGoodsPrice(double goodsPrice) {
    this.goodsPrice = goodsPrice;
  }


  public String getGoodsPhoto() {
    return goodsPhoto;
  }

  public void setGoodsPhoto(String goodsPhoto) {
    this.goodsPhoto = goodsPhoto;
  }


  public String getMaterials() {
    return materials;
  }

  public void setMaterials(String materials) {
    this.materials = materials;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }

  public List<Sell> getSells() {
    return sells;
  }

  public void setSells(List<Sell> sells) {
    this.sells = sells;
  }

  @Override
  public String toString() {
    return "Goodsall{" +
            "dessertId=" + dessertId +
            ", goodsName='" + goodsName + '\'' +
            ", goodsPrice=" + goodsPrice +
            ", goodsPhoto='" + goodsPhoto + '\'' +
            ", materials='" + materials + '\'' +
            ", goodsId=" + goodsId +
            ", sells=" + sells +
            '}';
  }
}
