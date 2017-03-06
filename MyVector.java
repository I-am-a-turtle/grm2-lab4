/*
Will Fung (W 7pm) and Grace Mazzarella (W 1pm)
*/
import structure5.*;
import java.util.Comparator;

public class MyVector<E> extends Vector<E>{

  public MyVector(){
    super();

  }

  protected void swap(int i, int j){
    E temp = elementAt(i) ;
    set(i, elementAt(j));
    set(j, temp);
  }

  public void sort(Comparator<E> c){
    //pre: c is a valid comparator
    //post: sort this.myV in order determined by c

    //bubble-sort for now...
    for (int i = size(); i > 0; i--){
      boolean swapped = false;
      for (int j = 1; j <= i; j++){
        if (c.compare(elementAt(j-1), elementAt(j)) > 0){
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
    MyVector<Student> test = new MyVector<Student>();
    Student a = new Student();
    a.addName("Brady Dill");
    a.addAddress("Exo Dimension");
    a.addSU("9999");
    a.addPersonal("0123456789");
    Student b = new Student();
    b.addName("Adam Falk");
    b.addAddress("Williams College");
    a.addSU("0000");
    a.addPersonal("9876543210");
    test.add(a);
    test.add(b);

    System.out.println(test.toString());
  }

}
