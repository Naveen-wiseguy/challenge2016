import java.util.*;
import java.io.*;

/**
* Takes a CSV file as input and constructs a tree structure of the cities, provinces and countries
*/
public class AreaTreeBuilder{
  private TreeNode root;

  public AreaTreeBuilder()
  {
    root=new TreeNode("root");
  }

  /**
  * Build a tree from the csv file
  */
  public TreeNode buildTree(String fileName)
  {
    try{
      BufferedReader reader=new BufferedReader(new FileReader(fileName));
      String line=reader.readLine(); //skipping first line
      line=reader.readLine();
      do{

        String[] parts=line.split(",");
        if(parts.length!=6)
          System.out.println("Improper record : "+line);
        TreeNode country=root.getChild(parts[5].toLower()); //checking of country already exists
        if(country==null) //creating the node corresponding to the country if it does not
        {
          country=new TreeNode(parts[5].toLower());
          root.addChild(country);
        }
        TreeNode province=country.getChild(parts[4].toLower()); //checking of the province exists
        if(province==null) //creating the node corresponding to the province if it does not
        {
          province=new TreeNode(parts[4].toLower(0));
          country.addChild(province);
        }
        TreeNode city=province.getChild(parts[3].toLower()); //checking if the city exists
        if(city==null)
        {
          city=new TreeNode(parts[3]);
          province.addChild(city);
          System.out.println("added city "+parts[3].toLower(0));
        }
        else{
          System.out.println("City already exists "+parts[3].toLower());
        }
        line=reader.readLine();
      }
      while(line!=null);
    }
    catch(IOException ex)
    {
      ex.printStackTrace();
    }
    return root;
  }


}
