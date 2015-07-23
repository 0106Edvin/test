package ba.bitcamp.edvin.test;

public class HistoryArtefact extends MuseumPiece {

	/**
	 * 
	 * properties of class
	 */
	private String origin;
	private period period;

	/**
	 * enumeration for periods
	 * @author edvin.mulabdic
	 *
	 */
	public enum period {
		CLASSICAL, MIDDLE_AGE, MODERN_HISTORY
	};
	/**
	 * creating constructor
	 * @param id of artefact
	 * @param name of artefact
	 * @param description of artefact
	 * @param origin of artefact
	 * @param period 
	 */
	public HistoryArtefact(Integer id, String name, String description,
			String origin, period period) {
		super(id, name, description);

		this.origin = origin;
		this.period = period;

	}
	/**
	 * generating hashCode and equals methods
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
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
		HistoryArtefact other = (HistoryArtefact) obj;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		if (period != other.period)
			return false;
		return true;
	}
	/**
	 * generating to string method for printing
	 */
	public String toString() {
		String s = "Origin of artefact :" + origin + "\n ";
		s += "Period :" + period + "\n";
		return s;
	}

}
