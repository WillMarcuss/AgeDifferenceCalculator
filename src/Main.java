import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        Frame frame = new Frame();
        frame.setFrame();

        // get input
        frame.getCompute().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if((Integer)frame.getM1().getSelectedItem() == 2 && (Integer)frame.getD1().getSelectedItem() >28){
                    printInvalidFirst();
                } else if((Integer)frame.getM2().getSelectedItem() == 2 && (Integer)frame.getD2().getSelectedItem() >28){
                    printInvalidSecond();
                } else if((Integer) frame.getM1().getSelectedItem()== 4 && (Integer)frame.getD1().getSelectedItem() >30){
                    printInvalidFirst();
                } else if((Integer)frame.getM2().getSelectedItem() == 4 && (Integer)frame.getD2().getSelectedItem() >30){
                    printInvalidSecond();
                } else if((Integer)frame.getM1().getSelectedItem()==6 && (Integer)frame.getD1().getSelectedItem() >30){
                    printInvalidFirst();
                } else if((Integer)frame.getM2().getSelectedItem()== 6 && (Integer)frame.getD2().getSelectedItem() >30){
                    printInvalidSecond();
                } else if((Integer)frame.getM1().getSelectedItem()==9 && (Integer)frame.getD1().getSelectedItem() >30){
                    printInvalidFirst();
                } else if((Integer)frame.getM2().getSelectedItem()==9 && (Integer)frame.getD2().getSelectedItem() >30){
                    printInvalidSecond();
                } else if((Integer)frame.getM1().getSelectedItem()==11 && (Integer)frame.getD1().getSelectedItem() >30){
                    printInvalidFirst();
                } else if((Integer)frame.getM2().getSelectedItem()==11 && (Integer)frame.getD2().getSelectedItem() >30){
                    printInvalidSecond();
                } else {
                    int yrDif = calculate.computeYearDifference((Integer) frame.getY1().getSelectedItem(), (Integer) frame.getY2().getSelectedItem());
                    int mthDif = calculate.computeMonthDifference((Integer) frame.getM1().getSelectedItem(), (Integer) frame.getM2().getSelectedItem());
                    int dayDif = calculate.computeDayDifference((Integer) frame.getD1().getSelectedItem(), (Integer) frame.getD2().getSelectedItem());
                    frame.getYrsOut().setText(yrDif+" Years apart");
                    frame.getMthOut().setText(mthDif+" Months apart");
                    frame.getDayOut().setText(dayDif+" Days apart");
                }
                }
        });

    }
    public static void printInvalidFirst(){
        JOptionPane.showMessageDialog(null, "Invalid First Birthday!");
    }
    public static void printInvalidSecond(){
        JOptionPane.showMessageDialog(null, "Invalid Second Birthday!");
    }
}
