/*
Will Fung (W 7pm) and Grace Mazzarella (W 1pm)
*/
import java.util.Scanner;
import structure5.*;

public class Reader{

  public static void main (String[] args){

    Scanner in = new Scanner(System.in);

    Vector<String> names = new Vector<String>();
    Vector<String> addresses = new Vector<String>();
    Vector<String> campus = new Vector<String>();
    Vector<String> suBox = new Vector<String>();
    Vector<String> personal = new Vector<String>();
    //code for spitting out all the data
    while (in.hasNextLine()){
      String filename = in.nextLine();
      //filename = filename + ", "+ in.nextLine();
      //filename = filename + ", "+ in.nextLine();
      String fileaddress = in.nextLine();
      String filenumbers = in.nextLine();
      String separated = filenumbers.replaceAll("[\\s]", "\n");
      String su1 = separated.replaceAll("[^\\n]+[\\n]", "");
      String su2 = separated.replaceAll("[\\s][^\\s]+","");
      String personalStr = separated.replaceAll("[^\\n]+[\\n]", "");
      String divide = in.nextLine();
      String alldata = filename + ", " + fileaddress + ", " + filenumbers;

      names.add(filename);
      addresses.add(fileaddress);

      /*campus.add(separated.nextLine());
      suBox.add(separated.nextLine());
      personal.add(separated.nextLine());*/
    }
    //code for parsing the data in good categories
    //System.out.println(names.toString());
  }
}
