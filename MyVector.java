/*
Will Fung (W 7pm) and Grace Mazzarella (W 1pm)
*/
import structure5.*;
import java.util.Comparator;

public class MyVector<E> extends Vector<E> {

  public MyVector(){
    super();
  }

  protected void swap(int i, int j){
    E temp = this.elementAt(i);
    this.set(i, this.elementAt(j));
    this.set(j, temp);
  }

  public void sort(Comparator<E> c){
    //pre: c is a valid comparator
    //post: sort this.myV in order determined by c

    //bubble-sort for now...
    for (int i = this.size(); i > 0; i--){
      boolean swapped = false;
      for (int j = 1; j <= i; j++){
        if (c.compare(this.elementAt(j-1), this.elementAt(j)) > 0){
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
