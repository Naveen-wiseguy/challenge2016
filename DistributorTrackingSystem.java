import java.util.*;

public class DistributorTrackingSystem{
  static public void main(String[] args)
  {
    if(args.length!=1)
    {
      System.out.println("Argument required : <csv file of cities>");
    }
    /////////////Bulding the tree  of areas
    AreaTreeBuilder builder=new AreaTreeBuilder();
    TreeNode node=builder.buildTree(args[0]);
    ///////Gettting the licensed Distributors
    
    ///////Responding to queries
  }
}
