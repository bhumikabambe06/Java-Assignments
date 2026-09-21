package customexception.com;

import java.util.Scanner;

class InvalidUsernameException extends Exception{
	public InvalidUsernameException(String message)
	{
		super(message);
	}
}
class InvalidPasswordException extends Exception{
	public InvalidPasswordException(String message)
	{
		super(message);
	}
}
class Login{
	String username="admin";
	String password="12345";
	void validateUsername(String enteredUsername) throws InvalidUsernameException
	{
		if(!username.equals(enteredUsername))
		{
			throw new InvalidUsernameException("Invalid Username");
		}
	}
	void validatePassword(String enteredPassword) throws InvalidPasswordException
	{
		
		if(!password.equals(enteredPassword))
		{
			throw new InvalidPasswordException("Invalid Password");
			
		}
	}
}
public class Main1 {
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	Login login=new Login();
    	System.out.println("Enter username");
    	String enteredUsername=sc.nextLine();
    	try {
			login.validateUsername(enteredUsername);
		} catch (InvalidUsernameException e) {
			System.out.println(e.getMessage());
		}
       int attempts=3;
       while(attempts>0)
       {
    	   System.out.println("Enter passwod");
    	   String enteredPassword=sc.nextLine();
    	 
    		   try {
				login.validatePassword(enteredPassword);
			} catch (InvalidPasswordException e) {
				attempts--;
				System.out.println(e.getMessage());
				System.out.println("Remaining attempst:"+attempts);
			}
       }
       System.out.println("Account Locked");
       sc.close();
    	
    }
}
