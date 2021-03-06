package clueGame;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class myDialog extends JDialog {

	private JComboBox people;
	private JComboBox rooms;
	private JComboBox weapons;
	private peopleBox pBox;
	private weaponBox wBox;
	private roomBox rBox;
	
	public myDialog() {
		setTitle("");
		setSize(500, 550);
		setLayout(new GridLayout(3, 2));
		
		pBox = new peopleBox();
		pBox.setBorder(new TitledBorder(new EtchedBorder(), "People"));
		
		people = createPeopleCombo();
		people.setBorder(new TitledBorder(new EtchedBorder(), "Person Guess"));
	
		rBox = new roomBox();
		rBox.setBorder(new TitledBorder(new EtchedBorder(), "Rooms"));
		
		rooms = createRoomsCombo();
		rooms.setBorder(new TitledBorder(new EtchedBorder(), "Room Guess"));
		
		wBox = new weaponBox();
		wBox.setBorder(new TitledBorder(new EtchedBorder(), "Weapons"));
		
		weapons = createWeaponsCombo();
		weapons.setBorder(new TitledBorder(new EtchedBorder(), "Weapon Guess"));
		add(pBox);
		add(people);
		add(rBox);
		add(rooms);
		add(wBox);
		add(weapons);
	}

	private JComboBox createPeopleCombo() {
		JComboBox pCombo = new JComboBox();
		pCombo.addItem("Professor Plum");
		pCombo.addItem("Mrs. White");
		pCombo.addItem("Mr. Green");
		pCombo.addItem("Mrs. Peacock");
		pCombo.addItem("Miss Scarlett");
		pCombo.addItem("Colonel Mustard");
		return pCombo;
	}

	private JComboBox createRoomsCombo() {
		JComboBox rCombo = new JComboBox();
		rCombo.addItem("Study");
		rCombo.addItem("Kitchen");
		rCombo.addItem("Hall");
		rCombo.addItem("Conservatory");
		rCombo.addItem("Lounge");
		rCombo.addItem("Ballroom");
		rCombo.addItem("Dining Room");
		rCombo.addItem("Library");
		rCombo.addItem("Billiard Room");
		return rCombo;
	}

	private JComboBox createWeaponsCombo() {
		JComboBox wCombo = new JComboBox();
		wCombo.addItem("Candlestick");
		wCombo.addItem("Wrench");
		wCombo.addItem("Rope");
		wCombo.addItem("Revolver");
		wCombo.addItem("Knife");
		wCombo.addItem("Lead Pipe");
		return wCombo;
	}

}
