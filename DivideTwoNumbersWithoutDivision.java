import static java.lang.Math.abs;

public class DivideTwoNumbersWithoutDivision {
    public static int divide(int dividend, int divisor){
        if(dividend==divisor) return 1;
        boolean isBothPositive=true;
        if(dividend<0 && divisor>0) isBothPositive=false;
        if(dividend>0 && divisor<0) isBothPositive=false;
        long n=abs((long) dividend);
        long d=abs((long)divisor);
        /* We need to check the d*(max power of 2) can be removed and
        *  the maximum power of two that can be removed and add it to
        * the counter. Repeat the same process till n>=d.
        * */
        int quotient=0;
        while(n>=d){
            int count=0;
            // We need to check for count+1 because n>=d true means n/ d*2^0.
            while(n>=d<<(count+1)){ //d<<(count+1) equivalent to d*2^count+1
                count++;
            }
            quotient+=1<<count; // 1<<count == 2^count
            n-=d<<count; // d*2^count
        }
        // We need to keep in mind the overflow condition.
        if(quotient==(1<<31) && isBothPositive){
            return Integer.MAX_VALUE;
        }
        if(quotient==(1<<31) && !isBothPositive){
            return Integer.MIN_VALUE;
        }

        return isBothPositive?quotient:-quotient;
    }


    public static void main(String[] args) {
        System.out.println(divide(Integer.MIN_VALUE,-1));
    }
}
