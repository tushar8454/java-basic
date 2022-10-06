import java.util.Scanner;
class admissionform{
    String name;
    String fname;
    int age;

    public void fill(){
        Scanner myobj=new Scanner(System.in);
      System.out.println("enter your name ");
      name=myobj.nextLine();

      System.out.println("enter your father name ");
      fname=myobj.nextLine();
      
      System.out.println("enter your age ");
      age=myobj.nextInt();


    }

    public void show(){
        System.out.println("enter your name "+name);
        System.out.println("enter your father name "+fname);
        System.out.println("enter your age "+age);
    }
}


public class class_object {
    public static void main(String[] args){
       admissionform sunil=new admissionform();
       sunil.fill();
       sunil.show();
    }
}
