/*  Find the maximum of numbers using varargs */
package Methods;

public class maximumOfNumber{

    static int max(int...a){
        if (a.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = 0;
        for (int i=0; i<a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;

    }
    public static void main(String[] args) {
        System.out.println(max());
        System.out.println(max(10));
        System.out.println(max(10,5));
        System.out.println(max(10,15,5));
        System.out.println(max(new int[]{2,4,6,8,10,15,25,5}));
    }
}
