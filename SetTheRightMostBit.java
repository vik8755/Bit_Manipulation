public class SetTheRightMostBit {
    public static int setRightBit(int n){
        /* 13=1101
        * We want to set the right most bit.
        * 13+1=14=1110
        * 1101
        * 1110 or
        * ------
        * 1111
        * */
        return n | (n+1);
    }

    public static void main(String[] args) {
        System.out.println(setRightBit(13));
    }

}
