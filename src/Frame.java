import javax.swing.*;
import java.awt.*;

public class Frame {
    private JComboBox<Integer> y1;
    private JComboBox<Integer> m1;
    private JComboBox<Integer> d1;
    private JComboBox<Integer> y2;
    private JComboBox<Integer> m2;
    private JComboBox<Integer> d2;
    private JButton compute;
    private JTextField yrsOut;
    private JTextField mthOut;
    private JTextField dayOut;

    public void setFrame(){
        JFrame f = new JFrame("Calculator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(500,250,350,350);
        f.setLayout(null);
        f.setResizable(false);
        f.getContentPane().setBackground(Color.LIGHT_GRAY);

        compute = new JButton("Compute");
        compute.setBounds(125,150,115,50);
        f.add(compute);

        yrsOut = new JTextField("Years Apart:");
        yrsOut.setBounds(125,215,115,25);
        yrsOut.setEditable(false);
        yrsOut.setBackground(Color.PINK);
        f.add(yrsOut);

        mthOut = new JTextField("Months Apart:");
        mthOut.setBounds(125,245,115,25);
        mthOut.setEditable(false);
        mthOut.setBackground(Color.PINK);
        f.add(mthOut);

        dayOut = new JTextField("Days Apart:");
        dayOut.setBounds(125,275,115,25);
        dayOut.setEditable(false);
        dayOut.setBackground(Color.PINK);
        f.add(dayOut);



        y1 = setYrsTB(f,10,50,100,25);
        m1 = setMthTB(f, 113,50,125,25);
        d1 = setDayTB(f, 248, 50, 100,25);

        y2 = setYrsTB(f,10,100,100,25);
        m2 = setMthTB(f, 113,100,125,25);
        d2 = setDayTB(f, 248, 100, 100,25);


        f.setVisible(true);
    }

    private JComboBox<Integer> setDayTB(JFrame f, int x, int y, int w, int h){
        JComboBox<Integer> days = new JComboBox<Integer>();
        for(int j=1;j<=31;j++){
            days.addItem(j);
        }
        days.setBounds(x,y,w,h);
        f.add(days);
        return days;

    }

    private JComboBox<Integer> setYrsTB(JFrame f, int x, int y, int w, int h){
        JComboBox<Integer> yrs = new JComboBox<Integer>();
        for(int i=2022;i>=1930;i--){
            yrs.addItem(i);
        }
        yrs.setBounds(x,y,w,h);
        f.add(yrs);
        return yrs;
    }
    private JComboBox setMthTB(JFrame f, int x, int y, int w, int h){
        JComboBox<Integer> mths = new JComboBox<Integer>();
        for(int i = 1; i<=12; i++){
            mths.addItem(i);
        }
        mths.setBounds(x,y,w,h);
        f.add(mths);

        return mths;
    }
    public JComboBox<Integer> getY1(){
        return y1;
    }
    public JComboBox<Integer> getM1(){
        return m1;
    }
    public JComboBox<Integer> getD1(){
        return d1;
    }
    public JComboBox<Integer> getY2(){
        return y2;
    }
    public JComboBox<Integer> getM2(){
        return m2;
    }
    public JComboBox<Integer> getD2(){
        return d2;
    }
    public JButton getCompute(){
        return compute;
    }
    public JTextField getYrsOut(){
        return yrsOut;
    }
    public JTextField getMthOut(){
        return mthOut;
    }
    public JTextField getDayOut(){
        return dayOut;
    }
}
