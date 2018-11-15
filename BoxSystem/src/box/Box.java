package box;

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
   
   
   public Box(float height, float width, float depth, boolean sealableTop, int grade){
       this.height = height;
       this.width = width;
       this.depth = depth;
       this.sealableTop = sealableTop; 
       this.grade = grade;
       

   }
       
   protected String getName(){
       return name;
   }
   protected float calculateSurfaceArea(){
      return (float)2*height*width + 2*width*depth + 2*depth*height;
   }   
   protected abstract float calculatePrice();
   protected abstract boolean checkGrade(int grade);
}
