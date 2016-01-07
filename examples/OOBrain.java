public class OOBrain {
	private byte[] _array = new byte[0];
	private int _pointer = 0;
	
	public OOBrain() {
		movePointerRight(40);
		movePointerRight(40);
		movePointerRight(40);
		movePointerLeft(1);
		movePointerRight(1);
		movePointerLeft(2);
		movePointerRight(2);
		movePointerLeft(3);
		movePointerRight(3);
		movePointerLeft(4);
		movePointerRight(4);
		movePointerLeft(5);
		movePointerRight(5);
		movePointerLeft(6);
		movePointerRight(6);
		movePointerLeft(7);
		movePointerRight(7);
		movePointerLeft(8);
		movePointerRight(8);
		movePointerLeft(9);
		movePointerRight(9);
		movePointerLeft(20);
		movePointerRight(20);
		decreaseCellValue(1);
		movePointerRight(12);
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
		movePointerRight(1);
		movePointerLeft(20);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(2);
		}
		increaseCellValue(1);
		movePointerLeft(1);
		increaseCellValue(1);
		movePointerRight(1);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(2);
		}
		movePointerLeft(2);
		movePointerRight(20);
		movePointerLeft(20);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(2);
		}
		increaseCellValue(1);
		movePointerLeft(1);
		movePointerRight(1);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(2);
		}
		movePointerLeft(2);
		movePointerRight(20);
		movePointerLeft(22);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(22);
			movePointerLeft(20);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(2);
			}
			movePointerRight(2);
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(2);
				}
				movePointerLeft(2);
				movePointerRight(20);
				increaseCellValue(1);
				movePointerLeft(20);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(2);
				}
				movePointerRight(2);
				movePointerLeft(1);
				decreaseCellValue(1);
			}
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(2);
			}
			movePointerLeft(2);
			movePointerRight(20);
			movePointerLeft(20);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(2);
			}
			movePointerRight(2);
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(2);
				}
				movePointerLeft(2);
				movePointerRight(21);
				increaseCellValue(1);
				movePointerLeft(21);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(2);
				}
				movePointerRight(2);
				movePointerLeft(1);
				decreaseCellValue(1);
			}
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(2);
			}
			movePointerLeft(2);
			movePointerRight(20);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(20);
					increaseCellValue(1);
					movePointerLeft(20);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(20);
					increaseCellValue(1);
					movePointerLeft(20);
					decreaseCellValue(1);
				}
				movePointerRight(20);
				decreaseCellValue(1);
			}
			movePointerLeft(2);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerRight(3);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(3);
				increaseCellValue(1);
				movePointerRight(3);
				decreaseCellValue(1);
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerLeft(3);
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
				movePointerLeft(4);
				increaseCellValue(1);
				movePointerRight(4);
				decreaseCellValue(1);
			}
			movePointerLeft(1);
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(1);
				decreaseCellValue(1);
				movePointerRight(1);
				decreaseCellValue(1);
			}
			movePointerLeft(1);
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(1);
				movePointerLeft(1);
				decreaseCellValue(1);
			}
			movePointerRight(1);
			decreaseCellValue(1);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
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
					movePointerLeft(3);
					increaseCellValue(1);
					movePointerRight(3);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				increaseCellValue(1);
				movePointerLeft(20);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(2);
				}
				increaseCellValue(1);
				movePointerLeft(1);
				increaseCellValue(4);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(2);
				}
				movePointerLeft(2);
				movePointerRight(20);
				movePointerLeft(20);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(2);
				}
				increaseCellValue(1);
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(2);
				}
				movePointerLeft(2);
				movePointerRight(20);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					movePointerRight(1);
					increaseCellValue(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					decreaseCellValue(1);
				}
				movePointerLeft(20);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(2);
				}
				increaseCellValue(1);
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(2);
				}
				movePointerLeft(2);
				movePointerRight(20);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
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
					movePointerLeft(3);
					increaseCellValue(1);
					movePointerRight(3);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(20);
					}
					movePointerRight(1);
					movePointerRight(20);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
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
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerRight(2);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerRight(20);
						movePointerLeft(1);
					}
					movePointerRight(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
					movePointerLeft(3);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerRight(3);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
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
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							increaseCellValue(1);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerLeft(20);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(4);
						increaseCellValue(1);
						movePointerRight(4);
						decreaseCellValue(1);
					}
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(4);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(5);
						decreaseCellValue(1);
					}
					movePointerRight(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(5);
						increaseCellValue(1);
						movePointerRight(5);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					increaseCellValue(6);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					increaseCellValue(5);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					increaseCellValue(20);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					increaseCellValue(10);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					increaseCellValue(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(20);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerRight(1);
						increaseCellValue(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(20);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(20);
					}
					movePointerRight(1);
					movePointerRight(20);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
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
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerRight(2);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerRight(20);
						movePointerLeft(1);
					}
					movePointerRight(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
					movePointerLeft(3);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(2);
					movePointerRight(3);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
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
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							increaseCellValue(1);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerLeft(20);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(5);
						increaseCellValue(1);
						movePointerRight(5);
						decreaseCellValue(1);
					}
					movePointerLeft(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(5);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(6);
						decreaseCellValue(1);
					}
					movePointerRight(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(6);
						increaseCellValue(1);
						movePointerRight(6);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					increaseCellValue(8);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					increaseCellValue(25);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					increaseCellValue(15);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					increaseCellValue(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(20);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerRight(1);
						increaseCellValue(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(20);
						decreaseCellValue(1);
					}
					movePointerRight(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
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
					movePointerLeft(3);
					increaseCellValue(1);
					movePointerRight(3);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(2);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(4);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(5);
						decreaseCellValue(1);
					}
					movePointerRight(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(5);
						increaseCellValue(1);
						movePointerRight(5);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(4);
						increaseCellValue(1);
						movePointerLeft(4);
						decreaseCellValue(1);
					}
					movePointerLeft(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(5);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(6);
						decreaseCellValue(1);
					}
					movePointerRight(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(6);
						increaseCellValue(1);
						movePointerRight(6);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(5);
						increaseCellValue(1);
						movePointerLeft(5);
						decreaseCellValue(1);
					}
					movePointerRight(3);
					increaseCellValue(2);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(3);
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(4);
							decreaseCellValue(1);
						}
						movePointerLeft(4);
						movePointerLeft(20);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						increaseCellValue(1);
						movePointerLeft(1);
						increaseCellValue(4);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(20);
						movePointerLeft(20);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						increaseCellValue(1);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(20);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(2);
							}
							movePointerRight(1);
							increaseCellValue(1);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(2);
							}
							movePointerLeft(2);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerRight(5);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(1);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						movePointerLeft(5);
						movePointerRight(3);
					}
					movePointerLeft(3);
					movePointerRight(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
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
					movePointerLeft(3);
					increaseCellValue(1);
					movePointerRight(3);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(3);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(4);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(5);
						decreaseCellValue(1);
					}
					movePointerRight(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(5);
						increaseCellValue(1);
						movePointerRight(5);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(4);
						increaseCellValue(1);
						movePointerLeft(4);
						decreaseCellValue(1);
					}
					movePointerLeft(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(5);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(6);
						decreaseCellValue(1);
					}
					movePointerRight(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(6);
						increaseCellValue(1);
						movePointerRight(6);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(5);
						increaseCellValue(1);
						movePointerLeft(5);
						decreaseCellValue(1);
					}
					movePointerRight(3);
					increaseCellValue(2);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(3);
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(4);
							decreaseCellValue(1);
						}
						movePointerLeft(4);
						movePointerLeft(20);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerLeft(1);
						increaseCellValue(4);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(5);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(5);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerRight(1);
						increaseCellValue(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(20);
						movePointerLeft(20);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerLeft(1);
						increaseCellValue(4);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(5);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(5);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerRight(1);
						increaseCellValue(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(20);
						movePointerLeft(20);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						increaseCellValue(1);
						movePointerLeft(1);
						increaseCellValue(3);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(20);
						movePointerLeft(20);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						increaseCellValue(1);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(20);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(2);
							}
							movePointerRight(1);
							increaseCellValue(1);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(2);
							}
							movePointerLeft(2);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerRight(5);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(1);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						movePointerLeft(5);
						movePointerRight(3);
					}
					movePointerLeft(3);
					movePointerRight(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
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
					movePointerLeft(3);
					increaseCellValue(1);
					movePointerRight(3);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(4);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(4);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(5);
						decreaseCellValue(1);
					}
					movePointerRight(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(5);
						increaseCellValue(1);
						movePointerRight(5);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(4);
						increaseCellValue(1);
						movePointerLeft(4);
						decreaseCellValue(1);
					}
					movePointerLeft(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(5);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(6);
						decreaseCellValue(1);
					}
					movePointerRight(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(6);
						increaseCellValue(1);
						movePointerRight(6);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(5);
						increaseCellValue(1);
						movePointerLeft(5);
						decreaseCellValue(1);
					}
					movePointerRight(3);
					increaseCellValue(2);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(3);
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(4);
							decreaseCellValue(1);
						}
						movePointerLeft(4);
						movePointerLeft(20);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						increaseCellValue(1);
						movePointerLeft(1);
						increaseCellValue(4);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(20);
						movePointerLeft(20);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						increaseCellValue(1);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(20);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(2);
							}
							movePointerRight(1);
							increaseCellValue(1);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(2);
							}
							movePointerLeft(2);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerRight(5);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(1);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						movePointerLeft(5);
						movePointerRight(3);
					}
					movePointerLeft(3);
					movePointerRight(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
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
					movePointerLeft(3);
					increaseCellValue(1);
					movePointerRight(3);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(5);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(20);
					}
					movePointerRight(1);
					movePointerRight(20);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
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
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerRight(2);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerRight(20);
						movePointerLeft(1);
					}
					movePointerRight(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
					movePointerLeft(3);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerRight(3);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
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
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							increaseCellValue(1);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerLeft(20);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(6);
						increaseCellValue(1);
						movePointerRight(6);
						decreaseCellValue(1);
					}
					movePointerLeft(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(6);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(7);
						decreaseCellValue(1);
					}
					movePointerRight(7);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(7);
						increaseCellValue(1);
						movePointerRight(7);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					increaseCellValue(15);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					increaseCellValue(15);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					increaseCellValue(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(20);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerRight(1);
						increaseCellValue(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(20);
						decreaseCellValue(1);
					}
					movePointerRight(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
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
					movePointerLeft(3);
					increaseCellValue(1);
					movePointerRight(3);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(6);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(6);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(7);
						decreaseCellValue(1);
					}
					movePointerRight(7);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(7);
						increaseCellValue(1);
						movePointerRight(7);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					increaseCellValue(30);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					increaseCellValue(5);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(20);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerRight(1);
						increaseCellValue(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(20);
						decreaseCellValue(1);
					}
					movePointerRight(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
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
					movePointerLeft(3);
					increaseCellValue(1);
					movePointerRight(3);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(7);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(6);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(7);
						decreaseCellValue(1);
					}
					movePointerRight(7);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(7);
						increaseCellValue(1);
						movePointerRight(7);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					increaseCellValue(4);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(20);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerRight(1);
						increaseCellValue(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(20);
						decreaseCellValue(1);
					}
					movePointerRight(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
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
					movePointerLeft(3);
					increaseCellValue(1);
					movePointerRight(3);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(8);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(22);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(22);
					movePointerRight(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerLeft(3);
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
				movePointerLeft(4);
				increaseCellValue(1);
				movePointerRight(4);
				decreaseCellValue(1);
			}
			movePointerLeft(1);
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			increaseCellValue(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(1);
				decreaseCellValue(1);
				movePointerRight(1);
				decreaseCellValue(1);
			}
			movePointerLeft(1);
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(1);
				movePointerLeft(1);
				decreaseCellValue(1);
			}
			movePointerRight(1);
			decreaseCellValue(1);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
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
					movePointerLeft(3);
					increaseCellValue(1);
					movePointerRight(3);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(4);
					movePointerLeft(5);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(5);
					movePointerLeft(6);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(6);
					movePointerLeft(7);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(7);
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
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							increaseCellValue(1);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerLeft(21);
					}
					movePointerRight(1);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					movePointerRight(2);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(21);
						increaseCellValue(1);
						movePointerLeft(21);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerRight(2);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerRight(20);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(5);
						increaseCellValue(1);
						movePointerRight(5);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
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
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							increaseCellValue(1);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerLeft(21);
					}
					movePointerRight(1);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					movePointerRight(2);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(21);
						increaseCellValue(1);
						movePointerLeft(21);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerRight(2);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerRight(20);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(6);
						increaseCellValue(1);
						movePointerRight(6);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
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
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							increaseCellValue(1);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerLeft(21);
					}
					movePointerRight(1);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					movePointerRight(2);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(21);
						increaseCellValue(1);
						movePointerLeft(21);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerRight(2);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerRight(20);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(7);
						increaseCellValue(1);
						movePointerRight(7);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
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
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							increaseCellValue(1);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerLeft(21);
					}
					movePointerRight(1);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					movePointerRight(2);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(21);
						increaseCellValue(1);
						movePointerLeft(21);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerRight(2);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerRight(20);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(8);
						increaseCellValue(1);
						movePointerRight(8);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
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
					movePointerLeft(3);
					increaseCellValue(1);
					movePointerRight(3);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(2);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(4);
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
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							increaseCellValue(1);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerLeft(21);
					}
					movePointerRight(1);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					movePointerRight(2);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(21);
						increaseCellValue(1);
						movePointerLeft(21);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerRight(2);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerRight(20);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(5);
						increaseCellValue(1);
						movePointerRight(5);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(5);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(5);
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
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							increaseCellValue(1);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerLeft(21);
					}
					movePointerRight(1);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					movePointerRight(2);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(21);
						increaseCellValue(1);
						movePointerLeft(21);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerRight(2);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerRight(20);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(6);
						increaseCellValue(1);
						movePointerRight(6);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
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
					movePointerLeft(3);
					increaseCellValue(1);
					movePointerRight(3);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(3);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
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
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							increaseCellValue(1);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerLeft(21);
					}
					movePointerRight(1);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					movePointerRight(2);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(21);
						increaseCellValue(1);
						movePointerLeft(21);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerRight(2);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerRight(20);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(5);
						increaseCellValue(1);
						movePointerRight(5);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
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
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							increaseCellValue(1);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerLeft(21);
					}
					movePointerRight(1);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					movePointerRight(2);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(21);
						increaseCellValue(1);
						movePointerLeft(21);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerRight(2);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerRight(20);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(6);
						increaseCellValue(1);
						movePointerRight(6);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
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
					movePointerLeft(3);
					increaseCellValue(1);
					movePointerRight(3);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(5);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(6);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(6);
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
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							increaseCellValue(1);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerLeft(21);
					}
					movePointerRight(1);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					movePointerRight(2);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(21);
						increaseCellValue(1);
						movePointerLeft(21);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerRight(2);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerRight(20);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(7);
						increaseCellValue(1);
						movePointerRight(7);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
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
					movePointerLeft(3);
					increaseCellValue(1);
					movePointerRight(3);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(6);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(6);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(6);
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
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							increaseCellValue(1);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerLeft(21);
					}
					movePointerRight(1);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					movePointerRight(2);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(21);
						increaseCellValue(1);
						movePointerLeft(21);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerRight(2);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerRight(20);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(8);
						increaseCellValue(1);
						movePointerRight(8);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
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
					movePointerLeft(3);
					increaseCellValue(1);
					movePointerRight(3);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(4);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(4);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(18);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(1);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(23);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(9);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(14);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(7);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(6);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(2);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(1);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(6);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(2);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(18);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(5);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(3);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(20);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(1);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(14);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(7);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(12);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(5);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(6);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(2);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(1);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(20);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(7);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(2);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(7);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					decreaseCellValue(2);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(4);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(5);
						decreaseCellValue(1);
					}
					movePointerRight(4);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(4);
						increaseCellValue(1);
						movePointerRight(4);
						decreaseCellValue(1);
					}
					movePointerRight(1);
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
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerRight(2);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerRight(1);
						increaseCellValue(9);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							increaseCellValue(1);
							movePointerLeft(2);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								increaseCellValue(1);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
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
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(2);
								increaseCellValue(10);
								movePointerRight(2);
								decreaseCellValue(1);
							}
							movePointerLeft(2);
							decreaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						increaseCellValue(9);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							decreaseCellValue(1);
							movePointerRight(1);
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
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerRight(3);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(3);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerRight(1);
						increaseCellValue(9);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							increaseCellValue(1);
							movePointerLeft(2);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								increaseCellValue(1);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
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
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(2);
								increaseCellValue(10);
								movePointerRight(3);
								increaseCellValue(1);
								movePointerLeft(1);
								decreaseCellValue(1);
							}
							movePointerLeft(2);
							decreaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(4);
							decreaseCellValue(1);
						}
						movePointerLeft(4);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerRight(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						increaseCellValue(7);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(7);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(1);
						movePointerLeft(1);
						outputCurrentCell();
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerRight(2);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(4);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(5);
						decreaseCellValue(1);
					}
					movePointerRight(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(5);
						increaseCellValue(1);
						movePointerRight(5);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						increaseCellValue(1);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						increaseCellValue(7);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(7);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						decreaseCellValue(1);
						outputCurrentCell();
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(7);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(2);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(5);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(6);
						decreaseCellValue(1);
					}
					movePointerRight(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(5);
						increaseCellValue(1);
						movePointerRight(5);
						decreaseCellValue(1);
					}
					movePointerRight(1);
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
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerRight(2);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerRight(1);
						increaseCellValue(9);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							increaseCellValue(1);
							movePointerLeft(2);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								increaseCellValue(1);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
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
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(2);
								increaseCellValue(10);
								movePointerRight(2);
								decreaseCellValue(1);
							}
							movePointerLeft(2);
							decreaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						increaseCellValue(9);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							decreaseCellValue(1);
							movePointerRight(1);
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
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerRight(3);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(3);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerRight(1);
						increaseCellValue(9);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							increaseCellValue(1);
							movePointerLeft(2);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								increaseCellValue(1);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
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
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(2);
								increaseCellValue(10);
								movePointerRight(3);
								increaseCellValue(1);
								movePointerLeft(1);
								decreaseCellValue(1);
							}
							movePointerLeft(2);
							decreaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(4);
							decreaseCellValue(1);
						}
						movePointerLeft(4);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerRight(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						increaseCellValue(7);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(7);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(1);
						movePointerLeft(1);
						outputCurrentCell();
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerRight(2);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(5);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(6);
						decreaseCellValue(1);
					}
					movePointerRight(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(6);
						increaseCellValue(1);
						movePointerRight(6);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						increaseCellValue(1);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						increaseCellValue(7);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(7);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						decreaseCellValue(1);
						outputCurrentCell();
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(7);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					decreaseCellValue(1);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(7);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(2);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(6);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(2);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(23);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(9);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(4);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(20);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(8);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(6);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(2);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(6);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(7);
						decreaseCellValue(1);
					}
					movePointerRight(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(6);
						increaseCellValue(1);
						movePointerRight(6);
						decreaseCellValue(1);
					}
					movePointerRight(1);
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
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerRight(2);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerRight(1);
						increaseCellValue(9);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							increaseCellValue(1);
							movePointerLeft(2);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								increaseCellValue(1);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
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
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(2);
								increaseCellValue(10);
								movePointerRight(2);
								decreaseCellValue(1);
							}
							movePointerLeft(2);
							decreaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						increaseCellValue(9);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							decreaseCellValue(1);
							movePointerRight(1);
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
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerRight(3);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(3);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerRight(1);
						increaseCellValue(9);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							increaseCellValue(1);
							movePointerLeft(2);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								increaseCellValue(1);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
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
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(2);
								increaseCellValue(10);
								movePointerRight(3);
								increaseCellValue(1);
								movePointerLeft(1);
								decreaseCellValue(1);
							}
							movePointerLeft(2);
							decreaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(4);
							decreaseCellValue(1);
						}
						movePointerLeft(4);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerRight(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						increaseCellValue(7);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(7);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(1);
						movePointerLeft(1);
						outputCurrentCell();
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerRight(2);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(6);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(7);
						decreaseCellValue(1);
					}
					movePointerRight(7);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(7);
						increaseCellValue(1);
						movePointerRight(7);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						increaseCellValue(1);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						increaseCellValue(7);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(7);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						decreaseCellValue(1);
						outputCurrentCell();
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(7);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(2);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(6);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(2);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(8);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(5);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(9);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(7);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(8);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(20);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(6);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(2);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
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
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(7);
						increaseCellValue(1);
						movePointerRight(7);
						decreaseCellValue(1);
					}
					movePointerRight(1);
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
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerRight(2);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerRight(1);
						increaseCellValue(9);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							increaseCellValue(1);
							movePointerLeft(2);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								increaseCellValue(1);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
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
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(2);
								increaseCellValue(10);
								movePointerRight(2);
								decreaseCellValue(1);
							}
							movePointerLeft(2);
							decreaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						increaseCellValue(9);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							decreaseCellValue(1);
							movePointerRight(1);
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
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerRight(3);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(3);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerRight(1);
						increaseCellValue(9);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							increaseCellValue(1);
							movePointerLeft(2);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								increaseCellValue(1);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
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
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(2);
								increaseCellValue(10);
								movePointerRight(3);
								increaseCellValue(1);
								movePointerLeft(1);
								decreaseCellValue(1);
							}
							movePointerLeft(2);
							decreaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(4);
							decreaseCellValue(1);
						}
						movePointerLeft(4);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerRight(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						increaseCellValue(7);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(7);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(1);
						movePointerLeft(1);
						outputCurrentCell();
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerRight(2);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(7);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(7);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(8);
						decreaseCellValue(1);
					}
					movePointerRight(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(8);
						increaseCellValue(1);
						movePointerRight(8);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						increaseCellValue(1);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						increaseCellValue(7);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(7);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						decreaseCellValue(1);
						outputCurrentCell();
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(10);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerLeft(3);
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
				movePointerLeft(4);
				increaseCellValue(1);
				movePointerRight(4);
				decreaseCellValue(1);
			}
			movePointerLeft(1);
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			increaseCellValue(2);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(1);
				decreaseCellValue(1);
				movePointerRight(1);
				decreaseCellValue(1);
			}
			movePointerLeft(1);
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(1);
				movePointerLeft(1);
				decreaseCellValue(1);
			}
			movePointerRight(1);
			decreaseCellValue(1);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
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
					movePointerLeft(3);
					increaseCellValue(1);
					movePointerRight(3);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(4);
					movePointerLeft(5);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(5);
					movePointerLeft(6);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(6);
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
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							increaseCellValue(1);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerLeft(21);
					}
					movePointerRight(1);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					movePointerRight(2);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(21);
						increaseCellValue(1);
						movePointerLeft(21);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerRight(2);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerRight(20);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(5);
						increaseCellValue(1);
						movePointerRight(5);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
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
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							increaseCellValue(1);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerLeft(21);
					}
					movePointerRight(1);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					movePointerRight(2);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(21);
						increaseCellValue(1);
						movePointerLeft(21);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerRight(2);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerRight(20);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(6);
						increaseCellValue(1);
						movePointerRight(6);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
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
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							increaseCellValue(1);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerLeft(21);
					}
					movePointerRight(1);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					movePointerRight(2);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(21);
						increaseCellValue(1);
						movePointerLeft(21);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerRight(2);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerRight(20);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(7);
						increaseCellValue(1);
						movePointerRight(7);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
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
					movePointerLeft(3);
					increaseCellValue(1);
					movePointerRight(3);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(2);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(4);
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
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							increaseCellValue(1);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerLeft(21);
					}
					movePointerRight(1);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					movePointerRight(2);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(21);
						increaseCellValue(1);
						movePointerLeft(21);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerRight(2);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerRight(20);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(5);
						increaseCellValue(1);
						movePointerRight(5);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(5);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(5);
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
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							increaseCellValue(1);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerLeft(21);
					}
					movePointerRight(1);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					movePointerRight(2);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(21);
						increaseCellValue(1);
						movePointerLeft(21);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerRight(2);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerRight(20);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(6);
						increaseCellValue(1);
						movePointerRight(6);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
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
					movePointerLeft(3);
					increaseCellValue(1);
					movePointerRight(3);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(3);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
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
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							increaseCellValue(1);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerLeft(21);
					}
					movePointerRight(1);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					movePointerRight(2);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(21);
						increaseCellValue(1);
						movePointerLeft(21);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerRight(2);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerRight(20);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(5);
						increaseCellValue(1);
						movePointerRight(5);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
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
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							increaseCellValue(1);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerLeft(21);
					}
					movePointerRight(1);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					movePointerRight(2);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(21);
						increaseCellValue(1);
						movePointerLeft(21);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerRight(2);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerRight(20);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(6);
						increaseCellValue(1);
						movePointerRight(6);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
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
					movePointerLeft(3);
					increaseCellValue(1);
					movePointerRight(3);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(5);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(6);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(6);
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
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(20);
							increaseCellValue(1);
							movePointerRight(20);
							decreaseCellValue(1);
						}
						movePointerLeft(21);
					}
					movePointerRight(1);
					movePointerLeft(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
					}
					movePointerRight(2);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
						}
						movePointerLeft(2);
						movePointerRight(21);
						increaseCellValue(1);
						movePointerLeft(21);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
						}
						movePointerRight(2);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
					}
					movePointerLeft(2);
					movePointerRight(20);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(20);
							increaseCellValue(1);
							movePointerLeft(20);
							decreaseCellValue(1);
						}
						movePointerRight(20);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(7);
						increaseCellValue(1);
						movePointerRight(7);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
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
					movePointerLeft(3);
					increaseCellValue(1);
					movePointerRight(3);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(4);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(4);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(18);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(1);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(23);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(9);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(14);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(7);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(6);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(2);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(1);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(6);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(2);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(3);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(9);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(18);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(3);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(12);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(5);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(6);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(2);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(1);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(20);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(7);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(2);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(7);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					decreaseCellValue(2);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(4);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(5);
						decreaseCellValue(1);
					}
					movePointerRight(4);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(4);
						increaseCellValue(1);
						movePointerRight(4);
						decreaseCellValue(1);
					}
					movePointerRight(1);
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
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerRight(2);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerRight(1);
						increaseCellValue(9);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							increaseCellValue(1);
							movePointerLeft(2);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								increaseCellValue(1);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
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
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(2);
								increaseCellValue(10);
								movePointerRight(2);
								decreaseCellValue(1);
							}
							movePointerLeft(2);
							decreaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						increaseCellValue(9);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							decreaseCellValue(1);
							movePointerRight(1);
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
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerRight(3);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(3);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerRight(1);
						increaseCellValue(9);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							increaseCellValue(1);
							movePointerLeft(2);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								increaseCellValue(1);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
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
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(2);
								increaseCellValue(10);
								movePointerRight(3);
								increaseCellValue(1);
								movePointerLeft(1);
								decreaseCellValue(1);
							}
							movePointerLeft(2);
							decreaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(4);
							decreaseCellValue(1);
						}
						movePointerLeft(4);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerRight(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						increaseCellValue(7);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(7);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(1);
						movePointerLeft(1);
						outputCurrentCell();
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerRight(2);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(4);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(5);
						decreaseCellValue(1);
					}
					movePointerRight(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(5);
						increaseCellValue(1);
						movePointerRight(5);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						increaseCellValue(1);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						increaseCellValue(7);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(7);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						decreaseCellValue(1);
						outputCurrentCell();
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(7);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(2);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(5);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(6);
						decreaseCellValue(1);
					}
					movePointerRight(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(5);
						increaseCellValue(1);
						movePointerRight(5);
						decreaseCellValue(1);
					}
					movePointerRight(1);
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
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerRight(2);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerRight(1);
						increaseCellValue(9);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							increaseCellValue(1);
							movePointerLeft(2);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								increaseCellValue(1);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
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
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(2);
								increaseCellValue(10);
								movePointerRight(2);
								decreaseCellValue(1);
							}
							movePointerLeft(2);
							decreaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						increaseCellValue(9);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							decreaseCellValue(1);
							movePointerRight(1);
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
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerRight(3);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(3);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerRight(1);
						increaseCellValue(9);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							increaseCellValue(1);
							movePointerLeft(2);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								increaseCellValue(1);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
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
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(2);
								increaseCellValue(10);
								movePointerRight(3);
								increaseCellValue(1);
								movePointerLeft(1);
								decreaseCellValue(1);
							}
							movePointerLeft(2);
							decreaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(4);
							decreaseCellValue(1);
						}
						movePointerLeft(4);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerRight(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						increaseCellValue(7);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(7);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(1);
						movePointerLeft(1);
						outputCurrentCell();
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerRight(2);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(5);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(6);
						decreaseCellValue(1);
					}
					movePointerRight(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(6);
						increaseCellValue(1);
						movePointerRight(6);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						increaseCellValue(1);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						increaseCellValue(7);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(7);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						decreaseCellValue(1);
						outputCurrentCell();
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(7);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					decreaseCellValue(1);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(7);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(2);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(6);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(2);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(18);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(1);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(4);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(9);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(21);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(8);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(19);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(6);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					increaseCellValue(2);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(6);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(7);
						decreaseCellValue(1);
					}
					movePointerRight(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(6);
						increaseCellValue(1);
						movePointerRight(6);
						decreaseCellValue(1);
					}
					movePointerRight(1);
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
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerRight(2);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerRight(1);
						increaseCellValue(9);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							increaseCellValue(1);
							movePointerLeft(2);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								increaseCellValue(1);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
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
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(2);
								increaseCellValue(10);
								movePointerRight(2);
								decreaseCellValue(1);
							}
							movePointerLeft(2);
							decreaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						increaseCellValue(9);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							decreaseCellValue(1);
							movePointerRight(1);
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
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerRight(3);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(3);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerRight(1);
						increaseCellValue(9);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							increaseCellValue(1);
							movePointerLeft(2);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								increaseCellValue(1);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
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
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(2);
								increaseCellValue(10);
								movePointerRight(3);
								increaseCellValue(1);
								movePointerLeft(1);
								decreaseCellValue(1);
							}
							movePointerLeft(2);
							decreaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(4);
							decreaseCellValue(1);
						}
						movePointerLeft(4);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerRight(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						increaseCellValue(7);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(7);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(1);
						movePointerLeft(1);
						outputCurrentCell();
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerRight(2);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(6);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(7);
						decreaseCellValue(1);
					}
					movePointerRight(7);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(7);
						increaseCellValue(1);
						movePointerRight(7);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						increaseCellValue(1);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						increaseCellValue(7);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(7);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						decreaseCellValue(1);
						outputCurrentCell();
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(10);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
				}
				movePointerLeft(1);
				movePointerRight(1);
			}
			movePointerLeft(1);
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(20);
			}
			movePointerRight(1);
			movePointerLeft(22);
		}
		while((getCellValue() & 0xFF) != 0) {
			outputCurrentCell();
			outputCurrentCell();
		}
	}

	public static void main(String[] args) {
		new OOBrain();
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
