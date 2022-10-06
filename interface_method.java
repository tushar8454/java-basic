interface abs{
    void calculate(float balance);
}

class sbi implements abs{
    float a,interest,totalbalance;
    int accountno;

    public void calculate(float balance){
        a=balance;
        interest=(a*5)/100;
        totalbalance=a+interest;
        System.out.println("your interest is "+interest);
        System.out.println("now total balance plus interest is "+totalbalance);
    }
}


public class interface_method {
    public static void main(String[] args){
        sbi myobj=new sbi();
      
      myobj.calculate(600);
    }
}
  