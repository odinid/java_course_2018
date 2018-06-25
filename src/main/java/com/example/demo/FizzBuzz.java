package com.example.demo;

public class FizzBuzz {

	private static final String BUZZ_STR = "Buzz";
	private static final String FIZZ_STR = "Fizz";

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
 
    public String say(int input) {
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
    
//	public String say(int input) {
//		result = "";

//		if (หารสามลงตัว(input)) {
//			result = result + FIZZ_STR;
//		}

//        if (หารห้าลงตัว(input)) {
//			result = result + BUZZ_STR;
//		}

//		if (result == "") {
//			result = String.valueOf(input);
//		}

//		return result;
//	}

//    private boolean หารห้าลงตัว(int input) {
//        return input % 5 == 0;
//    }
//
//    private boolean หารสามลงตัว(int input) {
//        return input % 3 == 0;
//    }

}
