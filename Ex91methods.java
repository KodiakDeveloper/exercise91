package bookExercises;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Ex91methods {

	public int[] array() {

		int swap;

		int[] array = new int[1000];

		for (int i = 0; i < array.length; i++) {

			int randomValue = (int) (Math.random() * 100);

			array[i] = randomValue;

		}

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] > array[j]) {

					swap = array[i];

					array[i] = array[j];

					array[j] = swap;
				}

			}
		}

		Map<Integer, Integer> countMap = new HashMap<>();

		for (int i = 0; i < array.length; i++) {

			countMap.put(array[i], countMap.getOrDefault(array[i], 0) + 1);
		}

		int maxCount = Integer.MIN_VALUE;

		int minCount = Integer.MAX_VALUE;

		int maxValue = -1;

		int minValue = -1;

		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {

			int value = entry.getKey();

			int count = entry.getValue();

			if (count > maxCount) {

				maxCount = count;

				maxValue = value;
			}

			if (count < minCount) {

				minCount = count;

				minValue = value;
			}
		}

		JOptionPane.showMessageDialog(null,
				"Largest value : " + array[999] + "\nSmallest value : " + array[0]
						+ "\nValue with the highest occurrence: " + maxValue + " ocurrences " + maxCount
						+ "\nValue with the lowest occurrence : " + minValue + " ocurrences " + minCount);

		return array;
	}
}
