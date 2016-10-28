package WarmUps;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Number_4
{
public static void main(String[] args)
{
	Set <String> s = new TreeSet<String>();
	s.add("John");
	s.add("Mary");
	s.add("Trevor");
	s.add("Michael");
	s.add("Franklin");
	s.add("Josh");
	s.add("Andrew");
	s.add("William");
	s.add("Stephen");
	
	//ArrayList <String> m = Arrays.sort(s);
	s.stream().forEach(System.out::println);
}
}
