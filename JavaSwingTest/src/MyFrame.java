import javax.swing.*;

public class MyFrame {

    public static void main (String [] args) {
        JFrame myWindow = new JFrame("Пробное окно");
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setSize(400, 300);
        myWindow.setVisible(true);
    }

    public class SimpleWindow extends JFrame {
        SimpleWindow(){
            super("Пробное окно");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(250, 100);
        }
    }
}
