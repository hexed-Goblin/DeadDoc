import loader.FileLoader;
import parser.MethodExtractor;
import explainer.ExplainerEngine;
import analyzer.DeadCodeAnalyzer;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("⚡ DeadDoc - Code Analyzer");
        System.out.println("----------------------------");
        if (args.length<2)
        {
            System.out.println("Usage:");
            System.out.println("java Main explain <file>");
            return;
        }
        String command=args[0];
        String filePath=args[1];
        List<String> lines=FileLoader.readFile(filePath);
        List<String> methods=MethodExtractor.extractMethods(lines);
        if(command.equals("explain"))
        {
            ExplainerEngine.explain(methods);
        }
        else if(command.equals("analyze"))
        {
            DeadCodeAnalyzer.analyze(lines, methods);
        }
        else
        {
            System.out.println("Invalid command");
        }
    }
}