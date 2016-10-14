package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals("")){
		return 0;
	}
	else if(text.contains(",") || text.contains("\n")){
		return sum(splitNumbers(text));
	}
	else
		return 1;
	}

	private static String[] splitNumbers(String numbers){
		String s = numbers;
		s = Replace(s);
		return s.split(",");
	}

	private static int sum(String[] numbers){
		int total = 0;
		for(String number : numbers){
			total += Integer.parseInt(number);
		}
		return total;
	}

	private static String Replace(String numbers){
		
		return numbers.replace('\n',',');
	}
}