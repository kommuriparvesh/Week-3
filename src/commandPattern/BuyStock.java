package commandPattern;

public class BuyStock implements Chalk {
	   private ChalkStock chalkStock;

	   public BuyStock(ChalkStock chalkStock){
	      this.chalkStock = chalkStock;
	   }

	   public void execute() {
	      chalkStock.buy();
	   }
	}