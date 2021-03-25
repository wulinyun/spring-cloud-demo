package com.landasoft.demo.springboot.springbootjar.practice.test.exception;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description 测试异常
 * @Date 2021/3/22 11:33
 */
public class TestExceptionDemo {

    /**
     * 测试try catch finally throw
     * @throws Exception
     */
    public static void testTryCatchFinally() throws Exception {
        try {
            System.out.println("A");
            throw new Exception();
        }catch (Exception exception){
            System.out.println("B");
            throw new Exception();
            //System.out.println("C");
        }finally {
            System.out.println("D");
        }
        //System.out.println("D");
    }

    public static Object testTryCatchFinallyReturn(){
        StringBuffer stringBuffer = new StringBuffer();
        try {
            return new StringBuffer().append("test1");
        }catch (Exception exception){
            return stringBuffer.append("test2");
        }finally {
            return new StringBuffer().append("test3");
        }
    }
    public static void main(String[] args) throws Exception {
        //testTryCatchFinally();

        System.out.println(testTryCatchFinallyReturn());
    }
}
