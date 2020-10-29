package com.swjd.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.List;

@TableName
public class Grang {
  @TableId(value = "grangId",type = IdType.AUTO)
  private long grangId;
  @TableField("dessertId")
  private long dessertId;
  @TableField("sellId")
  private long sellId;
  @TableField("grangName")
  private String grangName;
  @TableField("grangPrice")
  private double grangPrice;
  @TableField("grangPhoto")
  private String grangPhoto;
  @TableField(exist = false)
  private List<Grangsell> grangsells;
  private String materials;

  public Grang() {
  }

  public Grang(long dessertId, long sellId, String grangName, double grangPrice, String grangPhoto, List<Grangsell> grangsells, String materials) {
    this.dessertId = dessertId;
    this.sellId = sellId;
    this.grangName = grangName;
    this.grangPrice = grangPrice;
    this.grangPhoto = grangPhoto;
    this.grangsells = grangsells;
    this.materials = materials;
  }

  public Grang(long dessertId, long sellId, String grangName, double grangPrice, String grangPhoto, List<Grangsell> grangsells) {
    this.dessertId = dessertId;
    this.sellId = sellId;
    this.grangName = grangName;
    this.grangPrice = grangPrice;
    this.grangPhoto = grangPhoto;
    this.grangsells = grangsells;
  }

  public long getGrangId() {
    return grangId;
  }

  public void setGrangId(long grangId) {
    this.grangId = grangId;
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


  public String getGrangName() {
    return grangName;
  }

  public void setGrangName(String grangName) {
    this.grangName = grangName;
  }


  public double getGrangPrice() {
    return grangPrice;
  }

  public void setGrangPrice(double grangPrice) {
    this.grangPrice = grangPrice;
  }


  public String getGrangPhoto() {
    return grangPhoto;
  }

  public void setGrangPhoto(String grangPhoto) {
    this.grangPhoto = grangPhoto;
  }

  public List<Grangsell> getGrangsells() {
    return grangsells;
  }

  public void setGrangsells(List<Grangsell> grangsells) {
    this.grangsells = grangsells;
  }

  public String getMaterials() {
    return materials;
  }

  public void setMaterials(String materials) {
    this.materials = materials;
  }

  @Override
  public String toString() {
    return "Grang{" +
            "grangId=" + grangId +
            ", dessertId=" + dessertId +
            ", sellId=" + sellId +
            ", grangName='" + grangName + '\'' +
            ", grangPrice=" + grangPrice +
            ", grangPhoto='" + grangPhoto + '\'' +
            ", grangsells=" + grangsells +
            ", materials='" + materials + '\'' +
            '}';
  }
}
