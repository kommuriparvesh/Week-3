package commandPattern;
import java.util.*;
public class CommandPatternDemo {
	   public static void main(String[] args) {
	      ChalkStock abcStock = new ChalkStock();
Scanner sc=new Scanner(System.in);
Broker broker = new Broker();

	      while(true) {
	    	  System.out.println("1.Buy\n2.Know Selling items\n3.Execute orders\n4.exit");
	    	  
	    	  int ch=sc.nextInt();
	    	  switch(ch) {
	    	  case 1:{
	    		  BuyStock buyStockOrder = new BuyStock(abcStock);	  
	    		  broker.takeOrder(buyStockOrder);
	    		  break;
			      
	    	  }

	    	  case 2:{
	    		  SellStock sellStockOrder = new SellStock(abcStock);

			      broker.takeOrder(sellStockOrder);  

			      break;
	    	  }
	    	  case 3:{
	    		  broker.placeOrders();  
	    		  break;
	    	  }
	    	  
	    	  case 4:{
	    		  System.out.println("Exiting........");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.exit(0);
					break;
	    	  }
	    	  }
	    	  
	    	 
	      }
	      
	      
	   }
	}