public class BrainfuckInterpreter {
	private byte[] _array = new byte[0];
	private int _pointer = 0;
	
	public BrainfuckInterpreter() {
		movePointerRight(3);
		increaseCellValue(1);
		while((getCellValue() & 0xFF) != 0) {
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			increaseCellValue(2);
			movePointerRight(1);
			increaseCellValue(1);
			movePointerRight(1);
			increaseCellValue(7);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(1);
				increaseCellValue(4);
				movePointerRight(2);
				increaseCellValue(2);
				movePointerLeft(1);
				decreaseCellValue(1);
			}
			increaseCellValue(2);
			movePointerRight(2);
			increaseCellValue(1);
			movePointerRight(1);
			increaseCellValue(1);
			movePointerRight(1);
			increaseCellValue(5);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				increaseCellValue(2);
				movePointerRight(1);
				increaseCellValue(6);
				movePointerLeft(2);
				decreaseCellValue(1);
			}
			increaseCellValue(1);
			movePointerRight(3);
			inputIntoCurrentCell();
			movePointerLeft(1);
			increaseCellValue(2);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(2);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
				}
				movePointerLeft(1);
				increaseCellValue(1);
				movePointerRight(2);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					increaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(1);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						movePointerRight(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						while((getCellValue() & 0xFF) != 0) {
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
							}
							movePointerLeft(1);
						}
						increaseCellValue(2);
						movePointerLeft(1);
						decreaseCellValue(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(9);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(1);
								decreaseCellValue(1);
								movePointerRight(1);
								decreaseCellValue(1);
							}
							movePointerRight(2);
						}
						movePointerRight(2);
					}
				}
				movePointerLeft(2);
			}
			movePointerLeft(1);
		}
		movePointerLeft(1);
		while((getCellValue() & 0xFF) != 0) {
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(1);
			}
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
				}
				movePointerRight(2);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(2);
				}
				increaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(2);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
				}
				movePointerLeft(1);
				increaseCellValue(1);
				movePointerRight(2);
				decreaseCellValue(1);
			}
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
			}
			increaseCellValue(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerRight(2);
			}
			movePointerLeft(4);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(2);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
				}
				increaseCellValue(1);
				movePointerLeft(2);
				while((getCellValue() & 0xFF) != 0) {
					increaseCellValue(1);
					movePointerRight(1);
					increaseCellValue(1);
					movePointerLeft(2);
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						decreaseCellValue(2);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(2);
						decreaseCellValue(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(2);
								increaseCellValue(1);
								movePointerLeft(2);
								decreaseCellValue(1);
							}
						}
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
				}
				increaseCellValue(2);
				movePointerRight(2);
				decreaseCellValue(2);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
				}
				movePointerRight(2);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(2);
				}
			}
			movePointerLeft(2);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(2);
				increaseCellValue(1);
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
					}
					movePointerLeft(1);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
					}
					increaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerRight(1);
							increaseCellValue(2);
							movePointerRight(1);
							decreaseCellValue(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(1);
								decreaseCellValue(1);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									movePointerLeft(2);
									increaseCellValue(1);
									movePointerRight(2);
									decreaseCellValue(1);
								}
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
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
					}
					movePointerRight(1);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(2);
				}
				movePointerRight(2);
			}
			movePointerLeft(2);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(2);
				increaseCellValue(1);
				movePointerRight(2);
				increaseCellValue(1);
				movePointerRight(2);
			}
			movePointerLeft(2);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerRight(8);
			}
			movePointerLeft(2);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				outputCurrentCell();
				movePointerRight(7);
			}
			movePointerLeft(2);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				decreaseCellValue(1);
				movePointerRight(5);
			}
			movePointerLeft(2);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				inputIntoCurrentCell();
				movePointerRight(3);
			}
			movePointerLeft(2);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				increaseCellValue(1);
				movePointerRight(1);
			}
			movePointerLeft(2);
			while((getCellValue() & 0xFF) != 0) {
				increaseCellValue(1);
				movePointerLeft(2);
			}
			movePointerLeft(1);
		}
		while((getCellValue() & 0xFF) != 0) {
			inputIntoCurrentCell();
			outputCurrentCell();
			outputCurrentCell();
			outputCurrentCell();
		}
	}

	public static void main(String[] args) {
		new BrainfuckInterpreter();
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
