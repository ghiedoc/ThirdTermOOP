package thirdterm;

class Student{
    String name;
    int roll_no;
    String phone;
    String address;
    static String course;
    
    Student(){
        
    }
    
    Student(String name, int roll_no, String address, String phone){
        this.name = name;
        this.roll_no = roll_no;
        this.address = address;
        this.phone = phone;
    }
    
    static void changeCourse(){
        course = "BSIT-MWA";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    

    public String getName() {
        return name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
    
    
    public void displayAll(){
        System.out.println("Name: " + getName());
        System.out.println("Student no: " + getRoll_no());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone number: " + getPhone());
    }
    
    void display(){
        System.out.println("Course: " + course);
    }
    
    
}

public class Codesdope {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Sam");
        s1.setRoll_no(2018102737);
        s1.setAddress("Cavite City");
        s1.setPhone("09472760568");
        s1.displayAll();
        Student.changeCourse();
        s1.display();
        System.out.println("");
        Student s2 = new Student();
        s2.setName("John");
        s2.setRoll_no(2018102678);
        s2.setAddress("Alabang City");
        s2.setPhone("09997831758");
        Student.changeCourse();
        s2.displayAll();
        s2.display();
        
        
    }
    
}
