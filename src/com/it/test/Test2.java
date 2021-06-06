package com.it.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Test2 {
    public void run()throws IOException {
        System.out.println("ss");
    }

    public static void main(String[] args) {
        Collection collection = new ArrayList();
        Object o = new Object();
        collection.contains(o);

    }
}

class Son extends Test2{
    @Override
    public void run() throws FileNotFoundException {
        System.out.println("aa");
    }
}