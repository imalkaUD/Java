package ex5;

public class GenaricCalculator {
	
	public static<T extends Number> double calculateSum(T[] array) {
		
		double sum = 0;
		
		for(T element : array) {
			sum = sum + element.doubleValue();
		}
		
		return sum;
	}
	
	public static<T extends Number> double calculateAvg(T[] array) {
		
		double sum = calculateSum(array);
		
		return sum / array.length;
	}
	
	
	public static void main(String[] args){
		
		Integer[] IntArray = {1,2,3,4,5};
		
		Double[] DoubleArray = {1.1,2.2,3.3,4.4,5.5};
		
		Float[] FloatArray = {1.1f,2.1f,3.1f,4.1f,5.1f};
		
		System.out.println("Integer array sum: " + calculateSum(IntArray));
		
		System.out.println("Double array sum: " + calculateSum(DoubleArray));
		
		System.out.println("Float array sum: " + calculateSum(FloatArray));
	}

}
