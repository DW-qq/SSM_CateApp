package com.swjd.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.List;

@TableName
public class Desserttype {

  @TableId(value = "typeId",type = IdType.AUTO)
  private long typeId;
  private long dessertId;
  private String dessertName;


  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }


  public long getDessertId() {
    return dessertId;
  }

  public void setDessertId(long dessertId) {
    this.dessertId = dessertId;
  }


  public String getDessertName() {
    return dessertName;
  }

  public void setDessertName(String dessertName) {
    this.dessertName = dessertName;
  }

}
