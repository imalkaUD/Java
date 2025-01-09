package B24;

import java.util.ArrayList;

public class GenericInventory <T extends Number>{
	
	ArrayList<T> array = new ArrayList<T>();

	public double calculateAverage(T[] array) {
		
		double sum = 0;
		double avg;
		
		for(T value : array){
			
			sum = sum + value.doubleValue();
		}
		avg = sum / array.length;
		return avg;
		
	}
	
	
	

}
