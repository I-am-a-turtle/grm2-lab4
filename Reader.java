/*
Will Fung (W 7pm) and Grace Mazzarella (W 1pm)
*/
import java.util.Scanner;
import structure5.*;

public class Reader{

  public static void main (String[] args){

    Scanner in = new Scanner(System.in);

    MyVector<Student> students = new MyVector<Student>();

    //These vectors hold the different subsets of information for easy filing into
    //student objects
    Vector<String> names = new Vector<String>();
    Vector<String> addresses = new Vector<String>();
    Vector<String> suBox = new Vector<String>();
    Vector<String> personal = new Vector<String>();

    //code for parsing the data
    while (in.hasNextLine()){
      String fileName = in.nextLine();
      String fileAddress = in.nextLine();
      String fileNumbers = in.nextLine();
      String separated = fileNumbers.replaceFirst("[\\s]", "\n");
      String suTemp = separated.replaceAll("[^\\n]+[\\n]", "");
      String suStr = suTemp.replaceAll("[\\s][^\\s]+","");
      String personalStr = separated.replaceAll("[^\\s]+[\\s]", "");
      String dividerTrash = in.nextLine(); //unnecessary stuff that must be thrown out

      names.add(fileName);
      addresses.add(fileAddress);
      suBox.add(suStr);
      personal.add(personalStr);
    }

    //creates Students
    for (int i = 0; i < names.size()-1; i++){
      Student bird = new Student();
      bird.addName(names.elementAt(i));
      bird.addAddress(addresses.elementAt(i));
      bird.addSU(suBox.elementAt(i));
      bird.addPersonal(personal.elementAt(i));
      students.add(bird);
    }

    NameComparator nc = new NameComparator();
    students.sort(nc);
    System.out.println("Information for the student first in a phonebook sorted by first name:");
    System.out.println(students.elementAt(0).toString());

    SUComparator sc = new SUComparator();
    students.sort(sc);
    System.out.println("Information for the student with the smallest SU box number:");
    System.out.println(students.elementAt(0).toString());
    System.out.println("Information for the student with the largest SU box number:");
    System.out.println(students.elementAt(students.size()-1).toString());

    

  }
}
