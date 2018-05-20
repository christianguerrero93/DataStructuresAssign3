import java.util.ArrayList;

public class ArrayBasedList<I extends Comparable<I>> implements ListInterface<I>{

   ArrayList<I> list = new ArrayList<>();
  
   @Override
   public int size() {
       return list.size();
   }

   @Override
   public boolean isEmpty() {
       return list.isEmpty();
   }

   @Override
   public void add(I obj) {
       list.add(obj);      
   }

   @Override
   public boolean add(I obj, int index) {
       if(index >= 0 && index <= list.size()) {
           list.add(index, obj);
           return true;
       }
       return false;
   }

   @Override
   public boolean addSorted(I obj) {
       int i=0;
       for(I a: list) {
           // object need to go to i index
           if(obj.compareTo(a) < 0) {
               break;
           }
       }

       add(obj, i);
      
       return true;
   }

   @Override
   public I get(int index) {
       if(index >= 0 && index < list.size()) {
           return list.get(index);
       }
       return null;
   }

   @Override
   public I replace(I obj, int index) {
       if(index >= 0 && index < list.size()) {
           return list.set(index, obj);
       }
       return null;
   }

   @Override
   public boolean remove(int index) {
       if(index >= 0 && index < list.size()) {
           list.remove(index);
           return true;
       }
       return false;
   }

   @Override
   public void removeAll() {
       list.clear();
   }

}


