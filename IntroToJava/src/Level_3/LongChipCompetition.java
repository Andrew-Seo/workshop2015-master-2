package Level_3;

	import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

	public class LongChipCompetition {

		/**
		 * The Beatles are eating lunch and playing a game to see who has the longest chip. (In England, french fries are called "chips".)
		 **/
		private static Stack<Character> stock = new Stack<Character>();
		private static ArrayList<Beatle> theBeatles = new ArrayList<Beatle>();
		public static void main(String[] args)
		{
			
			initializeBeatles();
			for (int i = 0; i < theBeatles.size(); i++)
			{
				Beatle a = theBeatles.get(i);
				ArrayList<Chip> ch = a.getChips();
				for (Chip c : ch)
				{
					if (c.getLength() >= 0)
					{
						c.getLength();
					}
				}
			}
			
			
		}
		private static void initializeBeatles() {
			Beatle george = new Beatle("George");
			Beatle john = new Beatle("John");
			Beatle paul = new Beatle("Paul");
			Beatle ringo = new Beatle("Ringo");

			theBeatles.add(george);
			theBeatles.add(john);
			theBeatles.add(paul);
			theBeatles.add(ringo);
		}
	}

	class Beatle {
		private String name;
		private ArrayList<Chip> chips = new ArrayList<Chip>();
		
		public Beatle(String name) {
			this.name = name;
			initializePlateOfChips();
			getChips();
		}

		private void initializePlateOfChips() {
			int numberOfChips = new Random().nextInt(100);
			for (int i = 0; i < numberOfChips; i++) {
				chips.add(new Chip(new Random().nextDouble() * 10));
				if (this.name.contains("in")) chips.add(new Chip(10));
			}
		}

		public ArrayList<Chip> getChips() {
			return this.chips;
		}

		public String getName() {
			return this.name;
		}

	}

	class Chip {
		private double length;

		public double getLength() {
			return length;
		}
		
		Chip(double d) {
			this.length = d;
		}
	}




