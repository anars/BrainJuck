public class Dvorak {
	private byte[] _array = new byte[0];
	private int _pointer = 0;
	
	public Dvorak() {
		increaseCellValue(1);
		movePointerRight(7);
		increaseCellValue(2);
		while((getCellValue() & 0xFF) != 0) {
			increaseCellValue(1);
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
			}
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(1);
				increaseCellValue(2);
				movePointerRight(1);
				decreaseCellValue(1);
			}
			movePointerLeft(1);
		}
		movePointerLeft(1);
		while((getCellValue() & 0xFF) != 0) {
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				increaseCellValue(1);
				movePointerRight(1);
				increaseCellValue(1);
				movePointerLeft(2);
				decreaseCellValue(1);
			}
			movePointerRight(2);
			decreaseCellValue(1);
		}
		movePointerRight(1);
		increaseCellValue(5);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(1);
			increaseCellValue(7);
			movePointerLeft(1);
			decreaseCellValue(1);
		}
		movePointerRight(1);
		while((getCellValue() & 0xFF) != 0) {
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(2);
				increaseCellValue(1);
				movePointerRight(2);
				decreaseCellValue(1);
			}
			movePointerLeft(2);
			decreaseCellValue(1);
		}
		increaseCellValue(6);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(1);
			increaseCellValue(10);
			movePointerLeft(1);
			decreaseCellValue(1);
		}
		movePointerRight(1);
		increaseCellValue(1);
		movePointerLeft(10);
		increaseCellValue(6);
		movePointerLeft(7);
		increaseCellValue(5);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(2);
			increaseCellValue(3);
			movePointerRight(1);
			increaseCellValue(1);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(2);
		movePointerLeft(1);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(7);
			increaseCellValue(5);
			movePointerRight(2);
			increaseCellValue(5);
			movePointerRight(1);
			increaseCellValue(1);
			movePointerRight(1);
			increaseCellValue(3);
			movePointerRight(2);
			increaseCellValue(5);
			movePointerRight(2);
			increaseCellValue(5);
			movePointerLeft(1);
			decreaseCellValue(1);
		}
		movePointerLeft(3);
		increaseCellValue(1);
		movePointerLeft(2);
		decreaseCellValue(3);
		movePointerRight(1);
		decreaseCellValue(2);
		while((getCellValue() & 0xFF) != 0) {
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(2);
				increaseCellValue(1);
				movePointerRight(2);
				decreaseCellValue(1);
			}
			movePointerLeft(2);
			decreaseCellValue(1);
		}
		movePointerRight(1);
		decreaseCellValue(3);
		movePointerLeft(4);
		decreaseCellValue(1);
		movePointerLeft(1);
		increaseCellValue(4);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(4);
			increaseCellValue(2);
			movePointerRight(1);
			decreaseCellValue(1);
			movePointerRight(1);
			increaseCellValue(7);
			movePointerRight(1);
			increaseCellValue(1);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(2);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(2);
			increaseCellValue(1);
			movePointerRight(1);
			increaseCellValue(1);
			movePointerRight(2);
			increaseCellValue(1);
			movePointerRight(2);
			increaseCellValue(1);
			movePointerRight(2);
			increaseCellValue(2);
			movePointerRight(2);
			increaseCellValue(1);
			movePointerLeft(7);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(1);
			increaseCellValue(1);
			movePointerLeft(1);
			decreaseCellValue(1);
		}
		movePointerLeft(2);
		decreaseCellValue(1);
		movePointerRight(1);
		while((getCellValue() & 0xFF) != 0) {
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(2);
				increaseCellValue(1);
				movePointerRight(2);
				decreaseCellValue(1);
			}
			movePointerLeft(2);
			decreaseCellValue(1);
		}
		movePointerLeft(4);
		increaseCellValue(12);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(2);
			increaseCellValue(1);
			movePointerRight(1);
			decreaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(2);
		while((getCellValue() & 0xFF) != 0) {
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(2);
				increaseCellValue(1);
				movePointerRight(2);
				decreaseCellValue(1);
			}
			movePointerLeft(2);
			decreaseCellValue(1);
		}
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(1);
			decreaseCellValue(9);
			movePointerLeft(1);
			decreaseCellValue(1);
		}
		movePointerLeft(17);
		increaseCellValue(1);
		movePointerLeft(1);
		increaseCellValue(4);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(2);
			increaseCellValue(4);
			movePointerRight(2);
			decreaseCellValue(1);
		}
		movePointerLeft(2);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(3);
			decreaseCellValue(3);
			movePointerRight(4);
			decreaseCellValue(1);
			movePointerRight(2);
			decreaseCellValue(2);
			movePointerRight(6);
			decreaseCellValue(3);
			movePointerLeft(9);
			decreaseCellValue(1);
		}
		movePointerLeft(3);
		decreaseCellValue(2);
		movePointerLeft(2);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(2);
			increaseCellValue(1);
			movePointerRight(1);
			increaseCellValue(11);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(1);
				decreaseCellValue(3);
				movePointerRight(4);
				decreaseCellValue(4);
				movePointerRight(2);
				decreaseCellValue(3);
				movePointerRight(2);
				decreaseCellValue(2);
				movePointerLeft(7);
				decreaseCellValue(1);
			}
			movePointerRight(5);
			increaseCellValue(1);
			movePointerRight(2);
			increaseCellValue(3);
			movePointerRight(3);
			increaseCellValue(7);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(1);
				decreaseCellValue(1);
				movePointerRight(2);
				decreaseCellValue(4);
				movePointerRight(2);
				decreaseCellValue(1);
				movePointerRight(2);
				decreaseCellValue(2);
				movePointerLeft(5);
				decreaseCellValue(1);
			}
			movePointerRight(1);
			increaseCellValue(1);
			movePointerRight(2);
			decreaseCellValue(4);
			movePointerRight(4);
			increaseCellValue(5);
			movePointerRight(2);
			decreaseCellValue(4);
			movePointerRight(2);
			decreaseCellValue(2);
			movePointerRight(1);
			increaseCellValue(6);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				decreaseCellValue(8);
				movePointerLeft(1);
				decreaseCellValue(1);
			}
			movePointerRight(1);
			increaseCellValue(1);
			movePointerRight(2);
			decreaseCellValue(4);
			movePointerRight(2);
			increaseCellValue(3);
			movePointerRight(2);
			decreaseCellValue(12);
			movePointerRight(4);
			increaseCellValue(2);
			movePointerRight(2);
			increaseCellValue(9);
			movePointerRight(2);
			decreaseCellValue(2);
			movePointerRight(2);
			decreaseCellValue(6);
			movePointerRight(2);
			decreaseCellValue(4);
			movePointerRight(2);
			increaseCellValue(2);
			movePointerRight(2);
			increaseCellValue(1);
			movePointerRight(1);
			increaseCellValue(7);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(1);
				increaseCellValue(2);
				movePointerRight(2);
				decreaseCellValue(1);
				movePointerLeft(1);
				decreaseCellValue(1);
			}
			movePointerRight(3);
			increaseCellValue(1);
			movePointerRight(3);
			increaseCellValue(7);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(1);
				increaseCellValue(1);
				movePointerRight(2);
				increaseCellValue(3);
				movePointerRight(6);
				increaseCellValue(4);
				movePointerLeft(7);
				decreaseCellValue(1);
			}
			movePointerRight(1);
			increaseCellValue(1);
			movePointerRight(8);
		}
		movePointerRight(1);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(1);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerRight(1);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(2);
		}
		movePointerLeft(1);
		inputIntoCurrentCell();
		while((getCellValue() & 0xFF) != 0) {
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(2);
					increaseCellValue(1);
					movePointerRight(2);
					decreaseCellValue(1);
				}
				movePointerLeft(2);
				decreaseCellValue(1);
			}
			movePointerRight(1);
			outputCurrentCell();
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(2);
			}
			movePointerLeft(1);
			inputIntoCurrentCell();
		}
		while((getCellValue() & 0xFF) != 0) {
			outputCurrentCell();
			outputCurrentCell();
			decreaseCellValue(4);
			movePointerRight(1);
			outputCurrentCell();
			outputCurrentCell();
			outputCurrentCell();
		}
	}

	public static void main(String[] args) {
		new Dvorak();
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

	private void inputIntoCurrentCell() {
		expandArray();
		try
		{
			_array[_pointer] = (byte)System.in.read();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}

	private void outputCurrentCell() {
		System.out.print((char)(getCellValue() & 0xFF));
	}

}
