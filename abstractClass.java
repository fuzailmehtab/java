/*
 * abstract in english means existing in thought or an idea wihout concrete existence.
 * abstract method is declared as - abstract void moveTo(int x, int y) 
   if a class includes abstract method then th class itself must be declared abstract.
   an abstract class is a class that is declared as abstract it may or may not include abstract methods.Abstract class can not be instantiated means we can not create objects but they can be subclassed.

 */
abstract class Base{
  public Base(){
    System.out.println(" i am a constructor of base");
  }
  public void sayHello(){
    System.out.println("hello hello");
  }
 abstract public void greet();
 abstract public void greet2();
}
class child extends Base{
  @Override
 public void greet(){
  System.out.println("good morning...");
 }

  @Override
  public void greet2() {
 System.out.println("yelo   yelo");
  }

}
abstract class child22 extends Base{

  @Override
  public void greet() {
  System.out.println("2nd child hii");
  }

  @Override
  public void greet2() {
  System.out.println("hello 2nd child");
  }
  
}

 public class abstractClass {
  public static void main(String[] args) {
    child cc = new child();
   //cannot instantiate because it is abstract class- Base bb = new Base();
  }
 }
