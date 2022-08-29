public class J4_TypeCasting {
    public static void main(String[] args) {
        // Type Conversion (Implicit or Widening Conversion)
        // byte < short < int < float < long < double lower to higher conversion is possible
        int c = 25;
        float d = c;
        System.out.println(d);

        // Type Casting (Explicit or Narrowing Conversion)
        // To make higher to lower conversion
        float a = 47.98f; //Because it takes decimals as double by default
        int b = (int)a;
        System.out.println(b);
    }
}
