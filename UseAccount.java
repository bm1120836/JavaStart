/*
 * Использование объектов типа Account
 */

import static java.lang.System.out;
public class UseAccount {
    public static void main(String[] args) {

        Account myAccount = new Account();
        Account yourAccount = new Account();

        myAccount.name = "Барри Берд";
        myAccount.address = "222 Cyberspase Lane";
        myAccount.balance = 24.02;

        yourAccount.name = "Джейн Смит";
        yourAccount.address = "111 Consumer Street";
        yourAccount.balance = 55.63;

        out.print(myAccount.name);
        out.print(" (");
        out.print(myAccount.address);
        out.print(") имеет на счету $");
        out.print(myAccount.balance);

        out.println();
        out.print(yourAccount.name);
        out.print(" (");
        out.print(yourAccount.address);
        out.print(") имеет на счету $");
        out.print(yourAccount.balance);

    }

}
