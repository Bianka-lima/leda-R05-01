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
		
	}

	public Integer binaryFloor(Integer[] array, Integer x, int leftIndex, int rightIndex) {
		int meio = ((rightIndex - leftIndex) / 2) + leftIndex;
		int dif = x;
		if (array[meio] == x) {
			dif = x - array[meio];
			return x;
		} else if (array[meio] < x) {
			binaryFloor(array, x, meio+1, rightIndex);
		} else {
			binaryFloor(array, x, leftIndex, meio - 1);
		}
		return null;
	}

	@Override
	public Integer ceil(Integer[] array, Integer x) {
		// TODO implement your code here
		throw new UnsupportedOperationException("Not implemented yet!");
	}

}
