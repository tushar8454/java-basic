import javax.swing.JOptionPane;

public class example3 {
    public static void main(String[] args){
        int a= Integer.parseInt(JOptionPane.showInputDialog(null,"enter the message A"));
        int b= Integer.parseInt(JOptionPane.showInputDialog(null,"enter the message B"));

        int c=a+b;
        JOptionPane.showMessageDialog(null, "result is "+c);
    }
}
