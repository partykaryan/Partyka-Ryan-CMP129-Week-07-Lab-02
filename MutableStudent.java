public class MutableStudent {

    // TODO: Create two private fields:
    private String name;
    private int age;

    // TODO: Create a constructor that receives name and age.
    // Store the values in the object's fields.
    public MutableStudent(String name, int age){
        this.name = name;
        this.age = age;
    }
    // TODO: Create a getter for name.
    public String getName(){
        return name;
    }
    // TODO: Create a getter for age.
    public int getAge(){
        return age;
    }
    // TODO: Create a setter for name.
    // This method should CHANGE the existing object's name.
    public void setName(String name){
        this.name = name;
    }
    // TODO: Create a setter for age.
    // This method should CHANGE the existing object's age.
    public void setAge(int age){
        this.age = age;
    }
    // TODO: Create a displayInfo() method.
    // Display the student's name and age.
     public void displayInfo(){
        System.out.println("Name: " + name + ", Age: " + age);
    }

}//end of public class
