import java.util.Scanner;

class Calculator {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = object.nextDouble();
        object.nextLine();
        System.out.print("Enter second number: ");
        double number2 = object.nextDouble();
        object.nextLine();
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
        System.out.print("Enter your choice:");
        int operation = object.nextInt();
        if(operation==1){
            System.out.printf("%f + %f = %f",number1,number2,number1 + number2);
        }
            else if(operation==2){
            System.out.printf("%f - %f = %f",number1,number2,number1 - number2);
        }
        else if(operation==3){
            System.out.printf("%f * %f = %f",number1,number2,number1 * number2);
        }
        else if(operation==4){
            if(number2==0){
                System.out.println("Error can't divide with zero");
            }
            else{
                System.out.printf("%f / %f = %f",number1,number2,number1 % number2);
                object.close();
            }
            
        }
        

    }
    
}
