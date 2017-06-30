import java.util.*;
public class MagpieRunner
{
	public static void main(String[] args)
	{
    Scanner io = new Scanner (System.in);
		Magpie maggieChatBot = new Magpie();
		
		System.out.println (maggieChatBot.getGreeting());
		String statement = io.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggieChatBot.getResponse(statement));
			statement = io.nextLine();
		}
	}

}
