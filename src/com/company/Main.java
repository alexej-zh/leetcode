package com.company;

public class Main {

    public static void main(String[] args) {

        int[] ar ={1,3,4,5};
//        System.out.println(findNum(ar,6));
        System.out.println(fibo(63));
    }


    public static int findNum(int[] array, int target) {

            int left = 0;
            int right = array.length;
            int mid =(right - left) /2 +left;


            while (array[mid]!=target){
                mid = (right - left) /2 +left;

                if(target > array[mid]){
                    left = mid + 1;}
                if(target < array[mid]){
                    right = mid;}
                if(right == left){
                    return  -1;
                }
            }

        return  mid;
    }
    private static long fibo (int num){
        long[] mem = new long[num];
        mem[0]=0;
        mem[1]=1;

        for (int i = 2; i < num; i++){

            long a = mem[i-1] + mem[i-2];
            mem[i] = a;
        }

        return mem[num-1];
    }
}