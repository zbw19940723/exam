package com.it.test;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> setA = new ArrayList<>();
        ArrayList<Integer> setB = new ArrayList<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(3);
        setA.add(4);
        setA.add(4);
        setA.add(5);
        setB.add(1);
        setB.add(2);
        setB.add(4);
        setB.add(4);
        setB.add(7);
        setB.add(8);
        System.out.println(hashJoin(setA, setB));
    }
    public static ArrayList<ArrayList<Integer>> hashJoin (ArrayList<Integer> setA, ArrayList<Integer> setB) {
        // write code here
        List<String> list = new ArrayList<>();
        for (int i = 0; i < setA.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(setA.get(i));
            stringBuilder.append(",");
            stringBuilder.append(i);
            stringBuilder.append(",");
            stringBuilder.append("A");
            list.add(new String(stringBuilder));
        }
        for (int i = 0; i < setB.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(setB.get(i));
            stringBuilder.append(",");
            stringBuilder.append(i);
            stringBuilder.append(",");
            stringBuilder.append("B");
            list.add(new String(stringBuilder));
        }
        Collections.sort(list);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        return null;
    }

}

