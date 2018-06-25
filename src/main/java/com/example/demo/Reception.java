package com.example.demo;

public class Reception {

//	private static final String HELLO_TEXT = "สวัสดี";
//	private static final String ONT_SPACE = " ";

	public String get(String name) {
		//return String.join(" ", HELLO_TEXT, name);
		
		//return HELLO_TEXT + name;
		
		//return HELLO_TEXT.concat(ONT_SPACE).concat(name);
		
		//StringBuilder builder = new StringBuilder();
		//builder.append(HELLO_TEXT).append(ONT_SPACE).append(name);
		//return builder.toString();
		
		return String.format("สวัสดี %s", name);
	}

}
