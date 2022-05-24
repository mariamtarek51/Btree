import java.util.ArrayList;
import java.util.List;

public class BTree_Node <K extends Comparable<K>, V> implements IBTreeNode<K, V> {
    private int T;
    List<K> KEYS= new ArrayList<>(2*T-1);
    List<V> VALUES=new ArrayList<>();
    List<IBTreeNode<K, V>> CHILDREN = new ArrayList<>(2*T);
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
    public List<K> getkeys(){
        return this.KEYS;
    }

    @Override
    public void setKeys(List keys) {
        for(int i=0;i<keys.size();i++)
            this.KEYS.add((K) keys.get(i));
    }

    public List<IBTreeNode<K, V>> getChildren(){
        return this.CHILDREN;
    }

    @Override
    public void setChildren(List children) {
        for(int i=0;i<children.size();i++)
            this.CHILDREN.add((IBTreeNode<K, V>) children.get(i));
    }


    public List<V> getValues(){
        return this.VALUES;
    }

    @Override
    public void setValues(List values) {
        for(int i=0;i<values.size();i++)
            this.VALUES.add((V) values.get(i));

    }

}
