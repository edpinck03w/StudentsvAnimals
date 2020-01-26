public class Example{

    public static void main(String args[]){

        student s1 = new student("Efren",29,7);
        student s2 = new student("Dan",30,5);
        student s3 = new student("Ed", 28,7);
        student s4 = new student("Rick",45,9);
        User u1 = new User("Andres",34);
        animal a1 = new animal("Machiato", "Dog");
        animal a2 = new animal("Baby","Shark");
        animal a3 = new animal("Black", "horse");
        animal a4 = new animal("Big","cat");

        s1.studentDisplay();
        System.out.println(u1.name);
        System.out.println(a1.name);

        a2.attack(s1);
        a3.attack(s2);
        a4.attack(s3);
        a1.attack(s4);

    }
}