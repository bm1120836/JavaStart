import java.util.Scanner;
import static java.lang.System.*;

/*
 * Проверка пароля, введенного пользователем
 */


public class CheckPassword {
    public static void main(String[] args) {
        out.print("Введите пароль: ");
        Scanner keyboard = new Scanner(in);
        String password = keyboard.next();

        out.println("Вы ввели >>" + password + "<<");
        out.println();

        if (password == "swordfish") {
            out.println("Введенный пароль ");
            out.println("совпадает с хранящимся");
            out.println("паролем. Поздравляем, ");
            out.println("вы хакер. ");
        } else {
            out.println("Введенный пароль ");
            out.println("не совпадает с ");
            out.println("хранящимся папролем.");
            out.println("Вам просто не повезло.");
        }
        out.println();

        if (password.equals("swordfish")) {
            out.println("Введенный пароль ");
            out.println("правильный! ");
            out.println("Можете войти ");
            out.println("в систему.");
        } else {
            out.println("Введенный пароль ");
            out.println("неправильный! ");
            out.println("Попытайтесь ");
            out.println("еще раз... ");
        }
        keyboard.close();
    }
    
}
