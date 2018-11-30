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
public class Type1 extends Box {
    private final String name = "Type 1";
    private final float sealablePrice = 1.1f;
    
    /**
     * 
     * @param height
     * @param width
     * @param depth
     * @param sealableTop
     * @param grade 
     */
    public Type1(float height, float width, float depth, boolean sealableTop, int grade, int quantity) {
        super(height, width, depth, sealableTop, grade, quantity);
        price = calculatePrice();
    }
    /**
     * 
     * @return 
     */
    @Override
    protected float calculatePrice() {
        return surfaceArea * gradePrice[grade-1]*((boolean)sealableTop? sealablePrice: 1)* quantity;
    }
    /**
     * 
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
