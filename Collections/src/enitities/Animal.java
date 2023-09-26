package enitities;

public class Animal {
 int id;
 String name;
 int a;
 
public Animal() {
	super();
}

public Animal(int id, String name, int a) {
	super();
	this.id = id;
	this.name = name;
	this.a = a;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

@Override
public String toString() {
	return "Animal [id=" + id + ", name=" + name + ", a=" + a + "]";
}
 
}
