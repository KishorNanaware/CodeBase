import java.util.Arrays;
import java.util.List;

public class SortStream {

	public static void main(String[] args) {
		List<String> nameStringList= Arrays.asList("kishor","Aman","Aarti","Mahesh","Kiran");
		nameStringList.stream().sorted().filter(p->p.startsWith("A")).map(String::toUpperCase).forEach(i->System.out.println(" "+i));
	}
}
