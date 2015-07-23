package ba.bitcamp.edvin.test;

public class MuseumPiece implements Comparable<MuseumPiece>, Searchable {
	/**
	 * creating properties for class
	 */
	private Integer id;
	private String name;
	private String description;
	
	/**
	 * creating constructor
	 * @param id of museum piece
	 * @param name of museum piece
	 * @param description 
	 */
	public MuseumPiece(Integer id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	/**
	 * generating setters and getters
	 * @return
	 */
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * generating hashCode and equals
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		MuseumPiece other = (MuseumPiece) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	/** 
	 * checking if id, name,description contains word that user enters
	 */
	@Override
	public boolean fitsSearch(String s) {
		if (Integer.parseInt(s) == id) {
			return true;

		} else if (name.equals(s)) {
			return true;
		} else if (description.contains(s)) {
			return true;
		}
		return false;
	}
	/**
	 * to string method for printing
	 */
	public String toString() {
		String s = "ID: " + id + "\n";
		s += "Name: " + name + "\n";
		s += "Description: " + description + "\n";
		return s;
	}
	/**
	 * method form Comparable 
	 */
	@Override
	public int compareTo(MuseumPiece o) {

		return this.name.compareTo(o.name);
	}
	
}
