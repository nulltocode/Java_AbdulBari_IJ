/*  Find the sum of all elements */
package Methods;

public class sumOfElements {
    static int sum(int...s){
        int sum = 0;
        for(int i=0; i<s.length; i++){
            sum += s[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println("Sum of 20 + 30 is " + sum(20, 30));
        System.out.println("Sum of 10 + 20 + 30 is " + sum(10,20,30));
        System.out.println(sum(1000, 2000, 5000));
        System.out.println("Sum of an array is " + sum(new int[]{2,4,6,8}));
    }
}
