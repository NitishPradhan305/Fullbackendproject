package enitities;

public class Post implements Comparable<Post>{
	int id;
	String name;
	String category;
	boolean isAvailable;

	public Post(int id, String name, String category, boolean isAvailable) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.isAvailable = isAvailable;
	}
	
	

	@Override
	public String toString() {
		return "Post [id=" + id + ", name=" + name + ", category=" + category + ", isAvailable=" + isAvailable + "]";
	}



	@Override
	public int compareTo(Post p1) {
		return name.compareTo(p1.name);
	};

}
