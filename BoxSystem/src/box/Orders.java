
package box;
import java.util.*;
/**
 *
 * @author up878976
 */
public class Orders {
    private ArrayList<Order> orders = new ArrayList<>();
    public float totalPrice = 0;
    public Orders(){
        
    }
    public void addOrder(Order order){
        orders.add(order);
    }
    public void checkOrder(int quantity, int grade, int colours, float height, float width, float depth, boolean sealableTop, boolean reinforcedBottom, boolean reinforcedCorner){
        if((grade >=2 || grade<=5) && colours == 2 && reinforcedBottom && reinforcedCorner ){
            addOrder(new Order(quantity,  grade,  height, width, depth, sealableTop, reinforcedBottom, reinforcedCorner));
        }
    }
}
