public class Week6Functions {
	int average(int[] inputArray) {
		// return the integer average of the values in inputArray
		// empty array should return an average of zero
		if (inputArray == null || inputArray.length == 0) {
			return 0; // Return 0 for empty or null array
		}

		int sum = 0;
        for (int j : inputArray) {
            sum += j; // Add each element to sum
        }

		return sum / inputArray.length; // Return the integer average
	}

	float range(float[] inputArray) {
		// return the difference between the largest and smallest values in
		// inputArray. Empty array returns zero. All input values lie between
		// -1000.0f and 1000.0f
		if (inputArray == null || inputArray.length == 0) {
			return 0.0f; // Return 0 for empty or null array
		}

		float min = inputArray[0];
		float max = inputArray[0];

		// Iterate through the array to find the min and max values
		for (int i = 1; i < inputArray.length; i++) {

			if (inputArray[i] < min) {
				min = inputArray[i]; // Update min if a smaller value is found
			}
			if (inputArray[i] > max) {
				max = inputArray[i]; // Update max if a larger value is found
			}
		}

		return max - min; // Return the difference between max and min
	}

	int collatz(int i) {
		// if I am even, return i/2, otherwise return 3*i + 1
		if (i % 2 == 0) {
			return i / 2; // If I am even, return i/2
		} else {
			return 3 * i + 1; // If i is odd, return 3*i + 1
		}
	}

	int compoundInterest(int capital, int ratePC, int years) {
		// return the new capital if compound interest at ratePC % per year is
		// accumulated by an integer amount (capital) over an integer number of years (years).
		// return value is rounded to *nearest* integer

		// Apply the compound interest formula
		double amount = capital * Math.pow(1 + (ratePC / 100.0), years);

		// Return the result rounded to the nearest integer
		return (int) Math.round(amount);
	}
}
