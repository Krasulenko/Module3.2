package homework.Task4;

public class User {
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    protected void paySalary () {
        this.balance = this.balance + salary;
    }

    protected double withdraw (int summ){
        double commission;
        double balanceAfterWithdrawal;
        if (summ < 1000)
            commission = 0.05;
        else
            commission = 0.1;
        balanceAfterWithdrawal = this.balance - summ - summ *commission;
        if (balanceAfterWithdrawal < 0)
            System.out.println("Not enough money on balance");
        else
            this.balance = balanceAfterWithdrawal;
        return this.balance;
    }

    protected int companyNameLength () {
        return this.companyName.length();
    }

    protected int monthIncreaser (int addMonth) {
        return this.monthsOfEmployment = this.monthsOfEmployment + addMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
