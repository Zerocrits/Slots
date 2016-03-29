//Bill Joseph
//BrawlRunner
//BrawlRunner

import java.util.ArrayList;
import java.util.Scanner;

public class BrawlRunner
{
	public static void main(String[] args)
	{
		int choice = 0;
		int level = 5;
		int health = 10;
		int random = 0;

		Scanner sc = new Scanner(System.in);
		Witch witch = new Witch(health, level);
		Player player = new Player(health, level);
		while(choice != 5)
		{
			System.out.println("***Choose An Opponent***");
			System.out.println("1. Witch");
			System.out.println("2. Vampie");
			System.out.println("3. Goblin");
			System.out.println("4. Ghost");
			System.out.println("5. Run Away");
			System.out.print("Opponent ID: ");
			choice = sc.nextInt();

			if(choice == 1)
			{
				System.out.println(witch.getHealth());
				level = player.getLevel();
				health = player.getHealth();
				player.attacks(witch);
				System.out.println(witch.getHealth());

			}

		}

	}
}

/*



*/
