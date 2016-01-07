public class EvenNumbers {
	private byte[] _array = new byte[0];
	private int _pointer = 0;
	
	public EvenNumbers() {
		increaseCellValue(8);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(1);
			increaseCellValue(6);
			movePointerRight(2);
			increaseCellValue(6);
			movePointerLeft(3);
			decreaseCellValue(1);
		}
		movePointerRight(5);
		increaseCellValue(5);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(2);
			movePointerLeft(4);
			increaseCellValue(2);
			movePointerRight(5);
			decreaseCellValue(1);
		}
		movePointerLeft(5);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(2);
			increaseCellValue(5);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(1);
				outputCurrentCell();
				movePointerRight(2);
				outputCurrentCell();
				increaseCellValue(2);
				movePointerRight(1);
				outputCurrentCell();
				movePointerLeft(2);
				decreaseCellValue(1);
			}
			movePointerRight(1);
			decreaseCellValue(10);
			movePointerLeft(2);
			increaseCellValue(1);
			movePointerLeft(1);
			decreaseCellValue(1);
		}
	}

	public static void main(String[] args) {
		new EvenNumbers();
	}

	private void movePointerRight(int steps) {
		_pointer += steps;
	}

	private void movePointerLeft(int steps) {
		_pointer -= steps;
		if (_pointer < 0)
			_pointer = 0;
	}

	private void increaseCellValue(int amount) {
		expandArray();
		_array[_pointer] += amount;
	}

	private void decreaseCellValue(int amount) {
		expandArray();
		_array[_pointer] -= amount;
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
