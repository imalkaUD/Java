import java.io.*;
public class Ex4{
	public static void main(String args[])throws IOException{
	
	int length, width, height, volume;
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	System.out.print("Input the length: ");
	length = Integer.parseInt(br.readLine());
	
	System.out.print("Input the width: ");
	width = Integer.parseInt(br.readLine());
	
	System.out.print("Input the height: ");
	height = Integer.parseInt(br.readLine());
	
	volume = (length * width) * height;
	
	System.out.println("Volume is  " + volume );
	
	}
}
	