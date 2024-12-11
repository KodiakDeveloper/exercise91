package bookExercises;

import javax.swing.JOptionPane;

public class Ex91 {

	public static void main(String[] args) {

		Ex91methods ex = new Ex91methods();

		String userAnswer;

		int[] numbers = new int[1000];

		do {

			numbers = ex.array();

			for (int i = 0; i < numbers.length; i++) {

				System.out.print(numbers[i] + " | ");
			}

			userAnswer = JOptionPane.showInputDialog("Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!");

	}

}
