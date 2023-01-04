/*
 * Счет, вычисляющий полученный доход
 */

public class Account1 {
    String name;
    String adress;
    double balance;
    public void display() {
        out.print(name);
        out.print(" (");
        out.print(address);
        out.print(") имеет на счету $");
        out.print(balance);
    }

    public double getInterest(double percentageRate) {
        return balance * percentageRate / 100;
    }
    
}
