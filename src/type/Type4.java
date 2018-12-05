package type;

/**
 *
 * @author up859036, up878976, up877962, up912872
 */
public class Type4 extends Type3{
    protected final float reinforcedBPrice = 1.13f;
    private final String name = "Type 4";
    protected boolean bottomReinforced;
    /**
     * 
     * @param height
     * @param width
     * @param depth
     * @param sealableTop
     * @param grade
     * @param twoColours
     * @param bottomReinforced 
     */
    public Type4(float height, float width, float depth, boolean sealableTop, int grade, boolean twoColours, boolean bottomReinforced, int quantity) {
        super(height, width, depth, sealableTop,grade, twoColours, quantity);
        this.bottomReinforced = bottomReinforced;
        price = calculatePrice();
    }

    /**
     * 
     * @return 
     */
    @Override
    protected float calculatePrice() {
        return super.calculatePrice() * reinforcedBPrice;
    }
    /**
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
