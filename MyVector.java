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
    //bubbleSort based on in-class example

    for (int i = size()-1; i > 0; i--){
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

}
