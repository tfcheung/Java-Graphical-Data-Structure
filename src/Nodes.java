/**
 * Nodes is a set of data to run the data structure
 * The data set is matched the given picture 
 */
import java.util.ArrayList;

public class Nodes {
	Node arrested = new Node();
	Node Smith = new Node();
	Node Officer = new Node();
	Node John = new Node();
	Node Jim = new Node();
	Node Jones = new Node();
	Node as = new Node();
	Node part = new Node();
	Node of = new Node();
	Node a = new Node();
	Node money = new Node();
	Node laundering = new Node();
	Node investigation = new Node();
	Node FullStop = new Node();
	
	public void setNodes() {
		arrested.setData("arrested");
		Smith.setData("Smith");
		Officer.setData("Officer");
		John.setData("John");
		Jim.setData("Jim");
		Jones.setData("Jones");
		as.setData("as");
		part.setData("part");
		of.setData("of");
		a.setData("a");
		money.setData("money");
		laundering.setData("laundering");
		investigation.setData("investigation");
		FullStop.setData(".");
		
		ArrayList<Child> arrestedChildren = new ArrayList<Child>();
		arrestedChildren.add(new Child("nsubj", Smith));
		arrestedChildren.add(new Child("punct", FullStop));
		arrestedChildren.add(new Child("obl", part));
		arrestedChildren.add(new Child("obj", Jones));
		arrested.setChild(arrestedChildren);
		
		ArrayList<Child> smithChildren = new ArrayList<Child>();
		smithChildren.add(new Child("compund", John));
		smithChildren.add(new Child("compund", Officer));
		Smith.setChild(smithChildren);
		
		ArrayList<Child> jonesChildren = new ArrayList<Child>();
		jonesChildren.add(new Child("compund", Jim));
		Jones.setChild(jonesChildren);
		
		ArrayList<Child> partChildren = new ArrayList<Child>();
		partChildren.add(new Child("case", as));
		partChildren.add(new Child("nmod", investigation));
		part.setChild(partChildren);
		
		ArrayList<Child> investigationChildren = new ArrayList<Child>();
		investigationChildren.add(new Child("case", of));
		investigationChildren.add(new Child("det", a));
		investigationChildren.add(new Child("amod", laundering));
		investigation.setChild(investigationChildren);
		
		ArrayList<Child> launderingChildren = new ArrayList<Child>();
		launderingChildren.add(new Child("dep", money));
		laundering.setChild(launderingChildren);
	}
	
	public ArrayList<Node> getNodes(){
		setNodes();
		ArrayList<Node> nodes = new ArrayList<Node>();
		nodes.add(arrested);
		nodes.add(Smith);
		nodes.add(Officer);
		nodes.add(John);
		nodes.add(Jim);
		nodes.add(Jones);
		nodes.add(as);
		nodes.add(part);
		nodes.add(of);
		nodes.add(a);
		nodes.add(money);
		nodes.add(laundering);
		nodes.add(investigation);
		nodes.add(FullStop);
		return nodes;
	}
	
}
