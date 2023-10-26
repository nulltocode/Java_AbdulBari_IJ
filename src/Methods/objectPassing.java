/*  Object Passing as Parameter */
package Methods;

public class objectPassing {

    static void change(int [] a, int index, int value){
        a[index] = value;
    }

    public static void main(String[] args) {
        int [] arr = {2,4,6,8};

        change(arr,1,5);
        for (int value:arr){
            System.out.print(" " + value);
        }

    }
}
