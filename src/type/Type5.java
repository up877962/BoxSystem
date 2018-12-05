package type;

/**
 *
 * @author up859036, up878976, up877962, up912872
 */
public class Type5 extends Type4{
    private final float reinforcedCPrice = 0.12f;
    private final String name = "Type 5";
    private boolean cornerReinforced;
    /**
     * 
     * @param height
     * @param width
     * @param depth
     * @param sealableTop
     * @param grade
     * @param twoColours
     * @param bottomReinforced
     * @param cornerReinforced 
     */
    public Type5(float height, float width, float depth, boolean sealableTop, int grade, boolean twoColours, boolean bottomReinforced, boolean cornerReinforced, int quantity) {
        super(height, width, depth, sealableTop, grade, twoColours, cornerReinforced, quantity);
        this.cornerReinforced = cornerReinforced;
        price = calculatePrice();
    }
    /**
     * 
     * @return 
     */
    @Override
    protected float calculatePrice() {
        float basicPrice = surfaceArea*gradePrice[grade-1];
        return super.calculatePrice()+(basicPrice*reinforcedCPrice);
 
    }
    /**
     * 
     * @param grade
     * @return 
     */
    @Override
     protected boolean checkGrade(int grade) {
        if(grade<3 || grade>5){
            return false;
        }
        else{
            return true;
        }
    }
     
}
