import java.util.ArrayList;
import java.util.regex.Matcher;


public class StringUtils {
	public static String[] splitWithReg(String input,String regExp){
		int index = 0;
        ArrayList<String> matchList = new ArrayList<String>();
        Matcher m =java.util.regex.Pattern.compile(regExp).matcher(input);
        while(m.find()) {
        	String match = input.substring(index, m.start());
        	if(!match.equals("")){
        		matchList.add(match);
        	}
            index = m.end();
            matchList.add(input.substring(m.start(),m.end()));
        }
        if (index == 0){
        	return new String[] {input.toString()};
        }
        matchList.add(input.subSequence(index, input.length()).toString());

        int resultSize = matchList.size();
        while (resultSize > 0 && matchList.get(resultSize-1).equals("")){
        	resultSize--;
        }
        String[] result = new String[resultSize];
        return matchList.subList(0, resultSize).toArray(result);
	}
	
	public static void main(String[] args) {
		String testStr ="左边&C中间&R右边";
		String[] parts = testStr.split("&[L,C,R]");
		for (String str: parts) {
			System.out.println(str);
		}
		String[] parts2 = StringUtils.splitWithReg(testStr, "&[L,C,R]");
		for (String str: parts2) {
			System.out.println(str);
		}
	}
}
