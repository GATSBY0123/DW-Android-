package com.gatsby.android_study;

public class Ex11Chicken {
    /* 아이템의 정보를 담기 위한 클래스 */
    String num;
    String name;
    int resId;

    public Ex11Chicken(String num, String name, int resId) {
        this.num = num;
        this.name = name;
        this.resId = resId;
    }

    public String getNum() {return num;}
    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getResId() {return resId;}
    public void setResId(int resId) {
        this.resId = resId;
    }
}
