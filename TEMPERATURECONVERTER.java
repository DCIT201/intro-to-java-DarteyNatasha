import java .util.Scanner;
public class TEMPERATURECONVERTER {
    public static void main(String[] args) {
        System.out.println("TEMPERATURE CHECKER");
        System.out.println("CHOOSE 1 TO CONVERT FROM CELSIUS TO FAHRENHEIT");
        System.out.println("CHOOSE 2 TO CONVERT FROM FAHRENHEIT TO CELSIUS");

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
         if (num1 == 1){
             System.out.println("Enter figure");
             int num2 = input.nextInt();
             int conv1 = (num2 * 9/5) + 32;
             System.out.println(conv1 + "°F");
         }
        else{
             System.out.println("Enter figure");
             int num3 = input.nextInt();
             int conv2 = (num3 - 32) * 5/9;
             System.out.println(conv2 + "°C");
         }
    }
}