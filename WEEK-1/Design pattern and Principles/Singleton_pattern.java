import java.util.*;
public class Singleton_pattern {
    public static void main(String[] args) {
        scheduler s1 = scheduler.getscheduler();
        scheduler s2 = scheduler.getscheduler();
        s1.log("First task added.");
        s2.log("Second task added.");
        if(s1==s2)
              System.out.println("There is only one Instances is created");
        else
            System.out.println("There is more than one instances is created");
    }
}
class scheduler{
 private static scheduler var;
    private scheduler()
    {
    }
    public static scheduler  getscheduler()
    {
        if(var==null)
         var = new scheduler();
             return var;
    }
    public  void  log( String msg)
    {
        System.out.println("[Log] :" + msg);
    }
}