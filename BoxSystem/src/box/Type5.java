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
public class Type5 extends Type4{
    private final float reinforcedCPrice = 1.12f;
    private final String name = "Type 5";
    private boolean cornerReinforced;
    
    public Type5(float height, float width, float depth, boolean sealableTop, int grade, boolean twoColours, boolean bottomReinforced, boolean cornerReinforced) {
        super(height, width, depth, sealableTop, grade, twoColours, cornerReinforced);
        this.cornerReinforced = cornerReinforced;
    }

    @Override//TODO: Need to check for reinforced options
    protected float calculatePrice() {
        price += super.calculatePrice()*((boolean)cornerReinforced? reinforcedCPrice: 1);
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


