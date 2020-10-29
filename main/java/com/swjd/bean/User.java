package com.swjd.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("user_tab")
public class User {
  @TableId(value = "uid",type = IdType.AUTO)
  private long uid;
  @TableField("utelephone")
  private String utelephone;
  @TableField("upassword")
  private String upassword;
  @TableField("uphoto")
  private String uphoto;
  @TableField("petname")
  private String petname;
  @TableField("ubirthday")
  private String ubirthday;
  @TableField("uadderss")
  private String uadderss;

  public User() {
  }

  public User(String utelephone, String upassword, String uphoto, String petname, String ubirthday, String uadderss) {
    this.utelephone = utelephone;
    this.upassword = upassword;
    this.uphoto = uphoto;
    this.petname = petname;
    this.ubirthday = ubirthday;
    this.uadderss = uadderss;
  }

  public User(String utelephone, String upassword, String uphoto) {
    this.utelephone = utelephone;
    this.upassword = upassword;
    this.uphoto = uphoto;
  }
  public User(String utelephone, String upassword) {
    this.utelephone = utelephone;
    this.upassword = upassword;
  }
  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public String getUtelephone() {
    return utelephone;
  }

  public void setUtelephone(String utelephone) {
    this.utelephone = utelephone;
  }


  public String getUpassword() {
    return upassword;
  }

  public void setUpassword(String upassword) {
    this.upassword = upassword;
  }


  public String getUphoto() {
    return uphoto;
  }

  public void setUphoto(String uphoto) {
    this.uphoto = uphoto;
  }


  public String getPetname() {
    return petname;
  }

  public void setPetname(String petname) {
    this.petname = petname;
  }


  public String getUbirthday() {
    return ubirthday;
  }

  public void setUbirthday(String ubirthday) {
    this.ubirthday = ubirthday;
  }


  public String getUadderss() {
    return uadderss;
  }

  public void setUadderss(String uadderss) {
    this.uadderss = uadderss;
  }

  @Override
  public String toString() {
    return "User{" +
            "uid=" + uid +
            ", utelephone='" + utelephone + '\'' +
            ", upassword='" + upassword + '\'' +
            ", uphoto='" + uphoto + '\'' +
            ", petname='" + petname + '\'' +
            ", ubirthday=" + ubirthday +
            ", uadderss='" + uadderss + '\'' +
            '}';
  }
}
