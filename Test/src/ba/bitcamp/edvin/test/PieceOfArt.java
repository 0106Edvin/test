package ba.bitcamp.edvin.test;

public class PieceOfArt extends MuseumPiece {
	
	/**
	 * creating properties for class
	 */
	private String authorName;
	private period period;
	/**
	 * creating enumeration for periods
	 * @author edvin.mulabdic
	 *
	 */
	public enum period {
		RENAISSANCE, NEOCLASSIC, MODERN, CONTEMPORARY_ART, ROMANTICISM
	};
	
	/**
	 * creating constructor
	 * @param id of piece of art
	 * @param name of piece of art
	 * @param description of piece of art
	 * @param authorName of piece of art
	 * @param period
	 */
	public PieceOfArt(Integer id, String name, String description,
			String authorName, period period) {
		super(id, name, description);
		this.authorName = authorName;
		this.period = period;
	}

	/**
	 * generating hash code and equals methods 
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((authorName == null) ? 0 : authorName.hashCode());
		result = prime * result + ((period == null) ? 0 : period.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PieceOfArt other = (PieceOfArt) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (period != other.period)
			return false;
		return true;
	}
	/**
	 * generating to string method for printing
	 */
	public String toString() {
		String s = "Author :" + authorName + "\n ";
		s += "Period : " + period + "\n";
		return s;
	}

}
