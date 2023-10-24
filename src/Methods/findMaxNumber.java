package Methods;

public class findMaxNumber {

    //--> METHOD
    static int max(int x, int y){
        return Math.max(x, y);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 15;


       int c = max(a,b);
        System.out.println("The maximum number is " + c);
    }
}
