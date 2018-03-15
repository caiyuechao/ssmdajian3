package com.axjy.pojo;


public class User {

  private Integer id;
  private String userCode;
  private String userName;
  private String userPassword;
  private Integer gender;
  private java.time.LocalDate birthday;
  private String phone;
  private String address;
  private Integer userRole;
  private Integer createdBy;
  private java.time.LocalDateTime creationDate;
  private Integer modifyBy;
  private java.time.LocalDateTime modifyDate;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getUserCode() {
    return userCode;
  }

  public void setUserCode(String userCode) {
    this.userCode = userCode;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }


  public Integer getGender() {
    return gender;
  }

  public void setGender(Integer gender) {
    this.gender = gender;
  }


  public java.time.LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(java.time.LocalDate birthday) {
    this.birthday = birthday;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public Integer getUserRole() {
    return userRole;
  }

  public void setUserRole(Integer userRole) {
    this.userRole = userRole;
  }


  public Integer getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }


  public java.time.LocalDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(java.time.LocalDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public Integer getModifyBy() {
    return modifyBy;
  }

  public void setModifyBy(Integer modifyBy) {
    this.modifyBy = modifyBy;
  }


  public java.time.LocalDateTime getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(java.time.LocalDateTime modifyDate) {
    this.modifyDate = modifyDate;
  }

}
