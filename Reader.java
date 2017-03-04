/*
Will Fung (W 7pm) and Grace Mazzarella (W 1pm)
*/
import java.util.Scanner;
//import structure5.*;

public class Reader{

  public static void main (String[] args){

  Scanner in = new Scanner(System.in);
  while (in.hasNextLine()){
    String filename = in.nextLine();
    filename = filename + ", "+ in.nextLine();
    filename = filename + ", "+ in.nextLine();
    String divide = in.nextLine();

    System.out.println(filename);
  }
  }

}
