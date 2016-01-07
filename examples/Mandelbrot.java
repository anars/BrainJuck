public class Mandelbrot {
	private byte[] _array = new byte[0];
	private int _pointer = 0;
	
	public Mandelbrot() {
		increaseCellValue(13);
		while((getCellValue() & 0xFF) != 0) {
			decreaseCellValue(1);
			movePointerRight(1);
			increaseCellValue(2);
			movePointerRight(3);
			increaseCellValue(5);
			movePointerRight(1);
			increaseCellValue(2);
			movePointerRight(1);
			increaseCellValue(1);
			movePointerLeft(6);
		}
		movePointerRight(5);
		increaseCellValue(6);
		movePointerRight(1);
		decreaseCellValue(3);
		movePointerRight(10);
		increaseCellValue(15);
		while((getCellValue() & 0xFF) != 0) {
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(9);
			}
			increaseCellValue(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(9);
			}
			movePointerRight(9);
			decreaseCellValue(1);
		}
		increaseCellValue(1);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(8);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerRight(1);
		}
		movePointerLeft(9);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(9);
		}
		movePointerRight(8);
		while((getCellValue() & 0xFF) != 0) {
			decreaseCellValue(1);
		}
		increaseCellValue(1);
		movePointerLeft(7);
		increaseCellValue(5);
		while((getCellValue() & 0xFF) != 0) {
			decreaseCellValue(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerRight(9);
				increaseCellValue(1);
				movePointerLeft(9);
			}
			movePointerRight(9);
		}
		movePointerRight(7);
		increaseCellValue(1);
		movePointerRight(26);
		movePointerRight(1);
		increaseCellValue(1);
		movePointerLeft(17);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(9);
		}
		movePointerRight(3);
		while((getCellValue() & 0xFF) != 0) {
			decreaseCellValue(1);
		}
		increaseCellValue(1);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(6);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(7);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(2);
			}
			movePointerLeft(9);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(9);
			}
			movePointerRight(2);
			movePointerRight(5);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			increaseCellValue(1);
			movePointerLeft(6);
			increaseCellValue(4);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(9);
					increaseCellValue(1);
					movePointerLeft(9);
				}
				movePointerRight(9);
			}
			movePointerRight(6);
			increaseCellValue(1);
			movePointerLeft(6);
			increaseCellValue(7);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(3);
					movePointerRight(6);
					increaseCellValue(1);
					movePointerLeft(9);
				}
				movePointerRight(9);
			}
			movePointerRight(6);
			increaseCellValue(1);
			movePointerLeft(16);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(9);
			}
			movePointerRight(3);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(6);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(5);
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(6);
						increaseCellValue(1);
						movePointerRight(6);
					}
					movePointerLeft(6);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(6);
						increaseCellValue(1);
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerLeft(3);
						increaseCellValue(1);
						movePointerLeft(1);
					}
					movePointerRight(8);
				}
				movePointerLeft(9);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(9);
				}
				movePointerRight(9);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(8);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(7);
						increaseCellValue(1);
						movePointerRight(7);
					}
					movePointerLeft(7);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(7);
						increaseCellValue(1);
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerLeft(3);
						increaseCellValue(1);
						movePointerLeft(2);
					}
					movePointerRight(8);
				}
				movePointerLeft(9);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(7);
					movePointerLeft(2);
				}
				movePointerRight(7);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(7);
					increaseCellValue(1);
					movePointerRight(7);
				}
				movePointerLeft(7);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(7);
					increaseCellValue(1);
					movePointerLeft(2);
					increaseCellValue(1);
					movePointerLeft(5);
				}
				movePointerRight(9);
				increaseCellValue(15);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(9);
					}
					increaseCellValue(1);
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
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(9);
					decreaseCellValue(1);
				}
				increaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					increaseCellValue(1);
					movePointerRight(8);
				}
				movePointerLeft(9);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(9);
				}
				movePointerRight(9);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					decreaseCellValue(1);
					movePointerRight(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(4);
						increaseCellValue(1);
						movePointerRight(4);
					}
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(4);
						increaseCellValue(1);
						movePointerLeft(5);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(2);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(2);
								increaseCellValue(1);
								movePointerRight(2);
							}
							movePointerLeft(2);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(2);
								increaseCellValue(1);
								movePointerRight(2);
								increaseCellValue(1);
								movePointerLeft(4);
							}
							increaseCellValue(1);
							movePointerRight(9);
						}
						movePointerLeft(8);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(9);
						}
					}
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(9);
					}
					movePointerLeft(7);
					movePointerLeft(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(9);
							increaseCellValue(1);
							movePointerLeft(9);
						}
						movePointerLeft(10);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(9);
						increaseCellValue(1);
						movePointerLeft(9);
					}
					movePointerLeft(1);
					increaseCellValue(1);
					movePointerRight(8);
				}
				movePointerLeft(9);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(4);
						increaseCellValue(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							decreaseCellValue(1);
							movePointerRight(1);
							decreaseCellValue(1);
							movePointerLeft(6);
							increaseCellValue(1);
							movePointerRight(6);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
						}
						movePointerRight(4);
					}
					movePointerLeft(3);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(3);
						increaseCellValue(1);
						movePointerLeft(3);
					}
					movePointerLeft(1);
					increaseCellValue(1);
					movePointerLeft(9);
				}
				movePointerRight(5);
				movePointerRight(4);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					increaseCellValue(1);
					movePointerRight(8);
				}
				movePointerLeft(9);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(9);
				}
				movePointerRight(9);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					decreaseCellValue(1);
					movePointerRight(5);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(5);
						increaseCellValue(1);
						movePointerRight(5);
					}
					movePointerLeft(5);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(5);
						increaseCellValue(1);
						movePointerLeft(6);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(3);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(3);
								increaseCellValue(1);
								movePointerRight(3);
							}
							movePointerLeft(3);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(3);
								increaseCellValue(1);
								movePointerRight(1);
								increaseCellValue(1);
								movePointerLeft(4);
							}
							increaseCellValue(1);
							movePointerRight(9);
						}
						movePointerLeft(8);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(9);
						}
					}
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
						movePointerRight(7);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(9);
							increaseCellValue(1);
							movePointerLeft(9);
						}
						movePointerLeft(11);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(9);
						increaseCellValue(1);
						movePointerLeft(9);
					}
					movePointerLeft(2);
					increaseCellValue(1);
					movePointerRight(8);
				}
				movePointerLeft(9);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(4);
						increaseCellValue(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							decreaseCellValue(1);
							movePointerRight(1);
							decreaseCellValue(1);
							movePointerLeft(6);
							increaseCellValue(1);
							movePointerRight(6);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
						}
						movePointerRight(4);
					}
					movePointerLeft(3);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(3);
						increaseCellValue(1);
						movePointerLeft(2);
						movePointerLeft(1);
					}
					movePointerLeft(1);
					increaseCellValue(1);
					movePointerLeft(9);
				}
				movePointerRight(9);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(36);
						increaseCellValue(1);
						movePointerRight(13);
						movePointerRight(23);
					}
					movePointerRight(5);
				}
				movePointerLeft(9);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(9);
				}
				movePointerRight(9);
				increaseCellValue(15);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(4);
						movePointerRight(5);
					}
					movePointerLeft(9);
					decreaseCellValue(1);
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(9);
					decreaseCellValue(1);
				}
				increaseCellValue(1);
				movePointerRight(21);
				increaseCellValue(1);
				movePointerLeft(3);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(6);
					movePointerLeft(3);
				}
				movePointerRight(9);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(3);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(3);
						decreaseCellValue(1);
						movePointerRight(3);
					}
					increaseCellValue(1);
					movePointerLeft(3);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(3);
						decreaseCellValue(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(4);
						}
						movePointerLeft(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(4);
							increaseCellValue(1);
							movePointerLeft(13);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(5);
								movePointerLeft(4);
							}
							movePointerRight(4);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
							}
							increaseCellValue(1);
							movePointerRight(5);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(9);
							}
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
						}
					}
					increaseCellValue(1);
					movePointerRight(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(4);
						decreaseCellValue(1);
						movePointerRight(4);
					}
					increaseCellValue(1);
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(4);
						decreaseCellValue(1);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(3);
						}
						movePointerLeft(3);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(1);
							movePointerRight(2);
							increaseCellValue(1);
							movePointerLeft(12);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(9);
							}
							movePointerRight(3);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
							}
							increaseCellValue(1);
							movePointerRight(6);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(9);
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
							}
							increaseCellValue(1);
							movePointerLeft(1);
						}
					}
					increaseCellValue(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(9);
						}
						movePointerLeft(6);
						movePointerLeft(2);
					}
					movePointerRight(8);
				}
				movePointerLeft(9);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(9);
				}
				movePointerLeft(7);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(1);
					increaseCellValue(1);
					movePointerRight(3);
					decreaseCellValue(1);
					movePointerLeft(4);
				}
				movePointerRight(9);
				increaseCellValue(19);
				increaseCellValue(7);
				movePointerRight(2);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(4);
					increaseCellValue(1);
					movePointerRight(4);
				}
				movePointerLeft(4);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(4);
					increaseCellValue(1);
					movePointerLeft(2);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(2);
				}
				movePointerRight(2);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(7);
					increaseCellValue(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerRight(4);
						increaseCellValue(1);
						movePointerLeft(2);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(2);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(1);
							increaseCellValue(1);
							movePointerRight(3);
							decreaseCellValue(1);
							movePointerLeft(4);
						}
						movePointerRight(3);
					}
					movePointerRight(13);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
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
						movePointerRight(5);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(3);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(5);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(4);
						}
						movePointerLeft(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(4);
							increaseCellValue(1);
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerLeft(1);
						}
						movePointerRight(8);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(8);
							movePointerLeft(1);
							increaseCellValue(1);
							movePointerRight(9);
						}
						movePointerRight(7);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(9);
					increaseCellValue(15);
					while((getCellValue() & 0xFF) != 0) {
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(9);
						}
						increaseCellValue(1);
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
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(9);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(9);
						}
						movePointerRight(9);
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						increaseCellValue(1);
						movePointerRight(8);
					}
					movePointerLeft(3);
					movePointerLeft(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						decreaseCellValue(1);
						movePointerRight(5);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(5);
							increaseCellValue(1);
							movePointerRight(5);
						}
						movePointerLeft(5);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(5);
							increaseCellValue(1);
							movePointerLeft(6);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(2);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerLeft(2);
									increaseCellValue(1);
									movePointerRight(2);
								}
								movePointerLeft(1);
								movePointerLeft(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(2);
									increaseCellValue(1);
									movePointerRight(1);
									increaseCellValue(1);
									movePointerLeft(3);
								}
								increaseCellValue(1);
								movePointerRight(9);
							}
							movePointerLeft(8);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(9);
							}
						}
						movePointerRight(9);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(9);
						}
						movePointerLeft(9);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(4);
								movePointerRight(5);
								increaseCellValue(1);
								movePointerLeft(9);
							}
							movePointerLeft(10);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(9);
							increaseCellValue(1);
							movePointerLeft(9);
						}
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerRight(8);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(3);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(1);
								decreaseCellValue(1);
								movePointerRight(1);
								decreaseCellValue(1);
								movePointerLeft(7);
								increaseCellValue(1);
								movePointerRight(7);
							}
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(1);
								increaseCellValue(1);
								movePointerLeft(1);
							}
							movePointerRight(3);
						}
						movePointerLeft(2);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(2);
							increaseCellValue(1);
							movePointerLeft(2);
						}
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerLeft(9);
					}
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(6);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(1);
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(5);
						}
						movePointerLeft(5);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(5);
							increaseCellValue(1);
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerLeft(1);
						}
						movePointerRight(8);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						increaseCellValue(1);
						movePointerRight(8);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						decreaseCellValue(1);
						movePointerRight(5);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(5);
							increaseCellValue(1);
							movePointerRight(5);
						}
						movePointerLeft(5);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(5);
							increaseCellValue(1);
							movePointerLeft(6);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(2);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerLeft(2);
									increaseCellValue(1);
									movePointerRight(2);
								}
								movePointerLeft(2);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(2);
									increaseCellValue(1);
									movePointerRight(2);
									increaseCellValue(1);
									movePointerLeft(4);
								}
								increaseCellValue(1);
								movePointerRight(9);
							}
							movePointerLeft(8);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(9);
							}
						}
						movePointerRight(9);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(9);
						}
						movePointerLeft(9);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(9);
								increaseCellValue(1);
								movePointerLeft(9);
							}
							movePointerLeft(10);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(9);
							increaseCellValue(1);
							movePointerLeft(9);
						}
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerRight(8);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(1);
								decreaseCellValue(1);
								movePointerRight(1);
								decreaseCellValue(1);
								movePointerLeft(6);
								increaseCellValue(1);
								movePointerRight(6);
							}
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(1);
								increaseCellValue(1);
								movePointerLeft(1);
							}
							movePointerRight(4);
						}
						movePointerLeft(3);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(3);
							increaseCellValue(1);
							movePointerLeft(3);
						}
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerLeft(9);
					}
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(36);
							increaseCellValue(1);
							movePointerRight(36);
						}
						movePointerRight(5);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(3);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(36);
							increaseCellValue(1);
							movePointerRight(1);
							movePointerRight(35);
						}
						movePointerRight(6);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(9);
					increaseCellValue(8);
					increaseCellValue(7);
					while((getCellValue() & 0xFF) != 0) {
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(9);
						}
						movePointerLeft(9);
						decreaseCellValue(1);
						movePointerLeft(9);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(9);
						}
						movePointerRight(9);
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(8);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(7);
							increaseCellValue(1);
							movePointerRight(7);
						}
						movePointerLeft(7);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(7);
							increaseCellValue(1);
							movePointerLeft(6);
							increaseCellValue(1);
							movePointerLeft(1);
						}
						movePointerRight(8);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(6);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(3);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(4);
					increaseCellValue(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerLeft(4);
						increaseCellValue(1);
						movePointerRight(5);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(6);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(5);
							increaseCellValue(1);
							movePointerLeft(1);
							increaseCellValue(2);
							movePointerLeft(4);
						}
						movePointerRight(5);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(1);
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(5);
						}
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerRight(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(1);
					}
					movePointerLeft(5);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(5);
						increaseCellValue(1);
						movePointerLeft(5);
					}
					movePointerRight(6);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(6);
					increaseCellValue(1);
					movePointerRight(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(4);
						decreaseCellValue(1);
						movePointerRight(4);
					}
					increaseCellValue(1);
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(4);
						decreaseCellValue(1);
						movePointerRight(5);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(2);
								decreaseCellValue(1);
								movePointerRight(2);
							}
							increaseCellValue(1);
							movePointerLeft(2);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(2);
								decreaseCellValue(1);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerLeft(3);
									increaseCellValue(1);
									movePointerRight(3);
								}
								movePointerLeft(3);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(3);
									increaseCellValue(1);
									movePointerLeft(12);
									while((getCellValue() & 0xFF) != 0) {
										movePointerLeft(9);
									}
									movePointerRight(3);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
									}
									increaseCellValue(1);
									movePointerRight(6);
									while((getCellValue() & 0xFF) != 0) {
										movePointerRight(9);
									}
									movePointerRight(1);
									increaseCellValue(1);
									movePointerLeft(1);
								}
							}
							increaseCellValue(1);
							movePointerRight(3);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(3);
								decreaseCellValue(1);
								movePointerRight(3);
							}
							increaseCellValue(1);
							movePointerLeft(3);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(3);
								decreaseCellValue(1);
								movePointerLeft(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerLeft(2);
									increaseCellValue(1);
									movePointerRight(2);
								}
								movePointerLeft(2);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(2);
									increaseCellValue(1);
									movePointerLeft(11);
									while((getCellValue() & 0xFF) != 0) {
										movePointerLeft(5);
										movePointerLeft(4);
									}
									movePointerRight(4);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
									}
									increaseCellValue(1);
									movePointerRight(5);
									while((getCellValue() & 0xFF) != 0) {
										movePointerRight(9);
									}
									movePointerRight(1);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
									}
									increaseCellValue(1);
									movePointerLeft(1);
								}
							}
							increaseCellValue(1);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(1);
								while((getCellValue() & 0xFF) != 0) {
									movePointerRight(9);
								}
								movePointerLeft(8);
							}
							movePointerRight(8);
						}
						movePointerLeft(9);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(9);
						}
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(4);
						}
						movePointerLeft(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(4);
							increaseCellValue(1);
							movePointerRight(5);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								increaseCellValue(1);
								movePointerRight(2);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerLeft(2);
									decreaseCellValue(1);
									movePointerRight(2);
								}
								movePointerLeft(2);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(2);
									increaseCellValue(1);
									movePointerLeft(2);
								}
								movePointerRight(8);
							}
							movePointerLeft(5);
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(5);
									increaseCellValue(1);
									movePointerLeft(4);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										movePointerRight(4);
										decreaseCellValue(1);
										movePointerLeft(14);
										increaseCellValue(1);
										movePointerRight(11);
										while((getCellValue() & 0xFF) != 0) {
											decreaseCellValue(1);
											movePointerRight(3);
											increaseCellValue(1);
											movePointerLeft(3);
										}
										movePointerLeft(1);
									}
									movePointerRight(1);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										movePointerRight(3);
										decreaseCellValue(1);
										movePointerLeft(9);
										movePointerLeft(5);
										increaseCellValue(1);
										movePointerRight(11);
									}
									movePointerLeft(2);
								}
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(4);
									increaseCellValue(1);
									movePointerLeft(3);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										movePointerRight(3);
										decreaseCellValue(1);
										movePointerLeft(14);
										increaseCellValue(1);
										movePointerRight(11);
									}
									movePointerLeft(1);
								}
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(3);
									increaseCellValue(1);
									movePointerLeft(3);
								}
								movePointerLeft(2);
								movePointerLeft(10);
							}
							movePointerRight(4);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
							}
							movePointerLeft(4);
						}
						movePointerRight(3);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(3);
						}
						movePointerLeft(3);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(3);
							increaseCellValue(1);
							movePointerRight(6);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								increaseCellValue(1);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerLeft(1);
									decreaseCellValue(1);
									movePointerRight(1);
								}
								movePointerLeft(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(1);
									increaseCellValue(1);
									movePointerLeft(1);
								}
								movePointerRight(8);
							}
							movePointerLeft(3);
							movePointerLeft(5);
							increaseCellValue(1);
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(5);
									increaseCellValue(1);
									movePointerLeft(3);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										movePointerRight(3);
										decreaseCellValue(1);
										movePointerLeft(14);
										increaseCellValue(1);
										movePointerRight(10);
										while((getCellValue() & 0xFF) != 0) {
											decreaseCellValue(1);
											movePointerRight(4);
											increaseCellValue(1);
											movePointerLeft(4);
										}
										movePointerRight(1);
									}
									movePointerLeft(1);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										movePointerRight(4);
										decreaseCellValue(1);
										movePointerLeft(7);
										movePointerLeft(7);
										increaseCellValue(1);
										movePointerRight(10);
									}
									movePointerLeft(1);
								}
								movePointerRight(2);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(3);
									increaseCellValue(1);
									movePointerLeft(4);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										movePointerRight(4);
										decreaseCellValue(1);
										movePointerLeft(14);
										increaseCellValue(1);
										movePointerRight(10);
									}
									movePointerRight(1);
								}
								movePointerLeft(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(4);
									increaseCellValue(1);
									movePointerLeft(4);
								}
								movePointerLeft(11);
							}
							movePointerRight(6);
							increaseCellValue(1);
							movePointerLeft(6);
						}
					}
					movePointerRight(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(4);
						increaseCellValue(1);
						movePointerRight(4);
					}
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(4);
						increaseCellValue(1);
						movePointerRight(5);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(9);
						}
						movePointerLeft(9);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(5);
								increaseCellValue(1);
								movePointerLeft(4);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(4);
									decreaseCellValue(1);
									movePointerLeft(14);
									increaseCellValue(1);
									movePointerRight(11);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										movePointerRight(3);
										increaseCellValue(1);
										movePointerLeft(3);
									}
									movePointerLeft(1);
								}
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(3);
									decreaseCellValue(1);
									movePointerLeft(14);
									increaseCellValue(1);
									movePointerRight(11);
								}
								movePointerLeft(2);
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(4);
								increaseCellValue(1);
								movePointerLeft(3);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(3);
									decreaseCellValue(1);
									movePointerLeft(14);
									increaseCellValue(1);
									movePointerRight(11);
								}
								movePointerLeft(1);
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(3);
								increaseCellValue(1);
								movePointerLeft(3);
							}
							movePointerLeft(7);
							movePointerLeft(5);
						}
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(6);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(5);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(1);
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(4);
						}
						movePointerLeft(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(4);
							increaseCellValue(1);
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerLeft(1);
						}
						movePointerRight(8);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(9);
					increaseCellValue(15);
					while((getCellValue() & 0xFF) != 0) {
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(9);
						}
						increaseCellValue(1);
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
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(9);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(9);
						}
						movePointerRight(9);
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						increaseCellValue(1);
						movePointerRight(8);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						decreaseCellValue(1);
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(4);
						}
						movePointerLeft(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(4);
							increaseCellValue(1);
							movePointerLeft(5);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(2);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerLeft(2);
									increaseCellValue(1);
									movePointerRight(2);
								}
								movePointerLeft(2);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(2);
									increaseCellValue(1);
									movePointerRight(1);
									increaseCellValue(1);
									movePointerLeft(3);
								}
								increaseCellValue(1);
								movePointerRight(9);
							}
							movePointerLeft(8);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(9);
							}
						}
						movePointerRight(9);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(9);
						}
						movePointerLeft(8);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(9);
								increaseCellValue(1);
								movePointerLeft(9);
							}
							movePointerLeft(10);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(9);
							increaseCellValue(1);
							movePointerLeft(9);
						}
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerRight(8);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(3);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(1);
								decreaseCellValue(1);
								movePointerRight(1);
								decreaseCellValue(1);
								movePointerLeft(7);
								increaseCellValue(1);
								movePointerRight(7);
							}
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(1);
								increaseCellValue(1);
								movePointerLeft(1);
							}
							movePointerRight(3);
						}
						movePointerLeft(2);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(2);
							increaseCellValue(1);
							movePointerLeft(2);
						}
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerLeft(9);
					}
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(3);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(36);
							increaseCellValue(1);
							movePointerRight(36);
						}
						movePointerRight(1);
						movePointerRight(5);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(5);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(4);
					increaseCellValue(15);
					while((getCellValue() & 0xFF) != 0) {
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(9);
						}
						movePointerLeft(9);
						decreaseCellValue(1);
						movePointerLeft(5);
						movePointerLeft(4);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(9);
						}
						movePointerRight(9);
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(3);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(3);
							decreaseCellValue(1);
							movePointerRight(3);
						}
						increaseCellValue(1);
						movePointerLeft(3);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(3);
							decreaseCellValue(1);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(4);
								increaseCellValue(1);
								movePointerRight(4);
							}
							movePointerLeft(4);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(4);
								increaseCellValue(1);
								movePointerLeft(5);
								movePointerLeft(8);
								while((getCellValue() & 0xFF) != 0) {
									movePointerLeft(9);
								}
								movePointerRight(4);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
								}
								increaseCellValue(1);
								movePointerRight(5);
								while((getCellValue() & 0xFF) != 0) {
									movePointerRight(9);
								}
								movePointerRight(1);
								increaseCellValue(1);
								movePointerLeft(1);
							}
						}
						increaseCellValue(1);
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(4);
							decreaseCellValue(1);
							movePointerRight(4);
						}
						increaseCellValue(1);
						movePointerLeft(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(4);
							decreaseCellValue(1);
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(3);
								increaseCellValue(1);
								movePointerRight(3);
							}
							movePointerLeft(3);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(3);
								increaseCellValue(1);
								movePointerLeft(12);
								while((getCellValue() & 0xFF) != 0) {
									movePointerLeft(9);
								}
								movePointerRight(3);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
								}
								increaseCellValue(1);
								movePointerRight(6);
								while((getCellValue() & 0xFF) != 0) {
									movePointerRight(9);
								}
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
								}
								increaseCellValue(1);
								movePointerLeft(1);
							}
						}
						increaseCellValue(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(2);
								movePointerRight(7);
							}
							movePointerLeft(8);
						}
						movePointerRight(8);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(3);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(3);
						increaseCellValue(1);
						movePointerRight(3);
					}
					movePointerLeft(3);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(3);
						increaseCellValue(1);
						movePointerRight(6);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerRight(3);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(3);
								decreaseCellValue(1);
								movePointerRight(3);
							}
							movePointerLeft(3);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(3);
								increaseCellValue(1);
								movePointerLeft(3);
							}
							movePointerRight(8);
						}
						movePointerLeft(8);
						increaseCellValue(1);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(1);
								increaseCellValue(1);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerLeft(1);
									decreaseCellValue(1);
									movePointerLeft(10);
									increaseCellValue(1);
									movePointerRight(12);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										movePointerLeft(2);
										increaseCellValue(1);
										movePointerRight(2);
									}
									movePointerLeft(1);
								}
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerLeft(2);
									decreaseCellValue(1);
									movePointerLeft(10);
									increaseCellValue(1);
									movePointerRight(12);
								}
								movePointerLeft(3);
							}
							movePointerRight(2);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(1);
								increaseCellValue(1);
								movePointerRight(2);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerLeft(2);
									decreaseCellValue(1);
									movePointerLeft(10);
									increaseCellValue(1);
									movePointerRight(12);
								}
								movePointerLeft(1);
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(2);
								increaseCellValue(1);
								movePointerRight(2);
							}
							movePointerLeft(13);
						}
					}
					movePointerRight(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(4);
						increaseCellValue(1);
						movePointerRight(4);
					}
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(4);
						increaseCellValue(1);
						movePointerRight(5);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerRight(2);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(2);
								decreaseCellValue(1);
								movePointerRight(2);
							}
							movePointerLeft(2);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(2);
								increaseCellValue(1);
								movePointerLeft(2);
							}
							movePointerRight(2);
							movePointerRight(6);
						}
						movePointerLeft(8);
						increaseCellValue(1);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(1);
								increaseCellValue(1);
								movePointerRight(2);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerLeft(2);
									decreaseCellValue(1);
									movePointerLeft(10);
									increaseCellValue(1);
									movePointerRight(11);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										movePointerLeft(1);
										increaseCellValue(1);
										movePointerRight(1);
									}
									movePointerRight(1);
								}
								movePointerLeft(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerLeft(1);
									decreaseCellValue(1);
									movePointerLeft(10);
									increaseCellValue(1);
									movePointerRight(4);
									movePointerRight(7);
								}
								movePointerLeft(2);
							}
							movePointerRight(3);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(2);
								increaseCellValue(1);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerLeft(1);
									decreaseCellValue(1);
									movePointerLeft(10);
									increaseCellValue(1);
									movePointerRight(11);
								}
								movePointerRight(1);
							}
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(1);
								increaseCellValue(1);
								movePointerRight(1);
							}
							movePointerLeft(12);
						}
						movePointerRight(5);
						increaseCellValue(1);
						movePointerLeft(5);
					}
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(3);
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
						movePointerRight(4);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(3);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(7);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(5);
							movePointerLeft(1);
							increaseCellValue(1);
							movePointerRight(6);
						}
						movePointerLeft(6);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(6);
							increaseCellValue(1);
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerLeft(2);
						}
						movePointerRight(8);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(4);
					increaseCellValue(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerLeft(4);
						increaseCellValue(1);
						movePointerRight(4);
						movePointerRight(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(7);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(5);
							increaseCellValue(1);
							movePointerLeft(1);
							increaseCellValue(2);
							movePointerLeft(4);
						}
						movePointerRight(5);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(5);
							increaseCellValue(1);
							movePointerRight(5);
						}
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerRight(2);
					}
					movePointerLeft(2);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(2);
						increaseCellValue(1);
						movePointerLeft(2);
					}
					movePointerLeft(5);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(5);
						increaseCellValue(1);
						movePointerLeft(2);
						movePointerLeft(3);
					}
					increaseCellValue(1);
					movePointerRight(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(4);
						decreaseCellValue(1);
						movePointerRight(4);
					}
					increaseCellValue(1);
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(4);
						decreaseCellValue(1);
						movePointerRight(5);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(3);
								decreaseCellValue(1);
								movePointerRight(3);
							}
							increaseCellValue(1);
							movePointerLeft(3);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(3);
								decreaseCellValue(1);
								movePointerLeft(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerLeft(2);
									increaseCellValue(1);
									movePointerRight(2);
								}
								movePointerLeft(2);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(2);
									increaseCellValue(1);
									movePointerLeft(2);
									movePointerLeft(9);
									while((getCellValue() & 0xFF) != 0) {
										movePointerLeft(9);
									}
									movePointerRight(4);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
									}
									increaseCellValue(1);
									movePointerRight(5);
									while((getCellValue() & 0xFF) != 0) {
										movePointerRight(9);
									}
									movePointerRight(1);
									increaseCellValue(1);
									movePointerLeft(1);
								}
							}
							increaseCellValue(1);
							movePointerRight(2);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(2);
								decreaseCellValue(1);
								movePointerRight(2);
							}
							increaseCellValue(1);
							movePointerLeft(2);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(2);
								decreaseCellValue(1);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerLeft(3);
									increaseCellValue(1);
									movePointerRight(3);
								}
								movePointerLeft(1);
								movePointerLeft(2);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(3);
									increaseCellValue(1);
									movePointerLeft(12);
									while((getCellValue() & 0xFF) != 0) {
										movePointerLeft(9);
									}
									movePointerRight(3);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
									}
									increaseCellValue(1);
									movePointerRight(6);
									while((getCellValue() & 0xFF) != 0) {
										movePointerRight(9);
									}
									movePointerRight(1);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
									}
									increaseCellValue(1);
									movePointerLeft(1);
								}
							}
							increaseCellValue(1);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(1);
								while((getCellValue() & 0xFF) != 0) {
									movePointerRight(9);
								}
								movePointerLeft(1);
								movePointerLeft(7);
							}
							movePointerRight(8);
						}
						movePointerLeft(9);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(9);
						}
						movePointerRight(3);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(3);
						}
						movePointerLeft(3);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(3);
							increaseCellValue(1);
							movePointerRight(6);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								increaseCellValue(1);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerLeft(1);
									decreaseCellValue(1);
									movePointerRight(1);
								}
								movePointerLeft(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(1);
									increaseCellValue(1);
									movePointerLeft(1);
								}
								movePointerRight(8);
							}
							movePointerLeft(8);
							increaseCellValue(1);
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(4);
									increaseCellValue(1);
									movePointerLeft(2);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										movePointerRight(2);
										decreaseCellValue(1);
										movePointerLeft(13);
										increaseCellValue(1);
										movePointerRight(10);
										while((getCellValue() & 0xFF) != 0) {
											decreaseCellValue(1);
											movePointerRight(3);
											increaseCellValue(1);
											movePointerLeft(3);
										}
										movePointerRight(1);
									}
									movePointerLeft(1);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										movePointerRight(3);
										decreaseCellValue(1);
										movePointerLeft(13);
										increaseCellValue(1);
										movePointerRight(10);
									}
									movePointerLeft(1);
								}
								movePointerRight(2);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(2);
									increaseCellValue(1);
									movePointerLeft(3);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										movePointerRight(3);
										decreaseCellValue(1);
										movePointerLeft(13);
										increaseCellValue(1);
										movePointerRight(10);
									}
									movePointerRight(1);
								}
								movePointerLeft(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(3);
									increaseCellValue(1);
									movePointerLeft(3);
								}
								movePointerLeft(11);
							}
							movePointerRight(5);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
							}
							movePointerRight(2);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(7);
								increaseCellValue(1);
								movePointerRight(7);
							}
							movePointerLeft(7);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(7);
								increaseCellValue(1);
								movePointerLeft(2);
								increaseCellValue(1);
								movePointerLeft(5);
							}
						}
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(1);
							movePointerRight(3);
						}
						movePointerLeft(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(4);
							increaseCellValue(1);
							movePointerRight(5);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								increaseCellValue(1);
								movePointerRight(2);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerLeft(2);
									decreaseCellValue(1);
									movePointerRight(2);
								}
								movePointerLeft(2);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(2);
									increaseCellValue(1);
									movePointerLeft(2);
								}
								movePointerRight(8);
							}
							movePointerLeft(8);
							increaseCellValue(1);
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(4);
									increaseCellValue(1);
									movePointerLeft(3);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										movePointerRight(3);
										decreaseCellValue(1);
										movePointerLeft(13);
										increaseCellValue(1);
										movePointerRight(11);
										while((getCellValue() & 0xFF) != 0) {
											decreaseCellValue(1);
											movePointerRight(2);
											increaseCellValue(1);
											movePointerLeft(2);
										}
										movePointerLeft(1);
									}
									movePointerRight(1);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										movePointerRight(2);
										decreaseCellValue(1);
										movePointerLeft(13);
										increaseCellValue(1);
										movePointerRight(11);
									}
									movePointerLeft(2);
								}
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(3);
									increaseCellValue(1);
									movePointerLeft(2);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										movePointerRight(2);
										decreaseCellValue(1);
										movePointerLeft(13);
										increaseCellValue(1);
										movePointerRight(11);
									}
									movePointerLeft(1);
								}
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(2);
									increaseCellValue(1);
									movePointerLeft(2);
								}
								movePointerLeft(12);
							}
						}
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(4);
					}
					movePointerRight(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(4);
						increaseCellValue(1);
						movePointerRight(2);
						movePointerRight(2);
					}
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(4);
						increaseCellValue(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(2);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(7);
							increaseCellValue(1);
							movePointerRight(7);
						}
						movePointerLeft(7);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(7);
							increaseCellValue(1);
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerLeft(5);
						}
						movePointerRight(9);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(6);
							movePointerRight(3);
						}
						movePointerLeft(9);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(4);
								increaseCellValue(1);
								movePointerLeft(3);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(3);
									decreaseCellValue(1);
									movePointerLeft(13);
									increaseCellValue(1);
									movePointerRight(11);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										movePointerRight(2);
										increaseCellValue(1);
										movePointerLeft(2);
									}
									movePointerLeft(1);
								}
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(2);
									decreaseCellValue(1);
									movePointerLeft(8);
									movePointerLeft(5);
									increaseCellValue(1);
									movePointerRight(11);
								}
								movePointerLeft(2);
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(3);
								increaseCellValue(1);
								movePointerLeft(2);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(2);
									decreaseCellValue(1);
									movePointerLeft(13);
									increaseCellValue(1);
									movePointerRight(11);
								}
								movePointerLeft(1);
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(2);
								increaseCellValue(1);
								movePointerLeft(2);
							}
							movePointerLeft(8);
							movePointerLeft(4);
						}
					}
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(6);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(3);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(5);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(4);
						}
						movePointerLeft(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(4);
							increaseCellValue(1);
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerLeft(1);
						}
						movePointerRight(8);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(6);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(5);
							increaseCellValue(1);
							movePointerRight(5);
						}
						movePointerLeft(5);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(5);
							increaseCellValue(1);
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerLeft(2);
						}
						movePointerRight(8);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(9);
					increaseCellValue(15);
					while((getCellValue() & 0xFF) != 0) {
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(4);
							movePointerRight(5);
						}
						increaseCellValue(1);
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
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(9);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(9);
						}
						movePointerRight(9);
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						increaseCellValue(1);
						movePointerRight(2);
						movePointerRight(6);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						decreaseCellValue(1);
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(4);
						}
						movePointerLeft(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(4);
							increaseCellValue(1);
							movePointerLeft(5);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(2);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerLeft(2);
									increaseCellValue(1);
									movePointerRight(2);
								}
								movePointerLeft(2);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(2);
									increaseCellValue(1);
									movePointerRight(2);
									increaseCellValue(1);
									movePointerLeft(4);
								}
								increaseCellValue(1);
								movePointerRight(9);
							}
							movePointerLeft(8);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(9);
							}
						}
						movePointerRight(9);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(9);
						}
						movePointerLeft(9);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(9);
								increaseCellValue(1);
								movePointerLeft(9);
							}
							movePointerLeft(10);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(9);
							increaseCellValue(1);
							movePointerLeft(9);
						}
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerRight(8);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(1);
								decreaseCellValue(1);
								movePointerRight(1);
								decreaseCellValue(1);
								movePointerLeft(6);
								increaseCellValue(1);
								movePointerRight(6);
							}
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(1);
								increaseCellValue(1);
								movePointerLeft(1);
							}
							movePointerRight(4);
						}
						movePointerLeft(3);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(3);
							increaseCellValue(1);
							movePointerLeft(3);
						}
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerLeft(9);
					}
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						increaseCellValue(1);
						movePointerRight(8);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						decreaseCellValue(1);
						movePointerRight(5);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(5);
							increaseCellValue(1);
							movePointerRight(5);
						}
						movePointerLeft(5);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(5);
							increaseCellValue(1);
							movePointerLeft(4);
							movePointerLeft(2);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(3);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerLeft(3);
									increaseCellValue(1);
									movePointerRight(3);
								}
								movePointerLeft(3);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(3);
									increaseCellValue(1);
									movePointerRight(1);
									increaseCellValue(1);
									movePointerLeft(4);
								}
								increaseCellValue(1);
								movePointerRight(9);
							}
							movePointerLeft(8);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(9);
							}
						}
						movePointerRight(9);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(6);
							movePointerRight(3);
						}
						movePointerLeft(9);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(9);
								increaseCellValue(1);
								movePointerLeft(9);
							}
							movePointerLeft(11);
						}
						movePointerRight(2);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(9);
							increaseCellValue(1);
							movePointerLeft(9);
						}
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(3);
						movePointerRight(5);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(1);
								decreaseCellValue(1);
								movePointerRight(1);
								decreaseCellValue(1);
								movePointerLeft(6);
								increaseCellValue(1);
								movePointerRight(6);
							}
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(1);
								increaseCellValue(1);
								movePointerLeft(1);
							}
							movePointerRight(4);
						}
						movePointerLeft(3);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(3);
							increaseCellValue(1);
							movePointerLeft(3);
						}
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerLeft(9);
					}
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(36);
							increaseCellValue(1);
							movePointerRight(17);
							movePointerRight(19);
						}
						movePointerRight(5);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(9);
					increaseCellValue(15);
					while((getCellValue() & 0xFF) != 0) {
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(8);
							movePointerRight(1);
						}
						movePointerLeft(9);
						decreaseCellValue(1);
						movePointerLeft(9);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(9);
						}
						movePointerRight(9);
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerRight(21);
					increaseCellValue(1);
					movePointerLeft(3);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(3);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(3);
							decreaseCellValue(1);
							movePointerRight(3);
						}
						increaseCellValue(1);
						movePointerLeft(3);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(3);
							decreaseCellValue(1);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(4);
								increaseCellValue(1);
								movePointerRight(4);
							}
							movePointerLeft(4);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(4);
								increaseCellValue(1);
								movePointerLeft(13);
								while((getCellValue() & 0xFF) != 0) {
									movePointerLeft(9);
								}
								movePointerRight(4);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
								}
								increaseCellValue(1);
								movePointerRight(5);
								while((getCellValue() & 0xFF) != 0) {
									movePointerRight(9);
								}
								movePointerRight(1);
								increaseCellValue(1);
								movePointerLeft(1);
							}
						}
						increaseCellValue(1);
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(4);
							decreaseCellValue(1);
							movePointerRight(4);
						}
						increaseCellValue(1);
						movePointerLeft(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(4);
							decreaseCellValue(1);
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(3);
								increaseCellValue(1);
								movePointerRight(3);
							}
							movePointerLeft(3);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(3);
								increaseCellValue(1);
								movePointerLeft(1);
								movePointerLeft(11);
								while((getCellValue() & 0xFF) != 0) {
									movePointerLeft(9);
								}
								movePointerRight(3);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
								}
								increaseCellValue(1);
								movePointerRight(6);
								while((getCellValue() & 0xFF) != 0) {
									movePointerRight(9);
								}
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
								}
								increaseCellValue(1);
								movePointerLeft(1);
							}
						}
						increaseCellValue(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(9);
							}
							movePointerLeft(8);
						}
						movePointerRight(1);
						movePointerRight(7);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(2);
					decreaseCellValue(1);
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(4);
						increaseCellValue(1);
						movePointerRight(4);
					}
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(4);
						increaseCellValue(1);
						movePointerLeft(2);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(2);
					}
					movePointerRight(2);
				}
				movePointerLeft(2);
				increaseCellValue(1);
				movePointerRight(4);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(4);
					decreaseCellValue(1);
					movePointerRight(4);
				}
				increaseCellValue(1);
				movePointerLeft(4);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(4);
					decreaseCellValue(1);
					movePointerLeft(6);
					outputCurrentCell();
					movePointerRight(2);
				}
				movePointerRight(4);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(7);
					outputCurrentCell();
					movePointerRight(7);
				}
				movePointerLeft(3);
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
				movePointerRight(3);
				while((getCellValue() & 0xFF) != 0) {
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
					movePointerRight(3);
				}
				movePointerLeft(9);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(9);
				}
				movePointerRight(9);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(5);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(4);
				}
				movePointerLeft(9);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(9);
				}
				movePointerRight(1);
				increaseCellValue(11);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(9);
						increaseCellValue(1);
						movePointerLeft(9);
					}
					movePointerRight(9);
				}
				movePointerRight(4);
				increaseCellValue(1);
				movePointerRight(9);
				increaseCellValue(1);
				movePointerLeft(8);
				movePointerLeft(6);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(9);
				}
				movePointerRight(7);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(7);
					increaseCellValue(1);
					movePointerRight(7);
				}
				movePointerLeft(7);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(7);
					increaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(9);
					}
					movePointerLeft(5);
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(7);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(6);
							increaseCellValue(1);
							movePointerRight(6);
						}
						movePointerLeft(6);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(6);
							increaseCellValue(1);
							movePointerLeft(7);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(9);
							}
							movePointerRight(7);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
							}
							increaseCellValue(1);
							movePointerRight(3);
						}
						movePointerLeft(4);
						movePointerLeft(6);
					}
				}
				movePointerRight(7);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(7);
					increaseCellValue(1);
					movePointerRight(7);
				}
				movePointerLeft(7);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(7);
					increaseCellValue(1);
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						increaseCellValue(1);
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(4);
							decreaseCellValue(1);
							movePointerRight(4);
						}
						movePointerLeft(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(3);
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(4);
						}
						movePointerRight(8);
					}
					movePointerLeft(2);
					increaseCellValue(1);
					movePointerLeft(7);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(5);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(2);
							increaseCellValue(1);
							movePointerLeft(2);
						}
						movePointerLeft(14);
					}
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(9);
					}
					movePointerLeft(5);
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(7);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(7);
							increaseCellValue(1);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(1);
								decreaseCellValue(1);
								movePointerRight(1);
								decreaseCellValue(1);
								movePointerLeft(3);
								increaseCellValue(1);
								movePointerRight(3);
							}
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(1);
								increaseCellValue(1);
								movePointerLeft(1);
							}
							movePointerRight(7);
						}
						movePointerLeft(6);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(6);
							increaseCellValue(1);
							movePointerLeft(6);
						}
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerLeft(9);
					}
					movePointerRight(7);
					decreaseCellValue(1);
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerLeft(3);
				}
				increaseCellValue(1);
				movePointerRight(7);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(7);
					decreaseCellValue(1);
					movePointerRight(7);
				}
				increaseCellValue(1);
				movePointerLeft(7);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(7);
					decreaseCellValue(1);
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
						movePointerRight(3);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(2);
							increaseCellValue(1);
							movePointerLeft(2);
						}
						movePointerRight(4);
					}
					movePointerLeft(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(7);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(7);
							increaseCellValue(1);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(1);
								decreaseCellValue(1);
								movePointerRight(1);
								decreaseCellValue(1);
								movePointerLeft(3);
								increaseCellValue(1);
								movePointerRight(3);
							}
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(1);
								increaseCellValue(1);
								movePointerLeft(1);
							}
							movePointerRight(7);
						}
						movePointerLeft(2);
						movePointerLeft(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(6);
							increaseCellValue(1);
							movePointerLeft(6);
						}
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerLeft(9);
					}
					movePointerRight(1);
					increaseCellValue(5);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(9);
							increaseCellValue(1);
							movePointerLeft(9);
						}
						movePointerRight(9);
					}
					movePointerRight(4);
					increaseCellValue(1);
					movePointerLeft(3);
					movePointerLeft(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(5);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(5);
							decreaseCellValue(1);
							movePointerRight(5);
						}
						increaseCellValue(1);
						movePointerLeft(5);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(5);
							decreaseCellValue(1);
							movePointerRight(2);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(7);
								increaseCellValue(1);
								movePointerRight(7);
							}
							movePointerLeft(4);
							movePointerLeft(3);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(7);
								increaseCellValue(1);
								movePointerLeft(16);
								while((getCellValue() & 0xFF) != 0) {
									movePointerLeft(9);
								}
								movePointerRight(4);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
								}
								increaseCellValue(1);
								movePointerRight(5);
								while((getCellValue() & 0xFF) != 0) {
									movePointerRight(9);
								}
								movePointerRight(1);
								increaseCellValue(1);
								movePointerLeft(1);
							}
						}
						increaseCellValue(1);
						movePointerRight(7);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(1);
							movePointerLeft(6);
							decreaseCellValue(1);
							movePointerRight(7);
						}
						increaseCellValue(1);
						movePointerLeft(7);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(7);
							decreaseCellValue(1);
							movePointerLeft(2);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(5);
								increaseCellValue(1);
								movePointerRight(5);
							}
							movePointerLeft(5);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(5);
								increaseCellValue(1);
								movePointerLeft(14);
								while((getCellValue() & 0xFF) != 0) {
									movePointerLeft(3);
									movePointerLeft(6);
								}
								movePointerRight(3);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
								}
								increaseCellValue(1);
								movePointerRight(6);
								while((getCellValue() & 0xFF) != 0) {
									movePointerRight(9);
								}
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
								}
								increaseCellValue(1);
								movePointerLeft(1);
							}
						}
						increaseCellValue(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(9);
							}
							movePointerLeft(8);
						}
						movePointerRight(8);
					}
					movePointerLeft(7);
					movePointerLeft(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
					}
					movePointerRight(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(3);
					increaseCellValue(5);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(9);
							increaseCellValue(1);
							movePointerLeft(9);
						}
						movePointerRight(9);
					}
					movePointerRight(4);
					decreaseCellValue(1);
					movePointerLeft(5);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(7);
						movePointerLeft(2);
					}
				}
				movePointerRight(3);
			}
			movePointerLeft(4);
			outputCurrentCell();
			movePointerRight(10);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(6);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(3);
			}
			movePointerLeft(9);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(9);
			}
			movePointerRight(1);
			increaseCellValue(10);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(8);
					movePointerRight(1);
					increaseCellValue(1);
					movePointerLeft(9);
				}
				movePointerRight(9);
			}
			movePointerRight(5);
			increaseCellValue(1);
			movePointerRight(9);
			increaseCellValue(1);
			movePointerLeft(15);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(9);
			}
			movePointerRight(8);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(6);
				movePointerLeft(2);
				increaseCellValue(1);
				movePointerRight(8);
			}
			movePointerLeft(8);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerRight(8);
				increaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(9);
				}
				movePointerLeft(9);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(8);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(7);
						increaseCellValue(1);
						movePointerRight(6);
						movePointerRight(1);
					}
					movePointerLeft(7);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(7);
						increaseCellValue(1);
						movePointerLeft(8);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(9);
						}
						movePointerRight(8);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						increaseCellValue(1);
						movePointerRight(2);
					}
					movePointerLeft(10);
				}
			}
			movePointerRight(8);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(5);
				movePointerLeft(3);
				increaseCellValue(1);
				movePointerRight(8);
			}
			movePointerLeft(8);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerRight(8);
				increaseCellValue(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					increaseCellValue(1);
					movePointerRight(5);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(5);
						decreaseCellValue(1);
						movePointerRight(5);
					}
					movePointerLeft(5);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(5);
						increaseCellValue(1);
						movePointerLeft(5);
					}
					movePointerRight(6);
					movePointerRight(2);
				}
				movePointerLeft(1);
				increaseCellValue(1);
				movePointerLeft(8);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(6);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(2);
						increaseCellValue(1);
						movePointerLeft(2);
					}
					movePointerLeft(15);
				}
				movePointerRight(9);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(9);
				}
				movePointerLeft(9);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(8);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(8);
						increaseCellValue(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							decreaseCellValue(1);
							movePointerRight(1);
							decreaseCellValue(1);
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerRight(2);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
						}
						movePointerRight(8);
					}
					movePointerLeft(7);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(7);
						increaseCellValue(1);
						movePointerLeft(7);
					}
					movePointerLeft(1);
					increaseCellValue(1);
					movePointerLeft(6);
					movePointerLeft(3);
				}
				movePointerRight(8);
				decreaseCellValue(1);
				movePointerLeft(5);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(1);
				movePointerLeft(3);
			}
			increaseCellValue(1);
			movePointerRight(8);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerLeft(8);
				decreaseCellValue(1);
				movePointerRight(8);
			}
			increaseCellValue(1);
			movePointerLeft(8);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerRight(8);
				decreaseCellValue(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(3);
					movePointerRight(3);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(2);
						increaseCellValue(1);
						movePointerLeft(2);
					}
					movePointerRight(3);
				}
				movePointerLeft(9);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(8);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(8);
						increaseCellValue(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							decreaseCellValue(1);
							movePointerRight(1);
							decreaseCellValue(1);
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerRight(2);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
						}
						movePointerRight(8);
					}
					movePointerLeft(2);
					movePointerLeft(5);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(7);
						increaseCellValue(1);
						movePointerLeft(7);
					}
					movePointerLeft(1);
					increaseCellValue(1);
					movePointerLeft(9);
				}
				movePointerRight(1);
				increaseCellValue(5);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(9);
						increaseCellValue(1);
						movePointerLeft(9);
					}
					movePointerRight(9);
				}
				movePointerRight(5);
				increaseCellValue(1);
				movePointerRight(27);
				increaseCellValue(1);
				movePointerLeft(6);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(9);
				}
				movePointerRight(9);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(6);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(6);
						decreaseCellValue(1);
						movePointerRight(6);
					}
					increaseCellValue(1);
					movePointerLeft(1);
					movePointerLeft(5);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(6);
						decreaseCellValue(1);
						movePointerRight(2);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(8);
							increaseCellValue(1);
							movePointerRight(8);
						}
						movePointerLeft(8);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(8);
							increaseCellValue(1);
							movePointerLeft(17);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(7);
								movePointerLeft(2);
							}
							movePointerRight(4);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
							}
							increaseCellValue(1);
							movePointerRight(5);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(9);
							}
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
						}
					}
					increaseCellValue(1);
					movePointerRight(8);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(8);
						decreaseCellValue(1);
						movePointerRight(8);
					}
					increaseCellValue(1);
					movePointerLeft(8);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(8);
						decreaseCellValue(1);
						movePointerLeft(2);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(6);
							increaseCellValue(1);
							movePointerRight(6);
						}
						movePointerLeft(6);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(6);
							increaseCellValue(1);
							movePointerLeft(15);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(9);
							}
							movePointerRight(3);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
							}
							increaseCellValue(1);
							movePointerRight(6);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(6);
								movePointerRight(3);
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
							}
							increaseCellValue(1);
							movePointerLeft(1);
						}
					}
					increaseCellValue(1);
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(9);
						}
						movePointerLeft(8);
					}
					movePointerRight(8);
				}
				movePointerLeft(9);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(9);
				}
				movePointerRight(4);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(3);
				increaseCellValue(4);
				increaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(9);
						increaseCellValue(1);
						movePointerLeft(9);
					}
					movePointerRight(9);
				}
				movePointerRight(5);
				decreaseCellValue(1);
				movePointerRight(27);
				decreaseCellValue(1);
				movePointerLeft(6);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(4);
					movePointerLeft(5);
				}
			}
			movePointerRight(3);
		}
	}

	public static void main(String[] args) {
		new Mandelbrot();
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
