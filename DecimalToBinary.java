public class DecimalToBinary {

    public static String convertToBinary(int decimalNumber){
        StringBuilder binary=new StringBuilder();
        while (decimalNumber!=1){
           binary.append(decimalNumber%2);
           decimalNumber/=2;
        }
        return binary.append(decimalNumber).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToBinary(4));
    }
}
