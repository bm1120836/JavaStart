/*
 * Счет, вычисляющий полученный доход
 */
import static java.lang.System.out;
public class Account1 {
    String name1;
    String address1;
    double balance1;
    public void display() {
        out.print(name1);
        out.print(" (");
        out.print(address1);
        out.print(") имеет на счету $");
        out.print(balance1);
    }

    public double getInterest(double percentageRate) {
        return balance1 * percentageRate / 100;
    }
    
}
