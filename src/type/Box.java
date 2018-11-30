/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package type;

/**
 *
 * @author up859036, up878976, up877962, up912872
 */
public abstract class Box {
   protected float height;
   protected float width;
   protected float depth;
   protected boolean sealableTop;
   protected float surfaceArea;
   protected float price;
   protected String name;
   protected final float[] gradePrice = {0.55f, 0.65f, 0.82f, 0.98f, 1.5f};
   protected final float sealablePrice = 1.1f;
   protected int grade;
   protected int quantity;
   
   /**
    * The constructor for the box class
    * @param height 
    * @param width 
    * @param depth
    * @param sealableTop
    * @param grade 
    */
   public Box(float height, float width, float depth, boolean sealableTop, int grade, int quantity){
       this.height = height;
       this.width = width;
       this.depth = depth;
       this.sealableTop = sealableTop; 
       this.grade = grade;
       this.quantity = quantity;
       surfaceArea = calculateSurfaceArea();
       System.out.println("surface area original: " + surfaceArea);
       

   }
   /**
    * 
    * @return 
    */    
   protected String getName(){
       return name;
   }
   /**
    * 
    * @return 
    */
   protected float getPrice(){
       return price;
   }
   protected float getSurfaceArea(){
       return surfaceArea;
   }
   /**
    * 
    * @return 
    */
   protected float calculateSurfaceArea(){
//      System.out.println("height: " + height + "\nwidth: " + width + "\ndepth: " + depth + "\nSurface area 1:" + 2*(height*width + width*depth + depth*height));
//      System.out.println("surface area 2: " + ((2*height*width) + (2*width*depth) + (2*depth*height)));
      
      
      return (float)(2*height*width + 2*width*depth + 2*depth*height);
   }  
  
   protected abstract float calculatePrice();
   /**
    * 
    * @param grade
    * @return 
    */
   protected abstract boolean checkGrade(int grade);
}
