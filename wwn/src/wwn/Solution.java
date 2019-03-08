package wwn;

import java.util.Iterator;

import com.google.common.base.Splitter;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value = "1011121310101042_50001442803428021";
		String[] result = getNewInitiatorAndPortFromPwwnKey(value);
		System.out.println(result[0]);
		System.out.println(result[1]);

	}

	private static String[] getNewInitiatorAndPortFromPwwnKey(String pWwnKey) {
		String[] result = null;
		String[] initiatorAndPort = pWwnKey.split("_");
		if ((initiatorAndPort.length < 2)
				|| (initiatorAndPort[0].length() != 16)
				|| (initiatorAndPort[1].length() != 16)) {

			System.out.println("can not get port and initiator from pWwnKey");

		} else {
			result = new String[2];
			result[0] = getWWNWithColons(initiatorAndPort[0]);
			result[1] = getWWNWithColons(initiatorAndPort[1]);

		}

		return result;

	}

	private static String[] getInitiatorAndPortFromPwwnKey(String pWwnKey) {

		String[] initiatorAndPort = pWwnKey.split("_");
		String initiator = initiatorAndPort[0];
		String port = initiatorAndPort[1];
		StringBuilder sbInitiator = new StringBuilder("");
		StringBuilder sbPort = new StringBuilder("");

		for (int i = 0; i < initiator.length() - 1; i = i + 2) {
			sbInitiator.append(initiator.substring(i, i + 2));
			sbInitiator.append(":");

			sbPort.append(port.substring(i, i + 2));
			sbPort.append(":");

		}
		sbInitiator.deleteCharAt(sbInitiator.length() - 1);
		sbPort.deleteCharAt(sbPort.length() - 1);
		initiatorAndPort[0] = sbInitiator.toString();
		initiatorAndPort[1] = sbPort.toString();
		return initiatorAndPort;
	}


	
	
	 public static String getWWNWithColons(String wwwWithNoColon) {
		StringBuilder builder = new StringBuilder();
		Iterable<String> s = Splitter.fixedLength(2).split(wwwWithNoColon);
		Iterator<String> t = s.iterator();
		while (t.hasNext()) {
			builder.append(t.next());
			if (t.hasNext()) {
				builder.append(":");
			}
		}
		return builder.toString().toUpperCase();
	}
}
