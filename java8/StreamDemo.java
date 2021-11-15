package java8;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(2,3,1,3,1,2,4,5,6,7,23);
		//list.stream().forEach(n->System.out.println(n));
		//list.stream().limit(3).forEach(n->System.out.println(n));
		//list.stream().distinct().forEach(n->System.out.println(n));
		//list.stream().map(n->n*10).forEach(n->System.out.println(n));
		//list.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		System.out.println("  using stream...");
		Stream s=Stream.of(3,4,5,6,7);
		//s.forEach(n->System.out.println(n));
		s.forEach(System.out::println);
		
		
		// terminal operation -> forEach  , collect
		
		List<Integer>  newlist=list.stream().limit(5).collect(Collectors.toList());
		newlist.stream().forEach(System.out::println);
		
		
		
	}

}
