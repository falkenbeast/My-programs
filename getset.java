class Frog{
    String name; //intance variable
    int age;
    public void setName(String newName){
        this.name = newName;                     //this reffers to the  instance variable
    }
    public void setAge(int newAge){               
        age = newAge;                           //without this it goes to nearer variable   
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class getset{
    public static void main(String [] args)
    {
        Frog frog1 = new Frog();
        frog1.setName("Ayush Srivastava");
        frog1.setAge(17);
        System.out.println(frog1.getName());
        System.out.println(frog1.getAge());
    }
}
