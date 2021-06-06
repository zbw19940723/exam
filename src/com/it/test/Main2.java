package com.it.test;
import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(solution(scanner.nextLong()));
        }
        for (Long i:list) {
            System.out.println(i);
        }
    }

    public static long solution(long i) {
        long max = 0;
        for (int j = 1; j <= i / 2; j++) {
            long cur = sum(j) + sum(i - j);
            if(cur>max){
                max = cur;
            }
        }
        return max;
    }

    public static long sum(long i) {
        String s = String.valueOf(i);
        int result = 0;
        for (int j = 0; j < s.length(); j++) {
            result = result + s.charAt(j) - '0';
        }
        return result;
    }
}