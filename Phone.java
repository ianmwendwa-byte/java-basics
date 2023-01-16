class Phones{
    void Ring(){
        System.out.println("Phone is Ringing");
    }
}
    class Nokia extends Phones{
        void Specs(){
            System.out.println("Most are Flagship");
        }
    }
    class Techno extends Phones{
        void Spec(){
            System.out.println("Most are midrange");
        }
    }
public class Phone{
    public static void main(String[] args) {
        Nokia N = new Nokia();
            N.Ring();
            N.Specs();
            Techno T = new Techno();
            T.Ring();
            T.Spec();
    }
}
