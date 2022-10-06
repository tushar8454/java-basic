import javax.swing.*;

public class array {
    
     public static void main(String[] args){
        int sum=0;
        int arrayblocks;
        arrayblocks=Integer.parseInt(JOptionPane.showInputDialog(null,"enter the size of array"));

        int marks[]=new int[arrayblocks];

        for(int i=0;i<marks.length;i++){

        marks[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"enter the marks : "+i));
        }

        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        JOptionPane.showMessageDialog(null,"total sum is"+sum);
        
     }
}
