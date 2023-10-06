package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringCalculator {
    public int add(String s1) {
        int r = 0;
        if (s1.isEmpty() == true) return r;
        s1 = s1.replace("/n",",");
        //s1 = s1.replace("",",");
        String[] arr1;
        String[] arr2;
        //String[] arr2;
        if (s1.startsWith("//[")){
            //String regex1 = s1.substring(3, s1.indexOf("]"));
                int k = s1.indexOf(",")+1;
                //s1 = s1.substring(k);
                if (s1.isEmpty() == true) return r;
                String s2;
                //String s3 = "";

                s2 = s1.substring(3, k-2);
                s1 = s1.substring(k);
                s2 = s2.replace("][",",");
                arr2 = s2.split(",");
                System.out.println(s1);
                System.out.println(s2);
                Arrays.sort(arr2, Collections.reverseOrder());
                for (String i3:arr2) System.out.println(i3);
                for (String i2: arr2) s1 = s1.replace(i2,",");
            // s3= s3 + i2 + "|";
                    //s1 = s1.replace(i2,",");
                //s3 = s3.substring(1);

                System.out.println(s1);
                //s1 = s1.replace(regex1,",");
                arr1 = s1.split(",");}
                //arr1 = s1.split(s3+",");}
        else {arr1 = s1.split(",");}
        //arr2[0] = "";
        //  arr2[0] = 0;
        int j = 0;
        //String[] arr2;
        ArrayList<String> arr_lst = new ArrayList<>();
        ArrayList<String> arr2_lst = new ArrayList<>();
        //for (int i = 0; i<arr1.length; i+=1){

        //}
        for (int i = 0; i<arr1.length; i+=1){
            if (Integer.parseInt(arr1[i])<0){
                arr_lst.add(arr1[i]);
                j+=1;
            }
        }
        for (String s : arr1) {
            if (Integer.parseInt(s) <= 1000) arr2_lst.add(s);
        }

        if (!arr_lst.isEmpty())
        {
            System.out.print("Exception. You entered negative numbers:");
            for (String i1: arr_lst) System.out.print(i1 + " ");
            return -1;
        }
        for (int i = 0; i< arr2_lst.size(); i+=1){
            r+=Integer.parseInt(arr2_lst.get(i));
        }
        return r;
        }
    }

