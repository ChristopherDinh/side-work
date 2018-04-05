import java.util.ArrayList;
import java.util.List;

public class Name {

	public static List<String> next() {
		List<String> names = new ArrayList<>();
		String name = Console.getString("Who has next? ", true);
		while (names.size() > 0) {
		names.add(name);
		
	}
		return names;
}
}