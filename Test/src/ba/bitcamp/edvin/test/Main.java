package ba.bitcamp.edvin.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ba.bitcamp.edvin.test.HistoryArtefact.period;

public class Main {

	public static void main(String[] args) {

		/**
		 * creating employees
		 */
		Employee e1 = new Employee("Edvin", "Mulabdic", 26, Employee.MALE);
		Employee e2 = new Employee("Ajla", "El Tabari", 30, Employee.FEMALE);
		Employee e3 = new Employee("Mladen", "Teofilovic", 24, Employee.MALE);
		Employee e4 = new Employee("Hajrudin", "Sehic", 25, Employee.MALE);
		
		/**
		 * creating a list of employees
		 * adding employees to list
		 */
		List<Employee> e = new ArrayList<>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);

		/**
		 * creating history artefacts
		 */
		HistoryArtefact ha1 = new HistoryArtefact(100, "noz",
				"Koristio se za ubijanje zivotinja", "BIH", period.MIDDLE_AGE);
		HistoryArtefact ha2 = new HistoryArtefact(101, "puska",
				"Pravljena od kovanog zeljeza", "Europe", period.CLASSICAL);

		/**
		 * creating a list of history artefacts
		 * adding artefacts to list
		 */
		List<HistoryArtefact> ha = new ArrayList<>();
		ha.add(ha1);
		ha.add(ha2);

		/**
		 * creating a piece of art
		 */
		PieceOfArt pa1 = new PieceOfArt(200, "Slika", "Mrtva priroda",
				"Autor 1", PieceOfArt.period.MODERN);
		PieceOfArt pa2 = new PieceOfArt(201, "Slika", "Zalazak suca",
				"Autor 2", PieceOfArt.period.NEOCLASSIC);

		/**
		 * creating a list of pieces of art and adding pieces to list
		 */
		List<PieceOfArt> pa = new ArrayList<>();
		pa.add(pa1);
		pa.add(pa2);

		/**
		 * creating museum pieces
		 */
		MuseumPiece mp1 = new MuseumPiece(300, "Kapa", "Kapa iz narodne nosnje");
		MuseumPiece mp2 = new MuseumPiece(301, "Cipela",
				"Cipela iz narodne nosnje");
		MuseumPiece mp3 = new MuseumPiece(302, "Odjeca", "Narodna nosnja");

		/**
		 * creating a list of museum pieces
		 * adding pieces to list
		 */
		List<MuseumPiece> mp = new ArrayList<>();
		mp.add(mp1);
		mp.add(mp2);
		mp.add(mp3);

		/**
		 * sorting pieces in list by name
		 */
		mp.sort(new Comparator<MuseumPiece>() {
			@Override
			public int compare(MuseumPiece o1, MuseumPiece o2) {

				return o2.getName().compareTo(o1.getName());
			}
		});

		/**
		 * creating musem and printing it
		 */
		Museum m1 = new Museum(mp, pa, ha, e);
		System.out.println(m1);
	}

}
