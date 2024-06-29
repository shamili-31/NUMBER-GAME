import java.util.Random;
import java.util.Scanner;
public class number{

    public static void main(String arg[]){
        Random random=new Random();
        try (Scanner sc = new Scanner(System.in)) {
            int randomNum=random.nextInt(100)+1;
            System.out.println("You have 5 Attempts to get a correct guess!");
            System.out.println("Guess a Number between 1 and 100: ");
            int guessNum,count=0,score=0;
            while(count<5){
                guessNum=sc.nextInt();
                if(randomNum==guessNum){
                    System.out.println("Genius, Number has been matched!");
                    score=count;
                }
                if(randomNum<guessNum && count<=4){
                    System.out.println("Number is Lower than "+guessNum);
                    count++;
                }
                if(randomNum>guessNum && count<=4){
                    System.out.println("Number is higher than "+guessNum);
                    count++;
                }
                switch(score){
                    case 1:
                        System.out.println("Hurrah,Your score is 100");
                        break;
                    case 2:
                        System.out.println("Yay,Your score is 90");
                        break;
                    case 3:
                        System.out.println("Wow,Your score is 80");
                        break;
                    case 4:
                        System.out.println("Nice,Your score is 60");
                        break;
                    case 5:
                        System.out.println("Good,Your score is 50");
                        break;
                    default:
                        break;
                }
                if(count==5 && score!=5){
                    System.out.println("You lost this game, Better Luck next time");
                }
            }
        }
    
    }
}