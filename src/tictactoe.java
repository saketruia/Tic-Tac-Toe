import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tictactoe extends JFrame{


    String d="";
    int xwin=0;
    int owin=0;
    int c=1;
    String xturn="X's TURN";
    String oturn="O's TURN";
    JButton g00=new JButton();
    JButton g01=new JButton();
    JButton g02=new JButton();
    JButton g10=new JButton();
    JButton g11=new JButton();
    JButton g12=new JButton();
    JButton g20=new JButton();
    JButton g21=new JButton();
    JButton g22=new JButton();
    JLabel display= new JLabel(d);

    public int check(){
        if((g00.getText().equals(g01.getText()) && g01.getText().equals(g02.getText())) && g00.getText().equals("X") ){
            return 1;
        }
        else if((g10.getText().equals(g11.getText()) && g11.getText().equals(g12.getText())) && g10.getText().equals("X") ){
            return 1;
        }
        else if((g20.getText().equals(g21.getText()) && g21.getText().equals(g22.getText())) && g20.getText().equals("X") ){
            return 1;
        }
        else if((g00.getText().equals(g10.getText()) && g10.getText().equals(g20.getText())) && g00.getText().equals("X") ){
            return 1;
        }
        else if((g01.getText().equals(g11.getText()) && g11.getText().equals(g21.getText())) && g01.getText().equals("X") ){
            return 1;
        }
        else if((g02.getText().equals(g12.getText()) && g12.getText().equals(g22.getText())) && g02.getText().equals("X") ){
            return 1;
        }
        else if((g00.getText().equals(g01.getText()) && g01.getText().equals(g02.getText())) && g00.getText().equals("X") ){
            return 1;
        }
        else if((g00.getText().equals(g11.getText()) && g11.getText().equals(g22.getText())) && g00.getText().equals("X") ){
            return 1;
        }
        else if((g02.getText().equals(g11.getText()) && g11.getText().equals(g20.getText())) && g02.getText().equals("X") ){
            return 1;
        }

        else if((g00.getText().equals(g01.getText()) && g01.getText().equals(g02.getText())) && g00.getText().equals("O") ){
            return 2;
        }
        else if((g10.getText().equals(g11.getText()) && g11.getText().equals(g12.getText())) && g10.getText().equals("O") ){
            return 2;
        }
        else if((g20.getText().equals(g21.getText()) && g21.getText().equals(g22.getText())) && g20.getText().equals("O") ){
            return 2;
        }
        else if((g00.getText().equals(g10.getText()) && g10.getText().equals(g20.getText())) && g00.getText().equals("O") ){
            return 2;
        }
        else if((g01.getText().equals(g11.getText()) && g11.getText().equals(g21.getText())) && g01.getText().equals("O") ){
            return 2;
        }
        else if((g02.getText().equals(g12.getText()) && g12.getText().equals(g22.getText())) && g02.getText().equals("O") ){
            return 2;
        }
        else if((g00.getText().equals(g01.getText()) && g01.getText().equals(g02.getText())) && g00.getText().equals("O") ){
            return 2;
        }
        else if((g00.getText().equals(g11.getText()) && g11.getText().equals(g22.getText())) && g00.getText().equals("O") ){
            return 2;
        }
        else if((g02.getText().equals(g11.getText()) && g11.getText().equals(g20.getText())) && g02.getText().equals("O") ){
            return 2;
        } else if (c == 10) {
            return 0;
        }
        return -1;
    }


    public tictactoe(){
        setTitle("Saket's TIC TAC TOE");

        /*JButton g00=new JButton();
        JButton g01=new JButton();
        JButton g02=new JButton();
        JButton g10=new JButton();
        JButton g11=new JButton();
        JButton g12=new JButton();
        JButton g20=new JButton();
        JButton g21=new JButton();
        JButton g22=new JButton();*/

        //JLabel display= new JLabel(d);
        JButton start=new JButton("START");
        JButton nextround=new JButton("NEXT ROUND");
        JButton newgame=new JButton("NEW GAME");
        JLabel wins= new JLabel("WINS :");
        JLabel xcount=new JLabel(" X : "+xwin);
        JLabel ocount =new JLabel(" O : "+owin);


        g00.setBounds(20,20,100,100);
        g01.setBounds(130,20,100,100);
        g02.setBounds(240,20,100,100);
        g10.setBounds(20,130,100,100);
        g11.setBounds(130,130,100,100);
        g12.setBounds(240,130,100,100);
        g20.setBounds(20,240,100,100);
        g21.setBounds(130,240,100,100);
        g22.setBounds(240,240,100,100);

        display.setBounds(20,360,320,100);
        start.setBounds(360,50,120,40);
        nextround.setBounds(360,160,120,40);
        newgame.setBounds(360,270,120,40);
        wins.setBounds(360, 360,120,30);
        xcount.setBounds(360,390,120,30);
        ocount.setBounds(360,420,120,30);


        add(g00);
        add(g01);
        add(g02);
        add(g10);
        add(g11);
        add(g12);
        add(g20);
        add(g21);
        add(g22);
        add(display);
        add(start);
        add(newgame);
        add(nextround);
        add(xcount);
        add(ocount);
        add(wins);


        Border lineBorder = BorderFactory.createLineBorder(Color.BLACK, 2);
        display.setBorder(lineBorder);
        //wins.setBorder(lineBorder);
        //xcount.setBorder(lineBorder);
        //ycount.setBorder(lineBorder);

        Font newFont = new Font("Serif", Font.BOLD, 25);
        wins.setFont(newFont);
        xcount.setFont(newFont);
        ocount.setFont(newFont);
        Font font = new Font("Arial", Font.BOLD, 80);
        Font dfont = new Font("Arial", Font.PLAIN, 60);
        g00.setFont(font);
        g01.setFont(font);
        g02.setFont(font);
        g10.setFont(font);
        g11.setFont(font);
        g12.setFont(font);
        g20.setFont(font);
        g21.setFont(font);
        g22.setFont(font);
        display.setFont(dfont);
        //g00.setForeground(Color.BLUE);



        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c=1;
                display.setText(xturn);
                g00.setEnabled(true);
                g01.setEnabled(true);
                g02.setEnabled(true);
                g10.setEnabled(true);
                g11.setEnabled(true);
                g12.setEnabled(true);
                g20.setEnabled(true);
                g21.setEnabled(true);
                g22.setEnabled(true);
                g00.setText("");
                g01.setText("");
                g02.setText("");
                g10.setText("");
                g11.setText("");
                g12.setText("");
                g20.setText("");
                g21.setText("");
                g22.setText("");


            }
        });
        nextround.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c=1;
                display.setText(xturn);
                g00.setEnabled(true);
                g01.setEnabled(true);
                g02.setEnabled(true);
                g10.setEnabled(true);
                g11.setEnabled(true);
                g12.setEnabled(true);
                g20.setEnabled(true);
                g21.setEnabled(true);
                g22.setEnabled(true);
                g00.setText("");
                g01.setText("");
                g02.setText("");
                g10.setText("");
                g11.setText("");
                g12.setText("");
                g20.setText("");
                g21.setText("");
                g22.setText("");


            }
        });
        newgame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c=1;
                display.setText(xturn);
                g00.setEnabled(true);
                g01.setEnabled(true);
                g02.setEnabled(true);
                g10.setEnabled(true);
                g11.setEnabled(true);
                g12.setEnabled(true);
                g20.setEnabled(true);
                g21.setEnabled(true);
                g22.setEnabled(true);
                g00.setText("");
                g01.setText("");
                g02.setText("");
                g10.setText("");
                g11.setText("");
                g12.setText("");
                g20.setText("");
                g21.setText("");
                g22.setText("");
                xwin=0;
                owin=0;
                ocount.setText(" O : "+owin);
                xcount.setText(" X : "+xwin);
            }
        });
        g00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(c%2==0) {
                    g00.setText("O");
                    display.setText(xturn);
                }
                else {
                    g00.setText("X");
                    //g00.setForeground(Color.BLUE);
                    display.setText(oturn);
                }
                c++;
                g00.setEnabled(false);
                if(check()==1){
                    display.setText("X WINS");
                    xwin++;
                    xcount.setText(" X : "+xwin);
                }
                else if(check()==2){
                    display.setText("O WINS");
                    owin++;
                    ocount.setText(" O : "+owin);
                }
                else if(check()==0){
                    display.setText("DRAW");
                    xwin++;
                    owin++;
                    ocount.setText(" O : "+owin);
                    xcount.setText(" X : "+xwin);
                }
            }
        });
        g01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(c%2==0) {
                    g01.setText("O");
                    display.setText(xturn);
                }
                else {
                    g01.setText("X");
                    display.setText(oturn);
                }
                c++;
                g01.setEnabled(false);
                if(check()==1){
                    display.setText("X WINS");
                    xwin++;
                    xcount.setText(" X : "+xwin);
                }
                else if(check()==2){
                    display.setText("O WINS");
                    owin++;
                    ocount.setText(" O : "+owin);
                }
                else if(check()==0){
                    display.setText("DRAW");
                    xwin++;
                    xcount.setText(" X : "+xwin);
                    owin++;
                    ocount.setText(" O : "+owin);
                }
            }
        });
        g02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(c%2==0) {
                    g02.setText("O");
                    display.setText(xturn);
                }
                else {
                    g02.setText("X");
                    display.setText(oturn);
                }
                c++;
                g02.setEnabled(false);
                if(check()==1){
                    display.setText("X WINS");
                    xwin++;
                    xcount.setText(" X : "+xwin);
                }
                else if(check()==2){
                    display.setText("O WINS");
                    owin++;
                    ocount.setText(" O : "+owin);
                }
                else if(check()==0){
                    display.setText("DRAW");
                    xwin++;
                    xcount.setText(" X : "+xwin);
                    owin++;
                    ocount.setText(" O : "+owin);
                }
            }
        });
        g10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(c%2==0) {
                    g10.setText("O");
                    display.setText(xturn);
                }
                else {
                    g10.setText("X");
                    display.setText(oturn);
                }
                c++;
                g10.setEnabled(false);
                if(check()==1){
                    display.setText("X WINS");
                    xwin++;
                    xcount.setText(" X : "+xwin);
                }
                else if(check()==2){
                    display.setText("O WINS");
                    owin++;
                    ocount.setText(" O : "+owin);
                }
                else if(check()==0){
                    display.setText("DRAW");
                    xwin++;
                    xcount.setText(" X : "+xwin);
                    owin++;
                    ocount.setText(" O : "+owin);
                }
            }
        });
        g11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(c%2==0) {
                    g11.setText("O");
                    display.setText(xturn);
                }
                else {
                    g11.setText("X");
                    display.setText(oturn);
                }
                c++;
                g11.setEnabled(false);
                if(check()==1){
                    display.setText("X WINS");
                    xwin++;
                    xcount.setText(" X : "+xwin);
                }
                else if(check()==2){
                    display.setText("O WINS");
                    owin++;
                    ocount.setText(" O : "+owin);
                }
                else if(check()==0){
                    display.setText("DRAW");
                    xwin++;
                    xcount.setText(" X : "+xwin);
                    owin++;
                    ocount.setText(" O : "+owin);
                }
            }
        });
        g12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(c%2==0) {
                    g12.setText("O");
                    display.setText(xturn);
                }
                else {
                    g12.setText("X");
                    display.setText(oturn);
                }
                c++;
                g12.setEnabled(false);
                if(check()==1){
                    display.setText("X WINS");
                    xwin++;
                    xcount.setText(" X : "+xwin);
                }
                else if(check()==2){
                    display.setText("O WINS");
                    owin++;
                    ocount.setText(" O : "+owin);
                }
                else if(check()==0){
                    display.setText("DRAW");
                    xwin++;
                    xcount.setText(" X : "+xwin);
                    owin++;
                    ocount.setText(" O : "+owin);
                }
            }
        });
        g20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(c%2==0) {
                    g20.setText("O");
                    display.setText(xturn);
                }
                else {
                    g20.setText("X");
                    display.setText(oturn);
                }
                c++;
                g20.setEnabled(false);
                if(check()==1){
                    display.setText("X WINS");
                    xwin++;
                    xcount.setText(" X : "+xwin);
                }
                else if(check()==2){
                    display.setText("O WINS");
                    owin++;
                    ocount.setText(" O : "+owin);
                }
                else if(check()==0){
                    display.setText("DRAW");
                    xwin++;
                    xcount.setText(" X : "+xwin);
                    owin++;
                    ocount.setText(" O : "+owin);
                }
            }
        });
        g21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(c%2==0) {
                    g21.setText("O");
                    display.setText(xturn);
                }
                else {
                    g21.setText("X");
                    display.setText(oturn);
                }
                c++;
                g21.setEnabled(false);
                if(check()==1){
                    display.setText("X WINS");
                    xwin++;
                    xcount.setText(" X : "+xwin);
                }
                else if(check()==2){
                    display.setText("O WINS");
                    owin++;
                    ocount.setText(" O : "+owin);
                }
                else if(check()==0){
                    display.setText("DRAW");
                    xwin++;
                    xcount.setText(" X : "+xwin);
                    owin++;
                    ocount.setText(" O : "+owin);
                }
            }
        });
        g22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(c%2==0) {
                    g22.setText("O");
                    display.setText(xturn);
                }
                else {
                    g22.setText("X");
                    display.setText(oturn);
                }
                c++;
                g22.setEnabled(false);
                if(check()==1){
                    display.setText("X WINS");
                    xwin++;
                    xcount.setText(" X : "+xwin);
                }
                else if(check()==2){
                    display.setText("O WINS");
                    owin++;
                    ocount.setText(" O : "+owin);
                }
                else if(check()==0){
                    display.setText("DRAW");
                    xwin++;
                    owin++;
                    xcount.setText(" X : "+xwin);
                    ocount.setText(" O : "+owin);
                }
            }
        });






        setLayout(null);
        setSize(510,520);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        tictactoe ob=new tictactoe();
    }
}
