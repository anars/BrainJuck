public class InputCounter {
	private byte[] _array = new byte[0];
	private int _pointer = 0;
	
	public InputCounter() {
		movePointerRight(3);
		increaseCellValue(1);
		movePointerRight(5);
		increaseCellValue(1);
		movePointerRight(2);
		increaseCellValue(1);
		movePointerRight(2);
		increaseCellValue(1);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(2);
		}
		inputIntoCurrentCell();
		while((getCellValue() & 0xFF) != 0) {
			decreaseCellValue(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										while((getCellValue() & 0xFF) != 0) {
											movePointerLeft(1);
											increaseCellValue(1);
											movePointerRight(1);
											decreaseCellValue(1);
											while((getCellValue() & 0xFF) != 0) {
												movePointerRight(1);
												increaseCellValue(1);
												movePointerLeft(1);
												decreaseCellValue(1);
												while((getCellValue() & 0xFF) != 0) {
													movePointerRight(1);
													decreaseCellValue(1);
													movePointerLeft(1);
													decreaseCellValue(1);
													while((getCellValue() & 0xFF) != 0) {
														decreaseCellValue(1);
														while((getCellValue() & 0xFF) != 0) {
															decreaseCellValue(1);
															while((getCellValue() & 0xFF) != 0) {
																movePointerLeft(1);
																increaseCellValue(2);
																while((getCellValue() & 0xFF) != 0) {
																	movePointerLeft(1);
																	increaseCellValue(6);
																	movePointerRight(1);
																	decreaseCellValue(1);
																}
																movePointerLeft(1);
																while((getCellValue() & 0xFF) != 0) {
																	movePointerRight(2);
																	while((getCellValue() & 0xFF) != 0) {
																		decreaseCellValue(1);
																		movePointerLeft(1);
																	}
																	movePointerLeft(1);
																	while((getCellValue() & 0xFF) != 0) {
																		movePointerRight(1);
																	}
																	movePointerLeft(1);
																	decreaseCellValue(1);
																}
																movePointerRight(2);
																while((getCellValue() & 0xFF) != 0) {
																	movePointerLeft(1);
																	increaseCellValue(1);
																	movePointerRight(1);
																	decreaseCellValue(1);
																	while((getCellValue() & 0xFF) != 0) {
																		movePointerLeft(1);
																		decreaseCellValue(1);
																		movePointerRight(1);
																		while((getCellValue() & 0xFF) != 0) {
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
							}
						}
					}
				}
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(2);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(1);
				movePointerRight(1);
			}
			movePointerLeft(2);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(6);
				increaseCellValue(1);
				movePointerLeft(6);
				decreaseCellValue(1);
			}
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
			}
			movePointerRight(7);
			increaseCellValue(1);
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(1);
				increaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					increaseCellValue(9);
					movePointerLeft(1);
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						decreaseCellValue(1);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					increaseCellValue(2);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(7);
						movePointerRight(1);
						decreaseCellValue(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							decreaseCellValue(1);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						increaseCellValue(1);
						while((getCellValue() & 0xFF) != 0) {
							increaseCellValue(1);
							movePointerRight(6);
						}
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(5);
						increaseCellValue(2);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
					}
					increaseCellValue(1);
					movePointerLeft(1);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(6);
				}
				movePointerRight(4);
			}
			inputIntoCurrentCell();
		}
		increaseCellValue(1);
		movePointerLeft(1);
		increaseCellValue(2);
		movePointerRight(3);
		while((getCellValue() & 0xFF) != 0) {
			while((getCellValue() & 0xFF) != 0) {
				increaseCellValue(5);
				movePointerRight(6);
			}
			movePointerLeft(1);
			increaseCellValue(1);
			movePointerRight(1);
			increaseCellValue(1);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					increaseCellValue(8);
					movePointerRight(1);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				outputCurrentCell();
				movePointerLeft(5);
			}
			movePointerRight(8);
		}
		while((getCellValue() & 0xFF) != 0) {
			inputIntoCurrentCell();
			inputIntoCurrentCell();
			outputCurrentCell();
			decreaseCellValue(4);
			movePointerRight(1);
			outputCurrentCell();
			outputCurrentCell();
			outputCurrentCell();
		}
	}

	public static void main(String[] args) {
		new InputCounter();
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
