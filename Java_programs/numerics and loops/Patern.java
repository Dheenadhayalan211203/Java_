 

public class Patern {

	
	public static void main(String[]args)
	{
		int n=5;
		for(int row=1;row<=n;row++)
		{
			
			 
			 for(int col=n-row;col>0; col--)
			 {
				 System.out.print("  ");
				 
			 }
			 int temp = row;
			 for(int col=1;col<=row;col++)
			 {
			     System.out.print((temp++) + " ");
			 }
			 temp -= 1;
			 for(int col = 1;col < row;col++){
			     System.out.print((--temp) + " ");
			 }
			  
			 
			 System.out.println();
			
		}
		
		 
	}
}
