
public class Lab_02 
{
	public static void main (String[]args) 
	{
		int length = 2;
		int width = 4;
		int area = length*width;
	
		System.out.println(length + " muliplied by " + width + " is " + area);
		System.out.println("5 and 4 will produce..." + 5*4);	
		System.out.println("5 muliplied by 6 is " + 5*6);
	
		String Name = "Jude Atiya";
		String Address = "13129 Caminito Mendiola";
		String City = "San Diego";
		int zipCode = 92130;
		
		System.out.println("\nName: "+ Name);
		System.out.println("Address: "+ Address);
		System.out.println("City: "+ City);
		System.out.println("Zip Code: "+ zipCode);
		
		int l = 2;
		int w = 3; 
		int h = 4;
		int surfaceArea;

		surfaceArea = 2*(w*l+h*l+h*w);
		System.out.println("\nThe surface area of your rectangle is " + surfaceArea);
		
		
	}
}
