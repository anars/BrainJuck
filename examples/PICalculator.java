public class PICalculator {
	private byte[] _array = new byte[0];
	private int _pointer = 0;
	
	public PICalculator() {
		while((getCellValue() & 0xFF) != 0) {
			outputCurrentCell();
			decreaseCellValue(1);
			decreaseCellValue(1);
			decreaseCellValue(1);
			outputCurrentCell();
			inputIntoCurrentCell();
			decreaseCellValue(1);
			outputCurrentCell();
			outputCurrentCell();
			decreaseCellValue(1);
			outputCurrentCell();
		}
		movePointerRight(1);
		increaseCellValue(15);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(1);
			movePointerRight(8);
			increaseCellValue(10);
			movePointerLeft(7);
			decreaseCellValue(1);
		}
		movePointerRight(1);
		increaseCellValue(5);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(9);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		increaseCellValue(1);
		movePointerRight(6);
		increaseCellValue(1);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(2);
			increaseCellValue(3);
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
				movePointerRight(1);
				increaseCellValue(1);
				movePointerRight(1);
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(1);
			}
			movePointerRight(1);
		}
		movePointerRight(1);
		while((getCellValue() & 0xFF) != 0) {
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerRight(4);
				increaseCellValue(1);
				movePointerLeft(4);
			}
			movePointerRight(3);
			increaseCellValue(3);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(4);
		}
		movePointerLeft(8);
		increaseCellValue(1);
		while((getCellValue() & 0xFF) != 0) {
			decreaseCellValue(1);
			movePointerRight(12);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(1);
				increaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(4);
					increaseCellValue(1);
					movePointerLeft(4);
				}
				movePointerRight(1);
				movePointerRight(4);
			}
			movePointerLeft(4);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(5);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(4);
					increaseCellValue(1);
					movePointerRight(4);
					decreaseCellValue(1);
				}
				movePointerLeft(5);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(2);
					increaseCellValue(10);
					movePointerRight(2);
					decreaseCellValue(1);
				}
				movePointerRight(3);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(3);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(2);
					movePointerLeft(2);
					increaseCellValue(1);
					movePointerRight(6);
					decreaseCellValue(1);
				}
				movePointerLeft(2);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
				decreaseCellValue(1);
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(2);
					increaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(3);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(1);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						movePointerRight(1);
						increaseCellValue(1);
						movePointerRight(2);
					}
					movePointerLeft(5);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(1);
				increaseCellValue(1);
				movePointerLeft(3);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(2);
					increaseCellValue(1);
					movePointerLeft(2);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
			}
			movePointerLeft(4);
			increaseCellValue(1);
			movePointerRight(7);
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(3);
				increaseCellValue(1);
				movePointerRight(3);
				decreaseCellValue(1);
			}
			movePointerLeft(2);
			increaseCellValue(10);
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerRight(2);
				increaseCellValue(1);
				movePointerLeft(1);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(3);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(1);
					movePointerRight(2);
				}
				movePointerLeft(5);
			}
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerRight(1);
			increaseCellValue(1);
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(2);
				increaseCellValue(1);
				movePointerLeft(1);
				increaseCellValue(1);
				movePointerRight(3);
				decreaseCellValue(1);
			}
			movePointerLeft(3);
			movePointerLeft(1);
			increaseCellValue(1);
			movePointerLeft(1);
			increaseCellValue(1);
			movePointerRight(2);
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
												decreaseCellValue(1);
												movePointerLeft(1);
												decreaseCellValue(1);
												movePointerRight(1);
												while((getCellValue() & 0xFF) != 0) {
													decreaseCellValue(1);
													movePointerLeft(1);
													increaseCellValue(1);
													movePointerLeft(1);
													decreaseCellValue(1);
													movePointerRight(2);
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
				increaseCellValue(5);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(3);
					increaseCellValue(8);
					movePointerLeft(1);
					increaseCellValue(8);
					movePointerRight(4);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerLeft(3);
				increaseCellValue(1);
				movePointerLeft(1);
				decreaseCellValue(1);
				movePointerRight(4);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					increaseCellValue(1);
					movePointerLeft(3);
					increaseCellValue(9);
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(3);
					decreaseCellValue(1);
				}
				movePointerLeft(5);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(2);
					increaseCellValue(1);
					movePointerLeft(2);
					decreaseCellValue(1);
				}
				increaseCellValue(1);
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(1);
					movePointerLeft(1);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(2);
					outputCurrentCell();
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						increaseCellValue(1);
						outputCurrentCell();
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
					}
					movePointerRight(2);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(2);
					outputCurrentCell();
					movePointerLeft(2);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(3);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(8);
						increaseCellValue(1);
						movePointerRight(8);
						decreaseCellValue(1);
					}
					movePointerLeft(2);
					decreaseCellValue(1);
				}
			}
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerLeft(3);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerLeft(8);
		}
		increaseCellValue(10);
		outputCurrentCell();
	}

	public static void main(String[] args) {
		new PICalculator();
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
