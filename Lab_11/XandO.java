public class XandO {
		
		public static void main(String[] args) {
			String[][] xAndO = new String[4][4];
			
			for(int i = 0; i < xAndO.length; ++i)
				for(int j = 0; j < xAndO[i].length; ++j)
				{
					int k = (int)(Math.random()*(2-1+1)) + 1;
					
					if( k == 1 )
						xAndO[i][j] = "x";
					else
						xAndO[i][j] = "o";
				}
			
			for(int i = 0; i < xAndO.length; ++i) {
				for(int j = 0; j < xAndO[i].length; ++j)
					System.out.print(xAndO[i][j] + " ");
				
				System.out.println();
			}
		}
}
