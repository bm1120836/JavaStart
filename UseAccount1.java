/*
 * Вычисление дохода
 */


 import static java.lang.System.out;

public class UseAccount1 {
    public static void main(String[] args) {
        Account1 myAccount = new Account1();
        Account1 yourAccount = new Account1();

        myAccount.name1 = "Барри Берд";
        myAccount.address1 = "222 Cyberspace Lane";
        myAccount.balance1 = 24.02;

        yourAccount.name1 = "Джейн Смит";
        yourAccount.address1 = "111 Consumer Street";
        yourAccount.balance1 = 55.63;

        myAccount.display();

        out.print (" плюс $");
        out.print(myAccount.getInterest(5.00));
        out.println(" дохода ");

        yourAccount.display();

        double yourInterestRate = 7.00;
        out.print(" плюс $");
        double yourInterestAmount = 
            yourAccount.getInterest(yourInterestRate);
        out.print(yourInterestAmount);
        out.println(" дохода ");
    }
    
}
