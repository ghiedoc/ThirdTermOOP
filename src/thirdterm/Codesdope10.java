package thirdterm;

class Employee{
    private String name;
    private int year;
    private String address;
    
    Employee(String name, int year, String address){
        this.name = name;
        this.year = year;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        System.out.println("Name: " + name);
        return name;
    }

    public int getYear() {
        System.out.println("Year of Joining: " + year);
        return year;
    }

    public String getAddress() {
        System.out.println("Address: " + address);
        return address;
    }
    
    public void display(){
        getName();
        getYear();
        getAddress();
    }
    
}

public class Codesdope10 {

    public static void main(String[] args) {
        
        Employee e1 = new Employee("Robert", 1998, "Araneta, Cubao");
        Employee e2 = new Employee("Trisha", 2000, "Baccor City");
        Employee e3 = new Employee("Mary", 1992, "Dasmarinas");
        
        e1.display();
        e2.display();
        e3.display();
        
        
    }
    
}
