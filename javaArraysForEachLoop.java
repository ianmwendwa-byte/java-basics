public class javaArraysForEachLoop {
    public static void main(String[] args) {
        String[] cars={"Mazda","Benz","Toyota","Honda","Subaru"};
        for (String i : cars) {
            System.out.println(i);
        }
        System.out.println(cars.length);
        System.out.println(cars[0]);
    }
}
