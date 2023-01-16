public class JavaMethodOverloading {
    static int plusIntMethod(int x,int y){
    return x+y;
    }
    static double plusIntMethod(Double x,Double y){
        return x+y;
    }
    public static void main(String[] args) {
        System.out.println(plusIntMethod(2,3));
        System.out.println(plusIntMethod(2.0,3.5));
    
    }
}
