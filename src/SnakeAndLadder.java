class CheckStatus{
    public static int positionOfPlayer1;
    public static int positionOfPlayer2;
    public static boolean chance;
    public static void checkOption()
    {
        int dice = (int)(Math.random()*10)%6+1;
        System.out.println("Dice number: "+dice);

        int option = (int)(Math.random()*3+1);

        switch (option)
        {
            case 1:
                System.out.println("It's a snake");
                if(chance) {
                    positionOfPlayer1-=dice;
                    System.out.println("Current position of Player 1: "+positionOfPlayer1);
                }
                else
                {
                    positionOfPlayer2-=dice;
                    System.out.println("Current position of Player 2: "+positionOfPlayer2);
                }
                if(positionOfPlayer1<0||positionOfPlayer2<0) {positionOfPlayer1=0;positionOfPlayer2=0;}

                break;
            case 2:
                System.out.println("It's a ladder");
                if(chance) {
                    positionOfPlayer1+=dice;
                    chance = false;
                }
                else
                {
                    positionOfPlayer2+=dice;
                    chance = true;
                }
                System.out.println("Current position of player : "+positionOfPlayer1);
                break;
            case 3:
                System.out.println("No Play");
                if(chance) {
                    System.out.println("Current position of Player 1: "+positionOfPlayer1);
                }
                else
                {
                    System.out.println("Current position of Player 2: "+positionOfPlayer2);
                }
        }
    }
}
public class SnakeAndLadder {

    public static void main(String[] args) {
        System.out.println("Current position of Player 1: "+CheckStatus.positionOfPlayer1);
        System.out.println("Current position of Player 2: "+CheckStatus.positionOfPlayer2);
        int count = 0;
        while(CheckStatus.positionOfPlayer1<100 || CheckStatus.positionOfPlayer2<100) {
            CheckStatus.checkOption();
            count++;
            if(CheckStatus.chance) {
                CheckStatus.chance = false;
            }
            else {
                CheckStatus.chance=true;
            }
        }
        System.out.println(count+" number of times the dice rolled");
        if(CheckStatus.chance) {
            System.out.println("Player 1 won!!!");
        }
        else {
            System.out.println("Player 2 won!!!");
        }
    }
}