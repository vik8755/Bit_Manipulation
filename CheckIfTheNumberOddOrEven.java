public class CheckIfTheNumberOddOrEven {
    public static boolean isOdd(int n){
        return (n&1)==1;
    }

    public static void main(String[] args) {
        System.out.println(isOdd(222222222)?"Number is odd":"Number is even");
    }
}
