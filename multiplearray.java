import javax.swing.*;
public class multiplearray {
    public static void main(String
    [] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog(null,"enter the rows in a array"));

        int b=Integer.parseInt(JOptionPane.showInputDialog(null,"enter the coloum in a array"));

        int c[][]=new int[a][b];

        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                c[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"enter the values"));
            }
        }

        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(" "+c[i][j]);
            } 
            System.out.println("");
        }
    }
}
