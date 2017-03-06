/*
Will Fung (W 7pm) and Grace Mazzarella (W 1pm)
*/

/*
(a) Which student appears first in a printed phone book, if names are printed as they appear in the data file (ie,
first name first)?
(b) Which student has the smallest SU box? Largest?
(c) Which student has the most vowels in his or her full name? (You may ignore “Y”s when counting vowels.)
(d) Which address is shared by the most students, and what are their names? You may find it useful to build
a second vector storing Associations between each address and the number of students living there.
A special comparator can then be used to sort that vector by comparing the number of students at each
address. Once the most common address is known, you can consult the original vector of Students and
print those living at that address.
Some students have address UNKNOWN because they are abroad, on leave, etc. These students should be
ignored for this question. Any other student entries with strange formatting, should also be ignored. (But
please let your instructor know if you find any weird entries.)
(e) What are the ten most common area codes for student home phone numbers, in decreasing order? Some
phone numbers are −1 to indicate that the actual information is not available. You should simply disregard
students without a known home phone number.
*/
import java.util.Scanner;
public class Analyze{

  public static void main(String[] args){

    //ansers question (a)
    System.out.print("(a) Which student appears first in the phone book?: ");
    Scanner in = new Scanner(System.in);
    String filename = in.nextLine();
    if (filename.equals("")){
      filename = in.nextLine();
    }else{
      System.out.println(filename);
    }
    //ansers question (b)
    System.out.print("(b) Which student has the smallest SU Box number?: ");


  }
}
