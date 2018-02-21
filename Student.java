import java.util.Scanner;


public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	//Constructor prompt name and year
	public Student(){
		System.out.println("Enter student's first name: ");
		Scanner in = new Scanner(System.in);
		this.firstName = in.nextLine();
		
		System.out.println("Enter student's last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1-Freshman\n2-Sophomore\n3-Junior\n4-SeniorEnter student's class level: ");
		this.gradeYear = in.nextInt();
				
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

	}
	
	//Generate ID
	private void setStudentID(){
		//Grade Level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	//Enroll in courses
	public void Enroll(){
		//Loop hits zero when finished enrolling
		do{
		System.out.println("Enter course to enroll (Q to quit)");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if(! course.equals("Q")){
			
			courses = courses + "\n" + course;

			tuitionBalance += costOfCourse;
		}
		else{
			break;
			}
		}
		while( 1!=0 );
	}
	
	//View Balance
	public void viewBalance(){
		System.out.println("Balance: "+ tuitionBalance);
	}
	
	//Pay Tuition
	public void payTuition(){
		viewBalance();
		System.out.println("How much tuition to pay? ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Paid: " + payment);
		viewBalance();
	}
	
	//Show Status
	public String showInfo(){
		return "Name: " + firstName + " " + lastName +
				"\nGrade level: " + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled: " + courses +
				"\nTuition Balance: " + tuitionBalance;
	}
}
