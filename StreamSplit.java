
import java.util.stream.Stream;

public class StreamSplit {

	public static void main(String[] args) {
		
		String inputStr="$abc$d$x$Y";
		Stream<String> strStream= Stream.of(inputStr.split("\\$"));
		
		strStream.forEach(p->System.out.print(" "+p));

	}

}
