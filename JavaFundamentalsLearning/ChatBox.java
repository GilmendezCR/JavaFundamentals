import java.util.Scanner;

public class ChatBox {
    
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Hello, what is your name?:");
String Name = scanner.nextLine();

System.out.print("Hi" + " " + Name + " " + "I'm Javabot. Where are you from?:");
String Home = scanner.nextLine();

System.out.print("I hear it's beutiful" + " " + Home + " " + "I'm from a place called Oracle. How old are you?:");
int Age = scanner.nextInt();

System.out.print("So you are" + " " + Age + " " + " so cool! I am 400 years old");

scanner.close();




}

}
