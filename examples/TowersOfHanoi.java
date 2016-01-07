public class TowersOfHanoi {
	private byte[] _array = new byte[0];
	private int _pointer = 0;
	
	public TowersOfHanoi() {
		movePointerRight(8);
		increaseCellValue(1);
		movePointerRight(1);
		increaseCellValue(4);
		movePointerRight(1);
		increaseCellValue(1);
		movePointerRight(2);
		movePointerRight(4);
		increaseCellValue(8);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(12);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(3);
			increaseCellValue(1);
			movePointerRight(1);
			increaseCellValue(1);
			movePointerRight(1);
			increaseCellValue(1);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(3);
		increaseCellValue(1);
		movePointerRight(1);
		increaseCellValue(2);
		movePointerRight(1);
		increaseCellValue(3);
		movePointerRight(1);
		increaseCellValue(3);
		movePointerRight(1);
		movePointerLeft(8);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(1);
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(2);
							increaseCellValue(3);
							movePointerLeft(2);
							movePointerRight(1);
							decreaseCellValue(1);
							movePointerLeft(1);
							movePointerRight(6);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								increaseCellValue(1);
								movePointerRight(1);
								increaseCellValue(1);
								movePointerLeft(2);
								decreaseCellValue(1);
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(1);
								increaseCellValue(1);
								movePointerRight(1);
								decreaseCellValue(1);
							}
							movePointerRight(1);
							decreaseCellValue(1);
							while((getCellValue() & 0xFF) != 0) {
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
								}
								movePointerLeft(1);
								increaseCellValue(1);
								movePointerRight(3);
								increaseCellValue(4);
								movePointerRight(1);
								movePointerLeft(8);
								while((getCellValue() & 0xFF) != 0) {
									movePointerRight(8);
									increaseCellValue(1);
									movePointerRight(1);
									increaseCellValue(1);
									movePointerLeft(9);
									decreaseCellValue(1);
								}
								movePointerRight(8);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									movePointerLeft(9);
									increaseCellValue(1);
									movePointerRight(9);
									decreaseCellValue(1);
								}
								movePointerLeft(1);
								movePointerRight(1);
								movePointerLeft(7);
								while((getCellValue() & 0xFF) != 0) {
									movePointerRight(7);
									increaseCellValue(1);
									movePointerRight(1);
									increaseCellValue(1);
									movePointerLeft(8);
									decreaseCellValue(1);
								}
								movePointerRight(7);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									movePointerLeft(8);
									increaseCellValue(1);
									movePointerRight(8);
									decreaseCellValue(1);
								}
								movePointerLeft(1);
								movePointerRight(1);
								movePointerLeft(9);
								while((getCellValue() & 0xFF) != 0) {
									movePointerRight(9);
									increaseCellValue(1);
									movePointerRight(1);
									increaseCellValue(1);
									movePointerLeft(10);
									decreaseCellValue(1);
								}
								movePointerRight(9);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									movePointerLeft(10);
									increaseCellValue(1);
									movePointerRight(10);
									decreaseCellValue(1);
								}
								movePointerLeft(1);
								movePointerRight(1);
								movePointerLeft(8);
								while((getCellValue() & 0xFF) != 0) {
									movePointerRight(8);
									increaseCellValue(1);
									movePointerRight(1);
									increaseCellValue(1);
									movePointerLeft(9);
									decreaseCellValue(1);
								}
								movePointerRight(8);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									movePointerLeft(9);
									increaseCellValue(1);
									movePointerRight(9);
									decreaseCellValue(1);
								}
								movePointerLeft(1);
								decreaseCellValue(1);
								movePointerRight(2);
							}
							movePointerLeft(8);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(1);
							movePointerRight(2);
							increaseCellValue(2);
							movePointerLeft(2);
							movePointerRight(7);
							increaseCellValue(1);
							movePointerRight(3);
							increaseCellValue(1);
							movePointerRight(1);
							movePointerLeft(8);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(8);
								increaseCellValue(1);
								movePointerRight(1);
								increaseCellValue(1);
								movePointerLeft(9);
								decreaseCellValue(1);
							}
							movePointerRight(8);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(9);
								increaseCellValue(1);
								movePointerRight(9);
								decreaseCellValue(1);
							}
							movePointerLeft(1);
							movePointerRight(1);
							movePointerLeft(8);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(8);
								increaseCellValue(1);
								movePointerRight(1);
								increaseCellValue(1);
								movePointerLeft(9);
								decreaseCellValue(1);
							}
							movePointerRight(8);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(9);
								increaseCellValue(1);
								movePointerRight(9);
								decreaseCellValue(1);
							}
							movePointerLeft(1);
							movePointerRight(1);
							movePointerLeft(8);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(8);
								increaseCellValue(1);
								movePointerRight(1);
								increaseCellValue(1);
								movePointerLeft(9);
								decreaseCellValue(1);
							}
							movePointerRight(8);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(9);
								increaseCellValue(1);
								movePointerRight(9);
								decreaseCellValue(1);
							}
							movePointerLeft(1);
							movePointerRight(1);
							increaseCellValue(1);
							movePointerRight(2);
							movePointerRight(1);
						}
						movePointerLeft(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(1);
						movePointerRight(6);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(2);
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(1);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						movePointerRight(1);
						decreaseCellValue(1);
						while((getCellValue() & 0xFF) != 0) {
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
							}
							movePointerLeft(1);
							increaseCellValue(1);
							movePointerRight(3);
							increaseCellValue(4);
							movePointerRight(1);
							movePointerLeft(7);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(7);
								increaseCellValue(1);
								movePointerLeft(7);
								decreaseCellValue(1);
							}
							movePointerRight(7);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(8);
								increaseCellValue(1);
								movePointerRight(8);
								decreaseCellValue(1);
							}
							movePointerLeft(1);
							movePointerRight(1);
							movePointerLeft(9);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(9);
								increaseCellValue(1);
								movePointerLeft(9);
								decreaseCellValue(1);
							}
							movePointerRight(9);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(10);
								increaseCellValue(1);
								movePointerRight(10);
								decreaseCellValue(1);
							}
							movePointerLeft(1);
							movePointerRight(1);
							movePointerLeft(8);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(8);
								increaseCellValue(1);
								movePointerLeft(8);
								decreaseCellValue(1);
							}
							movePointerRight(8);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(9);
								increaseCellValue(1);
								movePointerRight(9);
								decreaseCellValue(1);
							}
							movePointerLeft(1);
							movePointerRight(1);
							movePointerLeft(8);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(8);
								increaseCellValue(1);
								movePointerRight(1);
								increaseCellValue(1);
								movePointerLeft(9);
								decreaseCellValue(1);
							}
							movePointerRight(8);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(9);
								increaseCellValue(1);
								movePointerRight(9);
								decreaseCellValue(1);
							}
							movePointerLeft(1);
							decreaseCellValue(1);
							movePointerRight(2);
						}
						movePointerLeft(8);
						movePointerRight(1);
					}
					movePointerLeft(1);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(1);
					movePointerRight(7);
					movePointerRight(1);
					increaseCellValue(4);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(2);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(9);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(4);
					movePointerRight(2);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(12);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(5);
					movePointerRight(2);
					increaseCellValue(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(12);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(3);
					movePointerLeft(3);
					movePointerRight(1);
					outputCurrentCell();
					increaseCellValue(7);
					movePointerRight(1);
					outputCurrentCell();
					increaseCellValue(2);
					outputCurrentCell();
					decreaseCellValue(2);
					outputCurrentCell();
					movePointerLeft(2);
					outputCurrentCell();
					movePointerRight(2);
					decreaseCellValue(1);
					outputCurrentCell();
					increaseCellValue(5);
					outputCurrentCell();
					decreaseCellValue(4);
					outputCurrentCell();
					movePointerLeft(2);
					outputCurrentCell();
					movePointerRight(3);
					outputCurrentCell();
					movePointerLeft(1);
					decreaseCellValue(3);
					outputCurrentCell();
					increaseCellValue(3);
					outputCurrentCell();
					movePointerRight(1);
					increaseCellValue(3);
					outputCurrentCell();
					increaseCellValue(1);
					outputCurrentCell();
					increaseCellValue(1);
					outputCurrentCell();
					movePointerLeft(1);
					outputCurrentCell();
					movePointerLeft(2);
					outputCurrentCell();
					movePointerRight(1);
					outputCurrentCell();
					movePointerRight(1);
					decreaseCellValue(2);
					outputCurrentCell();
					increaseCellValue(5);
					outputCurrentCell();
					decreaseCellValue(3);
					outputCurrentCell();
					increaseCellValue(4);
					outputCurrentCell();
					decreaseCellValue(7);
					outputCurrentCell();
					increaseCellValue(3);
					outputCurrentCell();
					movePointerLeft(2);
					outputCurrentCell();
					movePointerRight(3);
					increaseCellValue(2);
					outputCurrentCell();
					decreaseCellValue(7);
					outputCurrentCell();
					decreaseCellValue(1);
					outputCurrentCell();
					movePointerLeft(3);
					outputCurrentCell();
					movePointerRight(1);
					increaseCellValue(1);
					outputCurrentCell();
					movePointerRight(2);
					increaseCellValue(7);
					outputCurrentCell();
					decreaseCellValue(3);
					outputCurrentCell();
					decreaseCellValue(5);
					outputCurrentCell();
					movePointerLeft(3);
					outputCurrentCell();
					movePointerLeft(4);
					outputCurrentCell();
					movePointerRight(4);
					outputCurrentCell();
					movePointerRight(2);
					decreaseCellValue(4);
					outputCurrentCell();
					movePointerRight(1);
					increaseCellValue(8);
					outputCurrentCell();
					movePointerLeft(1);
					increaseCellValue(5);
					outputCurrentCell();
					movePointerLeft(2);
					outputCurrentCell();
					movePointerRight(1);
					outputCurrentCell();
					movePointerRight(2);
					outputCurrentCell();
					decreaseCellValue(3);
					outputCurrentCell();
					decreaseCellValue(5);
					outputCurrentCell();
					movePointerLeft(3);
					outputCurrentCell();
					movePointerLeft(2);
					outputCurrentCell();
					movePointerRight(2);
					increaseCellValue(14);
					outputCurrentCell();
					movePointerRight(3);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(13);
					outputCurrentCell();
					decreaseCellValue(3);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(7);
					movePointerRight(1);
				}
				movePointerLeft(1);
				movePointerRight(2);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(2);
					increaseCellValue(1);
					movePointerRight(2);
					decreaseCellValue(1);
				}
				movePointerLeft(2);
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
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
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
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
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerLeft(6);
			movePointerLeft(8);
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(2);
				increaseCellValue(1);
				movePointerRight(2);
				decreaseCellValue(1);
			}
			movePointerLeft(2);
			movePointerLeft(1);
		}
	}

	public static void main(String[] args) {
		new TowersOfHanoi();
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
