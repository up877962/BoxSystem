/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;

/**
 *
 * @author up878976
 */
public class Type3 extends Box{
    private final float twoColours = 1.15f;
    private final String name = "Type 3";
    
    public Type3(float height, float width, float depth, boolean sealableTop, int grade) {
        super(height, width, depth, sealableTop, grade);
        this.grade = grade;
    }

    @Override
    protected float calculatePrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
