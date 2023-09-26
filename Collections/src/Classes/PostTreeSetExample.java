package Classes;

import java.util.TreeSet;

import enitities.Post;

public class PostTreeSetExample {

	public static void main(String[] args) {
		TreeSet<Post> set = new TreeSet<>();
		set.add(new Post(7, "sports", "play", true));
		set.add(new Post(2, "entertainment", "sing", true));
		set.add(new Post(6, "Education", "intermediate", true));
		set.add(new Post(4, "Crime", "Murder", false));
		set.add(new Post(9, "Aviation", "fly", false));

		set.forEach(x->System.out.println(x));
	}
}
