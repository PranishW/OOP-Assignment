package proj1;
class Cat
{
	String type;
	String color;
	String name;
	String fam_name;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFam_name() {
		return fam_name;
	}
	public void setFam_name(String fam_name) {
		this.fam_name = fam_name;
	}
		
};

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		cat1.setName("Pirate");
		cat1.setColor("Black");
		cat1.setType("Persian");
		cat2.setName("Coco");
		cat2.setColor("Orange");
		cat2.setType("Indian");
		System.out.println("Color of the cat "+cat1.getName()+" is "+cat1.getColor());
		System.out.println("Type of the cat "+cat1.getName()+" is "+cat1.getType());
		System.out.println("Color of the cat "+cat2.getName()+" is "+cat2.getColor());
		System.out.println("Type of the cat "+cat2.getName()+" is "+cat2.getType());
	}

}
