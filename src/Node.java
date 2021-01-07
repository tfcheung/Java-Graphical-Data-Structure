import java.util.ArrayList;

public class Node {
	private String data;
	private ArrayList<Child> children;
	
	Node(String str, ArrayList<Child> children){
		this.data = str;
		this.children = children;
	}
	
	Node(){
		children = new ArrayList<Child>();
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public ArrayList<Child> getChildren() {
		return children;
	}
	public void setChild(ArrayList<Child> children) {
		this.children = children;
	}
	
}
