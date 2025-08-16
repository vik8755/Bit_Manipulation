public class CheckIfIthBitSet {
    public static boolean isIthBitSetUsingLeftShift(int n, int i){
        int temp=1<<i;
        return (n&temp)!=0;
    }
    public static boolean isIthBitSetUsingRightShift(int n, int i){
        return ((n>>i)&1)==1;
    }


    public static void main(String[] args) {
        System.out.println(isIthBitSetUsingLeftShift(8,2)? " Bit is set":  " Bit is not set");
        System.out.println(isIthBitSetUsingRightShift(8,2)? " Bit is set":  " Bit is not set");

    }
}
