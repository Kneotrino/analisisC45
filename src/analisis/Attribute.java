package analisis;


import java.util.List;


// Holds data for an attribute
public class Attribute {
	
	public final String name;
	public final List<String> values;
	public final boolean numeric;
	public final boolean label;
	
	public Attribute(List<String> values, String name) {
                System.out.println("values = " + values);
                this.name = name;
		this.values = values;
//                System.out.print("name = " + name);
//                System.out.println("\t values = " + values);
//		if (values.size() == 1 && values.get(0).equals("real"))
//			numeric = true;
//		else 
//			numeric = false;
                numeric = values.size() == 1 && values.get(0).equals("numeric");
		if (name.equals("hiperglikemia"))
			label = true;
		else 
			label = false;
	}
	
	// Developer tool: print instance
	public void print() {
		if (numeric)
			System.out.println(name + ": numeric");
		else
			System.out.println(name + ": " + values);
	}

    @Override
    public String toString() {
        return name;
//        return "Attribute{" + "name=" + name + ", numeric=" + numeric + ", label=" + label + '}';
    }
        
	
}
