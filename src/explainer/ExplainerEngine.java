package explainer;
import java.util.*;
public class ExplainerEngine
{
    public static void explain(List<String> methods)
    {
        System.out.println("\n*** Code Explanation: ***\n");
        for (String method:methods)
        {
            System.out.println("<> Method: " + method);
            if (method.toLowerCase().contains("sum"))
            {
                System.out.println("   → This method calculates a sum.");
            }
            else if (method.toLowerCase().contains("print"))
            {
                System.out.println("   → This method prints output.");
            }
            else if (method.toLowerCase().contains("get"))
            {
                System.out.println("   → This method retrieves data.");
            }
            else
            {
                System.out.println("   → This method performs an operation related to " + method);
            }
            System.out.println();
        }
    }
}