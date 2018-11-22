
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
}
