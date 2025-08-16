public class CountNumberOfSetBits {
    public static int countSetBitsIst(int n){
        int count=0;
        while(n>1){
            // This can be replaced with its equivalent bit operation.
           // if(n%2==1) count++;
            count+=n&1;
          //  n=n/2;
          n= n>>1;
        }
        if(n==1) count++;
        return count;
    }
    public static int countSetBitsIInd(int n){
        int count=0;
        // Turn off the right most set bit till we get 0.
        while (n>0){
            count++;
            n=n&n-1;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(countSetBitsIst(84));
        System.out.println(countSetBitsIInd(84));

    }
}
