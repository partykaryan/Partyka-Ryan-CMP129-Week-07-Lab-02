public final class ImmutableStudent {

    // TODO: Create two private final fields:
    private final String name;
    private final int age;

    // TODO: Create a constructor that receives name and age.
    // The constructor should initialize both fields.
    public ImmutableStudent(String name, int age){
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

    // IMPORTANT:
    // Do NOT create setter methods in this class.
    // The object's data should not change after it is created.

    // TODO: Create a displayInfo() method.
    // Display the student's name and age.
    public void displayInfo(){
        System.out.println("Name: " + name + ", Age: " + age);
    }

}//end of public final class
