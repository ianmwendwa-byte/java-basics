class OuterClass{
    int x=10;
    class InnerClasses{
    int y=15;    
    }
}
public class InnerClasses {
    public static void main(String[] args) {
       OuterClass myOuter=new OuterClass();
       OuterClass.InnerClasses  myInner=myOuter.new InnerClasses();
 System.out.println(myOuter.x+" "+myInner.y);

    }
}
