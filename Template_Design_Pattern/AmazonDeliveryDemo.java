import java.util.*;
abstract class OrderProcessingTemplate{
    public void processOrder(){
        validateOrder();
        assignDeliveryAgent();
        trackOrder(); 
    }
    abstract void validateOrder();
    abstract void assignDeliveryAgent();
    abstract void trackOrder();
}
class LocalDelivery extends OrderProcessingTemplate{
    public void validateOrder(){
        System.out.println("Validating Local Order");
    }
    public void assignDeliveryAgent(){
        System.out.println("Assigning Local Delivery Partner for Order Delivery");
    }
    public void trackOrder(){
        System.out.println("Track the status of your local order");
    }
}
class InternationalDelivery extends OrderProcessingTemplate{
    public void validateOrder(){
        System.out.println("Validating International order");
    }
    public void assignDeliveryAgent(){
        System.out.println("Assigning International delivery Partner for order delivery");
    }
    public void trackOrder(){
        System.out.println("Tracking the status of International order");
    }
}
public class AmazonDeliveryDemo{
    public static void main(String args[]){
        OrderProcessingTemplate localTemplate=new LocalDelivery();
        OrderProcessingTemplate internationalTemplate=new InternationalDelivery();
        localTemplate.processOrder();
        System.out.println();
        internationalTemplate.processOrder();
    }
}