import java.util.Scanner;
public class JavaSwitch {
    public static void main(String[] args) {
      Scanner myObj=new Scanner(System.in);
      System.out.println("Enter the number of day:");
      int day=myObj.nextInt();
      switch(day){
          case 1:
          System.out.println("Monday");
          break;
          case 2:
          System.out.println("Tuesday");
          break;
          case 3:
          System.out.println("Wenesday");
          break;
          case 4:
          System.out.println("thursday");
          break;
          case 5:
          System.out.println("thursday");
          break;
          default:
          System.out.println("You entered a wrong grade.");
      }

    }
    
}
