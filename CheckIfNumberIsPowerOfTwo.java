public class CheckIfNumberIsPowerOfTwo {
    public static boolean isPowerOfTwo(int n){
        return (n & n-1) ==0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(35)?"NUMBER IS IN POWER OF TWO":"NUMBER IS NOT IN POWER OF TWO");
    }
}
