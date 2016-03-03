import java.util.*;

/**
* Class for represetning a general tree node which can have a particular distributor associated with it
*/
public class TreeNode{
    /**
    *Stores child nodes of the tree node
    */
    private HashMap<String,TreeNode> map;
    private String distributor=null;
    private String element;

    /**
    * Constructor takes the node name as argument
    */
    public TreeNode(String element)
    {
      this.element=element;
    }

    public void addChild(TreeNode child)
    {
      map.put(child.getElement(),child);
    }

    public String getElement()
    {
      return element;
    }

    public String getDistributor()
    {
      return distributor;
    }

    public TreeNode getChild(String child)
    {
      return map.get(child);
    }
}
