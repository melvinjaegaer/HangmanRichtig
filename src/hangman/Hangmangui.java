package hangman;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hangmangui {
    private JPanel panel;
    private JTextField wortfeld;
    private JTextField ratefeld;
    private JButton startButton;
    private JButton ratenButton;
    String wort;
 String[] wort1;


    public Hangmangui() {

      //  wort =String.valueOf(ratefeld.getText());
      //  wort1= new String[wort.length()];
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               wort=String.valueOf(ratefeld.getText());
                wort1= new String[wort.length()];
                for(int i=0;i<wort.length();i++)
                {wort1[i]=" _ " ;}
                ratefeld.setText("");
                for(int i=0;i<wort.length();i++){wortfeld.setText(wortfeld.getText()+wort1[i]);;}

            }
        });

        ratenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hangmangui");
        frame.setContentPane(new Hangmangui().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
