class myEmployee1{
  private int id;
  private String name;
  public myEmployee1(){ // this is a constructor .Its name is same as class name and it is automatically invoked(called).
    id=45;
    name="your name here";
  }
  public myEmployee1(String myName , int myId){ // making another constructor is constructor overloading
    id=myId;
    name=myName;
  }
  
  public void setName(String n){
    name =n;
  }
  public String getName(){
    return name;
  }
  public int getId(){
    return id;

  }
  public void setId(int i){
    id=i;
  }
}
public class constructor {
  public static void main(String[] args) {
    myEmployee1 harry = new myEmployee1();
    //myEmployee1 harry = new myEmployee1("aman pratap" , 23);
    // harry.setName("papa bolte");
    // harry.setId(15);
    System.out.println(harry.getId());
    System.out.println(harry.getName());
    
  }
}
