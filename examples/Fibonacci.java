public class Fibonacci {
	private byte[] _array = new byte[0];
	private int _pointer = 0;
	
	public Fibonacci() {
		movePointerRight(1);
		increaseCellValue(10);
		movePointerRight(1);
		increaseCellValue(1);
		movePointerRight(1);
		increaseCellValue(1);
		while((getCellValue() & 0xFF) != 0) {
			while((getCellValue() & 0xFF) != 0) {
				increaseCellValue(5);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					increaseCellValue(8);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				outputCurrentCell();
				movePointerLeft(1);
				increaseCellValue(6);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					decreaseCellValue(8);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				increaseCellValue(1);
				movePointerLeft(3);
			}
			movePointerRight(1);
			outputCurrentCell();
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					increaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(2);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(2);
					increaseCellValue(1);
					movePointerRight(1);
					increaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					increaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(1);
						decreaseCellValue(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								increaseCellValue(1);
								movePointerLeft(1);
								decreaseCellValue(1);
								while((getCellValue() & 0xFF) != 0) {
									movePointerRight(1);
									increaseCellValue(1);
									movePointerLeft(1);
									decreaseCellValue(1);
									while((getCellValue() & 0xFF) != 0) {
										movePointerRight(1);
										increaseCellValue(1);
										movePointerLeft(1);
										decreaseCellValue(1);
										while((getCellValue() & 0xFF) != 0) {
											movePointerRight(1);
											increaseCellValue(1);
											movePointerLeft(1);
											decreaseCellValue(1);
											while((getCellValue() & 0xFF) != 0) {
												movePointerRight(1);
												increaseCellValue(1);
												movePointerLeft(1);
												decreaseCellValue(1);
												while((getCellValue() & 0xFF) != 0) {
													movePointerRight(1);
													increaseCellValue(1);
													movePointerLeft(1);
													decreaseCellValue(1);
													while((getCellValue() & 0xFF) != 0) {
														movePointerRight(1);
														while((getCellValue() & 0xFF) != 0) {
															decreaseCellValue(1);
														}
														movePointerRight(1);
														increaseCellValue(1);
														movePointerRight(1);
														increaseCellValue(1);
														movePointerLeft(3);
														decreaseCellValue(1);
														while((getCellValue() & 0xFF) != 0) {
															movePointerRight(1);
															increaseCellValue(1);
															movePointerLeft(1);
															decreaseCellValue(1);
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				increaseCellValue(1);
				movePointerRight(3);
			}
			movePointerLeft(3);
		}
		outputCurrentCell();
		outputCurrentCell();
		outputCurrentCell();
	}

	public static void main(String[] args) {
		new Fibonacci();
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
