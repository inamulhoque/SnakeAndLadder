public class SnakeAndLadder {
    public static void main(String[] args) {
        int playerPosition = 0;
        System.out.println("Starting position of player : "+playerPosition);
        int dice = (int)(Math.random()*10)%6+1;
        System.out.println("Dice number: "+dice);
    }
}