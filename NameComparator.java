/*
Will Fung (W 7pm) and Grace Mazzarella (W 1pm)
*/
public class NameComparator implements Comparator<Student>{

  public interface Comparator<Student>{
    //Returns < 0 if a is smaller than b
    //Returns 0 if a equals b
    //Returns >0 if a is larger than b
    int NameComparator(Student a, Student b){
      return a.getName().compareTo(b.getName());
    }
  }
}
