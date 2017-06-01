import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(int x, int y){
        super("Пробное окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        MyPanel newPanel = new MyPanel();
        newPanel.setLayout(new FlowLayout());
        newPanel.add(new MyButton("Кнопка"));
        newPanel.add(new MyButton("+"));
        newPanel.add(new MyButton("-"));
        newPanel.add(new MyButton("Кнопка с длинной надписью"));
        setContentPane(newPanel);
        setSize(x, y);
    }
}