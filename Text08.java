package com.itheima;

import java.util.Scanner;

public class Text08 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        System.out.println("请输入您想查找的数字：");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = GetIndex(arr, number);
        System.out.println(result);
    }
        public static int GetIndex ( int[] arr, int number){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                index = i;
                break;
            }
        }
        return index;
    }


}
