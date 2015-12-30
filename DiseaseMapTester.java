/****************************************************************************
  *  Name: Andrew Hunt
  * 
  *  Compilation: javac DiseaseMapTester.java
  *  Dependencies: Std Lib
  *  Execution: 
  *  DiseaseMapTester 5200 10 5 100
  *  
  *  Description: Tests the DiseaseMap class using input arguments of:
  *   - total number of students
  *   - number of those students that are diseased
  *   - rate of transmission (as percentage integer)
  *   - number of time cycles that you want to perform
  ****************************************************************************/
public class DiseaseMapTester {
    
    // Prints percentage of diseased students after T cycles of transmission
    public static void main(String[] args) {
      if (args.length == 0){
        System.out.println("Error : No Arguments \nArgs should be \"Students Infected Rate Cycles\"");
      }
      else{
        int students = Integer.parseInt(args[0]);
        int infected = Integer.parseInt(args[1]);
        int rate = Integer.parseInt(args[2]);
        int T = Integer.parseInt(args[3]);
        DiseaseMap map = new DiseaseMap(students, infected, rate);
        map.progress(T);
        System.out.println(map.getPercInfected());
      }
    }
}