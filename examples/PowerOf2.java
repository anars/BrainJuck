public class PowerOf2 {
	private byte[] _array = new byte[0];
	private int _pointer = 0;
	
	public PowerOf2() {
		increaseCellValue(6);
		movePointerRight(1);
		increaseCellValue(1);
		movePointerLeft(1);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				increaseCellValue(2);
				movePointerLeft(1);
				decreaseCellValue(1);
			}
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(1);
				increaseCellValue(1);
				movePointerRight(1);
				decreaseCellValue(1);
			}
			movePointerLeft(2);
			decreaseCellValue(1);
		}
	}

	public static void main(String[] args) {
		new PowerOf2();
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

}
