public class Rabbit{

  //coordinates
   private int x;
   private int y;
   
   //konstruktør
   public Rabbit(int x, int y){
      this.x = x;
      this.y = y;
   }  
   public void move(){
      x++;
      y++;   
         System.out.println("Jeg er en Kanin, og står på feltet " + x + "," + y);
}
   public void help(){
      System.out.println("NEEEJJ!!! Du må ikke spise mig Slange!");
      }
 
}
