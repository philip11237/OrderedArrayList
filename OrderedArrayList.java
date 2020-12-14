import java.lang.IllegalArgumentException;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int startingCapacity){

    super(startingCapacity);
  }

  public boolean add(T e){
    int i=0;
    if (e==null){
      throw new IllegalArgumentException();
    }
    while ((i<this.size())&&(this.get(i).compareTo(e) < 0)){
      i++;
    }
    super.add(i,e);
    return true;
  }
  public void add(int index, T element){
    add(element);

  }
  public T set(int index, T element){
    if (element==null){
      throw new IllegalArgumentException();
    }
    T x=this.remove(index);
    add(element);
    return x;
  }
}
