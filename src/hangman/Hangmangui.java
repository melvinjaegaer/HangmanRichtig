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
    private JTextArea Feld;
    private JButton zufallstart;
    private JTextField kanister;
    private JLabel Fv;
    private JLabel Label;
    String wort;
    int fehleranzahl;
 String[] wort1;



    public Hangmangui() {

        //  wort =String.valueOf(ratefeld.getText());
        //  wort1= new String[wort.length()];
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wortfeld.setText("");
                wort = String.valueOf(ratefeld.getText());
                wort1 = new String[wort.length()];
                for (int i = 0; i < wort.length(); i++) {
                    wort1[i] = " _ ";
                }
                ratefeld.setText("");
                for (int i = 0; i < wort.length(); i++) {
                    wortfeld.setText(wortfeld.getText() + wort1[i]);
                    ;
                }

            }
        });

        ratenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String wortversuch = ratefeld.getText();
                if (wortversuch.toLowerCase().equals(wort.toLowerCase())) {
                    ratefeld.setText("GEwonnen");
                    wortfeld.setText(wort);
                }else{
                    if (wort.toLowerCase().indexOf(wortversuch.toLowerCase()) == -1)  {

                        fehleranzahl = fehleranzahl + 1;

                        if (!kanister.getText().equals("")) {
                            kanister.setText(kanister.getText() + "," + wortversuch);
                        } else {
                            kanister.setText(wortversuch);
                        }

                    }
                }
                if (wortversuch.length() == 1) {
                    for (int i = 0; i < wort.length(); i++) {
                        String wortplatzhalter = String.valueOf(wort.charAt(i));
                        if (wortplatzhalter.toLowerCase().equals(wortversuch.toLowerCase())) {
                            wort1[i] = wortplatzhalter;
                           wortfeld.setText("");
                        }
//ddd



                    }
                    wortfeld.setText("");
                    for (int i = 0; i < wort.length(); i++) {
                        wortfeld.setText(wortfeld.getText()+ ""+ wort1[i]);
                        ratefeld.setText("");
                    }
                }
                if (wortfeld.getText().indexOf("_") == -1) {
                    wortfeld.setText(wort);
                    ratefeld.setText("GEWONNEN!");
                }
                if (fehleranzahl == 13) {
                    ratefeld.setText("Du hast " + fehleranzahl + " Fehler gemacht. Probier ein neues Wort.");
                    wortfeld.setText(wort);
                }
                if(fehleranzahl==1){
                    Feld.setText ("\n\n\n\n\n\n\t\t\n\n\n\n \n                              |   \n  ==================  ");

                }
                if(fehleranzahl==2){
                    Feld.setText ("\n\n\n\n\n\t\t\n\n\n\n \n                              |\n                              |   \n  ==================  ");

                }
                if(fehleranzahl==3){
                    Feld.setText ("\n\n\n\n\t\t\n\n\n\n \n                              |\n                              |\n                              |   \n  ==================  ");

                }
                if(fehleranzahl==4){
                    Feld.setText ("\n\n\n\n\t\t\n\n\n \n                              |\n                              |\n                              |\n                              |   \n  ==================  ");

                }
                if(fehleranzahl==5){
                    Feld.setText ("\n\n\n\n\t\t\n\n \n                              |\n                              |\n                              |\n                              |\n                              |   \n  ==================  ");

                }
                if(fehleranzahl==6){
                    Feld.setText ("\n\n\n\n\n\t\t \n                    +-------+ \n                              |\n                              |\n                              |\n                              |\n                              |   \n  ==================  ");

                }
                if(fehleranzahl==7){
                    Feld.setText ("\n\n\n\n\n\t\t \n                    +-------+ \n                     |        |\n                              |\n                              |\n                              |\n                              |   \n  ==================  ");

                }
                if(fehleranzahl==8){
                    Feld.setText ("\n\n\n\n\n\t\t \n                    +-------+ \n                     |        |\n                    o        |\n                              |\n                              |\n                              |   \n  ==================  ");

                }
                if(fehleranzahl==9){
                    Feld.setText ("\n\n\n\n\n\t\t \n                    +-------+ \n                     |        |\n                    o        |\n                     |        |\n                              |\n                              |   \n  ==================  ");

                }
                if(fehleranzahl==10){
                    Feld.setText ("\n\n\n\n\n\t\t \n                    +-------+ \n                     |        |\n                    o        |\n                   / |        |\n                              |\n                              |   \n  ==================  ");

                }
                if(fehleranzahl==11){
                    Feld.setText ("\n\n\n\n\n\t\t \n                    +-------+ \n                     |        |\n                    o        |\n                   / | \\      |\n                              |\n                              |   \n  ==================  ");

                }
                if(fehleranzahl==12){
                    Feld.setText ("\n\n\n\n\n\t\t \n                    +-------+ \n                     |        |\n                    o        |\n                   / | \\      |\n                    /         |\n                              |   \n  ==================  ");

                }
                if(fehleranzahl==13){
                    Feld.setText ("\n\n\n\n\n\t\t \n                    +-------+ \n                     |        |\n                    o        |\n                   / | \\      |\n                    /  \\      |\n                              |   \n  ==================  ");

                }
            }
        });

        zufallstart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wort="";
                wortfeld.setText("");

                int zahl= (int) Math.floor(Math.random()*10);
                if(zahl==0){
                    wort="Mensch";
                }
                if(zahl==1){
                    wort="Hallo";
                }
                if(zahl==2){
                    wort="Münze";
                }
                if(zahl==3){
                    wort="Käfer";
                }
                if(zahl==4){
                    wort="Haus";
                }
                if(zahl==5){
                    wort="Vollmond";
                }
                if(zahl==6){
                    wort="Chef";
                }
                if(zahl==7){
                    wort="Kellner";
                }
                if(zahl==8){
                    wort="Maurer";
                }if(zahl==9){
                    wort="Geselle";
                }
                if(zahl==10){
                    wort="Arsch";
                }

                wort1 = new String[wort.length()];
                for (int i = 0; i < wort.length(); i++) {
                    wort1[i] = " _ ";
                }
                ratefeld.setText("");
                for (int i = 0; i < wort.length(); i++) {
                    wortfeld.setText(wortfeld.getText() + wort1[i]);
                    ;
                }
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
