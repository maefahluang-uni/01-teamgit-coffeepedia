package util;

import java.util.StringTokenizer;

//This is an example (faulty) class to be used for A4 Task1 and Task2
public class Counter {
	public int _ctr;
	public int _multiplier;

	// method increments _ctr
	public void increment() {
		_ctr++; // faulty increment
	}

	// method decrements _ctr
	public void decrement() {
		_ctr--; // faulty decrement
	}

	// method resets _ctr
	public void reset() {
		_ctr = 0; // faulty reset, _ctr should rather be 0
	}

	// method multiplies _ctr by n
	public void multiplyBy(int multiplier) {
		_multiplier = multiplier; // no fault here
		_ctr = _ctr * _multiplier; // no fault here
	}

	// TODO: dev1- method for increment to closest even number
	public void incrementToEven() {
		//_ctr = -99;
		while(true){
			_ctr++;
			if (_ctr % 2 == 0){
				return;
			}
		}
	}

	// TODO: dev1- method for decrement to closest even number
	public void decrementToEven() {
		//_ctr = -99;
		while(true){
			_ctr--;
			if (_ctr % 2 == 0){
				return;
			}
		}
	}

	// TODO: dev2- method for increment to closest prime number
	public void incrementToPrime() {
		//_ctr = -99;
		_ctr = findNextPrime(_ctr);
	}

	// TODO: dev2- method for decrement to closest prime number
	public void decrementToPrime() {
		//_ctr = -99;
		_ctr = findPreviousPrime(_ctr);
	}

	// Helper method to find the next prime number
    private int findNextPrime(int _ctr) {
        while (true) {
            _ctr++;
            if (isPrime(_ctr)) {
                return _ctr;
            }
        }
    }

    // Helper method to find the previous prime number
    private int findPreviousPrime(int _ctr) {
        while (true) {
            _ctr--;
            if (isPrime(_ctr)) {
                return _ctr;
            }
        }
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int _ctr) {
        if (_ctr < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(_ctr); i++) {
            if (_ctr % i == 0) {
                return false;
            }
        }
        return true;
    }

	// TODO: dev3- count the frequency of word in sentence,
	// refactor source code from dev1 and dev2
	public void countFrequency(String word, String sentence) {
		_ctr = -99;
	}

}
