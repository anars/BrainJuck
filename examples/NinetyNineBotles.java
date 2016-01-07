public class NinetyNineBotles {
	private byte[] _array = new byte[0];
	private int _pointer = 0;
	
	public NinetyNineBotles() {
		movePointerRight(1);
		increaseCellValue(10);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(10);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(1);
		movePointerRight(5);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(1);
			increaseCellValue(3);
			movePointerRight(1);
			increaseCellValue(3);
			movePointerLeft(2);
			decreaseCellValue(1);
		}
		movePointerLeft(4);
		increaseCellValue(1);
		movePointerLeft(1);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				increaseCellValue(1);
				movePointerRight(1);
				increaseCellValue(1);
				movePointerLeft(2);
				decreaseCellValue(1);
			}
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(2);
				increaseCellValue(1);
				movePointerRight(2);
			}
			increaseCellValue(4);
			movePointerRight(1);
			increaseCellValue(1);
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(1);
				decreaseCellValue(1);
				movePointerRight(1);
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(2);
				decreaseCellValue(1);
				movePointerLeft(2);
			}
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
				increaseCellValue(1);
				movePointerRight(2);
			}
			movePointerLeft(2);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(2);
				movePointerRight(4);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(10);
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(2);
				}
				movePointerLeft(1);
				decreaseCellValue(1);
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
				increaseCellValue(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
				}
				movePointerLeft(8);
				movePointerLeft(1);
				decreaseCellValue(1);
				movePointerRight(2);
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				increaseCellValue(1);
				movePointerRight(1);
				increaseCellValue(1);
				movePointerLeft(2);
				decreaseCellValue(1);
			}
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(2);
				increaseCellValue(1);
				movePointerRight(2);
			}
			increaseCellValue(1);
			movePointerRight(1);
			increaseCellValue(1);
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(1);
				decreaseCellValue(1);
				movePointerRight(1);
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(2);
				decreaseCellValue(1);
				movePointerLeft(2);
			}
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
				increaseCellValue(1);
				movePointerRight(2);
			}
			movePointerLeft(2);
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(2);
				increaseCellValue(1);
				movePointerRight(1);
				increaseCellValue(1);
				movePointerLeft(3);
				decreaseCellValue(1);
			}
			movePointerRight(3);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(3);
				increaseCellValue(1);
				movePointerRight(3);
			}
			increaseCellValue(2);
			movePointerRight(1);
			increaseCellValue(1);
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(1);
				decreaseCellValue(1);
				movePointerRight(1);
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(2);
				decreaseCellValue(1);
				movePointerLeft(2);
			}
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
				increaseCellValue(1);
				movePointerRight(2);
			}
			movePointerLeft(1);
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				increaseCellValue(1);
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(2);
				increaseCellValue(1);
				movePointerLeft(2);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
			}
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(2);
				increaseCellValue(1);
				movePointerRight(2);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
			}
			movePointerLeft(3);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(2);
				increaseCellValue(1);
				movePointerRight(1);
				increaseCellValue(1);
				movePointerLeft(3);
				decreaseCellValue(1);
			}
			movePointerRight(3);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(3);
				increaseCellValue(1);
				movePointerRight(3);
			}
			increaseCellValue(1);
			increaseCellValue(3);
			movePointerRight(1);
			increaseCellValue(1);
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(1);
				decreaseCellValue(1);
				movePointerRight(1);
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(2);
				decreaseCellValue(1);
				movePointerLeft(2);
			}
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
				increaseCellValue(1);
				movePointerRight(2);
			}
			movePointerLeft(2);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				increaseCellValue(1);
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(2);
				increaseCellValue(1);
				movePointerLeft(2);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
			}
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(1);
				movePointerLeft(1);
				increaseCellValue(1);
				movePointerRight(2);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
			}
			movePointerLeft(2);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(3);
				increaseCellValue(8);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(2);
					increaseCellValue(6);
					movePointerLeft(2);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						increaseCellValue(6);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					outputCurrentCell();
					movePointerLeft(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						decreaseCellValue(6);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
				}
				movePointerRight(1);
				outputCurrentCell();
				movePointerLeft(2);
				increaseCellValue(8);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(2);
					decreaseCellValue(6);
					movePointerLeft(2);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(2);
					increaseCellValue(1);
					movePointerLeft(2);
				}
				movePointerLeft(1);
				increaseCellValue(8);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					increaseCellValue(4);
					movePointerRight(1);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				outputCurrentCell();
				movePointerRight(1);
				increaseCellValue(7);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					increaseCellValue(9);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				increaseCellValue(3);
				outputCurrentCell();
				movePointerLeft(1);
				increaseCellValue(5);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					increaseCellValue(9);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				outputCurrentCell();
				increaseCellValue(5);
				outputCurrentCell();
				outputCurrentCell();
				decreaseCellValue(8);
				outputCurrentCell();
				decreaseCellValue(7);
				outputCurrentCell();
				increaseCellValue(14);
				movePointerRight(2);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(3);
					increaseCellValue(1);
					movePointerRight(1);
					increaseCellValue(1);
					movePointerLeft(4);
					decreaseCellValue(1);
				}
				movePointerRight(4);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(4);
					increaseCellValue(1);
					movePointerRight(4);
				}
				movePointerRight(1);
				increaseCellValue(1);
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(2);
					decreaseCellValue(1);
					movePointerLeft(2);
				}
				movePointerRight(2);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(2);
					increaseCellValue(1);
					movePointerRight(2);
				}
				movePointerLeft(4);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(3);
					increaseCellValue(1);
					movePointerRight(1);
					increaseCellValue(1);
					movePointerLeft(4);
					decreaseCellValue(1);
				}
				movePointerRight(4);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(4);
					increaseCellValue(1);
					movePointerRight(4);
				}
				increaseCellValue(1);
				movePointerRight(1);
				increaseCellValue(1);
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(2);
					decreaseCellValue(1);
					movePointerLeft(2);
				}
				movePointerRight(2);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(2);
					increaseCellValue(1);
					movePointerRight(1);
					movePointerRight(1);
				}
				movePointerLeft(3);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(2);
					increaseCellValue(1);
					movePointerLeft(2);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					increaseCellValue(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
				}
				increaseCellValue(2);
				movePointerRight(2);
				increaseCellValue(1);
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(2);
					decreaseCellValue(1);
					movePointerLeft(2);
				}
				movePointerRight(2);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(2);
					increaseCellValue(1);
					movePointerRight(2);
				}
				movePointerLeft(1);
				increaseCellValue(1);
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					decreaseCellValue(1);
					movePointerLeft(1);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(7);
					outputCurrentCell();
					movePointerRight(7);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
				}
				movePointerLeft(9);
				outputCurrentCell();
				movePointerRight(2);
				decreaseCellValue(4);
				outputCurrentCell();
				decreaseCellValue(9);
				outputCurrentCell();
				movePointerLeft(2);
				outputCurrentCell();
				movePointerRight(2);
				decreaseCellValue(4);
				outputCurrentCell();
				increaseCellValue(3);
				outputCurrentCell();
				outputCurrentCell();
				increaseCellValue(13);
				outputCurrentCell();
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				increaseCellValue(1);
				movePointerRight(1);
				increaseCellValue(1);
				movePointerLeft(2);
				decreaseCellValue(1);
			}
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(2);
				increaseCellValue(1);
				movePointerRight(2);
			}
			increaseCellValue(1);
			movePointerRight(1);
			increaseCellValue(1);
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(1);
				decreaseCellValue(1);
				movePointerRight(1);
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(2);
				decreaseCellValue(1);
				movePointerLeft(2);
			}
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
				increaseCellValue(1);
				movePointerRight(2);
			}
			movePointerLeft(3);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(2);
				increaseCellValue(1);
				movePointerRight(1);
				increaseCellValue(1);
				movePointerLeft(3);
				decreaseCellValue(1);
			}
			movePointerRight(3);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(3);
				increaseCellValue(1);
				movePointerRight(3);
			}
			increaseCellValue(4);
			movePointerRight(1);
			increaseCellValue(1);
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(1);
				decreaseCellValue(1);
				movePointerRight(1);
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(2);
				decreaseCellValue(1);
				movePointerLeft(2);
			}
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
				increaseCellValue(1);
				movePointerRight(2);
			}
			movePointerLeft(2);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				increaseCellValue(1);
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(2);
				increaseCellValue(1);
				movePointerLeft(2);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
			}
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(2);
				increaseCellValue(1);
				movePointerRight(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
			}
			movePointerLeft(2);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(1);
				increaseCellValue(8);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					increaseCellValue(4);
					movePointerRight(1);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				outputCurrentCell();
				movePointerRight(1);
				increaseCellValue(10);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					increaseCellValue(11);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				increaseCellValue(1);
				outputCurrentCell();
				decreaseCellValue(1);
				outputCurrentCell();
				movePointerLeft(2);
				outputCurrentCell();
				movePointerRight(2);
				increaseCellValue(6);
				outputCurrentCell();
				decreaseCellValue(12);
				outputCurrentCell();
				decreaseCellValue(3);
				outputCurrentCell();
				movePointerLeft(2);
				outputCurrentCell();
				movePointerRight(1);
				increaseCellValue(6);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					increaseCellValue(3);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				outputCurrentCell();
				movePointerLeft(1);
				increaseCellValue(6);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					decreaseCellValue(4);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				increaseCellValue(2);
				outputCurrentCell();
				increaseCellValue(11);
				outputCurrentCell();
				outputCurrentCell();
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(10);
				outputCurrentCell();
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				increaseCellValue(1);
				movePointerRight(1);
				increaseCellValue(1);
				movePointerLeft(2);
				decreaseCellValue(1);
			}
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(2);
				increaseCellValue(1);
				movePointerRight(2);
			}
			increaseCellValue(3);
			movePointerRight(1);
			increaseCellValue(1);
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(1);
				decreaseCellValue(1);
				movePointerRight(1);
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(2);
				decreaseCellValue(1);
				movePointerLeft(2);
			}
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
				increaseCellValue(1);
				movePointerRight(2);
			}
			movePointerLeft(2);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(10);
				outputCurrentCell();
				movePointerRight(1);
				increaseCellValue(9);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					increaseCellValue(9);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				increaseCellValue(3);
				outputCurrentCell();
				increaseCellValue(13);
				outputCurrentCell();
				increaseCellValue(10);
				outputCurrentCell();
				decreaseCellValue(6);
				outputCurrentCell();
				movePointerLeft(1);
				increaseCellValue(8);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(2);
					increaseCellValue(4);
					movePointerLeft(2);
					decreaseCellValue(1);
				}
				movePointerRight(2);
				outputCurrentCell();
				movePointerLeft(1);
				increaseCellValue(10);
				outputCurrentCell();
				decreaseCellValue(1);
				outputCurrentCell();
				decreaseCellValue(9);
				outputCurrentCell();
				movePointerRight(1);
				outputCurrentCell();
				movePointerLeft(1);
				decreaseCellValue(1);
				outputCurrentCell();
				increaseCellValue(7);
				increaseCellValue(4);
				outputCurrentCell();
				increaseCellValue(8);
				outputCurrentCell();
				decreaseCellValue(9);
				outputCurrentCell();
				movePointerRight(1);
				outputCurrentCell();
				movePointerLeft(1);
				decreaseCellValue(13);
				outputCurrentCell();
				increaseCellValue(13);
				outputCurrentCell();
				decreaseCellValue(5);
				decreaseCellValue(5);
				outputCurrentCell();
				movePointerRight(1);
				outputCurrentCell();
				movePointerLeft(1);
				increaseCellValue(12);
				outputCurrentCell();
				decreaseCellValue(15);
				outputCurrentCell();
				movePointerLeft(1);
				increaseCellValue(3);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					increaseCellValue(6);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				outputCurrentCell();
				outputCurrentCell();
				movePointerRight(1);
				outputCurrentCell();
				movePointerLeft(1);
				decreaseCellValue(1);
				decreaseCellValue(9);
				outputCurrentCell();
				increaseCellValue(11);
				outputCurrentCell();
				movePointerRight(1);
				outputCurrentCell();
				movePointerLeft(2);
				increaseCellValue(3);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					decreaseCellValue(6);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				decreaseCellValue(1);
				outputCurrentCell();
				increaseCellValue(17);
				outputCurrentCell();
				decreaseCellValue(3);
				outputCurrentCell();
				increaseCellValue(6);
				outputCurrentCell();
				decreaseCellValue(7);
				outputCurrentCell();
				decreaseCellValue(10);
				outputCurrentCell();
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(3);
				outputCurrentCell();
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				increaseCellValue(1);
				movePointerRight(1);
				increaseCellValue(1);
				movePointerLeft(2);
				decreaseCellValue(1);
			}
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(2);
				increaseCellValue(1);
				movePointerRight(2);
			}
			increaseCellValue(4);
			movePointerRight(1);
			increaseCellValue(1);
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(1);
				decreaseCellValue(1);
				movePointerRight(1);
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(2);
				decreaseCellValue(1);
				movePointerLeft(2);
			}
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
				increaseCellValue(1);
				movePointerRight(2);
			}
			movePointerLeft(2);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(10);
				outputCurrentCell();
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(1);
			}
			movePointerLeft(1);
			increaseCellValue(1);
			movePointerLeft(1);
		}
	}

	public static void main(String[] args) {
		new NinetyNineBotles();
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
