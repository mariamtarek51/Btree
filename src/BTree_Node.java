import java.util.ArrayList;
import java.util.List;

public class BTree_Node implements IBTreeNode {
    private int T;
    List<Comparable> KEYS= new ArrayList<>(2*T-1);
    List<Object> VALUES=new ArrayList<>();
    List<IBTreeNode<Comparable, Object>> CHILDREN = new ArrayList<>(2*T);
    boolean leaf = true;

    @Override
    public int getNumOfKeys() {
        return 0;
    }

    @Override
    public void setNumOfKeys(int numOfKeys) {

    }

    public boolean isLeaf(){
        return this.leaf;
    }
    public void setLeaf(boolean isLeaf){
        this.leaf=true;
    }
    public List<Comparable> getkeys(){
        return this.KEYS;
    }

    @Override
    public void setKeys(List keys) {
        for(int i=0;i<keys.size();i++)
            this.KEYS.add((Comparable) keys.get(i));
    }

    public List<IBTreeNode<Comparable, Object>> getChildren(){
        return this.CHILDREN;
    }

    @Override
    public void setChildren(List children) {
        for(int i=0;i<children.size();i++)
            this.CHILDREN.add((IBTreeNode<Comparable, Object>) children.get(i));
    }


    public List<Object> getValues(){
        return this.VALUES;
    }

    @Override
    public void setValues(List values) {
        for(int i=0;i<values.size();i++)
            this.VALUES.add( values.get(i));

    }

}
