package com.landasoft.demo.springboot.springbootjar.practice.solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description TODO
 * @Date 2021/3/11 9:06
 */
public class SolutionTask {
        public static int solution(int[] A) {
            // write your code in Java SE 8
            int N = A.length;
            for(int i=1; i<=N; i++){
                int count = 0 ;
                for(int j = 0; j<N; j++){
                    if(A[j] == i){
                        count = 1;
                    }
                }
                if(count == 0){
                    return i;
                }
            }
            return N+1;
        }

       public static void test(){
            int j = 0;
           for(int i = 0; i<10; i++){
               while (j < 100){
                   return;
               }
           }
       }

    public static void main(String[] args) {
        int[] A = {-1,-3};
        System.out.println(solution(A));
        final Set<String> set = new HashSet<>(Arrays.asList("first","second"));
        set.add("33333");
        set.remove("first");
    }
}
