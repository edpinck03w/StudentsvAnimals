public class animal{

    String name;
    String type;
    

    public animal(String name, String type){
        this.name=name;
        this.type=type;
        
    }

    public void attack(student s){
        System.out.println(this.name + " " + this.type + " is attacking..." + s.name);
    }
}