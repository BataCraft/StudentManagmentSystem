package StudentManagment;

import java.io.Serializable;



public class Student implements Serializable {
    private int ID;
    private String name;
    private String address;
    private int num;
    private String faculty;

    public Student()
{
    ID = 0;
    name = "";
    address = "";
    num = 0;
    faculty = "";
}


    public Student(int iD, String name, String address, int num, String faculty) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.num = num;
        this.faculty = faculty;
    }

    public int getID(){
        return ID;
    }
    public String getname(){
        return name;
    }
    public String getaddress(){
        return address;
    }
    public int getnum(){
        return num;
    }
    public String getfaculty(){
        return faculty;
    }

}

