

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun( "Kunal", "Hemant", "Rahul", "Saiyam");
        multiple(10, 20, 1,2,3,4,5,6);
        System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
    }
    static void fun(String ...s){
        System.out.println(Arrays.toString(s));
    }
    static void multiple(int a, int b, int ...v){
        System.out.println(a + " " + b + " " + Arrays.toString(v));
    }

    static int sum(int ...v){
        int sum = 0;
        for (int i=0; i < v.length; i++){
            sum += v[i];
        }
        return sum;
    }
}
