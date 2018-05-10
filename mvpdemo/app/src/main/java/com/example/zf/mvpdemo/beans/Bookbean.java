package com.example.zf.mvpdemo.beans;

public class Bookbean {
    private String name;
    private int no;
    private String time;

    public Bookbean(String name, int no, String time) {
        this.name = name;
        this.no = no;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
