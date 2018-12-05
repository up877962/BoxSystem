package type;

/**
 *
 * @author up859036, up878976, up877962, up912872
 */
public class Type3 extends Box{
    protected final float twoColoursPrice = 0.15f;
    private final String name = "Type 3";
    protected boolean twoColours;
   
    public Type3(float height, float width, float depth, boolean sealableTop, int grade, boolean twoColours, int quantity) {
        super(height, width, depth, sealableTop, grade, quantity);
        this.twoColours = twoColours;
        price = calculatePrice();
    }
    /**
     * 
     * @return 
     */
    @Override
    protected float calculatePrice() {
        float basicPrice = surfaceArea*gradePrice[grade-1];
        return (basicPrice + (basicPrice * twoColoursPrice) + ((boolean)sealableTop? (basicPrice * sealablePrice): 0)) * quantity;
        //return price;
    }
    /**+
     * 
     * @param grade
     * @return 
     */
    @Override
   protected boolean checkGrade(int grade) {
        if(grade<2 || grade>5){
            return false;
        }
        else{
            return true;
        }
    }
    
}
