import javax.management.RuntimeErrorException;
public class BTree  <K extends Comparable<K>, V> implements IBTree<K, V> {


    @Override
    public int getMinimumDegree() {
        return 0;
    }

    @Override
    public IBTreeNode<K, V> getRoot() {

        return null;
    }

    @Override
    public void insert(K key, V value) {

    }

    @Override
    public V search(K key) {
        IBTreeNode root=getRoot();
        if (root==null){
            return  null; //Btree is empty
        }
        if(key==null){
            throw new RuntimeErrorException(null);
        }
        return (V)searchHelper(root,key);
    }
    public V searchHelper(IBTreeNode<K, V> Bnode, K key) {
        int i=0;
        while (i<Bnode.getNumOfKeys() && Bnode.getkeys().get(i).compareTo( key ) < 0  ) i++;
        for (i = 0; i < Bnode.getNumOfKeys(); i++) {
            if (key.compareTo(Bnode.getkeys().get(i))<0) {
                break;
            }
            if (key.equals(Bnode.getkeys().get(i))) {
                return Bnode.getValues().get(i);
            }
        }
        if (Bnode.isLeaf()) {
            return null;
        } else {

            return searchHelper ( Bnode.getChildren().get(i) , key);
        }

    }

    @Override
    public boolean delete(K key) {
        return false;
    }
}
