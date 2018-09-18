public class Snake{

   private int x;
   private int y;

   public Snake(int x, int y){
      this.x = x;
      this.y = y;
   }
      public void move(){
      x--;
      y--;   
         System.out.println("Jeg er en Slange, og står på feltet " + x + "," + y);
}

   public void eat(){
      System.out.println("HAHA jeg spiser dig nu Kanin!");
      System.out.println("HAPS!");
   }
}
