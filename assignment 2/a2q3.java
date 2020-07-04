import java.util.*;
public class a2q3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Exam ob[] = new Exam[5];
		//intializing objects to avoid null point exception
		for(int i=0; i<5; i++)
		{
			ob[i]=new Exam();
		}
		for(int i=0; i<5; i++)
		{
			System.out.println("For Student 1 :");
			System.out.println("Enter Student Name :");
			String name=sc.nextLine();
			System.out.println("Enter Roll Number :");
			int roll_number=sc.nextInt();
			System.out.println("Enter Course :");
			String course=sc.nextLine();
			System.out.println("Enter Mark 1 :");
			int mark1=sc.nextInt();
			System.out.println("Enter Mark 2 :");
			int mark2=sc.nextInt();
			System.out.println("Enter Mark 3 :");
			int mark3=sc.nextInt();
			sc.nextLine();
			ob[i].input_Student(roll_number,name,course);
			ob[i].input_Marks(mark1, mark2, mark3);
		}
		System.out.println("Diplaying Results :\n\n");
		for(int i=0; i<5; i++)
		{
			ob[i].display_student();
			ob[i].display_result();
		}
	}
}
class Student
{
	int roll_number;
	String name, course;
	void input_Student(int roll_number, String name, String course)
	{
		this.roll_number=roll_number;
		this.name=name;
		this.course=course;
	}
	void display_student()
	{
		System.out.println("Roll Number :"+roll_number);
		System.out.println("Name :"+name);
		System.out.println("Couse :"+course);
	}
}
class Exam extends Student
{
	int mark1, mark2, mark3;
	void input_Marks(int mark1, int mark2, int mark3)
	{
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	void display_result()
	{
		System.out.println("Mark 1 :"+mark1);
		System.out.println("Mark 2 :"+mark2);
		System.out.println("Mark 3 :"+mark3);
	}
}
