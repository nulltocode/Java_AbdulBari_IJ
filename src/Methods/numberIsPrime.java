/*  Find the number is Prime or not Prime */
package Methods;

public class numberIsPrime {

    static boolean isPrime(int n){
        for (int i=2; i<n/2; i++){
            if (n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        if(isPrime(19)){
            System.out.println("It's a prime number");
        }
        else{
            System.out.println("It's not a prime number");
        }
    }
}
