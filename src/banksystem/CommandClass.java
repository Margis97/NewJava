package banksystem;

import java.security.PublicKey;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommandClass {
	private    Bank bank;
	
	public void process(String command) {
		final String addBankRegex = "(addbank) ([a-zA-Z\\s]+;[a-zA-Z\\s]+;[a-zA-Z\\s]+;[0-9]+)";
		final String printDirector = "director";
		Matcher matcher = isRegexMatch(addBankRegex, command);
        if (matcher.matches()) {
        	String data = matcher.group(2);
        	String [] dataArray = data.split(";");
        	String []firstAndLastName = dataArray[2].split(" ");
        	
        	int salary = Integer.parseInt(dataArray[3]);
            Director director = new Director(firstAndLastName[0],  firstAndLastName[1], salary);
            bank = new Bank(dataArray[0], dataArray[1], director);
        	System.out.println();
        	System.out.println("OK");
        }
        matcher = isRegexMatch(printDirector, command);
        if (matcher.matches()) {
        	bank.whoIsDirector();
        }
	}
	
        
        
    public Matcher isRegexMatch(String regex, String command){
    	final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(command);
        return matcher;
    }
	public static void main(String[] args) {
		// addbank Alfa Bank;Moscow;Ivan Perov;506048
		CommandClass commandClass = new CommandClass();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Please type a command");
			String command  = scanner.nextLine();
			commandClass.process(command);
		}
	}

}
