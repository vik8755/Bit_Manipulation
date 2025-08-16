public class SwapTwoNumbers {
    public static void swap(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Swaped numbers: a: "+a+" b: "+b);
    }

    public static void main(String[] args) {
        swap(15,76);
    }
}
