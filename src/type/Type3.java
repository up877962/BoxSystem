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
    
    public Type3(float height, float width, float depth, boolean sealableTop, int grade, boolean twoColours) {
        super(height, width, depth, sealableTop, grade);
        this.twoColours = twoColours;
        calculatePrice();
    }

    @Override
    protected float calculatePrice() {
        price += super.calculateSurfaceArea()* super.gradePrice[grade-1] * ((boolean)twoColours?twoColoursPrice:1);
        return price;
    }

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
