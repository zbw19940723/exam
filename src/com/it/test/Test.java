package com.it.test;

public class Test {
    public static void main(String[] args) {
        factory factory = new factory();
        proxyFactory proxyFactory = new proxyFactory(factory);
        proxyFactory.product();
    }
}

interface Cloth{
    void product();
}

class factory implements Cloth{

    @Override
    public void product() {
        System.out.println("生产衣服");
    }
}

class proxyFactory implements Cloth{
    private Cloth c;

    public proxyFactory(Cloth c) {
        this.c = c;
    }

    @Override
    public void product() {
        System.out.println("前期准备工作");
        c.product();
    }
}