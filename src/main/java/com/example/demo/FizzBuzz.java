package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FizzBuzz {

	private static final String BUZZ_STR = "Buzz";
	private static final String FIZZ_STR = "Fizz";
	private String result;
    public static void main(String[] args) {
        int[] datas = {1, 2, 3, 4, 5, 6};
        
        for (int i : datas) {
            System.out.println(i);
        }
        
        int length = datas.length;
        for (int i = 0; i < length; i++) {
            System.out.println(i);  
        }
        
        for(int i = 0 ; i < 5 ; i++) {
            System.out.println(i);
        }
    }
 
    public String say2(int input) {
        if (input == 15) {
            return FIZZ_STR + BUZZ_STR;
        }
        
        for (int i = 0; i <= input; i+=3) {
            if (i == input) {
                return FIZZ_STR;
            }
        }

        for (int i = 0; i <= input; i+=5) {
            if (i == input) {
                return BUZZ_STR;
            }
        }
        
        return String.valueOf(input);
    }
    
	public String say(int input) {
		List<Condition> conditions = new ArrayList<>();
		conditions.add(new FizzBuzzCodition());
        conditions.add(new FizzCodition());
        conditions.add(new BuzzCodition());
        conditions.add(new KBTGCodition());
		conditions.add(new OtherCondition());
		
        for (Condition condition : conditions) {
            if (condition.check(input)) {
                return condition.say();
            }
        }
        
        throw new RuntimeException("Condition not match");
//		return conditions.parallelStream()
//		        .filter(c -> c.check(input))
//		        .map(c -> c.say())
//		        .collect(Collectors.toList()).get(0);

	}

    private boolean หารห้าลงตัว(int input) {
        return input % 5 == 0;
    }

    private boolean หารสามลงตัว(int input) {
        return input % 3 == 0;
    }
}

