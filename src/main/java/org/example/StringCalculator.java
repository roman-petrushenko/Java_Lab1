package org.example;

public class StringCalculator {
    public int add(String s1) {
        int r = 0;
        if (s1.isEmpty() == true) return r;
        String[] arr1;
        arr1 = s1.split(",");
        for (int i = 0; i<arr1.length; i+=1){
            r+=Integer.parseInt(arr1[i]);
        }
        return r;
        }
    }

