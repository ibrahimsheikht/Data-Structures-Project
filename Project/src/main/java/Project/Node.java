package Project;

/**
 * @author Hamza Akbar
 */
public class Node {
   private PixelColor color;
   Node left;
   Node right;
   
   public Node(PixelColor color){
       this.color = color;
       this.left = null;
       this.right = null;
   }
   
   public PixelColor getColor(){
       return this.color;
   }
   
   
}
