/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package type;

import java.util.ArrayList;

/**
 *
 * @author up859036, up878976, up877962, up912872
 */
public class Order {
    public float totalPrice;
    private ArrayList<Box> orders = new ArrayList<>();
    
    public boolean addOrder(float height, float width, float depth,int grade, int colors, boolean reinforcedBottom, boolean reinforcedCorner, boolean sealabletop, int quantity) {
        if((grade >=3 && grade<=5) && colors == 2 && reinforcedBottom && reinforcedCorner ){
            orders.add(new Type5(height, width, depth, sealabletop, grade, (colors == 2) , reinforcedBottom, reinforcedCorner, quantity));
            System.out.println("Type5 Complete");
            return true;
        } else if( (grade >= 2 && grade <=5) && colors == 2 && reinforcedBottom && !reinforcedCorner){
            orders.add(new Type4(height, width, depth, sealabletop, grade, (colors == 2) , reinforcedBottom, quantity));
            System.out.println("Type4 Complete");
            return true;
        } else if ( (grade >= 2 && grade <= 5) && colors == 2 && !reinforcedBottom && !reinforcedCorner) {
            orders.add(new Type3(height, width, depth, sealabletop, grade, (colors == 2), quantity));
            System.out.println("Type3 Complete");
            return true;
        } else if ( (grade >= 2 && grade <= 4) && colors == 1 && !reinforcedBottom && !reinforcedCorner) {
            orders.add(new Type2(height, width, depth, sealabletop, grade, (colors == 1), quantity));
            System.out.println("Type2 Complete");
            return true;
        } else if ((grade >= 1 && grade <= 3) && colors == 0 && !reinforcedBottom && !reinforcedCorner){
            orders.add(new Type1(height, width, depth, sealabletop, grade, quantity));
            System.out.println("Type1 Complete");
            return true;
        }
        return false;
    }
    
    public void removeOrder(int index) {
        System.out.println(orders.size());
        orders.remove(index);
    }
    
    public float calculateTotalPrice() {
        float price = 0f;
        for(Box order: orders) {
            price += order.getPrice();
        }
        totalPrice = price;
        return price;
    }
    
    public Box getOrder(int index) {
    return orders.get(index);
    }
    
    public float getPrice(int index) {
        return orders.get(index).getPrice();
    }
    public float getTotalPrice(){
        return totalPrice;
    }
    public String getInvoice() {
        String output = "";
        for (Box order: orders) {
            
        }
        return output;
    }
}
