public class BrainfuckToC {
	private byte[] _array = new byte[0];
	private int _pointer = 0;
	
	public BrainfuckToC() {
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(1);
			increaseCellValue(5);
			movePointerLeft(1);
			decreaseCellValue(1);
		}
		movePointerRight(2);
		increaseCellValue(1);
		movePointerLeft(1);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(2);
			increaseCellValue(4);
			movePointerRight(1);
			increaseCellValue(2);
			movePointerRight(1);
			increaseCellValue(5);
			movePointerRight(1);
			increaseCellValue(5);
			movePointerRight(1);
			increaseCellValue(1);
			movePointerRight(2);
			increaseCellValue(1);
			movePointerLeft(1);
			increaseCellValue(2);
			while((getCellValue() & 0xFF) != 0) {
				increaseCellValue(2);
				movePointerLeft(1);
			}
			movePointerRight(1);
			decreaseCellValue(3);
		}
		movePointerRight(1);
		increaseCellValue(4);
		outputCurrentCell();
		movePointerRight(3);
		outputCurrentCell();
		increaseCellValue(5);
		outputCurrentCell();
		movePointerRight(1);
		decreaseCellValue(6);
		outputCurrentCell();
		movePointerLeft(1);
		decreaseCellValue(2);
		outputCurrentCell();
		increaseCellValue(9);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(1);
		outputCurrentCell();
		increaseCellValue(1);
		outputCurrentCell();
		movePointerLeft(4);
		decreaseCellValue(3);
		outputCurrentCell();
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(1);
		}
		movePointerLeft(2);
		outputCurrentCell();
		movePointerLeft(3);
		outputCurrentCell();
		decreaseCellValue(7);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(4);
		outputCurrentCell();
		movePointerLeft(1);
		increaseCellValue(5);
		outputCurrentCell();
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		decreaseCellValue(5);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(1);
		outputCurrentCell();
		movePointerLeft(1);
		increaseCellValue(4);
		outputCurrentCell();
		movePointerRight(2);
		increaseCellValue(2);
		outputCurrentCell();
		movePointerRight(1);
		decreaseCellValue(5);
		outputCurrentCell();
		movePointerLeft(3);
		decreaseCellValue(5);
		outputCurrentCell();
		increaseCellValue(5);
		outputCurrentCell();
		decreaseCellValue(7);
		outputCurrentCell();
		movePointerLeft(1);
		decreaseCellValue(2);
		outputCurrentCell();
		movePointerLeft(3);
		outputCurrentCell();
		movePointerRight(3);
		outputCurrentCell();
		movePointerLeft(2);
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		decreaseCellValue(6);
		outputCurrentCell();
		decreaseCellValue(1);
		outputCurrentCell();
		outputCurrentCell();
		decreaseCellValue(2);
		outputCurrentCell();
		increaseCellValue(3);
		outputCurrentCell();
		decreaseCellValue(5);
		movePointerLeft(1);
		increaseCellValue(2);
		outputCurrentCell();
		movePointerLeft(1);
		decreaseCellValue(2);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(1);
			increaseCellValue(1);
			movePointerLeft(1);
			decreaseCellValue(1);
		}
		movePointerRight(5);
		decreaseCellValue(2);
		outputCurrentCell();
		decreaseCellValue(2);
		outputCurrentCell();
		movePointerLeft(1);
		increaseCellValue(4);
		outputCurrentCell();
		movePointerRight(2);
		decreaseCellValue(1);
		outputCurrentCell();
		movePointerLeft(3);
		outputCurrentCell();
		movePointerRight(3);
		decreaseCellValue(2);
		outputCurrentCell();
		movePointerRight(1);
		outputCurrentCell();
		movePointerLeft(4);
		decreaseCellValue(5);
		outputCurrentCell();
		movePointerRight(1);
		decreaseCellValue(4);
		outputCurrentCell();
		increaseCellValue(8);
		outputCurrentCell();
		decreaseCellValue(4);
		movePointerLeft(1);
		increaseCellValue(1);
		outputCurrentCell();
		increaseCellValue(9);
		movePointerRight(2);
		decreaseCellValue(2);
		outputCurrentCell();
		increaseCellValue(1);
		outputCurrentCell();
		increaseCellValue(2);
		movePointerLeft(4);
		outputCurrentCell();
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(2);
		inputIntoCurrentCell();
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(2);
			increaseCellValue(3);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(1);
				increaseCellValue(7);
				movePointerRight(1);
				decreaseCellValue(1);
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(1);
					}
				}
				movePointerRight(2);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
				}
				movePointerLeft(1);
				decreaseCellValue(1);
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(1);
				increaseCellValue(5);
				movePointerRight(1);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					increaseCellValue(3);
					movePointerRight(1);
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						decreaseCellValue(2);
						movePointerRight(1);
						decreaseCellValue(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(3);
							movePointerRight(1);
							decreaseCellValue(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(1);
								increaseCellValue(4);
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
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									movePointerLeft(1);
									increaseCellValue(3);
									movePointerRight(1);
									decreaseCellValue(1);
									while((getCellValue() & 0xFF) != 0) {
										movePointerLeft(1);
										decreaseCellValue(3);
										movePointerRight(1);
										decreaseCellValue(1);
										while((getCellValue() & 0xFF) != 0) {
											movePointerLeft(1);
											increaseCellValue(4);
											movePointerRight(1);
											decreaseCellValue(1);
											while((getCellValue() & 0xFF) != 0) {
												movePointerLeft(1);
												increaseCellValue(3);
												while((getCellValue() & 0xFF) != 0) {
													movePointerRight(1);
													while((getCellValue() & 0xFF) != 0) {
														decreaseCellValue(1);
														while((getCellValue() & 0xFF) != 0) {
															decreaseCellValue(1);
															while((getCellValue() & 0xFF) != 0) {
																decreaseCellValue(1);
																while((getCellValue() & 0xFF) != 0) {
																	decreaseCellValue(1);
																	movePointerRight(2);
																}
															}
														}
													}
													movePointerLeft(1);
													while((getCellValue() & 0xFF) != 0) {
														movePointerRight(2);
													}
													movePointerLeft(2);
													decreaseCellValue(1);
												}
												movePointerRight(1);
												while((getCellValue() & 0xFF) != 0) {
													movePointerLeft(1);
													increaseCellValue(1);
													movePointerRight(1);
													decreaseCellValue(1);
													while((getCellValue() & 0xFF) != 0) {
														movePointerLeft(1);
														decreaseCellValue(1);
														movePointerRight(1);
														decreaseCellValue(1);
														while((getCellValue() & 0xFF) != 0) {
															movePointerLeft(1);
															increaseCellValue(2);
															movePointerRight(1);
															decreaseCellValue(1);
															while((getCellValue() & 0xFF) != 0) {
																movePointerLeft(1);
																while((getCellValue() & 0xFF) != 0) {
																	decreaseCellValue(1);
																}
																movePointerRight(1);
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
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(4);
					outputCurrentCell();
					movePointerRight(1);
					increaseCellValue(3);
					outputCurrentCell();
					increaseCellValue(1);
					outputCurrentCell();
					increaseCellValue(3);
					outputCurrentCell();
					decreaseCellValue(7);
					outputCurrentCell();
					movePointerRight(1);
					decreaseCellValue(3);
					outputCurrentCell();
					increaseCellValue(2);
					outputCurrentCell();
					movePointerLeft(1);
					outputCurrentCell();
					movePointerRight(1);
					decreaseCellValue(1);
					outputCurrentCell();
					increaseCellValue(2);
					movePointerLeft(4);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
					}
					movePointerRight(9);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
					}
					movePointerRight(1);
					increaseCellValue(2);
					outputCurrentCell();
					decreaseCellValue(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
					}
					movePointerRight(8);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(2);
					increaseCellValue(2);
					outputCurrentCell();
					outputCurrentCell();
					decreaseCellValue(2);
					movePointerRight(6);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(2);
					outputCurrentCell();
					outputCurrentCell();
					movePointerRight(5);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(2);
					outputCurrentCell();
					outputCurrentCell();
					decreaseCellValue(1);
					outputCurrentCell();
					increaseCellValue(1);
					movePointerRight(4);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(2);
					increaseCellValue(2);
					outputCurrentCell();
					outputCurrentCell();
					decreaseCellValue(3);
					outputCurrentCell();
					increaseCellValue(1);
					movePointerRight(3);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(3);
					outputCurrentCell();
					movePointerRight(2);
					outputCurrentCell();
					movePointerRight(5);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(4);
					decreaseCellValue(5);
					outputCurrentCell();
					increaseCellValue(5);
					movePointerRight(1);
					outputCurrentCell();
					decreaseCellValue(4);
					outputCurrentCell();
					increaseCellValue(3);
					outputCurrentCell();
					increaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(3);
					outputCurrentCell();
					movePointerLeft(3);
					decreaseCellValue(1);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
					}
					movePointerRight(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(4);
					outputCurrentCell();
					decreaseCellValue(5);
					outputCurrentCell();
					movePointerRight(1);
					increaseCellValue(4);
					outputCurrentCell();
					movePointerLeft(1);
					increaseCellValue(2);
					outputCurrentCell();
					increaseCellValue(3);
					movePointerRight(1);
					decreaseCellValue(4);
					outputCurrentCell();
					movePointerRight(1);
					decreaseCellValue(3);
					outputCurrentCell();
					movePointerLeft(3);
					outputCurrentCell();
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
					}
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(5);
					decreaseCellValue(4);
					outputCurrentCell();
					movePointerRight(2);
					outputCurrentCell();
					movePointerLeft(2);
					outputCurrentCell();
					increaseCellValue(5);
					outputCurrentCell();
					movePointerRight(3);
					increaseCellValue(1);
					outputCurrentCell();
					increaseCellValue(2);
					movePointerRight(1);
					outputCurrentCell();
					movePointerRight(2);
				}
				movePointerLeft(1);
				outputCurrentCell();
				movePointerRight(1);
			}
			movePointerRight(1);
			inputIntoCurrentCell();
		}
		movePointerLeft(5);
		outputCurrentCell();
		movePointerLeft(1);
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(4);
		outputCurrentCell();
		movePointerLeft(1);
		decreaseCellValue(4);
		outputCurrentCell();
		movePointerRight(2);
		decreaseCellValue(3);
		outputCurrentCell();
		movePointerLeft(3);
		decreaseCellValue(1);
		outputCurrentCell();
		movePointerRight(3);
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		outputCurrentCell();
		movePointerRight(1);
		outputCurrentCell();
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
		}
		movePointerRight(1);
		increaseCellValue(2);
		outputCurrentCell();
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		while((getCellValue() & 0xFF) != 0) {
			outputCurrentCell();
			decreaseCellValue(4);
			movePointerRight(1);
			outputCurrentCell();
			decreaseCellValue(3);
			inputIntoCurrentCell();
			outputCurrentCell();
			outputCurrentCell();
			outputCurrentCell();
			outputCurrentCell();
		}
	}

	public static void main(String[] args) {
		new BrainfuckToC();
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
