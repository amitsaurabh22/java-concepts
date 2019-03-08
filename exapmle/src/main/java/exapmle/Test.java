package exapmle;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {

	static Logger log = LoggerFactory.getLogger(Test.class);

	public static void main(String[] args) {
//no need to call toSting in the logger.

		List<String> t = new ArrayList<>();
		t.add("10");
		t.add("20");

		log.error("Hello.... {}  anjali {}", t, "amit");
				t=null;
				log.info("Hello.... {}", t);
				
			//	System.out.println("Hello.... "+t.toString());

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i m toString";
	}
}
