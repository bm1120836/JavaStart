/*
 * Сокрытие полей класса
 */


public class Account3 {
    private String name3;
    private String address3;
    private double balance3;

    public void setName(String n) {
        name3 = n;
    }

    public String getName() {
        return name3;
    }
    
    public void setAddress (String a) {
        address3 = a;
    }

    public String getAddress() {
        return address3;
    }

    public void setBalance(double b) {
        balance3 = b;
    }

    public double getBalance() {
        return balance3;
    }
}
