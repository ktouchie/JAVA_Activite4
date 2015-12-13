import java.util.*;
class Activite4 {
    
    public static void main(String [] args) {  

        Scanner sc = new Scanner(System.in);
 
        char loop = 'Y';
        
        double cels = 0;
        double fahr = 0;
        
        while (loop == 'Y') {        
        
            System.out.println("CELSIUS-FAHRENHEIT CONVERTER");
            System.out.println("----------------------------");
            System.out.println("Choose conversion mode:");
            System.out.println("1 - Convert Celsius to Fahrenheit");
            System.out.println("2 - Convert Fahrenheit to Celsius");
            
            int mode = sc.nextInt();
        
            if (mode==1) {
                //* Celsius to Fahrenheit *//
                System.out.println("Please enter the temperature (°C) you wish to convert:");
                cels = sc.nextDouble();
                fahr = ((1.8*cels)+32);
                fahr = roundup(fahr,1);
                System.out.println(cels + "°C is equal to " + fahr + "°F.");
                
            } else if (mode==2) {
                //* Fahreheit to Celsius *//
                System.out.println("Please enter the temperature (°F) you wish to convert:");
                fahr = sc.nextDouble();
                cels = (((fahr-32)*5)/9);
                cels = roundup(cels,1);
                System.out.println(fahr + "°F is equal to " + cels + "°C.");
                
            } else {
                System.out.println("That is not a valid selection. Please select \"1\" or \"2\".");
            }
            System.out.println("Would you like to convert another temperature? (Y/N)");
            char valid = sc.next().charAt(0);
            valid = Character.toUpperCase(valid);
            if (valid=='Y') {
                loop = 'Y';
            } else if (valid=='N') {
                loop = 'N';
            } else {
                System.out.println("That is not a valid selection.");
                loop = 'N';
            }
        }
        System.out.println("Goodbye!");
    }
    public static double roundup(double A, int B) {
        return (double) ( (int) (A * Math.pow(10,B) + .5)) / Math.pow(10, B);
    }
}