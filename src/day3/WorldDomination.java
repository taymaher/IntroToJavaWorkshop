package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String	ans=JOptionPane.showInputDialog("DO YOU KNOW HOW TO WRITE CODE?");
		// 2. If they say "yes", tell them they will rule the world.
if (ans.equals("yes")) {
	JOptionPane.showMessageDialog(null, ans+"? you will rule the world");
}
else{		// 3. Otherwise, wish them good luck washing dishes.
	JOptionPane.showMessageDialog(null, ans+"? good luck washing dishes" );
	}
}
}
