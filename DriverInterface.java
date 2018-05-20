public interface DriverInterface {
  
       public enum ListType {ArrayBasedList, LinkedList};
  
       public enum TestType {AddSortedOdd, AddSortedEven, AddAll, AddAllAtIndexZero, RemoveAllEven, RemoveAllOdd};

       public ListInterface<Integer> createList(ListType listType, TestType forTestType);
      
       public ListInterface<Integer> initializeList(ListInterface<Integer> list,  int firstNumber, int lastNumber, int increment);

       double memoryUsage();
       
       public RunTime runTestCase(ListType listType, TestType testType, int numberOfTimes); 
      
}


