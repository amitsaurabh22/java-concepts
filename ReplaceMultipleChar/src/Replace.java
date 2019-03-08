
public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "amit//kumar-5^%gaurav//#@@5439saurabh";
		System.out.println(path);
		path = path.replaceAll("/+", "/");
		path=path.replaceAll("[^/\\-\\dA-Za-z ]", "").replaceAll("\\s+", "_");
		System.out.println(path);
		
		
		// replace dot 
		
		/*String path = "amit..kumar.saurabh";
		System.out.println(path);
		path = path.replaceAll("\\.+", ".");
		System.out.println(path);
		*/
		
	}

}
