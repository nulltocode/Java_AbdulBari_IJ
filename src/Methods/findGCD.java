/*  Find Greatest Common Divisor between two numbers */
package Methods;

public class findGCD {

    static int gcd(int m, int n){
      while (m != n){
          if (m > n){
              m = m - n;
          }
          else{
              n = n - m;
          }
      }
        return m;
    }
    public static void main(String[] args) {
        System.out.println(gcd(25,15));

    }
}
