 abstract class a{
    public static void f(){
        System.out.println("hyy sb thil h ye abstract class hai thikk hai");
    }
}

class b extends a{

}

public class abstract_class {
    public static void main(String[] args){
      b obj=new b();
      b.f();
    }
}
