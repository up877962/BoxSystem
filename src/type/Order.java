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
            return true;
        } else if( (grade >= 2 && grade <=5) && colors == 2 && reinforcedBottom && !reinforcedCorner){
            orders.add(new Type4(height, width, depth, sealabletop, grade, (colors == 2) , reinforcedBottom, quantity));
            return true;
        } else if ( (grade >= 2 && grade <= 5) && colors == 2 && !reinforcedBottom && !reinforcedCorner) {
            orders.add(new Type3(height, width, depth, sealabletop, grade, (colors == 2), quantity));
            return true;
        } else if ( (grade >= 2 && grade <= 4) && colors == 1 && !reinforcedBottom && !reinforcedCorner) {
            orders.add(new Type2(height, width, depth, sealabletop, grade, (colors == 1), quantity));
            return true;
        } else if ((grade >= 1 && grade <= 3) && colors == 0 && !reinforcedBottom && !reinforcedCorner){
            orders.add(new Type1(height, width, depth, sealabletop, grade, quantity));
            return true;
        }
        return false;
    }
    /**
     * Method to remove an order from the orders list
     * @param index of order to be removed
     */
    public void removeOrder(int index) {
        orders.remove(index);
    }
    /**
     * Calculates the total price of all orders
     * @return the total price
     */
    public float calculateTotalPrice() {
        float price = 0f;
        for(Box order: orders) {
            price += order.getPrice();
        }
        totalPrice = price;
        return price;
    }
    /**
     * Gets order at specified index of orders list
     * @param index of order in list
     * @return order
     */
    public Box getOrder(int index) {
    return orders.get(index);
    }
    /**
     * Gets the price of an order in orders list
     * @param index of order in list
     * @return price of order at specified index
     */
    public float getPrice(int index) {
        return orders.get(index).getPrice();
    }
    /**
     * 
     * @return totalPrice
     */
    public float getTotalPrice(){
        return totalPrice;
    }
    /**
     * 
     * @return the number of orders in list 
     */
    public int getTotalOrders() {
        return orders.size();
    }
}
