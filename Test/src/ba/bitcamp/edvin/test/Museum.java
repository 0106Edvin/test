package ba.bitcamp.edvin.test;

import java.util.List;

public class Museum {
	
	/**
	 * properties of museum
	 */
	private List<MuseumPiece> museumPiece;
	private List<PieceOfArt> pieceOfArt;
	private List<HistoryArtefact> historyArtefact;
	private List<Employee> employee;

	/**
	 * generating constructors
	 * @param museumPiece list of museum pieces
	 * @param pieceOfArt list of museum pieces of art
	 * @param historyArtefact list of museum history artefacts
	 * @param employee list of employees
	 */
	public Museum(List<MuseumPiece> museumPiece, List<PieceOfArt> pieceOfArt,
			List<HistoryArtefact> historyArtefact, List<Employee> employee) {
		super();
		this.museumPiece = museumPiece;
		this.pieceOfArt = pieceOfArt;
		this.historyArtefact = historyArtefact;
		this.employee = employee;
	}
	/**
	 * to string 
	 */

	@Override
	public String toString() {
		String s = "Museum piece " + "\n" + museumPiece + "\n";
		s += "Piece of Art " + "\n" + pieceOfArt + "\n";
		s += "History artefact " + "\n" + historyArtefact + "\n";
		s += "Employee " + "\n" + employee;
		return s;
	}

}
