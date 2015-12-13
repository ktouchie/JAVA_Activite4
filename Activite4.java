import java.util.Scanner;
class Activite4 {
    
    public static void main(String [] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("CELSIUS-FAHRENHEIT CONVERTER");
        System.out.println("----------------------------");
        System.out.println("Choose conversion mode:");
        System.out.println("1 - Convert Celsius to Fahrenheit");
        System.out.println("2 - Convert Fahrenheit to Celsius");
        
        int mode = sc.nextInt();
        
        char loop = 'Y';
        
        while (loop == 'Y') {
        
            if (mode==1) {
                //* Celsius to Fahrenheit *//
                System.out.println("Please enter the temperature (°C) you wish to convert:");
                
            } else if (mode==2) {
                //* Fahreheit to Celsius *//
            } else {
                System.out.println("That is not a valid selection. Please select /"1/" or /"2/".");
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
    }
}