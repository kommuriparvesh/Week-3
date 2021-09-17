package commandPattern;
import java.util.ArrayList;
import java.util.List;

   public class Broker {
   private List<Chalk> chalkList = new ArrayList<Chalk>(); 

   public void takeOrder(Chalk order){
      chalkList.add(order);
      System.out.println("Broker registered in sequence all will executed Once.");
   }

   public void placeOrders(){
   
      for (Chalk order : chalkList) {
         order.execute();
      }
      chalkList.clear();
   }
}