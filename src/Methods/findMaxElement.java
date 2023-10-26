package Methods;

public class findMaxElement {

    static int maxElement(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr = {4,7,9,2,1};

        int maximumElement = maxElement(arr);

        System.out.println("The maximum element in an array is " + maximumElement);
    }
}
