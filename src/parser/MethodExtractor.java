package parser;
import java.util.*;
import java.util.regex.*;
public class MethodExtractor
{
    public static List<String> extractMethods(List<String> lines)
    {
        List<String> methods=new ArrayList<>();
        String regex="(public|private|protected)\\s+\\w+\\s+(\\w+)\\s*\\(";
        Pattern pattern=Pattern.compile(regex);
        for (String line:lines)
        {
            Matcher matcher=pattern.matcher(line);
            if (matcher.find())
            {
                String methodName=matcher.group(2);
                methods.add(methodName);
            }
        }
        return methods;
    }
}