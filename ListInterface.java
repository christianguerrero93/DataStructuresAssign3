public interface ListInterface<I> {
   int size();

   boolean isEmpty();

   void add(I obj);

   boolean add(I obj, int index);

   boolean addSorted(I obj);

   I get(int index);

   I replace(I obj, int index);

   boolean remove(int index);

   void removeAll();
}