/*
Will Fung (W 7pm) and Grace Mazzarella (W 1pm)
*/
//import structure5.*;
import java.util.Comparator;
import java.util.Vector;

public class MyVector<E> extends Vector {

  public MyVector(){
    super();
  }

  protected static void swap(int i, int j){
    E temp = Vector.elementAt(i);
    Vector.set(i, Vector.elementAt(j));
    Vector.set(j, temp);
  }

  public static void sort(Comparator<E> c){
    //pre: c is a valid comparator
    //post: sort this.myV in order determined by c

    //bubble-sort for now...
    for (int i = Vector.size(); i > 0; i--){
      boolean swapped = false;
      for (int j = 1; j <= i; j++){
        if (c.compare(Vector.elementAt(j-1), Vector.elementAt(j)) > 0){
          swap(j, j-1);
          swapped = true;
        }
      }
      if (!swapped){
        break;
      }
    }
  }

  public static void main(String args){
    MyVector test = new MyVector();
    Student a = new Student();
    a.addName("Brady Dill");
    a.addAddress("Exo Dimension");
    a.addCampus("-1");
    a.addSU("9999");
    a.addPersonal("0123456789");
    Student b = new Student();
    b.addName("Adam Falk");
    b.addAddress("Williams College");
    a.addCampus("-1");
    a.addSU("0000");
    a.addPersonal("9876543210");
    test.add(a);
    test.add(b);

    System.out.println(test.toString());
  }

}
