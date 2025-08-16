public class ToggleTheIthBit {
    public static int toggleIthBit(int n, int i){
        return n^(1<<i);
    }

    public static void main(String[] args) {
        System.out.println(toggleIthBit(26,2));
    }
}
