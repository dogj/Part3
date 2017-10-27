package java_code;
import java.util.ArrayList;

public class Calc  {

	
	public int calc(String test) {
	    ArrayList<String> arrayList = new ArrayList<String>();
		int b = 0;
	        int calc = 0;
	        String string1 = test;
	        String string2 = string1;
	        try {
	            for (int a = 0; a < string1.length(); a++) {
	                if (string1.substring(a, a + 1).contains("+") || string1.substring(a, a + 1).contains("-") || string1.substring(a, a + 1).contains("*") || string1.substring(a, a + 1).contains("/")) {
	                    arrayList.add(string2.substring(0, a - b));
	                    arrayList.add(string2.substring(a - b, a - b + 1));
	                    string2 = string2.substring(a - b + 1);
	                    b = a + 1;
	                }

	            }
	            arrayList.add(string2);
	            int c = arrayList.size();

	            while (c != 1) {
	                if (c > 3) {
	                    if (arrayList.get(3).contains("*") || arrayList.get(3).contains("/")) {
	                        if (arrayList.get(3).contains("*")) {
	                            calc = Integer.parseInt(arrayList.get(2)) * Integer.parseInt(arrayList.get(4));
	                        }
	                        if (arrayList.get(3).contains("/")) {
	                            calc = Integer.parseInt(arrayList.get(2)) / Integer.parseInt(arrayList.get(4));
	                        }
	                        arrayList.remove(2);
	                        arrayList.remove(2);
	                        arrayList.remove(2);
	                        arrayList.add(2, String.valueOf(calc));
	                        c = arrayList.size();
	                    } else {
	                        if (arrayList.get(1).contains("*")) {
	                            calc = Integer.parseInt(arrayList.get(0)) * Integer.parseInt(arrayList.get(2));
	                        }
	                        if (arrayList.get(1).contains("/")) {
	                            calc = Integer.parseInt(arrayList.get(0)) / Integer.parseInt(arrayList.get(2));
	                        }
	                        if (arrayList.get(1).contains("+")) {
	                            calc = Integer.parseInt(arrayList.get(0)) + Integer.parseInt(arrayList.get(2));
	                        }
	                        if (arrayList.get(1).contains("-")) {
	                            calc = Integer.parseInt(arrayList.get(0)) - Integer.parseInt(arrayList.get(2));
	                        }
	                        arrayList.remove(0);
	                        arrayList.remove(0);
	                        arrayList.add(1, String.valueOf(calc));
	                        arrayList.remove(0);
	                        c = arrayList.size();
	                    }
	                } else {
	                    if (arrayList.get(1).contains("*")) {
	                        calc = Integer.parseInt(arrayList.get(0)) * Integer.parseInt(arrayList.get(2));
	                        System.out.println(calc);
	                    }
	                    if (arrayList.get(1).contains("/")) {
	                        calc = Integer.parseInt(arrayList.get(0)) / Integer.parseInt(arrayList.get(2));
	                    }
	                    if (arrayList.get(1).contains("+")) {
	                        calc = Integer.parseInt(arrayList.get(0)) + Integer.parseInt(arrayList.get(2));
	                    }
	                    if (arrayList.get(1).contains("-")) {
	                        calc = Integer.parseInt(arrayList.get(0)) - Integer.parseInt(arrayList.get(2));
	                    }
	                    arrayList.remove(0);
	                    arrayList.remove(0);
	                    arrayList.add(1, String.valueOf(calc));
	                    arrayList.remove(0);
	                    c = arrayList.size();
	                }
	            }

	           arrayList.clear();

	        }catch (Exception e){
	            System.out.println("oops");
	        }
			return calc;
		

	}


}
