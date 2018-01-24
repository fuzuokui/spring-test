package com.fuzuokui.java.sort;

public class BubbleSort {

    public static void sort(int[] array){
        int length = array.length;
        for (int i = 0; i < length - 1; i++){
            for (int j = i + 1; j < length - 1; j++){
                int a = array[i];
                int b = array[j];
                if (b > a){
                    array[i] = b;
                    array[j] = a;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] array = {2,5,8,9,6,2,1};
        sort(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
