package StudentManagment;


import java.io.*;
import java.util.*;



public class StudentManagementSystem {

    public static void menu() {
        // Creating a menu for chose a options from user/keybord..........
        System.out.println("***********Choose Your Choices************************");
        System.out.println("1. Add Student Name");
        System.out.println("2. Students Details");
        System.out.println("3. Exit's");

    }

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String args[]) throws Exception {
        Scanner in=new Scanner(System.in); //to take a  integer value form user or keyboard (in is for interger) 
        Scanner sc = new Scanner(System.in); // to take Sting value from user or keyboard (Sc for string)
        //Array list
        ArrayList <Student> ar = new ArrayList<Student>();

        File file = new File("StudentManagmentsystem.txt");
        ObjectOutputStream wData = null;  //For wrote a data in file
        ObjectInputStream rData = null;
        if (file.isFile())
        {
        	rData = new ObjectInputStream (new  FileInputStream(file));
        	ar = (ArrayList<Student>)rData.readObject();
        	rData.close();
        }

        int choose = -1;
        do{
            menu();
            System.out.println("Enter your Choices........");
            choose = in.nextInt();

            switch(choose)
            {
                case 1:
                    System.out.println("Enter Students ID Nummber:"); // to take students ID number in integer
                    int ID = in.nextInt();
                    System.out.println("Enter Students Name:");
                    String name=sc.nextLine();  //to get the input as string
                    System.out.println("Enter Students Address:");
                    String address = sc.nextLine() ;
                    System.out.println("Enter Student Phone Number:");
                    int num = in.nextInt();
                    System.out.println("Enter Students Faculty:");
                    String faculty = sc.nextLine();
                    
                    //call array
                    ar.add(new Student(ID, name, address, num, faculty)); //using Construction method;
                    wData= new ObjectOutputStream( new FileOutputStream(file));
                    wData.writeObject(ar);
                    wData.close();
                    break;


                case 2:
//                	System.out.println(ar);
                	ListIterator<Student> il = ar.listIterator();
                	while(il.hasNext()) {
                		Student stu = il.next();
                		System.out.println(stu.getID() + "\t" + stu.getname() + "\t" + stu.getnum() + "\t" + stu.getfaculty());
                	}
                	break;
                case 3:
                    System.exit(0);
            }

        } while (choose != 0);

        
    }

}
