package box;

public class Order {
    private float orderPrice;
    private int quantity;
    
    public Order(int quantity){
        this.quantity = quantity;
    }
    public Order (int quantity, int grade, float height, float width, float depth, boolean sealableTop){
        Type1 product = new Type1(height,width, depth, sealableTop, grade);
    }
    public Order (int quantity, int grade, float height, float width, float depth, boolean sealableTop,int colours){
        if(colours == 1){
            Type2 product = new Type2(height,width, depth, sealableTop, grade, true);
        }
        else if (colours == 2){
            Type3 product = new Type3(height,width, depth, sealableTop, grade, true);
        }
        else{
            throw new Error("Invalid colours choice");
        }

        
    }
    public Order (int quantity, int grade, float height, float width, float depth, boolean sealableTop, boolean reinforcedBottom){
        Type4 product = new Type4(height,width, depth, sealableTop, grade, true, reinforcedBottom);
    }
    public Order (int quantity, int grade, float height, float width, float depth, boolean sealableTop, boolean reinforcedBottom, boolean reinforcedCorner){
        Type5 product = new Type5(height,width, depth, sealableTop, grade, true, reinforcedBottom, reinforcedCorner);
    }
    
    
}
