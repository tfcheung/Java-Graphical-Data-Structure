/**
 * 
 * Child is class 
 *
 */
public class Child {
	
	String relation;
	Node child;
	
	public Child(String relation, Node child) {
		super();
		this.relation = relation;
		this.child = child;
	}
	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getRelation() {
		return relation;
	}
	
	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	public Node getChild() {
		return child;
	}
	
	public void setChild(Node child) {
		this.child = child;
	}
	
}
