public class Algorithm196 {
	private byte[] _array = new byte[0];
	private int _pointer = 0;
	
	public Algorithm196() {
		while((getCellValue() & 0xFF) != 0) {
			decreaseCellValue(1);
			outputCurrentCell();
			outputCurrentCell();
			outputCurrentCell();
			inputIntoCurrentCell();
			decreaseCellValue(1);
			outputCurrentCell();
			outputCurrentCell();
			outputCurrentCell();
			outputCurrentCell();
			inputIntoCurrentCell();
			outputCurrentCell();
			decreaseCellValue(76);
			decreaseCellValue(1);
			movePointerLeft(1);
			movePointerRight(1);
			outputCurrentCell();
			outputCurrentCell();
			inputIntoCurrentCell();
			inputIntoCurrentCell();
			outputCurrentCell();
			decreaseCellValue(2);
			decreaseCellValue(76);
		}
		increaseCellValue(10);
		while((getCellValue() & 0xFF) != 0) {
			decreaseCellValue(1);
			movePointerRight(1);
			increaseCellValue(10);
			movePointerRight(1);
			increaseCellValue(11);
			movePointerRight(1);
			increaseCellValue(3);
			movePointerLeft(3);
		}
		movePointerRight(1);
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		outputCurrentCell();
		increaseCellValue(6);
		outputCurrentCell();
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		decreaseCellValue(2);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(2);
		outputCurrentCell();
		movePointerLeft(1);
		decreaseCellValue(3);
		decreaseCellValue(1);
		outputCurrentCell();
		increaseCellValue(7);
		outputCurrentCell();
		decreaseCellValue(8);
		outputCurrentCell();
		movePointerLeft(1);
		decreaseCellValue(3);
		outputCurrentCell();
		increaseCellValue(3);
		outputCurrentCell();
		while((getCellValue() & 0xFF) != 0) {
			decreaseCellValue(1);
		}
		movePointerRight(1);
		increaseCellValue(5);
		outputCurrentCell();
		increaseCellValue(2);
		while((getCellValue() & 0xFF) != 0) {
			decreaseCellValue(2);
			movePointerLeft(1);
			increaseCellValue(1);
			movePointerRight(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		while((getCellValue() & 0xFF) != 0) {
			decreaseCellValue(1);
		}
		movePointerRight(2);
		outputCurrentCell();
		while((getCellValue() & 0xFF) != 0) {
			decreaseCellValue(1);
		}
		movePointerLeft(3);
		increaseCellValue(1);
		movePointerRight(2);
		decreaseCellValue(1);
		movePointerRight(1);
		inputIntoCurrentCell();
		decreaseCellValue(2);
		decreaseCellValue(4);
		decreaseCellValue(4);
		while((getCellValue() & 0xFF) != 0) {
			decreaseCellValue(2);
			movePointerRight(1);
			increaseCellValue(6);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(1);
				decreaseCellValue(6);
				movePointerRight(1);
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerRight(1);
				increaseCellValue(1);
				movePointerRight(1);
				increaseCellValue(1);
				movePointerLeft(2);
			}
			movePointerLeft(1);
			increaseCellValue(1);
			movePointerRight(1);
			increaseCellValue(1);
			movePointerRight(5);
			inputIntoCurrentCell();
			decreaseCellValue(10);
		}
		movePointerLeft(6);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(2);
			movePointerLeft(3);
		}
		movePointerRight(1);
		decreaseCellValue(1);
		movePointerLeft(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(7);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(2);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(5);
					}
					movePointerLeft(1);
					increaseCellValue(1);
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(5);
					}
					movePointerRight(3);
				}
				movePointerRight(2);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(5);
				}
				movePointerLeft(2);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(3);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(5);
					}
					movePointerRight(3);
					increaseCellValue(1);
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(5);
					}
					movePointerLeft(2);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(1);
					increaseCellValue(1);
					movePointerRight(1);
				}
				movePointerLeft(4);
				decreaseCellValue(1);
				movePointerLeft(5);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(5);
				}
				movePointerRight(5);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(5);
			}
			movePointerLeft(4);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(5);
			}
			movePointerLeft(2);
			increaseCellValue(1);
			movePointerRight(7);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(1);
				increaseCellValue(1);
				movePointerRight(6);
			}
			movePointerLeft(1);
			increaseCellValue(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(2);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(1);
					increaseCellValue(1);
					movePointerRight(1);
					increaseCellValue(1);
					movePointerLeft(2);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(1);
					increaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(1);
					movePointerLeft(2);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(1);
					increaseCellValue(1);
					movePointerRight(1);
				}
				movePointerRight(2);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(2);
					increaseCellValue(1);
					movePointerRight(2);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(3);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(5);
					}
					movePointerLeft(2);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(4);
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(5);
					}
					movePointerLeft(1);
				}
				movePointerLeft(4);
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(1);
				decreaseCellValue(1);
				movePointerRight(1);
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(8);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(2);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(1);
						increaseCellValue(6);
						movePointerRight(1);
					}
					movePointerLeft(1);
					outputCurrentCell();
					movePointerRight(8);
				}
				increaseCellValue(8);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(1);
					increaseCellValue(5);
					movePointerLeft(1);
					increaseCellValue(4);
					movePointerLeft(1);
					increaseCellValue(6);
					movePointerRight(3);
				}
				movePointerLeft(3);
				outputCurrentCell();
				movePointerRight(1);
				outputCurrentCell();
				movePointerRight(1);
				increaseCellValue(3);
				outputCurrentCell();
				movePointerLeft(1);
				outputCurrentCell();
				movePointerLeft(1);
				outputCurrentCell();
				movePointerRight(2);
				increaseCellValue(5);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(2);
					decreaseCellValue(1);
					movePointerRight(2);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(3);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(3);
					outputCurrentCell();
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(1);
						decreaseCellValue(6);
						movePointerRight(1);
					}
					movePointerLeft(3);
				}
				increaseCellValue(10);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(1);
					increaseCellValue(3);
					movePointerLeft(1);
					increaseCellValue(6);
					movePointerRight(2);
				}
				movePointerLeft(1);
				increaseCellValue(2);
				outputCurrentCell();
				movePointerLeft(1);
				increaseCellValue(1);
				outputCurrentCell();
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(1);
				outputCurrentCell();
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(6);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(5);
				}
				increaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(5);
				}
				movePointerRight(3);
				movePointerRight(2);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(3);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerRight(1);
					}
					movePointerRight(1);
					increaseCellValue(1);
					movePointerLeft(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
						decreaseCellValue(1);
						movePointerLeft(2);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
						}
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerRight(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
						decreaseCellValue(1);
						movePointerLeft(2);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(3);
					increaseCellValue(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
						increaseCellValue(1);
						movePointerLeft(2);
						decreaseCellValue(1);
						movePointerLeft(1);
						decreaseCellValue(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							decreaseCellValue(1);
							movePointerLeft(3);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(2);
								increaseCellValue(1);
								movePointerLeft(2);
							}
						}
						movePointerRight(2);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerRight(2);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
							}
							movePointerLeft(1);
						}
						movePointerLeft(2);
					}
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(3);
					increaseCellValue(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(2);
						increaseCellValue(1);
						movePointerLeft(1);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(3);
						increaseCellValue(7);
						increaseCellValue(3);
						movePointerRight(3);
					}
					movePointerRight(6);
				}
				movePointerLeft(5);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(1);
					increaseCellValue(1);
					movePointerRight(2);
					increaseCellValue(1);
					movePointerLeft(1);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(1);
					increaseCellValue(1);
					movePointerRight(1);
				}
				movePointerLeft(7);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(5);
				}
				movePointerRight(5);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(5);
				}
				movePointerLeft(5);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(3);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
					}
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(6);
						movePointerLeft(1);
					}
					movePointerRight(1);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(9);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(1);
					increaseCellValue(1);
					movePointerRight(1);
					increaseCellValue(1);
					movePointerRight(1);
					increaseCellValue(1);
					movePointerLeft(3);
				}
				movePointerRight(2);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(2);
					increaseCellValue(1);
					movePointerRight(2);
				}
				increaseCellValue(8);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(1);
					increaseCellValue(6);
					movePointerLeft(1);
				}
				movePointerRight(1);
				outputCurrentCell();
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(5);
				}
				movePointerLeft(5);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					increaseCellValue(1);
					movePointerLeft(4);
				}
				movePointerLeft(3);
				increaseCellValue(9);
				outputCurrentCell();
				decreaseCellValue(9);
				movePointerRight(1);
				increaseCellValue(1);
				movePointerLeft(1);
				decreaseCellValue(1);
			}
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(1);
				increaseCellValue(1);
				movePointerRight(1);
			}
			movePointerLeft(1);
		}
		increaseCellValue(10);
		while((getCellValue() & 0xFF) != 0) {
			decreaseCellValue(1);
			movePointerRight(1);
			increaseCellValue(8);
			movePointerRight(1);
			increaseCellValue(11);
			movePointerRight(1);
			increaseCellValue(2);
			increaseCellValue(4);
			movePointerLeft(3);
		}
		movePointerRight(1);
		outputCurrentCell();
		movePointerLeft(1);
		increaseCellValue(4);
		while((getCellValue() & 0xFF) != 0) {
			decreaseCellValue(1);
			movePointerRight(1);
			increaseCellValue(4);
			movePointerLeft(1);
		}
		movePointerRight(1);
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		decreaseCellValue(2);
		outputCurrentCell();
		decreaseCellValue(3);
		outputCurrentCell();
		increaseCellValue(5);
		outputCurrentCell();
		movePointerLeft(1);
		increaseCellValue(3);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(4);
		outputCurrentCell();
		decreaseCellValue(3);
		outputCurrentCell();
		decreaseCellValue(2);
		outputCurrentCell();
		movePointerLeft(1);
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(2);
		decreaseCellValue(2);
		outputCurrentCell();
		increaseCellValue(2);
		while((getCellValue() & 0xFF) != 0) {
			decreaseCellValue(2);
			movePointerLeft(3);
			increaseCellValue(1);
			movePointerRight(3);
		}
		movePointerLeft(3);
		increaseCellValue(2);
		outputCurrentCell();
		movePointerRight(3);
		increaseCellValue(1);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(3);
			increaseCellValue(8);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(1);
				increaseCellValue(6);
				movePointerRight(1);
			}
			movePointerLeft(1);
			outputCurrentCell();
			movePointerRight(3);
		}
		increaseCellValue(10);
		outputCurrentCell();
	}

	public static void main(String[] args) {
		new Algorithm196();
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
