package com.aus;

import java.io.Serializable;

public class Emp implements Serializable {
    private  int empid;
    private String ename;

    @Override
    public String toString() {
        return "Emp{" +
                "empid=" + empid +
                ", ename='" + ename + '\'' +
                ", sal=" + sal +
                '}';
    }

    private long sal;
    public Emp() {
    }


    public Emp(int empid, String ename, long sal) {
        this.empid = empid;
        this.ename = ename;
        this.sal = sal;
    }


    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public long getSal() {
        return sal;
    }

    public void setSal(long sal) {
        this.sal = sal;
    }



}
