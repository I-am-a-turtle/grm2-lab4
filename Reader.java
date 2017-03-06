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

    //Answering questions

    //a)
    NameComparator nc = new NameComparator();
    students.sort(nc);
    System.out.println("(a) Information for the student first in a phonebook sorted by first name:");
    System.out.println(students.elementAt(0).toString());

    //b)
    SUComparator sc = new SUComparator();
    students.sort(sc);
    System.out.println("(b.1) Information for the student with the smallest SU box number:");
    System.out.println(students.elementAt(0).toString());
    System.out.println("(b.2) Information for the student with the largest SU box number:");
    System.out.println(students.elementAt(students.size()-1).toString());

    //c)
    int winningCount = 0;
    Student winningStudent = new Student();
    for (int i = 0; i < students.size()-1; i++){
      int count = 0;
      Student curStu = students.elementAt(i);
      for (int j = 0; j < curStu.getName().length()-1; j++){
        if (curStu.getName().substring(j,j+1).matches("^[aeiou]+$")){
          count++;
        }

      }
      if (count > winningCount){
        winningCount = count;
        winningStudent = curStu;
      }
    }
    System.out.println("(c) Information for the student with the most vowels in their name:");
    System.out.println(winningStudent.toString());

    //d)
    MyVector<Association<String,Integer>> tracker = new MyVector<Association<String,Integer>>();
    for (int k = 0; k < students.size()-1; k++){
      String area = students.elementAt(k).getPersonal().toString();
      //System.out.println(area);

      if (Long.valueOf(area) < 0){
        //phone number does not exist, do nothing
      } else {
        String areacodes = area.substring(0,3);
        //takes just the area code portion
        if (tracker.isEmpty()){
          Association<String,Integer> fill = new Association<String,Integer>(areacodes,1);
          tracker.add(fill);
          //creates the first association of areacode and count
        } else {
          //checks to see if the an area code is already within the vector
          for (int l = 0; l <= tracker.size(); l++){
            if (l < tracker.size()){
              if (tracker.get(l).getKey().equals(areacodes)){
                //then adds one to the count
                tracker.get(l).setValue(tracker.get(l).getValue() + 1);
                break; //stops checking once updated
              }
            }
            else {
              //creates a new association if the vector does not contain an area code
              Association<String,Integer> newArea = new Association<String,Integer>(areacodes,1);
              tracker.add(newArea);
              break; //stops checking once updated
            }
          }
        }
      }
    }
    CountComparator cc = new CountComparator();
    tracker.sort(cc);
    //System.out.println(tracker.toString());
    System.out.println("(e) The most common area codes in descending order: ");
    for (int m = tracker.size()-1; m > tracker.size()-11; m--){
      System.out.print(tracker.elementAt(m).getKey().toString() + ", ");
    }
    System.out.println();
  }
}
