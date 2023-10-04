package org.example;

public class StringCalculator {
    public int add(String s1) {
        int r = 0;
        if (s1.isEmpty() == true) return r;
        s1 = s1.replace("/n",",");
        String[] arr1;
        if (s1.startsWith("//")){
            String regex1 = s1.substring(2, s1.indexOf(","));
                int k = s1.indexOf(",")+1;
                s1 = s1.substring(k);
                if (s1.isEmpty() == true) return r;
                s1 = s1.replace(regex1,",");
                arr1 = s1.split(",");}
        else {arr1 = s1.split(",");}

        for (int i = 0; i<arr1.length; i+=1){
            r+=Integer.parseInt(arr1[i]);
        }
        return r;
        }
    }

