/*
 * Первый пример кода с классом DummiesFrame
 */


public class GuessingGame1 {
    public static void main(String[] args) {
        DummiesFrame frame = new DummiesFrame("Поздоровывайся со мной!");
        frame.addRow("Укажите Ваше имя ");
        frame.go();
    }

    public static String calculate(String firstName) {
        return "Привет, " + firstName + "!";
    }
    
}
