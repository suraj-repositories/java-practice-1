package Start_Advance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// This is also VERY LARGE topic . for more explanation view java documentation ( ! API) documents

public class Ad_17_RegX_package {

	public static void main(String[] args) {
		
		String regexStr = ".*[a-z][0-9].";
//		String regexStr = ".*[a-z][0-9][a-z].";
		
		Pattern pattern = Pattern.compile(regexStr);
		
		Matcher matcher = pattern.matcher("123435646adadaf242341234");
		boolean matchFound = matcher.find();
		
		if(matchFound) {
			System.out.println("Match Found");
		}
		else {
			System.out.println("Match not found");
		}
	}

}
