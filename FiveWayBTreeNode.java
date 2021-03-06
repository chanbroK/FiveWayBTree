import java.util.ArrayList;
import java.util.List;

public class FiveWayBTreeNode {

  final int m = 5;
  final int max_children = m;
  final int max_keys = m - 1;
  final int min_keys = (int) (Math.ceil(m / 2)) - 1; // 최소 #키 구하는 식

  private FiveWayBTreeNode parent;
  private List<Integer> keyList;
  private List<FiveWayBTreeNode> children;
  boolean isLeaf;

  public FiveWayBTreeNode() {
    keyList = new ArrayList<Integer>();
    children = new ArrayList<FiveWayBTreeNode>();
    isLeaf = true;
    parent = null;
  }

  public FiveWayBTreeNode(int val) {
    keyList = new ArrayList<Integer>();
    children = new ArrayList<FiveWayBTreeNode>();
    isLeaf = false;
    parent = null;
    keyList.add(val);
  }

  public FiveWayBTreeNode getParent() {
    return parent;
  }

  public List<FiveWayBTreeNode> getChildren() {
    return children;
  }

  public List<Integer> getKeyList() {
    return keyList;
  }

  public void setParent(FiveWayBTreeNode parent) {
    this.parent = parent;
  }

  public void setKeyList(List<Integer> keyList) {
    this.keyList = keyList;
  }

  public void setChildren(List<FiveWayBTreeNode> children) {
    this.children = children;
  }
}
