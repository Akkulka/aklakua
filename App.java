package ru.krista.example;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

int rez=0;


 //System.out.println("Vvedite pervoe chislo");
 //int num1 = in.nextInt();
 //System.out.println("Vvedite znak (+, -, *, /)");
 //String value = in.next();
 //System.out.println("Vvedite vtoroe chislo");
 //int num2 = in.nextInt();

 String str = in.nextLine();
 in.close();
 String[] parts = str.split(" ");
 String newStr = String.join(" ", parts);
System.out.println(newStr);
int num1;
int num2;

try {

    num1 = Integer.parseInt(parts[0]);
    
    } catch (NumberFormatException e) {
    
    System.out.println("Не удалось получить число из: " + parts[0]);
    
    }

    try {

        num2 = Integer.parseInt(parts[2]);
        
        } catch (NumberFormatException e) {
        
        System.out.println("Не удалось получить число из: " + parts[2]);
        
        }
        num1 = Integer.parseInt(parts[0]);
        num2 = Integer.parseInt(parts[2]);
 switch (parts[1]) {
        case "+":
            rez = num1 + num2;
            break;
        case "-" :
        rez = num1 - num2;
        break;
        case "*" :
        rez = num1 * num2;
        break;
        case "/":
        if (num2 == 0){
            System.out.println("delit na 0 nelzya");
            return ;
        }
            else rez = num1 / num2;{
        }
            break;
        default:
        System.out.println("Oshibka! Vvedite correctnii znak");

            return;
    }
    System.out.println("Rezultat vichesleniya:");
    System.out.println(num1 + " " + parts[1] + " " + num2 + " = " + rez);
}    
}