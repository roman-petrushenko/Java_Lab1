package org.example;
import java.util.ArrayList;
public class StringCalculator {
    public int add(String s1) {
        int r = 0;
        if (s1.isEmpty() == true) return r;
        s1 = s1.replace("/n",",");
        //s1 = s1.replace("",",");
        String[] arr1;
        //String[] arr2;
        if (s1.startsWith("//[")){
            String regex1 = s1.substring(3, s1.indexOf("]"));
                int k = s1.indexOf(",")+1;
                s1 = s1.substring(k);
                if (s1.isEmpty() == true) return r;
                s1 = s1.replace(regex1,",");
                arr1 = s1.split(",");}
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

