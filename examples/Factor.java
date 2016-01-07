public class Factor {
	private byte[] _array = new byte[0];
	private int _pointer = 0;
	
	public Factor() {
		movePointerRight(30);
		decreaseCellValue(1);
		movePointerLeft(9);
		increaseCellValue(1);
		while((getCellValue() & 0xFF) != 0) {
			decreaseCellValue(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(10);
			}
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerLeft(10);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(10);
					increaseCellValue(1);
					movePointerLeft(10);
				}
				movePointerLeft(10);
			}
			movePointerRight(10);
			inputIntoCurrentCell();
			decreaseCellValue(10);
		}
		movePointerRight(10);
		while((getCellValue() & 0xFF) != 0) {
			decreaseCellValue(37);
			movePointerRight(9);
			decreaseCellValue(1);
			movePointerRight(1);
		}
		movePointerLeft(1);
		while((getCellValue() & 0xFF) != 0) {
			increaseCellValue(1);
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(9);
				increaseCellValue(1);
				movePointerRight(1);
			}
			movePointerLeft(1);
			decreaseCellValue(1);
			movePointerLeft(10);
		}
		decreaseCellValue(1);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(1);
			increaseCellValue(48);
			outputCurrentCell();
			decreaseCellValue(48);
			movePointerLeft(11);
		}
		increaseCellValue(58);
		outputCurrentCell();
		decreaseCellValue(26);
		outputCurrentCell();
		while((getCellValue() & 0xFF) != 0) {
			decreaseCellValue(1);
		}
		movePointerRight(12);
		increaseCellValue(2);
		movePointerLeft(4);
		increaseCellValue(1);
		while((getCellValue() & 0xFF) != 0) {
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(4);
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
				movePointerLeft(7);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(3);
					increaseCellValue(1);
					movePointerRight(1);
					increaseCellValue(1);
					movePointerLeft(4);
				}
				movePointerRight(8);
			}
			movePointerLeft(10);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(6);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(4);
					increaseCellValue(1);
					movePointerRight(4);
				}
				movePointerLeft(16);
			}
			movePointerRight(10);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(3);
					increaseCellValue(1);
					movePointerRight(2);
					increaseCellValue(1);
					movePointerLeft(5);
				}
				movePointerRight(9);
			}
			movePointerLeft(10);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(6);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(5);
					increaseCellValue(1);
					movePointerRight(5);
				}
				movePointerLeft(16);
			}
			movePointerRight(10);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(3);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(3);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerRight(3);
			}
			movePointerLeft(10);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(10);
			}
			movePointerRight(9);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerRight(7);
			increaseCellValue(1);
			movePointerLeft(8);
			while((getCellValue() & 0xFF) != 0) {
				increaseCellValue(1);
			}
			increaseCellValue(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				movePointerRight(2);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(6);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(2);
						movePointerLeft(1);
					}
					movePointerRight(4);
				}
				movePointerLeft(10);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(8);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(3);
						increaseCellValue(2);
						movePointerLeft(3);
					}
					movePointerLeft(15);
				}
				movePointerRight(10);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(8);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(1);
								increaseCellValue(1);
								movePointerLeft(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(1);
									increaseCellValue(1);
									movePointerLeft(1);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										movePointerRight(1);
										increaseCellValue(1);
										movePointerLeft(1);
										while((getCellValue() & 0xFF) != 0) {
											decreaseCellValue(1);
											movePointerRight(1);
											increaseCellValue(1);
											movePointerLeft(1);
											while((getCellValue() & 0xFF) != 0) {
												decreaseCellValue(1);
												movePointerRight(1);
												increaseCellValue(1);
												movePointerLeft(1);
												while((getCellValue() & 0xFF) != 0) {
													decreaseCellValue(1);
													movePointerRight(1);
													increaseCellValue(1);
													movePointerLeft(1);
													while((getCellValue() & 0xFF) != 0) {
														decreaseCellValue(1);
														movePointerRight(1);
														increaseCellValue(1);
														movePointerLeft(1);
														while((getCellValue() & 0xFF) != 0) {
															decreaseCellValue(1);
															movePointerRight(1);
															decreaseCellValue(9);
															movePointerRight(9);
															increaseCellValue(1);
															movePointerLeft(10);
															while((getCellValue() & 0xFF) != 0) {
																decreaseCellValue(1);
																movePointerRight(1);
																increaseCellValue(1);
																movePointerLeft(1);
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
					movePointerRight(2);
				}
				movePointerLeft(10);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerLeft(3);
						increaseCellValue(1);
						movePointerRight(4);
					}
					movePointerLeft(19);
				}
				movePointerRight(10);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(7);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(1);
							increaseCellValue(1);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(1);
								increaseCellValue(1);
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerLeft(1);
									increaseCellValue(1);
									movePointerRight(1);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										movePointerLeft(1);
										increaseCellValue(1);
										movePointerRight(1);
										while((getCellValue() & 0xFF) != 0) {
											decreaseCellValue(1);
											movePointerLeft(1);
											increaseCellValue(1);
											movePointerRight(1);
											while((getCellValue() & 0xFF) != 0) {
												decreaseCellValue(1);
												movePointerLeft(1);
												increaseCellValue(1);
												movePointerRight(1);
												while((getCellValue() & 0xFF) != 0) {
													decreaseCellValue(1);
													movePointerLeft(1);
													increaseCellValue(1);
													movePointerRight(1);
													while((getCellValue() & 0xFF) != 0) {
														decreaseCellValue(1);
														movePointerLeft(1);
														increaseCellValue(1);
														movePointerRight(1);
														while((getCellValue() & 0xFF) != 0) {
															decreaseCellValue(1);
															movePointerLeft(1);
															decreaseCellValue(9);
															movePointerRight(11);
															increaseCellValue(1);
															movePointerLeft(10);
															while((getCellValue() & 0xFF) != 0) {
																decreaseCellValue(1);
																movePointerLeft(1);
																increaseCellValue(1);
																movePointerRight(1);
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
					movePointerRight(3);
				}
				movePointerLeft(10);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(3);
						increaseCellValue(1);
						movePointerRight(2);
						increaseCellValue(1);
						movePointerLeft(5);
					}
					movePointerLeft(14);
				}
				movePointerRight(10);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(7);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(3);
						increaseCellValue(1);
						movePointerRight(3);
					}
					movePointerRight(3);
				}
				movePointerLeft(10);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(8);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(1);
						decreaseCellValue(1);
						movePointerLeft(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(9);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
							}
							movePointerRight(10);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(10);
								increaseCellValue(1);
								movePointerRight(10);
							}
							movePointerLeft(19);
						}
						movePointerRight(19);
					}
					movePointerLeft(19);
				}
				movePointerRight(9);
				while((getCellValue() & 0xFF) != 0) {
					increaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						increaseCellValue(1);
						while((getCellValue() & 0xFF) != 0) {
							increaseCellValue(1);
							while((getCellValue() & 0xFF) != 0) {
								increaseCellValue(1);
								while((getCellValue() & 0xFF) != 0) {
									increaseCellValue(1);
									while((getCellValue() & 0xFF) != 0) {
										increaseCellValue(1);
										while((getCellValue() & 0xFF) != 0) {
											increaseCellValue(1);
											while((getCellValue() & 0xFF) != 0) {
												increaseCellValue(1);
												while((getCellValue() & 0xFF) != 0) {
													increaseCellValue(1);
													while((getCellValue() & 0xFF) != 0) {
														increaseCellValue(1);
														while((getCellValue() & 0xFF) != 0) {
															while((getCellValue() & 0xFF) != 0) {
																decreaseCellValue(1);
															}
															movePointerLeft(1);
															increaseCellValue(1);
															movePointerRight(1);
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
			}
			movePointerRight(8);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(6);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(8);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(5);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(3);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(4);
					}
					movePointerRight(6);
				}
				movePointerLeft(10);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(8);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(4);
						increaseCellValue(1);
						movePointerRight(4);
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
					movePointerLeft(15);
				}
				movePointerRight(10);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(9);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(4);
						increaseCellValue(1);
						movePointerRight(4);
					}
					movePointerRight(1);
				}
				movePointerLeft(10);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(8);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(1);
						decreaseCellValue(1);
						movePointerRight(1);
					}
					movePointerLeft(18);
				}
				movePointerRight(10);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(7);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(1);
								increaseCellValue(1);
								movePointerLeft(1);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(1);
									increaseCellValue(1);
									movePointerLeft(1);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										movePointerRight(1);
										increaseCellValue(1);
										movePointerLeft(1);
										while((getCellValue() & 0xFF) != 0) {
											decreaseCellValue(1);
											movePointerRight(1);
											increaseCellValue(1);
											movePointerLeft(1);
											while((getCellValue() & 0xFF) != 0) {
												decreaseCellValue(1);
												movePointerRight(1);
												increaseCellValue(1);
												movePointerLeft(1);
												while((getCellValue() & 0xFF) != 0) {
													decreaseCellValue(1);
													movePointerRight(1);
													increaseCellValue(1);
													movePointerLeft(1);
													while((getCellValue() & 0xFF) != 0) {
														decreaseCellValue(1);
														movePointerRight(1);
														increaseCellValue(1);
														movePointerLeft(1);
														while((getCellValue() & 0xFF) != 0) {
															decreaseCellValue(1);
															movePointerRight(1);
															increaseCellValue(1);
															movePointerLeft(1);
															while((getCellValue() & 0xFF) != 0) {
																increaseCellValue(10);
																while((getCellValue() & 0xFF) != 0) {
																	increaseCellValue(1);
																	movePointerRight(1);
																	decreaseCellValue(1);
																	movePointerLeft(1);
																}
																movePointerRight(10);
																decreaseCellValue(1);
																movePointerLeft(10);
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
					movePointerRight(3);
				}
				movePointerRight(7);
				increaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(17);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(4);
						}
						movePointerLeft(2);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(2);
							increaseCellValue(1);
							movePointerLeft(2);
						}
						movePointerLeft(16);
					}
					movePointerRight(10);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(8);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(2);
						}
						movePointerRight(2);
					}
					movePointerLeft(10);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(3);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(6);
							increaseCellValue(1);
							movePointerLeft(6);
						}
						movePointerLeft(13);
					}
					movePointerRight(10);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(9);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(6);
							increaseCellValue(1);
							movePointerRight(6);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(6);
								increaseCellValue(1);
								movePointerRight(6);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerLeft(6);
									increaseCellValue(1);
									movePointerRight(6);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										movePointerLeft(6);
										increaseCellValue(1);
										movePointerRight(6);
										while((getCellValue() & 0xFF) != 0) {
											decreaseCellValue(1);
											movePointerLeft(6);
											increaseCellValue(1);
											movePointerRight(6);
											while((getCellValue() & 0xFF) != 0) {
												decreaseCellValue(1);
												movePointerLeft(6);
												increaseCellValue(1);
												movePointerRight(6);
												while((getCellValue() & 0xFF) != 0) {
													decreaseCellValue(1);
													movePointerLeft(6);
													increaseCellValue(1);
													movePointerRight(6);
													while((getCellValue() & 0xFF) != 0) {
														decreaseCellValue(1);
														movePointerLeft(6);
														increaseCellValue(1);
														movePointerRight(6);
														while((getCellValue() & 0xFF) != 0) {
															decreaseCellValue(1);
															movePointerLeft(6);
															increaseCellValue(1);
															movePointerRight(6);
															while((getCellValue() & 0xFF) != 0) {
																decreaseCellValue(1);
																movePointerLeft(6);
																decreaseCellValue(9);
																movePointerRight(16);
																increaseCellValue(1);
																movePointerLeft(10);
																while((getCellValue() & 0xFF) != 0) {
																	decreaseCellValue(1);
																	movePointerLeft(6);
																	increaseCellValue(1);
																	movePointerRight(6);
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
						movePointerRight(1);
					}
					movePointerRight(7);
				}
				movePointerLeft(17);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(10);
				}
				movePointerRight(10);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(8);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(2);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(3);
						increaseCellValue(1);
						movePointerLeft(3);
					}
					movePointerRight(5);
				}
				movePointerLeft(10);
				while((getCellValue() & 0xFF) != 0) {
					increaseCellValue(1);
					movePointerRight(7);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(7);
						increaseCellValue(1);
						movePointerRight(7);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(7);
							decreaseCellValue(1);
							movePointerRight(6);
							increaseCellValue(1);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(7);
								increaseCellValue(1);
								movePointerRight(7);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerLeft(7);
									decreaseCellValue(1);
									movePointerRight(6);
									increaseCellValue(1);
									movePointerRight(1);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										movePointerLeft(7);
										increaseCellValue(1);
										movePointerRight(7);
										while((getCellValue() & 0xFF) != 0) {
											decreaseCellValue(1);
											movePointerLeft(7);
											decreaseCellValue(1);
											movePointerRight(6);
											increaseCellValue(1);
											movePointerRight(1);
											while((getCellValue() & 0xFF) != 0) {
												decreaseCellValue(1);
												movePointerLeft(7);
												increaseCellValue(1);
												movePointerRight(7);
												while((getCellValue() & 0xFF) != 0) {
													decreaseCellValue(1);
													movePointerLeft(7);
													decreaseCellValue(1);
													movePointerRight(6);
													increaseCellValue(1);
													movePointerRight(1);
													while((getCellValue() & 0xFF) != 0) {
														decreaseCellValue(1);
														movePointerLeft(7);
														increaseCellValue(1);
														movePointerRight(7);
													}
												}
											}
										}
									}
								}
							}
						}
					}
					movePointerLeft(7);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(7);
						increaseCellValue(1);
						movePointerLeft(7);
					}
					decreaseCellValue(1);
					movePointerLeft(10);
				}
				movePointerRight(7);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(11);
					increaseCellValue(1);
					movePointerRight(11);
				}
				movePointerRight(3);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(7);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(11);
						increaseCellValue(5);
						movePointerRight(11);
					}
					movePointerRight(3);
				}
				movePointerLeft(10);
				while((getCellValue() & 0xFF) != 0) {
					increaseCellValue(1);
					movePointerRight(8);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(8);
						increaseCellValue(1);
						movePointerRight(8);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(8);
							decreaseCellValue(1);
							movePointerRight(5);
							increaseCellValue(1);
							movePointerRight(3);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerLeft(8);
								increaseCellValue(1);
								movePointerRight(8);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerLeft(8);
									decreaseCellValue(1);
									movePointerRight(5);
									increaseCellValue(1);
									movePointerRight(3);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										movePointerLeft(8);
										increaseCellValue(1);
										movePointerRight(8);
										while((getCellValue() & 0xFF) != 0) {
											decreaseCellValue(1);
											movePointerLeft(8);
											decreaseCellValue(1);
											movePointerRight(5);
											increaseCellValue(1);
											movePointerRight(3);
											while((getCellValue() & 0xFF) != 0) {
												decreaseCellValue(1);
												movePointerLeft(8);
												increaseCellValue(1);
												movePointerRight(8);
												while((getCellValue() & 0xFF) != 0) {
													decreaseCellValue(1);
													movePointerLeft(8);
													decreaseCellValue(1);
													movePointerRight(5);
													increaseCellValue(1);
													movePointerRight(3);
													while((getCellValue() & 0xFF) != 0) {
														decreaseCellValue(1);
														movePointerLeft(8);
														increaseCellValue(1);
														movePointerRight(8);
													}
												}
											}
										}
									}
								}
							}
						}
					}
					movePointerLeft(8);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(8);
						increaseCellValue(1);
						movePointerLeft(8);
					}
					decreaseCellValue(1);
					movePointerLeft(10);
				}
				movePointerRight(8);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(13);
					increaseCellValue(1);
					movePointerRight(13);
				}
				movePointerRight(2);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(8);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(13);
						increaseCellValue(5);
						movePointerRight(13);
					}
					movePointerRight(2);
				}
				movePointerLeft(10);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(10);
				}
				movePointerRight(10);
				movePointerRight(6);
			}
			movePointerLeft(6);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(3);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(4);
					increaseCellValue(1);
					movePointerRight(1);
					increaseCellValue(1);
					movePointerLeft(5);
				}
				movePointerRight(7);
			}
			movePointerLeft(10);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(7);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(4);
					increaseCellValue(1);
					movePointerRight(4);
				}
				movePointerLeft(5);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerRight(5);
					increaseCellValue(1);
					movePointerRight(2);
					increaseCellValue(1);
					movePointerLeft(7);
				}
				movePointerLeft(12);
			}
			movePointerRight(10);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(7);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(5);
					increaseCellValue(1);
					movePointerRight(5);
				}
				movePointerRight(3);
			}
			movePointerLeft(10);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(9);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
					movePointerRight(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(8);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(10);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(10);
							increaseCellValue(1);
							movePointerRight(10);
						}
						movePointerLeft(18);
					}
					movePointerRight(18);
				}
				movePointerLeft(18);
			}
			movePointerRight(8);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				decreaseCellValue(1);
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					increaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						increaseCellValue(1);
						while((getCellValue() & 0xFF) != 0) {
							increaseCellValue(1);
							while((getCellValue() & 0xFF) != 0) {
								increaseCellValue(1);
								while((getCellValue() & 0xFF) != 0) {
									increaseCellValue(1);
									while((getCellValue() & 0xFF) != 0) {
										increaseCellValue(1);
										while((getCellValue() & 0xFF) != 0) {
											increaseCellValue(1);
											while((getCellValue() & 0xFF) != 0) {
												increaseCellValue(1);
												while((getCellValue() & 0xFF) != 0) {
													increaseCellValue(1);
													while((getCellValue() & 0xFF) != 0) {
														while((getCellValue() & 0xFF) != 0) {
															decreaseCellValue(1);
														}
														movePointerRight(1);
														increaseCellValue(1);
														movePointerLeft(1);
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
			movePointerRight(1);
			increaseCellValue(1);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				increaseCellValue(1);
				movePointerRight(4);
				increaseCellValue(1);
				movePointerRight(8);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(10);
				}
				movePointerLeft(10);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(4);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(10);
						}
						movePointerRight(4);
						increaseCellValue(1);
						movePointerLeft(10);
					}
					movePointerLeft(4);
				}
				movePointerRight(20);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(10);
				}
				movePointerLeft(10);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(10);
				}
				movePointerRight(4);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					while((getCellValue() & 0xFF) != 0) {
						increaseCellValue(1);
					}
					movePointerRight(8);
					decreaseCellValue(1);
					movePointerLeft(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerRight(2);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerRight(2);
						}
						movePointerRight(7);
					}
					movePointerLeft(10);
					while((getCellValue() & 0xFF) != 0) {
						increaseCellValue(1);
						movePointerRight(2);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(8);
							increaseCellValue(1);
							movePointerRight(2);
						}
						movePointerLeft(2);
						decreaseCellValue(1);
						movePointerLeft(10);
					}
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
						increaseCellValue(48);
						outputCurrentCell();
						decreaseCellValue(48);
						movePointerLeft(12);
					}
					increaseCellValue(32);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerRight(4);
				}
				movePointerRight(6);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(5);
						increaseCellValue(1);
						movePointerLeft(5);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(5);
							increaseCellValue(1);
							movePointerLeft(5);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								movePointerRight(5);
								increaseCellValue(1);
								movePointerLeft(5);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
									movePointerRight(5);
									increaseCellValue(1);
									movePointerLeft(5);
									while((getCellValue() & 0xFF) != 0) {
										decreaseCellValue(1);
										movePointerRight(5);
										increaseCellValue(1);
										movePointerLeft(5);
										while((getCellValue() & 0xFF) != 0) {
											decreaseCellValue(1);
											movePointerRight(5);
											increaseCellValue(1);
											movePointerLeft(5);
											while((getCellValue() & 0xFF) != 0) {
												decreaseCellValue(1);
												movePointerRight(5);
												increaseCellValue(1);
												movePointerLeft(5);
												while((getCellValue() & 0xFF) != 0) {
													decreaseCellValue(1);
													movePointerRight(5);
													increaseCellValue(1);
													movePointerLeft(5);
													while((getCellValue() & 0xFF) != 0) {
														decreaseCellValue(1);
														movePointerRight(5);
														increaseCellValue(1);
														movePointerLeft(5);
														while((getCellValue() & 0xFF) != 0) {
															decreaseCellValue(1);
															movePointerRight(5);
															decreaseCellValue(9);
															movePointerRight(5);
															increaseCellValue(1);
															movePointerLeft(10);
															while((getCellValue() & 0xFF) != 0) {
																decreaseCellValue(1);
																movePointerRight(5);
																increaseCellValue(1);
																movePointerLeft(5);
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
					movePointerRight(8);
				}
				movePointerLeft(10);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(7);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerLeft(5);
						increaseCellValue(1);
						movePointerRight(5);
					}
					movePointerLeft(17);
				}
				movePointerRight(9);
			}
			movePointerLeft(1);
		}
		movePointerRight(2);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(10);
		}
		movePointerLeft(10);
		while((getCellValue() & 0xFF) != 0) {
			increaseCellValue(1);
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(9);
				increaseCellValue(1);
				movePointerRight(1);
			}
			movePointerLeft(1);
			decreaseCellValue(1);
			movePointerLeft(10);
		}
		decreaseCellValue(1);
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(1);
			increaseCellValue(48);
			outputCurrentCell();
			movePointerLeft(11);
		}
		increaseCellValue(10);
		outputCurrentCell();
	}

	public static void main(String[] args) {
		new Factor();
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
