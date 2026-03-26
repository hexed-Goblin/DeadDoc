package analyzer;
import java.util.*;
public class DeadCodeAnalyzer {
    public static void analyze(List<String> lines, List<String> methods)
    {
        Set<String> calledMethods=new HashSet<>();
        for (String line:lines)
        {
            for (String method:methods)
            {
                if (line.contains(method + "(") && !line.contains(" " + method + "("))
                {
                    calledMethods.add(method);
                }
            }
        }
        System.out.println("\n* * * Dead Code Analysis: * * *\n");
        int deadCount=0;
        for (String method:methods)
        {
            if (!calledMethods.contains(method) && !method.equals("main"))
            {
                System.out.println(" Unused Method:  " + method);
                deadCount++;
            }
        }
        if (deadCount==0)
        {
            System.out.println(" No dead code found * * *");
        }
        int score=100-(deadCount*10);
        if (score<0)score=0;
        System.out.println("\n Code Health Score: " + score + "/100");
    }
}