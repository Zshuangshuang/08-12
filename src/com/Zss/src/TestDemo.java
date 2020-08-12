package com.Zss.src;

import java.util.Arrays;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-08-12
 * Time:21:08
 **/
public class TestDemo {
    public static int divide(int x,int y)throws ArithmeticException{

        if (y == 0){
            throw new ArithmeticException("y == 0");
        }
        return x/y;
    }
    public static void main(String[] args) {
        try {
            int ret = divide(10,0);
            System.out.println(ret);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("咕噜咕噜");
        }
    }
    public static void main2(String[] args) {
        int[] arr = {1,2,3};
        arr  = null;
        try {
            System.out.println(Arrays.toString(arr));

        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("捕获空指针异常");
        }finally {
            System.out.println("niinn");
        }

    }
    public static void main1(String[] args) {
        int[] array = {1,2,3};
        try {
            System.out.println(array[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("捕获ArrayIndexOutOfBoundsException");
        }

        System.out.println("hello");
    }
}
