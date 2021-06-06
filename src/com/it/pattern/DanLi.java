package com.it.pattern;

/**
 * 单例模式
 */
public class DanLi {
    public static void main(String[] args) {

    }
}

class DanLi_LanHan {
    private static DanLi_LanHan instance;

    private DanLi_LanHan() {

    }

    public static DanLi_LanHan getInstance() {
        if (instance == null) {
            instance = new DanLi_LanHan();
        }
        return instance;
    }
}

class DanLi2_EHan {
    private static DanLi2_EHan instance = new DanLi2_EHan();
    private DanLi2_EHan(){

    }
    public static DanLi2_EHan getInstance(){
        return instance;
    }
}
