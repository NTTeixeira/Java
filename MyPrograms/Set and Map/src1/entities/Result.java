package entities;

public class Result {
	
	private String name;
	private Double vote;
	
	public Result(String name, Double vote) {
		this.name = name;
		this.vote = vote;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getVote() {
		return vote;
	}

	public void setVote(Double vote) {
		this.vote = vote;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((vote == null) ? 0 : vote.hashCode());
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
		Result other = (Result) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (vote == null) {
			if (other.vote != null)
				return false;
		} else if (!vote.equals(other.vote))
			return false;
		return true;
	}
	
	

}
