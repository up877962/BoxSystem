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
public class Type5 extends Box{
    private final float twoColoursPrice = 1.15f;
    private final float reinforcedBPrice = 1.13f;
    private final float reinforcedCPrice = 1.12f;
    private final String name = "Type 5";
    private boolean twoColours;
    private boolean bottomReinforced;
    private boolean cornerReinforced;
    
    public Type5(float height, float width, float depth, boolean sealableTop, int grade, boolean twoColours, boolean cornerReinforced, boolean bottomReinforced) {
        super(height, width, depth, sealableTop, grade);
        this.grade = grade;
        this.twoColours = twoColours;
        this.cornerReinforced = cornerReinforced;
        this.bottomReinforced = bottomReinforced;
    }

    @Override//TODO: Need to check for reinforced options
    protected float calculatePrice() {
        price += super.calculateSurfaceArea()* super.gradePrice[grade-1] * ((boolean)twoColours?twoColoursPrice:1) * ((boolean)cornerReinforced? reinforcedCPrice: 1)* ((boolean)bottomReinforced? reinforcedBPrice: 1);
        return price;
    }

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


