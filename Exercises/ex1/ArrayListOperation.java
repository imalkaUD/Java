package ex1;

import java.util.ArrayList;

public class ArrayListOperation {
	
	public void removeOddNumbers(ArrayList<Integer> no) {
		
		no.removeIf(n -> n % 2 != 0);
		System.out.println("Output: " + no);
	}
	
	public void doubleEvenNumbers(ArrayList<Integer> no) {
		
		ArrayList<Integer> newno = new ArrayList<>();
		
		for(int newnumber : no) {
			if(newnumber % 2 == 0) {
				newnumber = newnumber * 2;
				newno.add(newnumber);
			}
			
	}
		System.out.println("Output: " + newno);
	}

}
