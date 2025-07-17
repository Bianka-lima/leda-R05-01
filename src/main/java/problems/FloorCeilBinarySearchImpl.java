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

	public Integer binaryFloor(Integer[] array, Integer x, int leftIndex, int rightIndex, int diferença) {
		if ((array != null) && (array.length > 0) && (leftIndex < rightIndex)) {
			int meio = ((rightIndex - leftIndex) / 2) + leftIndex;
			while (diferença >= 0) {
				if (diferença == 0) {
					return x;
				} else if (((x - array[meio]) < diferença) && diferença >= 0) {
					diferença = x - array[meio];
				}
			}
			
		}
		return null;
	}

	@Override
	public Integer ceil(Integer[] array, Integer x) {
		// TODO implement your code here
		throw new UnsupportedOperationException("Not implemented yet!");
	}



	
	public Integer menorIgual(Integer[] array, Integer x) {
		
		return null;
	}

	public Integer menorIgualLogic(Integer[] array, Integer x, int leftIndex, int rightIndex, int dif) {
		int floor = array[leftIndex];
		dif = x;
		if ((array != null) && (array.length > 0) && (leftIndex < rightIndex)) {
			int meio = ((((rightIndex - leftIndex) / 2) + leftIndex));
			if (array[meio] == x) {
				return x;
			} else if (array[meio] < x && (((x - array[meio]) < dif) && (x - array[meio]) > 0)) {
				dif = x - array[meio];
				menorIgualLogic(array, x, leftIndex, meio - 1, dif);
			} else {
				menorIgualLogic(array, x, meio + 1, rightIndex, dif);
			}
			
		} else if((array != null) && (array.length > 0) && (leftIndex >= rightIndex)) {
			
			floor = x - dif;

			if (floor <= x)
				return floor;

		}
		
		
		return null;
	}



}
