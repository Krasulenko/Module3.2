package classwork.autoboxingAndUnboxing;

public class Example1 {
    public static void main(String[] args) {
        Integer [] array = new  Integer[10];

        //Autoboxing
        //приведение типа к классу обертки

        for (int i =0; i < 10; i += 2)
            array [i] = i;


       // array [i] = Integer.valueOf(i);
        //int i -> Integer i;
    }
}
