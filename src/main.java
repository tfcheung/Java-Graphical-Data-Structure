import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dataStructure test = new dataStructure();
		Nodes node_data = new Nodes();
		node_data.setNodes();
		Tree tree = new Tree(node_data.arrested);
		List<String> result = test.getTriplets(tree);
		for( String str : result) {
			System.out.println(str);
		}
	}

}
