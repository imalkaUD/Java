//ex1
/*public class Lab1{
	public static void main(String args[]){
		System.out.println("Hello World!");
		System.out.println("It's been nice knowing you");
		System.out.print("Goodbye world!");
	}
}*/

//ex5
public class Lab1{

public static void main (String[] args)  {

int i,j,rows=6;

for(i=1 ; i<rows ; i++)
{
	for ( j = rows-i ; j>1 ; j--)
	{
	System.out.println(" ");
	}
	
	for(j=0 ; j<=i ; j++)
	{
	System.out.println("* ");
	}
//throws the cursor 
System.out.println();
}

}
}
	