package map.pro.identityhashmap;

public class Bike {

	String name;
	int model;
	
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(String name, int model) {
		super();
		this.name = name;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + ", model=" + model + "]";
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + model;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Bike other = (Bike) obj;
//		if (model != other.model)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}

	
	
	
	
	
	


}
