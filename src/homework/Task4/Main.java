package homework.Task4;

public class Main {
    public static void main(String[] args) {
        User user = new User("Ann", 3000, 20,"Google", 1200,"USD");

        System.out.println("Balance " + user.getBalance());

        user.paySalary();
        System.out.println("Balance after salary " + user.getBalance());

        System.out.println("Balance after withdrawal " + user.withdraw(2000));

        System.out.println("Balance " + user.getBalance());

        System.out.println("Company name length " + user.companyNameLength());

        System.out.println("Months of employment " + user.monthIncreaser(4));


    }
}
