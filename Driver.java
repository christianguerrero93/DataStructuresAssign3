
public class Driver implements DriverInterface{

   public static void main(String[] args) {
       Driver d = new Driver();
              
       System.out.println("Running test = AddSortedOdd");
       
       displayHeader();
       
       RunTime r = d.runTestCase(ListType.ArrayBasedList, TestType.AddSortedOdd, 10);
      
       displayRuntime(ListType.ArrayBasedList, r, d.memoryUsage());

       
       r = d.runTestCase(ListType.LinkedList, TestType.AddSortedOdd, 10);
       
       displayRuntime(ListType.LinkedList, r, d.memoryUsage());
       System.out.println();

       // ================================================================================================
       System.out.println("\nRunning test = AddSortedEven");
     
       displayHeader();
      
       r = d.runTestCase(ListType.ArrayBasedList, TestType.AddSortedEven, 10);
      
       displayRuntime(ListType.ArrayBasedList, r, d.memoryUsage());

       
       r = d.runTestCase(ListType.LinkedList, TestType.AddSortedEven, 10);
      
       displayRuntime(ListType.LinkedList, r, d.memoryUsage());
       System.out.println();

       // ================================================================================================
       System.out.println("\nRunning test = AddAll");
       
       displayHeader();
       
       r = d.runTestCase(ListType.ArrayBasedList, TestType.AddAll, 10);
    
       displayRuntime(ListType.ArrayBasedList, r, d.memoryUsage());

       
       r = d.runTestCase(ListType.LinkedList, TestType.AddAll, 10);
       
       displayRuntime(ListType.LinkedList, r, d.memoryUsage());
       System.out.println();

       // ================================================================================================
       System.out.println("\nRunning test = AddAllAtIndexZero");
       
       displayHeader();
       
       r = d.runTestCase(ListType.ArrayBasedList, TestType.AddAllAtIndexZero, 10);
       
       displayRuntime(ListType.ArrayBasedList, r, d.memoryUsage());

       
       r = d.runTestCase(ListType.LinkedList, TestType.AddAllAtIndexZero, 10);
      
       displayRuntime(ListType.LinkedList, r, d.memoryUsage());
       System.out.println();

       // ================================================================================================
       System.out.println("\nRunning test = RemoveAllOdd");
    
       displayHeader();
       
       r = d.runTestCase(ListType.ArrayBasedList, TestType.RemoveAllOdd, 10);
      
       displayRuntime(ListType.ArrayBasedList, r, d.memoryUsage());

       
       r = d.runTestCase(ListType.LinkedList, TestType.RemoveAllOdd, 10);
    
       displayRuntime(ListType.LinkedList, r, d.memoryUsage());
       System.out.println();

       // ================================================================================================
       System.out.println("\nRunning test = RemoveAllEven");
       
       displayHeader();
      
       r = d.runTestCase(ListType.ArrayBasedList, TestType.RemoveAllEven, 10);
       
       displayRuntime(ListType.ArrayBasedList, r, d.memoryUsage());

       
       r = d.runTestCase(ListType.LinkedList, TestType.RemoveAllEven, 10);
       
       displayRuntime(ListType.LinkedList,  r, d.memoryUsage());
   }
  
   private static void displayHeader() {
       System.out.format("%14s %10s %10s %10s %10s %10s %10s %10s %10s %10s %10s %14s %12s", "", "Run 1 ", "Run 2 ", "Run 3 ",
               "Run 4 ", "Run 5 ", "Run 6 ", "Run 7 ", "Run 8 ", "Run 9", "Run 10", "Average", "Memory Usage");
       System.out.format("\n%14s %10s %10s %10s %10s %10s %10s %10s %10s %10s %10s %14s %12s", "", "Seconds", "Seconds",
               "Seconds", "Seconds", "Seconds", "Seconds", "Seconds", "Seconds", "Seconds", "Seconds", "Seconds",
               "Mega Bytes");
       System.out.format("\n%14s %10s %10s %10s %10s %10s %10s %10s %10s %10s %10s %12s %12s", "", "----------", "----------",
               "----------", "----------", "----------", "----------", "----------", "----------", "----------", "----------", "--------------",
               "-------------");
   }

  
   private static void displayRuntime(ListType listType, RunTime runTime, double memoryUsage) {
       System.out.format("\n%-14s ", listType.toString());

       
       long[] runTimes = runTime.getRunTimes();
       for (int i = 0; i < runTimes.length; i++)
           System.out.format("%10d ", runTimes[i]);

      
       System.out.format("%14.2f ", runTime.getAverageRunTime());

      
       System.out.format("%12.2f ", memoryUsage);
   }

   
   @Override
   public ListInterface<Integer> createList(ListType listType,
           TestType fortestType) {
       ListInterface<Integer> list = null;
       if(listType.equals(ListType.ArrayBasedList)) {
           list = new ArrayBasedList<>();
       } else if(listType.equals(ListType.LinkedList)) {
           list = new LinkedList<>();
       }
      
       if(fortestType.equals(TestType.AddSortedOdd)) {
           list = initializeList(list, 1, 9999, 2);
       } else if(fortestType.equals(TestType.AddSortedEven)) {
           list = initializeList(list, 2, 10000, 2);
       } else if(fortestType.equals(TestType.AddAll)) {
           list = initializeList(list, 1, 10000, 1);
       } else if(fortestType.equals(TestType.AddAllAtIndexZero)) {
    	   for (int i = 0; i < 10000; i++)
               list.add((i + 1), 0);
       } else if(fortestType.equals(TestType.RemoveAllEven)) {
           list = initializeList(list, 1, 10000, 1);
           int index = 0;
           for (int i = 0; i < 10000; i++) {
               if ((list.get(index) % 2) == 0)
                   list.remove(index);
               else
                   index += 1;
           }
       } else if(fortestType.equals(TestType.RemoveAllOdd)) {
           list = initializeList(list, 1, 10000, 1);
           for (int i = 9999; i >= 0; i--) {
               if (((i + 1) % 2) != 0)
                   list.remove(i);
           }
       }
      
       return list;
   }


   @Override
   public double memoryUsage() {
       Runtime systemRunTime = Runtime.getRuntime();
       return systemRunTime.totalMemory() - systemRunTime.freeMemory();
   }

   public RunTime runTestCase(ListType listType, TestType testType,
           int numberOfTimes) {

       RunTime runTime = new RunTime();

       for (int i = 0; i < numberOfTimes; i++) {
           long startTime = System.nanoTime(); 
           ListInterface<Integer> list = createList(listType, testType);
           long endTime = System.nanoTime(); 

           runTime.addRuntime(endTime - startTime);
       }

       return runTime;
   }

@Override
public ListInterface<Integer> initializeList(ListInterface<Integer> list, int firstNumber, int lastNumber,
		int increment) {
	
	 if (list != null) {
         for (int i = firstNumber; i <= lastNumber; i += increment)
             list.add(i);
     }

     return list;
}
}


