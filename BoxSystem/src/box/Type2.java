package box;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author up878976
 */
public class Type2 extends Box{
    private final float oneColour = 1.12f;
    private final String name = "Type 2";
    
    public Type2(float height, float width, float depth, boolean sealableTop, int grade) {
        super(height, width, depth, sealableTop, grade);
    }

    @Override
    protected float calculatePrice() {
        price += super.calculateSurfaceArea()* super.gradePrice[grade-1] * oneColour;
        return price;
    }

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
