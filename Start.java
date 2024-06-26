import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Student Manegment App--");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		while(true) {
			
			System.out.println("Press 1 to ADD Student");
			System.out.println("Press 2 to Delete Student");
			System.out.println("Press 3 to Display Student");
			System.out.println("Press 4 to Exit Student");
			int c=Integer.parseInt(br.readLine());
			
			if(c == 1)
			{
				//add
				System.out.println("Enter user Name"); 
				String name = br.readLine();
				
				System.out.println("Enter user Phone"); 
				String phone = br.readLine();
				
				System.out.println("Enter user City"); 
				String city = br.readLine();
				 
				Student st = new Student(name, phone, city);
				boolean answer = StudentDao.insertStudentToDB(st);
				if(answer)
				{
					System.out.println("Student is added succesfully");
				}else
				{
					System.out.println("somthing went wrong");
				}
				System.out.println(st);
				
				//create student object to store student
			
				//System.out.println(st); 
				
				
			} else if( c== 2)
			{
				//delet
				
				System.out.println("Enter Student ID to Delete:  ");
				int userId = Integer.parseInt(br.readLine());
				boolean f =StudentDao.deleteStudent(userId);
				if(f)
				{
					System.out.println("DEleted....");
					
				}
				else {
					System.out.println("Something went wrong");
				}
			}else if( c== 3)
			{
				//display
				StudentDao.showAllStudent();
			}else if(c==4)
			{
				//exit
				break;
			}else
			{
				System.out.println(" ");
			}
		}
		System.out.println("Thank You For Using MY Application:-):-)");
		System.out.println("See You Soon Bye Bye........!");
	}

}
