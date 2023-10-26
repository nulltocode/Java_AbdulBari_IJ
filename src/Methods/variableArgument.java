package Methods;

public class variableArgument {

    static void show(int ...x){
        for (int a : x){
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        show();
        show(10,20,30);
        show(new int[]{2,4,6,8,10,12,14});  //---> Anonymous Array
    }
}
