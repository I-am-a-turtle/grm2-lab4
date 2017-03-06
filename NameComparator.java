/*
Will Fung (W 7pm) and Grace Mazzarella (W 1pm)
*/

//import structure5.*;
public class NameComparator implements java.util.Comparator<E>{

//compares students names via alphabet
  public int compare(Student a, Student b){
    //Returns < 0 if a is smaller than b
    //Returns 0 if a equals b
    //Returns >0 if a is larger than b
    return a.getName().compareTo(b.getName());
  }

//compares student addresses
  public int compare(Student a, Student b){
    //Returns < 0 if a is smaller than b
    //Returns 0 if a equals b
    //Returns >0 if a is larger than b
    return a.getAddress().compareTo(b.getAddress());
  }

//compares campus numbers
  public int compare(Student a, Student b){
    //Returns < 0 if a is smaller than b
    //Returns 0 if a equals b
    //Returns >0 if a is larger than b
    return a.getCampus().compareTo(b.getCampus());
  }

//compares SU boxes
  public int compare(Student a, Student b){
    //Returns < 0 if a is smaller than b
    //Returns 0 if a equals b
    //Returns >0 if a is larger than b
    return a.getSU().compareTo(b.getSU());
  }

//compares personal phone numbers
  public int compare(Student a, Student b){
    //Returns < 0 if a is smaller than b
    //Returns 0 if a equals b
    //Returns >0 if a is larger than b
    return a.getPersonal().compareTo(b.getPersonal());
  }
}
