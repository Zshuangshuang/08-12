package com.Zss.src;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-08-12
 * Time:22:08
 **/
class MyException extends RuntimeException{
    public MyException(){
        super();
    }
    public MyException(String message){
        super(message);
    }

}
public class TestDemo2 {
    public static void func(int x)throws  MyException{
        if (x == 20) {
            throw new MyException("x == 20");
        }
    }
    public static void main(String[] args) {
       try {
           func(20);
       }catch (MyException e){
           e.printStackTrace();
       }
    }
}
