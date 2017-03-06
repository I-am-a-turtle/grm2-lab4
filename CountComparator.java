/*
Will Fung (W 7pm) and Grace Mazzarella (W 1pm)
*/

import structure5.*;
public class CountComparator implements java.util.Comparator<Association<String,Integer>>{
  //compares personal phone numbers
  public int compare(Association<String,Integer> a, Association<String,Integer> b){
    //Returns < 0 if a is smaller than b
    //Returns 0 if a equals b
    //Returns >0 if a is larger than b
    Integer aVal = a.getValue();
    Integer bVal = b.getValue();
    return aVal.compareTo(bVal);
  }
}
