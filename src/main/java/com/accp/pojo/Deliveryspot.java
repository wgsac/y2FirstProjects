package com.accp.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * @program: y2FirstProjects
 * @description: Deliveryspot
 * @author: hjn
 * @create: 2019-08-20 15:22
 **/
@Entity
public class Deliveryspot {
    private int deliveryspotid;
    private String deliveryspotno;
    private String dname;
    private int provinceid;
    private int cityid;
    private int empid;
    private String tel;
    private BigDecimal startscope;
    private BigDecimal startprice;
    private BigDecimal secondprice;
    private int flag;
    private BigDecimal startvolumescope;
    private BigDecimal startvolumeprice;
    private BigDecimal secondvdlumeprice;

    @Id
    @Column(name = "DELIVERYSPOTID")
    public int getDeliveryspotid() {
        return deliveryspotid;
    }

    public void setDeliveryspotid(int deliveryspotid) {
        this.deliveryspotid = deliveryspotid;
    }

    @Basic
    @Column(name = "DELIVERYSPOTNO")
    public String getDeliveryspotno() {
        return deliveryspotno;
    }

    public void setDeliveryspotno(String deliveryspotno) {
        this.deliveryspotno = deliveryspotno;
    }

    @Basic
    @Column(name = "DNAME")
    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Basic
    @Column(name = "PROVINCEID")
    public int getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(int provinceid) {
        this.provinceid = provinceid;
    }

    @Basic
    @Column(name = "CITYID")
    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }

    @Basic
    @Column(name = "EMPID")
    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    @Basic
    @Column(name = "TEL")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "STARTSCOPE")
    public BigDecimal getStartscope() {
        return startscope;
    }

    public void setStartscope(BigDecimal startscope) {
        this.startscope = startscope;
    }

    @Basic
    @Column(name = "STARTPRICE")
    public BigDecimal getStartprice() {
        return startprice;
    }

    public void setStartprice(BigDecimal startprice) {
        this.startprice = startprice;
    }

    @Basic
    @Column(name = "SECONDPRICE")
    public BigDecimal getSecondprice() {
        return secondprice;
    }

    public void setSecondprice(BigDecimal secondprice) {
        this.secondprice = secondprice;
    }

    @Basic
    @Column(name = "FLAG")
    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Basic
    @Column(name = "STARTVOLUMESCOPE")
    public BigDecimal getStartvolumescope() {
        return startvolumescope;
    }

    public void setStartvolumescope(BigDecimal startvolumescope) {
        this.startvolumescope = startvolumescope;
    }

    @Basic
    @Column(name = "STARTVOLUMEPRICE")
    public BigDecimal getStartvolumeprice() {
        return startvolumeprice;
    }

    public void setStartvolumeprice(BigDecimal startvolumeprice) {
        this.startvolumeprice = startvolumeprice;
    }

    @Basic
    @Column(name = "SECONDVDLUMEPRICE")
    public BigDecimal getSecondvdlumeprice() {
        return secondvdlumeprice;
    }

    public void setSecondvdlumeprice(BigDecimal secondvdlumeprice) {
        this.secondvdlumeprice = secondvdlumeprice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deliveryspot that = (Deliveryspot) o;
        return deliveryspotid == that.deliveryspotid &&
                provinceid == that.provinceid &&
                cityid == that.cityid &&
                empid == that.empid &&
                flag == that.flag &&
                Objects.equals(deliveryspotno, that.deliveryspotno) &&
                Objects.equals(dname, that.dname) &&
                Objects.equals(tel, that.tel) &&
                Objects.equals(startscope, that.startscope) &&
                Objects.equals(startprice, that.startprice) &&
                Objects.equals(secondprice, that.secondprice) &&
                Objects.equals(startvolumescope, that.startvolumescope) &&
                Objects.equals(startvolumeprice, that.startvolumeprice) &&
                Objects.equals(secondvdlumeprice, that.secondvdlumeprice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deliveryspotid, deliveryspotno, dname, provinceid, cityid, empid, tel, startscope, startprice, secondprice, flag, startvolumescope, startvolumeprice, secondvdlumeprice);
    }
}
