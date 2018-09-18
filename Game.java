public class Game{

   public static void main(String[] args){
   
   Snake nySnake = new Snake(10, 10);
   Rabbit nyRabbit = new Rabbit(1, 1);
   
   System.out.println("NU STARTER SPILLET!\n");
     for (int i = 0; i <4; i++){

   nySnake.move();
   nyRabbit.move();
   
   }
   nyRabbit.help();
   nySnake.eat();
   System.out.println();
   System.out.println("Spillet er slut nu! og Snaken har vundet");
   }
}