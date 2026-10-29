public class StudentTest {

    public static void main(String[] args) {

        // PART 1: Mutable Student
        // TODO: Create a MutableStudent object.
        MutableStudent mutableStudent = new MutableStudent("Jeff", 21);

        // TODO: Display the student's original information.
        mutableStudent.displayInfo();

        // TODO: Use the setter methods to change the student's data.
        mutableStudent.setAge(22);

        // TODO: Display the student again.
        // Question: Did the SAME object change? Yes the age attribute was successfully changed using a setter method 
        //on the same mutable student object
        System.out.println("Attempt to change attribute of Mutable Student object using setter method: ");
        mutableStudent.displayInfo();
        System.out.println("Confirmed: " + mutableStudent.getName() + "'s age updated to " + mutableStudent.getAge());

        System.out.println();

        // PART 2: Immutable Student
        // TODO: Create an ImmutableStudent object.
        ImmutableStudent immutableStudent = new ImmutableStudent("Lisa", 22);

        // TODO: Display the student's information.
        immutableStudent.displayInfo();
         
        //Creating second ImmutableStudent object with different data
        ImmutableStudent immutableStudent2 = new ImmutableStudent("Greg", 20);

        //Dispaying both ImmutableStudent objects to show that first object cannot be changed with setter methods
        System.out.println("Demonstrating that attributes of first Immutable Student object do not change\n"
        + "after creation of second Immutable Student object: ");
        immutableStudent.displayInfo();
        immutableStudent2.displayInfo();

        // Try to answer this in a comment:
        // Why can you not change the ImmutableStudent object
        // using setter methods?
        //Setter methods cannot be used to update the ImmutableStudent object as the class is declared as final
        //and it's fields are also declaerd as private final, preventing any attempt to update the attributes of an 
        //object after creation.


        // PART 3: Compare
        // Add comments that answer:
        // 1. Which class is mutable? MutableStudent class
        // 2. Which class is immutable? ImmutableStudent class
        // 3. What is the biggest difference you noticed? 
        //In MutableStudent we are able to use setter methods to update the attributes of the objects 
        //created in StudentTest, while ImmutableStudent objects cannot be modified after creation. 
    }//end of main method
}//end of public class
