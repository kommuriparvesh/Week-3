package commandPattern;
public class SellStock implements Chalk{
	   private ChalkStock chalkStock;

	   public SellStock(ChalkStock chalkStock){
	      this.chalkStock = chalkStock;
	   }

	   public void execute() {
	      chalkStock.sell();
	   }
	}