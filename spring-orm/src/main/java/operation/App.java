package operation;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import orm.dao.StudentDao;
import orm.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
      ApplicationContext ac =  new ClassPathXmlApplicationContext("config.xml");
       
      StudentDao dao = ac.getBean("studentDao",StudentDao.class);
     
      /*
      // insert the data
      Student s1 = new Student(456,"Subha","Bengaluru");
      int insert = dao.insert(s1);
      
      System.out.println("insert done");
      System.out.println(insert+" rows are inserted.");
      */


      Scanner sc = new Scanner(System.in);
      boolean flag = true;
      while(flag) {
      System.out.println("Press 1 to add new Student");
      System.out.println("Press 2 to display all Student");
      System.out.println("Press 3 to display one Student");
      System.out.println("Press 4 to delete Student");
      System.out.println("Press 5 to update Student Data");
      System.out.println("Press 6 for exit");
      
         try {
        	 int choice =Integer.parseInt(sc.next());
        	 
        	 switch (choice) {
			case 1:
				// insert  the student data
				System.out.println("enter student id:");
				int uId =sc.nextInt();
				System.out.println("enter student name");
				String uName = sc.next();
				System.out.println("enter student city");
				String uCity = sc.next();
				Student s = new Student(uId, uName, uCity);
				
				int i = dao.insert(s);
				System.out.println(i+" id student are added");
				System.out.println("************");
				
				break;

            case 2:
				//display all student
            	List<Student> deatils = dao.getAllDeatils();
            	for (Student student : deatils) {
					System.out.println(student.getId());
					System.out.println(student.getName());
					System.out.println(student.getCity());
					System.out.println("---------------------------");
				}
				break;
            case 3:
            	// get one student data
            	System.out.println("enter student id:");
				int id =sc.nextInt();
				Student s1 = dao.getStudent(id);
				System.out.println(s1.getId());
				System.out.println(s1.getName());
				System.out.println(s1.getCity());
				System.out.println("---------------------------------");
				
            	break;
            	
            case 4:
            	// delete a student data
            	System.out.println("enter student id:");
				int iD =sc.nextInt();
				dao.deleteStudent(iD);
				System.out.println("Details deleted......");
            	break;
            case 5:
            	//update student data
            	System.out.println("enter student id:");
				int userId =sc.nextInt();
				System.out.println("enter student name");
				String userName = sc.next();
				System.out.println("enter student city");
				String userCity = sc.next();
				Student s2 = new Student(userId, userName, userCity);
				
				dao.updateStudent(s2);
            	
				System.out.println("Deatils updated sucessfully....");
            	break;
            case 6:
            	// exit from the loop
            	flag = false;
            	break;
			
			}
         }catch (Exception e) {
			System.out.println("Invalid input try with valid one");
			System.out.println(e.getMessage());
		}
      }
      System.out.println("Thank you for using my application");
      System.out.println("See you again");
    }
}
