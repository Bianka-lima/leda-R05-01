package problems;

/**
 * Calcula o floor e ceil de um numero em um array usando a estrategia de busca
 * binaria.
 * 
 * Restricoes: 
 * - Algoritmo in-place (nao pode usar memoria extra a nao ser variaveis locais) 
 * - O tempo de seu algoritmo deve ser O(log n).
 * 
 * @author Adalberto
 *
 */
public class FloorCeilBinarySearchImpl implements FloorCeil {

	@Override
	public Integer floor(Integer[] array, Integer x) {
		Integer possible = null;
		possible = binaryFloor(array, x, 0, (array.length) - 1, possible);
		return possible;
	}


	public static Integer floor2(Integer[] array, Integer x) {
		Integer possible = null;
		possible = binaryFloor(array, x, 0, (array.length) - 1, possible);
		return possible;
	}

	public static Integer binaryFloor(Integer[] array, Integer x, int leftIndex, int rightIndex, Integer possible) {
		if (leftIndex <= rightIndex) {
			int meio = (leftIndex + rightIndex) / 2;
			if (array[meio] == x) {
				possible = array[meio];
				rightIndex = leftIndex-1;
			} else if (array[meio] < x) {
				possible = binaryFloor(array, x, meio + 1, rightIndex, array[meio]);
			} else {
				possible = binaryFloor(array, x, leftIndex, meio -1, possible);
			}
		}
		return possible;
	}


	@Override
	public Integer ceil(Integer[] array, Integer x) {
		// TODO implement your code here
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	public static void main(String[] args) {
		Integer[] array = {1, 2, 3, 4, 5, 7, 8};
		System.out.println(floor2(array, 7));
	}
}
