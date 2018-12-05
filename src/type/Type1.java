package type;

/**
 *
 * @author up859036, up878976, up877962, up912872
 */
public class Type1 extends Box {
    private final String name = "Type 1";
    
    
    public Type1(float height, float width, float depth, boolean sealableTop, int grade, int quantity) {
        super(height, width, depth, sealableTop, grade, quantity);
        price = calculatePrice();
    }
    /**
     * Calculates the price of the box
     * @return 
     */
    @Override
    protected float calculatePrice() {
        float basicPrice = surfaceArea * gradePrice[grade-1];
        return (basicPrice +((boolean)sealableTop? (basicPrice*sealablePrice): 0))* quantity;
    }
    /**
     * Checks whether the grade is within the valid range for the box
     * @param grade
     * @return 
     */
    @Override
    protected boolean checkGrade(int grade) {
        if(grade<1 || grade>3){
            return false;
        }
        else{
            return true;
        }
    }    
}
