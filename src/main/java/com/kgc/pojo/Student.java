package com.kgc.pojo;

public class Student {
  private Integer studentno;
  private String loginpwd;
  private String studentname;
  private String sex;
  private Integer gradeid;
  private String phone;
  private String address;
  private String borndate;
  private String email;
  private String identitycard;

  public Integer getStudentno() {
    return studentno;
  }

  public void setStudentno(Integer studentno) {
    this.studentno = studentno;
  }

  public String getLoginpwd() {
    return loginpwd;
  }

  public void setLoginpwd(String loginpwd) {
    this.loginpwd = loginpwd;
  }

  public String getStudentname() {
    return studentname;
  }

  public void setStudentname(String studentname) {
    this.studentname = studentname;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public Integer getGradeid() {
    return gradeid;
  }

  public void setGradeid(Integer gradeid) {
    this.gradeid = gradeid;
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

  public String getBorndate() {
    return borndate;
  }

  public void setBorndate(String borndate) {
    this.borndate = borndate;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getIdentitycard() {
    return identitycard;
  }

  public void setIdentitycard(String identitycard) {
    this.identitycard = identitycard;
  }

  @Override
  public String toString() {
    return "Student{" +
            "studentno=" + studentno +
            ", loginpwd='" + loginpwd + '\'' +
            ", studentname='" + studentname + '\'' +
            ", sex='" + sex + '\'' +
            ", gradeid=" + gradeid +
            ", phone='" + phone + '\'' +
            ", address='" + address + '\'' +
            ", borndate='" + borndate + '\'' +
            ", email='" + email + '\'' +
            ", identitycard='" + identitycard + '\'' +
            '}';
  }
}
