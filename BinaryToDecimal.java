public class BinaryToDecimal {
    public static int convertToDecimal(int binary){

        int decimal=0;int count=0;
        while (binary>0){
            int rem=binary%10;
            decimal+=Math.pow(2,count)*rem;
            binary/=10;
            count++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        System.out.println(convertToDecimal(1111));
    }

    }
