import javax.swing.JFrame;

/*
 * Использование ссылочного типа данных
 */

public class PeremString {
    public static void main(String[] args) {
        
        final JFrame myFrame = new JFrame();
        String myTytle = "Пустой фрейм";

        myFrame.setTitle(myTytle);
        myFrame.setSize(300, 200);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);

    }
    
}
