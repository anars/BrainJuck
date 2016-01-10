public class AllCharacters {
	private byte[] _array = new byte[0];
	private int _pointer = 0;
	
	public AllCharacters() {
		outputCurrentCell();
		increaseCellValue(1);
		while((getCellValue() & 0xFF) != 0) {
			outputCurrentCell();
			increaseCellValue(1);
		}
	}

	public static void main(String[] args) {
		new AllCharacters();
	}

	private void increaseCellValue(int amount) {
		expandArray();
		_array[_pointer] += amount;
	}

	private void expandArray() {
		if (_pointer >= _array.length) {
			byte[] newArray = new byte[_pointer + 1];
			System.arraycopy(_array, 0, newArray, 0, _array.length);
			_array = newArray;
		}
	}

	private byte getCellValue() {
		if (_pointer >= _array.length)
			return (0);
		return (_array[_pointer]);
	}

	private void outputCurrentCell() {
		System.out.print((char)(getCellValue() & 0xFF));
	}

}