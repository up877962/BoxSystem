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
public class Type1 extends Box {
    private final String name = "Type 1";
    
    
    public Type1(float height, float width, float depth, boolean sealableTop, int grade) {
        super(height, width, depth, sealableTop, grade);
        
    }

    @Override
    protected float calculatePrice() {
        price += super.calculateSurfaceArea()* super.gradePrice[grade-1];
        return price;
    }

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
