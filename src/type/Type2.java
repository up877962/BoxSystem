package type;

/**
 *
 * @author up859036, up878976, up877962, up912872
 */
public class Type2 extends Box{
    private final float oneColourPrice = 0.12f;
    private final String name = "Type 2";
    private boolean oneColour;
    
    public Type2(float height, float width, float depth, boolean sealableTop, int grade, boolean oneColour, int quantity) {
        super(height, width, depth, sealableTop, grade, quantity);
        this.oneColour = oneColour;
        price = calculatePrice();
    }
    /**
     * 
     * @return 
     */
    @Override
    protected float calculatePrice() {
        float basicPrice = surfaceArea*gradePrice[grade-1];
        return  (basicPrice + (basicPrice * oneColourPrice) +((boolean)sealableTop? (basicPrice * sealablePrice): 0))* quantity;
        
    }
    /**
     * 
     * @param grade
     * @return 
     */
    @Override
    protected boolean checkGrade(int grade) {
        if(grade<2 || grade>4){
            return false;
        }
        else{
            return true;
        }
    }
    
    
}
