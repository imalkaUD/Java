package my;
import java.util.ArrayList;
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> st = new ArrayList<Student>();
		
		st.add(new Student(1 , "Kamal" , 3));
		st.add(new Student(1 , "Kamal" , 3));
		st.add(new Student(1 , "Kamal" , 3));
		st.add(new Student(1 , "Kamal" , 3));
		st.add(new Student(1 , "Kamal" , 3));
		
		for(Student stValue : st) {
			System.out.println(stValue);
		}
		
		
		
		ArrayList<Student> removest = new ArrayList<Student>();
		
		for(Student stValue : st) {
			
			if(stValue.marks > 50) {
				removest.add(stValue);
			}
		}
		
		
		for(Student stValue : removest) {
			System.out.println(stValue);
		}

	}

}
