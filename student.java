public class student extends User{
    
    public int cohortNumber;

    public student(String name, int age, int cohortNumber){
        super(name, age);
        this.cohortNumber=cohortNumber;
    }

    public void studentDisplay(){
        System.out.println("Name: "+ this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Cohort: "+ this.cohortNumber);
    }
}