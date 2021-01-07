import java.util.ArrayList;
import java.util.List;

public class dataStructure {
	List<String> list = new ArrayList<String>();
	public void createTriplets(Tree tree){
		Node currentNode = tree.getRoot();
		//If the current Node has child then process,
		if(currentNode.getChildren().size() > 0) {
			for (Child child : currentNode.getChildren()) { 
				String temp = currentNode.getData() + " " + child.getRelation() + " " + child.getChild().getData();
				list.add(temp);
				//If the child Node has child then put the sub-tree to do recursive method
				if(child.getChild().getChildren().size() > 0) {
					createTriplets(new Tree(child.child));
				}
			}
		}
	}
	
	public List<String> getTriplets(Tree tree){
		createTriplets(tree);
		return list;
	}
	
	
}
