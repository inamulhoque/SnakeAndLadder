import java.util.Scanner;
public class SnakeAndLadder {
    public static void main(String[] args) {
        int playerPosition = 0;
        System.out.println("Starting position of player : "+playerPosition);
        System.out.println("\nOption 1 : No Play");
        System.out.println("Option 2 : Ladder");
        System.out.println("Option 3 : Snake\n");
        int count =1;


        for (playerPosition=1;playerPosition<=100;playerPosition++) {
            int dice = (int)(Math.random()*10)%6+1;
            System.out.println("Dice number: "+dice);
            int No_Play = 1;
            int Ladder = 2;
            int Snake = 3;
            int option = (int) (Math.random() * 10) % 3 + 1;
            count++;
            System.out.println("The player got: " + option);
            switch (option) {
                case 1:
                    System.out.println("No Play");
                    playerPosition = playerPosition + 0;
                    System.out.println("Player Position after dice roll:"+playerPosition);
                    break;
                case 2:
                    if (playerPosition <= 100) {
                        playerPosition = playerPosition + dice;
                    }
                    System.out.println("Player Position after dice roll:"+playerPosition);
                    break;
                case 3:
                    playerPosition = playerPosition - dice;
                    if (playerPosition < 0) {
                        playerPosition = 0;
                    }
                    System.out.println("Player Position after dice roll:"+playerPosition);
                    break;
            }
            System.out.println("Player position: "+playerPosition);
            if (playerPosition==100){
                System.out.println("Congratulation!!! you have won.");
                System.out.println(count+" number of times dice rolled.");
            } else if (playerPosition>100){
                playerPosition=playerPosition-dice;
            }
        }
    }
}