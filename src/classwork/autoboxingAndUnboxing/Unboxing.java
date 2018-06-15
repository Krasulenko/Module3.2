package classwork.autoboxingAndUnboxing;

public class Unboxing {
    public static void main(String[] args) {
        Integer i = new Integer (-8);

        // unboxing through method invocation
        int absVal = absoluteValue (i);
        System.out.println("absolute value of " + i + " = " + absVal);

        Double [] Id = new Double[1];
        Id [0] = 3.1416;

        // unboxing through assignment
        double pi = Id [0];
        System.out.println("pi = " + pi);
    }

    public static int absoluteValue (int i) {
        if (i < 0) return -i;
        else return i;
        // return (i < 0) ? -i : i;
    }
}
