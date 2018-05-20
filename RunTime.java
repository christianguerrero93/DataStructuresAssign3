import java.util.Arrays;

public class RunTime implements RuntimeInterface {

   private static final int MAX = 10;
   private long[] runtimes;
   private int count;
  

   public RunTime() {
       this.runtimes = new long[MAX];
       this.count += 0;
   }

   
   @Override
   public void addRuntime(long runTime) {
       if (this.count == MAX) {
          
           for (int i = 0; i < (MAX - 1); i++) {
               this.runtimes[i] = this.runtimes[i + 1];
           }
          
           this.runtimes[MAX - 1] = runTime;
       } else {
          
           this.runtimes[count] = runTime;
         
           this.count += 1;
       }
   }
  
  
   @Override
   public double getAverageRunTime() {
       double sum = 0;
       for (int i = 0; i < this.count; i++) {
           sum += this.runtimes[i];
       }
      
       return (sum / this.count);
   }
  
   
   @Override
   public long getLastRunTime() {
       return this.runtimes[this.count - 1];
   }
  
  
   @Override
   public long[] getRunTimes() {
       return Arrays.copyOf(this.runtimes, this.count);
   }
  
 
   @Override
   public void resetRunTimes() {
       for (int i = 0; i < MAX; i++) {
           this.runtimes[i] = 0;
       }
   }
}