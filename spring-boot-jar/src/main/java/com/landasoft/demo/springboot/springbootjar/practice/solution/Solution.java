package com.landasoft.demo.springboot.springbootjar.practice.solution;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description 给两个木根，截取成4段组成面积最大的长度
 * @Date 2021/3/11 11:03
 */
public class Solution {
    public static int solution(int A, int B){
        int avg = (A+B)/4;
        if(avg <= 0 ){
            return 0;
        }
        int a_length = A/avg;
        int b_length = B/avg;
        int length = a_length + b_length;
        if(length == 4){
            return avg;
        }else{
            while(avg>0 && length != 4){
                avg = avg - 1;
                if(avg > 0) {
                    length = length(A, B, avg);
                }
            }
            if(length == 4){
                return avg;
            }

        }
        return 0;
    }

    public static int length(int A,int B,int avg){
        if(avg <= 0 ){
            return 0;
        }
        int a_length = A/avg;
        int b_length = B/avg;
        int length = a_length + b_length;
        return length;
    };

    public static void main(String[] args) {
        System.out.println(solution(1,8));
    }
}
