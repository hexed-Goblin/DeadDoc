package loader;
import java.io.*;
import java.util.*;
public class FileLoader
{
    public static List<String> readFile(String path)
    {
        List<String> lines=new ArrayList<>();
        try (BufferedReader br=new BufferedReader(new FileReader(path)))
        {
            String line;
            while((line=br.readLine())!=null)
            {
                lines.add(line);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return lines;
    }
}