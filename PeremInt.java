/*
 * Использование типа  переменной int
 */

public class PeremInt  {
    /**
     * @param args
     */
    public static void main(String args[]) {
        int weightOfAPerson;
        int elevatorWeightLimit;
        int numberOfPeople;

        weightOfAPerson = 68;
        elevatorWeightLimit = 635;
        numberOfPeople = elevatorWeightLimit / weightOfAPerson;

        System.out.print("Лифт может поднять ");
        System.out.print(numberOfPeople);
        System.out.println(" человек");
    }
    
}
