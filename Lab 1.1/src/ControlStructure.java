
public class ControlStructure {
	public static void main (String [] avgs) {
		primePrinter(50);
		fooBarBaz();
		System.out.println("done");}
	
// fooBarBaz 
	
	public static void fooBarBaz(){
		for (int x=1; x<=500; x++){
			if ((x%310==0 ) && (x%7==0 ) && (x%3==0 )) 
			{
				System.out.print ("fooBarBaz");
			}
			else if ((x%10==0 ) && (x%7==0 )) 
			{
				System.out.print ("BarBaz");
			}
			else if ((x%10==0 ) && (x%3==0 )) 
			{
				System.out.print ("fooBaz");
			}
			else if ((x%7==0 ) && (x%3==0 )) 
			{
				System.out.print ("fooBar");
			}
			else if (x%10==0 ) 
			{
				System.out.print ("Baz");
			}
			else if (x%7==0 ) 
			{
				System.out.print ("Bar");
			}
			else if (x%3==0 ) 
			{
				System.out.print ("foo");
			}
			else 
			{
				System.out.print(x);
			}
			System.out.println();
		}
	}
		
//isPrime

	public static boolean isPrime(int num){
		for (int mod = 2; mod < num; mod++){
			if ((num%mod == 0))
			{
				return false;
			}
		}
		return true;
	}
		
//primePrinter
	
	public static void primePrinter(int limit){
		int counter=0;
		int initialnum=2;
			while (counter < limit)
			{
				if (isPrime(initialnum))
				{
				System.out.println(initialnum);
				counter++;
				}
				initialnum++;
			}	
		}
}