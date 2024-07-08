import java.util.Random;
import java.util.Scanner;

public class rockpaper {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 0 for rock , 1 for paper , 2 for scissor");
    int userInput = sc.nextInt();

    Random random =  new Random( 3);
    int computerInput = random.nextInt(); 

    if(userInput== computerInput){
      System.out.println("draw");
    }
    else if (userInput ==0 && computerInput ==2 || userInput ==1 && computerInput ==0 || userInput ==2 && computerInput ==1) {
      System.out.println("user won");
    }
    
    else{
      System.out.println("computer won");
    }
    System.out.println("computer choice : " + computerInput);
  }
}


// import java.util.Random;
// import java.util.Scanner;

// public class Main{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter 0 for rock , 1 for paper , 2 for scissor");
//     int userInput = sc.nextInt();

//     Random random =  new Random();
//     int computerInput = random.nextInt();

//     if(userInput== computerInput){
//       System.out.println("draw");
//     }
//     else if (userInput ==0 && computerInput ==2 || userInput ==1 && computerInput ==0 || userInput ==2 && computerInput ==1) {
//       System.out.println("user won");
//     }
    
//     else{
//       System.out.println("computer won");
//     }
//   }
// }
