package classwork.cars;

public class Car {
    int year;
    String model;
    int price;
    String nameOfTheOwner;

    public Car(int year, String model) {
        this.year = year;
        this.model = model;
    }

    public Car(int year, String model, int price, String nameOfTheOwner) {
        this.year = year;
        this.model = model;
        this.price = price;
        this.nameOfTheOwner = nameOfTheOwner;
    }

    //перегрузка метода
   int test (int a) {
        return a-5;
   }

   int test (int a, int b){
        return a-5;
   }

   void printOwnerName () {
       System.out.println(nameOfTheOwner);
   }

   void printYear (){
       System.out.println(year);
   }
}
