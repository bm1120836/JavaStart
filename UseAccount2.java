/*
 * Форматирование чисел при их выводе на консоль
 */

 import static java.lang.System.out;
 import java.util.Locale;

public class UseAccount2 {
    public static void main(String[] args) {
        Account2 myAccount2 = new Account2();
        Account2 yourAccount2 = new Account2();

        myAccount2.balance2 = 24.02;
        yourAccount2.balance2 = 55.63;
        double myInterest = myAccount2.getInterest(5.00);
        double yourInterest = yourAccount2.getInterest(7.00);
        Locale.setDefault(Locale.US);

        out.printf("$%4.2f\n", myInterest);
        out.printf("$%5.2f\n", myInterest);
        out.printf("$%.2f\n", myInterest);
        out.printf("$%3.2f\n", myInterest);
        out.printf("$%.2f $%.2f", myInterest, yourInterest);
    }
    
}
