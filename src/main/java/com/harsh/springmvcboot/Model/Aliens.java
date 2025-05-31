package com.harsh.springmvcboot.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aliens
{
    @Id
    private int aid;
    private String aname;

    public Aliens(){}

//    public Aliens(String aname, int aid) {
//        this.aname = aname;
//        this.aid = aid;
//    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                '}';
    }
}
