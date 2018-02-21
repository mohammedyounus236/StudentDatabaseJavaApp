import java.util.Scanner;


public class StudentDatabaseApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ask how many students we want to add
		System.out.println("Enter number of students: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		
		//Create n number of new students
		for(int i = 0; i < numOfStudents; i++){
			students[i] = new Student();
			students[i].Enroll();
			students[i].payTuition();
			System.out.println(students[i].showInfo());
		}
		
		
	}

}
