/*
 * Вызов методов доступа
 */

import static java.lang.System.out;

public class UseAccount3 {
    public static void main(String[] args) {
        Account3 myAccount = new Account3();
        Account3 yourAccount = new Account3();

        myAccount.setName("Барри Берд");
        myAccount.setAddress("222 Cyberspace Lane");
        myAccount.setBalance(24.02);

        yourAccount.setName("Джейн Смит");
        yourAccount.setAddress("111 Consumer Street");
        yourAccount.setBalance(55.63);

        out.print(myAccount.getName());
        out.print(" (");
        out.print(myAccount.getAddress());
        out.print(") имеет на счету $");
        out.print(myAccount.getBalance());
        out.println();

        out.print(yourAccount.getName());
        out.print(" (");
        out.print(yourAccount.getAddress());
        out.print(") имеет на счету $");
        out.print(yourAccount.getBalance());

    }
    
}
