import javax.swing.JOptionPane;

/*
 * Проверка имени пользователя и пароля
 */

public class CheckUsername {
    public static void main(String[] args) {
        
        String username = 
            JOptionPane.showInputDialog("Имя пользователя: ");
        String password = 
            JOptionPane.showInputDialog("Пароль:");

        if (
            username != null && password != null &&
            (
                (username.equals("bburd") &&
                password.equals("swordfish")) ||
                (username.equals("hritter") &&
                password.equals("preakston"))
            )
        )
        {
            JOptionPane.showMessageDialog(null, "Вы допущены в систему.");
        } else {
            JOptionPane.showMessageDialog(null, "Попытайтесь еще раз...");
        }
    }
    
}
