class Vehicles {
    protected String brand="Ford";
    public void honk(){
        System.out.println("Tuut,tuut");
    }
}
class car extends Vehicles{
    private String modelName="Mustang";
    public static void main(String[] args) {
        car obj=new car();
        obj.honk();
        System.out.println(obj.brand+"  "+obj.modelName);
    }
}

