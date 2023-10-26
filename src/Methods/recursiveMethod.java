package Methods;

import org.w3c.dom.ls.LSOutput;

public class recursiveMethod {

    static void fun(int n){
        if (n > 0){
            System.out.println(n);
            fun (n - 1);
        }
    }
    static void fun1(int x){
        if (x > 0){
            fun1(x - 1);
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        fun(3);
        System.out.println();
        fun1(3);

    }
}
