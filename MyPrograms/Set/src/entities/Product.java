package entities;

public class Product {
	
	private Integer numberID;

	public Product(Integer numberID) {
		this.numberID = numberID;
	}

	public Integer getNumberID() {
		return numberID;
	}

	public void setNumberID(Integer numberID) {
		this.numberID = numberID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numberID == null) ? 0 : numberID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (numberID == null) {
			if (other.numberID != null)
				return false;
		} else if (!numberID.equals(other.numberID))
			return false;
		return true;
	}
	
	

}
