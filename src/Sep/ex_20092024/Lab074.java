package Sep.ex_20092024;

public class Lab074 {
    public static void main(String[] args) {
        // Grade calculator
        // write a program that calculate and display
        // based on the following grading scale

        // A : 90 -100          90 - > A
        // B : 80 - 90          87 - > B
        // C ; 70 - 80          23 ->  F
        // D ; 60 - 69
        // F ; 0 - 59

        // 1. Find the user inputs
        // Score - > int score -> 89;
        // return - data - type - grade -> char

        // 2 . Basic logic
        // if score ( Score >= 90 && Score <= 100 ) -> Return or print grade - A
        // if score ( Score >= 89 && Score <= 80 ) -> Return or print grade - B
        // if score ( Score >= 79 && Score <= 70 ) -> Return or print grade - C
        // D,E
        // else grade  -> F


        // 3. Write the code

        char grade = 'F';
        int score = 89; // in future we will get this from user

        if (score >= 90 && score <=100) {
            grade = 'A';
        } else if  (score >= 80 && score <= 89) {
            grade = 'B';
        } else if  (score >= 70 && score <= 79) {
                grade = 'c';
        } else if  (score >= 60 && score <= 69) {
            grade = 'D';
        } else if  (score <= 0 && score > 100) {
            System.out.println("lol !!, are you god?");
            grade = '0';
        }  else {
            grade = 'F';
        }
        System.out.println("your grade is -> " + grade);







    }
}
