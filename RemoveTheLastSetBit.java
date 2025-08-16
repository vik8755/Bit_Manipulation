public class RemoveTheLastSetBit {
    public static int removeLastBit(int n){
        return n & n-1;
    }

    public static void main(String[] args) {
        System.out.println(removeLastBit(40));
    }
}
