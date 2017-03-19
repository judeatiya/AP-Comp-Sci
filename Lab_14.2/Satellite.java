import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

public class Satellite {
	public static void main(String[] args) {

	       ArrayList<Location> locate = new ArrayList<>();
	       double[] honLoc = {5, 6};
	       locate.add(new Honda(honLoc));
	       locate.add(new Toyota("8, 9"));
	       locate.add(new GMC(3, 8));
	       double[] home = {0, 0};
	       
	       NumberFormat deci2 = new DecimalFormat("#0.00");

	       int i = 0;
	       for (Location l : locate) {
	    	   double x = Math.random()*(100 - 1) + 1;
		       double y = Math.random()*(100 - 1) + 1;
	    	   
		       l.move(x, y);
		       
		       double newX = l.getLoc()[0];
		       double newY = l.getLoc()[1];
		       
	           System.out.println
	           		("\nAfter " + l.getID() + " Moved (" + deci2.format(x) + ", " +
	           	    deci2.format(y) + ")\n" + "New Location: " + 
	           	    "(" + deci2.format(newX) + ", " + deci2.format(newY) + ")");
	        		   
	       }

	       String printout =	"\n\n" +
	               				"==========================" + 
	               				"\nStarting locations...";

	       for (Location l : locate) {
	    	   double newX = l.getLoc()[0];
		       double newY = l.getLoc()[1];
	    	   
	           printout += 	"\nLocation for " + l.getID() + 
	        		   		": (" + deci2.format(newX) + ", " + deci2.format(newY) + ")";
	       }

	       printout += "\n\n" + "==========================" +
	                   "\nDistance from home...";


	       for (Location l : locate) {
	           printout += 	"\nDistance for " + l.getID() + 
	        		   		": (" + deci2.format(getDistance(l.getLoc(), home))+ ")";
	       }

	       System.out.println(printout);
	   }


	   public static double getDistance(double[] car, double[] home) {
	       return  Math.sqrt((Math.pow(car[0] - home[0], 2) + 
	    		   Math.pow(car[1] - home[1], 2)));
	   }

	   public static String getLocation(double[] loc) {
	       return loc[0] + ", " + loc[1];
	   }
}
