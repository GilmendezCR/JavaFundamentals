
import java.util.Scanner;

public class TriviaQuiz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int Score = 0;

        System.out.println("1.Which country held the 2016 Summer Olympics?");
        System.out.println(" a) China");
        System.out.println(" b) Ireland");
        System.out.println(" c) Brazil");
        System.out.println(" d) Italy");
        String Answer = scanner.nextLine();

        if(Answer.equals("c") || Answer.equals("C") || Answer.equals("c)") || Answer.equals("C)" ))
        {
            Score = Score + 5;
        }
        else{
            System.out.println("Error. System just accepts the following answers: a - d , A - D , a) - d) , A) - D)");
        }

        System.out.println("2.Which planet is the hottest?");
        System.out.println(" a) Venus");
        System.out.println(" b) Saturn");
        System.out.println(" c) Mercury");
        System.out.println(" d) Mars");
        String AnswerTwo = scanner.nextLine();

         if(AnswerTwo.equals("a") || AnswerTwo.equals("A") || AnswerTwo.equals("a)") || AnswerTwo.equals("A)"))
        {
            Score = Score + 5;
        }
        else{
            System.out.println("Error. System just accepts the following answers: a - d , A - D , a) - d) , A) - D)");
        }

        System.out.println("3.What is the rearest blood type?");
        System.out.println(" a) 0");
        System.out.println(" b) A");
        System.out.println(" c) B");
        System.out.println(" d) AB-Negative");
        String AnswerThree = scanner.nextLine();

         if(AnswerThree.equals("d") || AnswerThree.equals("D") || AnswerThree.equals("d)") || AnswerThree.equals("D)"))
        {
            Score = Score + 5;
        }
        else{
            System.out.println("Error. System just accepts the following answers: a - d , A - D , a) - d) , A) - D)");
        }

        System.out.println("4.Which country held the 2016 Summer Olympics?");
        System.out.println(" a) Ron Weasley");
        System.out.println(" b) Hermione Granger");
        System.out.println(" c) Draco Malfoy");
        String AnswerFour = scanner.nextLine();

        if(AnswerFour.equals("a") || AnswerFour.equals("A") || AnswerFour.equals("a)") || AnswerFour.equals("A)") || AnswerFour.equals("b") || AnswerFour.equals("B") || AnswerFour.equals("b)") || AnswerFour.equals("B)"))
        {
            Score = Score + 5;
        }
        else{
            System.out.println("Error. System just accepts the following answers: a - d , A - D , a) - d) , A) - D)");
        }
        
        System.out.println("Your final score is:" + Score + " " + "/20");


        if(Score >= 15)
        {
        System.out.println("Wow you know your stuff");
        }else if(Score < 15 && Score > 5)
        {
        System.out.println("Not Bad");
        }
        else
        {
        System.out.println("Better Luck Next Time");

        }
        scanner.close();
        }


}


    

