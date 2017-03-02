/*
Will Fung (W 7pm) and Grace Mazzarella (W 1pm)
*/

public class NameComparator implements java.util.Comparator<Student>{

  public int compare(Student a, Student b){
    //Returns < 0 if a is smaller than b
    //Returns 0 if a equals b
    //Returns >0 if a is larger than b
    return a.getName().compareTo(b.getName());
  }
}
