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
public class Type3 extends Box{
    protected final float twoColoursPrice = 1.15f;
    private final String name = "Type 3";
    protected boolean twoColours;
    /**
     * 
     * @param height
     * @param width
     * @param depth
     * @param sealableTop
     * @param grade
     * @param twoColours 
     */
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
        System.out.println("Quantity: " + quantity);
        return surfaceArea* gradePrice[grade-1] * twoColoursPrice*((boolean)sealableTop? sealablePrice: 1) * quantity;
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
