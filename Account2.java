
/*
 * Счет, вычисляющий полученный доход
 */
import static java.lang.System.out;
public class Account2 {
    String name2;
    String address2;
    double balance2;
    public void display() {
        out.print(name2);
        out.print(" (");
        out.print(address2);
        out.print(") имеет на счету $");
        out.print(balance2);
    }

    public double getInterest(double percentageRate) {
        return balance2 * percentageRate / 100;
    }
    
}

