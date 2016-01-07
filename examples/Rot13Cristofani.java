public class Rot13Cristofani {
	private byte[] _array = new byte[0];
	private int _pointer = 0;
	
	public Rot13Cristofani() {
		inputIntoCurrentCell();
		while((getCellValue() & 0xFF) != 0) {
			movePointerRight(1);
			increaseCellValue(1);
			movePointerLeft(1);
			decreaseCellValue(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				increaseCellValue(1);
				movePointerLeft(1);
				decreaseCellValue(1);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					increaseCellValue(1);
					movePointerLeft(1);
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(1);
						decreaseCellValue(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								increaseCellValue(1);
								movePointerLeft(1);
								decreaseCellValue(1);
								while((getCellValue() & 0xFF) != 0) {
									movePointerRight(1);
									increaseCellValue(1);
									movePointerLeft(1);
									decreaseCellValue(1);
									while((getCellValue() & 0xFF) != 0) {
										movePointerRight(1);
										increaseCellValue(1);
										movePointerLeft(1);
										decreaseCellValue(1);
										while((getCellValue() & 0xFF) != 0) {
											movePointerRight(1);
											increaseCellValue(1);
											movePointerLeft(1);
											decreaseCellValue(1);
											while((getCellValue() & 0xFF) != 0) {
												movePointerRight(1);
												increaseCellValue(1);
												movePointerLeft(1);
												decreaseCellValue(1);
												while((getCellValue() & 0xFF) != 0) {
													movePointerRight(1);
													increaseCellValue(1);
													movePointerLeft(1);
													decreaseCellValue(1);
													while((getCellValue() & 0xFF) != 0) {
														movePointerRight(1);
														increaseCellValue(1);
														movePointerLeft(1);
														decreaseCellValue(1);
														while((getCellValue() & 0xFF) != 0) {
															movePointerRight(1);
															increaseCellValue(1);
															movePointerLeft(1);
															decreaseCellValue(1);
															while((getCellValue() & 0xFF) != 0) {
																movePointerRight(1);
																increaseCellValue(1);
																movePointerLeft(1);
																decreaseCellValue(1);
																while((getCellValue() & 0xFF) != 0) {
																	movePointerRight(1);
																	increaseCellValue(1);
																	movePointerLeft(1);
																	decreaseCellValue(1);
																	while((getCellValue() & 0xFF) != 0) {
																		movePointerRight(1);
																		increaseCellValue(1);
																		movePointerLeft(1);
																		decreaseCellValue(1);
																		while((getCellValue() & 0xFF) != 0) {
																			movePointerRight(1);
																			increaseCellValue(1);
																			movePointerLeft(1);
																			decreaseCellValue(1);
																			while((getCellValue() & 0xFF) != 0) {
																				movePointerRight(1);
																				increaseCellValue(1);
																				movePointerLeft(1);
																				decreaseCellValue(1);
																				while((getCellValue() & 0xFF) != 0) {
																					movePointerRight(1);
																					increaseCellValue(1);
																					movePointerLeft(1);
																					decreaseCellValue(1);
																					while((getCellValue() & 0xFF) != 0) {
																						movePointerRight(1);
																						increaseCellValue(1);
																						movePointerLeft(1);
																						decreaseCellValue(1);
																						while((getCellValue() & 0xFF) != 0) {
																							movePointerRight(1);
																							increaseCellValue(1);
																							movePointerLeft(1);
																							decreaseCellValue(1);
																							while((getCellValue() & 0xFF) != 0) {
																								movePointerRight(1);
																								increaseCellValue(1);
																								movePointerLeft(1);
																								decreaseCellValue(1);
																								while((getCellValue() & 0xFF) != 0) {
																									movePointerRight(1);
																									increaseCellValue(1);
																									movePointerLeft(1);
																									decreaseCellValue(1);
																									while((getCellValue() & 0xFF) != 0) {
																										movePointerRight(1);
																										increaseCellValue(1);
																										movePointerLeft(1);
																										decreaseCellValue(1);
																										while((getCellValue() & 0xFF) != 0) {
																											movePointerRight(1);
																											increaseCellValue(1);
																											movePointerLeft(1);
																											decreaseCellValue(1);
																											while((getCellValue() & 0xFF) != 0) {
																												movePointerRight(1);
																												increaseCellValue(1);
																												movePointerLeft(1);
																												decreaseCellValue(1);
																												while((getCellValue() & 0xFF) != 0) {
																													movePointerRight(1);
																													increaseCellValue(1);
																													movePointerLeft(1);
																													decreaseCellValue(1);
																													while((getCellValue() & 0xFF) != 0) {
																														movePointerRight(1);
																														increaseCellValue(1);
																														movePointerLeft(1);
																														decreaseCellValue(1);
																														while((getCellValue() & 0xFF) != 0) {
																															movePointerRight(1);
																															increaseCellValue(1);
																															movePointerLeft(1);
																															decreaseCellValue(1);
																															while((getCellValue() & 0xFF) != 0) {
																																movePointerRight(1);
																																increaseCellValue(1);
																																movePointerLeft(1);
																																decreaseCellValue(1);
																																while((getCellValue() & 0xFF) != 0) {
																																	movePointerRight(1);
																																	increaseCellValue(1);
																																	movePointerLeft(1);
																																	decreaseCellValue(1);
																																	while((getCellValue() & 0xFF) != 0) {
																																		movePointerRight(1);
																																		increaseCellValue(1);
																																		movePointerLeft(1);
																																		decreaseCellValue(1);
																																		while((getCellValue() & 0xFF) != 0) {
																																			movePointerRight(1);
																																			increaseCellValue(1);
																																			movePointerLeft(1);
																																			decreaseCellValue(1);
																																			while((getCellValue() & 0xFF) != 0) {
																																				movePointerRight(1);
																																				increaseCellValue(1);
																																				movePointerLeft(1);
																																				decreaseCellValue(1);
																																				while((getCellValue() & 0xFF) != 0) {
																																					movePointerRight(1);
																																					increaseCellValue(1);
																																					movePointerLeft(1);
																																					decreaseCellValue(1);
																																					while((getCellValue() & 0xFF) != 0) {
																																						movePointerRight(1);
																																						increaseCellValue(1);
																																						movePointerLeft(1);
																																						decreaseCellValue(1);
																																						while((getCellValue() & 0xFF) != 0) {
																																							movePointerRight(1);
																																							increaseCellValue(1);
																																							movePointerLeft(1);
																																							decreaseCellValue(1);
																																							while((getCellValue() & 0xFF) != 0) {
																																								movePointerRight(1);
																																								increaseCellValue(1);
																																								movePointerLeft(1);
																																								decreaseCellValue(1);
																																								while((getCellValue() & 0xFF) != 0) {
																																									movePointerRight(1);
																																									increaseCellValue(1);
																																									movePointerLeft(1);
																																									decreaseCellValue(1);
																																									while((getCellValue() & 0xFF) != 0) {
																																										movePointerRight(1);
																																										increaseCellValue(1);
																																										movePointerLeft(1);
																																										decreaseCellValue(1);
																																										while((getCellValue() & 0xFF) != 0) {
																																											movePointerRight(1);
																																											increaseCellValue(1);
																																											movePointerLeft(1);
																																											decreaseCellValue(1);
																																											while((getCellValue() & 0xFF) != 0) {
																																												movePointerRight(1);
																																												increaseCellValue(1);
																																												movePointerLeft(1);
																																												decreaseCellValue(1);
																																												while((getCellValue() & 0xFF) != 0) {
																																													movePointerRight(1);
																																													increaseCellValue(1);
																																													movePointerLeft(1);
																																													decreaseCellValue(1);
																																													while((getCellValue() & 0xFF) != 0) {
																																														movePointerRight(1);
																																														increaseCellValue(1);
																																														movePointerLeft(1);
																																														decreaseCellValue(1);
																																														while((getCellValue() & 0xFF) != 0) {
																																															movePointerRight(1);
																																															increaseCellValue(1);
																																															movePointerLeft(1);
																																															decreaseCellValue(1);
																																															while((getCellValue() & 0xFF) != 0) {
																																																movePointerRight(1);
																																																increaseCellValue(1);
																																																movePointerLeft(1);
																																																decreaseCellValue(1);
																																																while((getCellValue() & 0xFF) != 0) {
																																																	movePointerRight(1);
																																																	increaseCellValue(1);
																																																	movePointerLeft(1);
																																																	decreaseCellValue(1);
																																																	while((getCellValue() & 0xFF) != 0) {
																																																		movePointerRight(1);
																																																		increaseCellValue(1);
																																																		movePointerLeft(1);
																																																		decreaseCellValue(1);
																																																		while((getCellValue() & 0xFF) != 0) {
																																																			movePointerRight(1);
																																																			increaseCellValue(1);
																																																			movePointerLeft(1);
																																																			decreaseCellValue(1);
																																																			while((getCellValue() & 0xFF) != 0) {
																																																				movePointerRight(1);
																																																				increaseCellValue(1);
																																																				movePointerLeft(1);
																																																				decreaseCellValue(1);
																																																				while((getCellValue() & 0xFF) != 0) {
																																																					movePointerRight(1);
																																																					increaseCellValue(1);
																																																					movePointerLeft(1);
																																																					decreaseCellValue(1);
																																																					while((getCellValue() & 0xFF) != 0) {
																																																						movePointerRight(1);
																																																						increaseCellValue(1);
																																																						movePointerLeft(1);
																																																						decreaseCellValue(1);
																																																						while((getCellValue() & 0xFF) != 0) {
																																																							movePointerRight(1);
																																																							increaseCellValue(1);
																																																							movePointerLeft(1);
																																																							decreaseCellValue(1);
																																																							while((getCellValue() & 0xFF) != 0) {
																																																								movePointerRight(1);
																																																								increaseCellValue(1);
																																																								movePointerLeft(1);
																																																								decreaseCellValue(1);
																																																								while((getCellValue() & 0xFF) != 0) {
																																																									movePointerRight(1);
																																																									increaseCellValue(1);
																																																									movePointerLeft(1);
																																																									decreaseCellValue(1);
																																																									while((getCellValue() & 0xFF) != 0) {
																																																										movePointerRight(1);
																																																										increaseCellValue(1);
																																																										movePointerLeft(1);
																																																										decreaseCellValue(1);
																																																										while((getCellValue() & 0xFF) != 0) {
																																																											movePointerRight(1);
																																																											increaseCellValue(1);
																																																											movePointerLeft(1);
																																																											decreaseCellValue(1);
																																																											while((getCellValue() & 0xFF) != 0) {
																																																												movePointerRight(1);
																																																												increaseCellValue(1);
																																																												movePointerLeft(1);
																																																												decreaseCellValue(1);
																																																												while((getCellValue() & 0xFF) != 0) {
																																																													movePointerRight(1);
																																																													increaseCellValue(1);
																																																													movePointerLeft(1);
																																																													decreaseCellValue(1);
																																																													while((getCellValue() & 0xFF) != 0) {
																																																														movePointerRight(1);
																																																														increaseCellValue(1);
																																																														movePointerLeft(1);
																																																														decreaseCellValue(1);
																																																														while((getCellValue() & 0xFF) != 0) {
																																																															movePointerRight(1);
																																																															increaseCellValue(1);
																																																															movePointerLeft(1);
																																																															decreaseCellValue(1);
																																																															while((getCellValue() & 0xFF) != 0) {
																																																																movePointerRight(1);
																																																																increaseCellValue(1);
																																																																movePointerLeft(1);
																																																																decreaseCellValue(1);
																																																																while((getCellValue() & 0xFF) != 0) {
																																																																	movePointerRight(1);
																																																																	increaseCellValue(1);
																																																																	movePointerLeft(1);
																																																																	decreaseCellValue(1);
																																																																	while((getCellValue() & 0xFF) != 0) {
																																																																		movePointerRight(1);
																																																																		increaseCellValue(1);
																																																																		movePointerLeft(1);
																																																																		decreaseCellValue(1);
																																																																		while((getCellValue() & 0xFF) != 0) {
																																																																			movePointerRight(1);
																																																																			increaseCellValue(14);
																																																																			movePointerLeft(1);
																																																																			decreaseCellValue(1);
																																																																			while((getCellValue() & 0xFF) != 0) {
																																																																				movePointerRight(1);
																																																																				increaseCellValue(1);
																																																																				movePointerLeft(1);
																																																																				decreaseCellValue(1);
																																																																				while((getCellValue() & 0xFF) != 0) {
																																																																					movePointerRight(1);
																																																																					increaseCellValue(1);
																																																																					movePointerLeft(1);
																																																																					decreaseCellValue(1);
																																																																					while((getCellValue() & 0xFF) != 0) {
																																																																						movePointerRight(1);
																																																																						increaseCellValue(1);
																																																																						movePointerLeft(1);
																																																																						decreaseCellValue(1);
																																																																						while((getCellValue() & 0xFF) != 0) {
																																																																							movePointerRight(1);
																																																																							increaseCellValue(1);
																																																																							movePointerLeft(1);
																																																																							decreaseCellValue(1);
																																																																							while((getCellValue() & 0xFF) != 0) {
																																																																								movePointerRight(1);
																																																																								increaseCellValue(1);
																																																																								movePointerLeft(1);
																																																																								decreaseCellValue(1);
																																																																								while((getCellValue() & 0xFF) != 0) {
																																																																									movePointerRight(1);
																																																																									increaseCellValue(1);
																																																																									movePointerLeft(1);
																																																																									decreaseCellValue(1);
																																																																									while((getCellValue() & 0xFF) != 0) {
																																																																										movePointerRight(1);
																																																																										increaseCellValue(1);
																																																																										movePointerLeft(1);
																																																																										decreaseCellValue(1);
																																																																										while((getCellValue() & 0xFF) != 0) {
																																																																											movePointerRight(1);
																																																																											increaseCellValue(1);
																																																																											movePointerLeft(1);
																																																																											decreaseCellValue(1);
																																																																											while((getCellValue() & 0xFF) != 0) {
																																																																												movePointerRight(1);
																																																																												increaseCellValue(1);
																																																																												movePointerLeft(1);
																																																																												decreaseCellValue(1);
																																																																												while((getCellValue() & 0xFF) != 0) {
																																																																													movePointerRight(1);
																																																																													increaseCellValue(1);
																																																																													movePointerLeft(1);
																																																																													decreaseCellValue(1);
																																																																													while((getCellValue() & 0xFF) != 0) {
																																																																														movePointerRight(1);
																																																																														increaseCellValue(1);
																																																																														movePointerLeft(1);
																																																																														decreaseCellValue(1);
																																																																														while((getCellValue() & 0xFF) != 0) {
																																																																															movePointerRight(1);
																																																																															increaseCellValue(1);
																																																																															movePointerLeft(1);
																																																																															decreaseCellValue(1);
																																																																															while((getCellValue() & 0xFF) != 0) {
																																																																																movePointerRight(2);
																																																																																increaseCellValue(5);
																																																																																while((getCellValue() & 0xFF) != 0) {
																																																																																	movePointerLeft(1);
																																																																																	decreaseCellValue(5);
																																																																																	movePointerRight(1);
																																																																																	decreaseCellValue(1);
																																																																																}
																																																																																movePointerLeft(2);
																																																																																decreaseCellValue(1);
																																																																																while((getCellValue() & 0xFF) != 0) {
																																																																																	movePointerRight(1);
																																																																																	increaseCellValue(1);
																																																																																	movePointerLeft(1);
																																																																																	decreaseCellValue(1);
																																																																																	while((getCellValue() & 0xFF) != 0) {
																																																																																		movePointerRight(1);
																																																																																		increaseCellValue(1);
																																																																																		movePointerLeft(1);
																																																																																		decreaseCellValue(1);
																																																																																		while((getCellValue() & 0xFF) != 0) {
																																																																																			movePointerRight(1);
																																																																																			increaseCellValue(1);
																																																																																			movePointerLeft(1);
																																																																																			decreaseCellValue(1);
																																																																																			while((getCellValue() & 0xFF) != 0) {
																																																																																				movePointerRight(1);
																																																																																				increaseCellValue(1);
																																																																																				movePointerLeft(1);
																																																																																				decreaseCellValue(1);
																																																																																				while((getCellValue() & 0xFF) != 0) {
																																																																																					movePointerRight(1);
																																																																																					increaseCellValue(1);
																																																																																					movePointerLeft(1);
																																																																																					decreaseCellValue(1);
																																																																																					while((getCellValue() & 0xFF) != 0) {
																																																																																						movePointerRight(1);
																																																																																						increaseCellValue(1);
																																																																																						movePointerLeft(1);
																																																																																						decreaseCellValue(1);
																																																																																						while((getCellValue() & 0xFF) != 0) {
																																																																																							movePointerRight(1);
																																																																																							increaseCellValue(1);
																																																																																							movePointerLeft(1);
																																																																																							decreaseCellValue(1);
																																																																																							while((getCellValue() & 0xFF) != 0) {
																																																																																								movePointerRight(1);
																																																																																								increaseCellValue(1);
																																																																																								movePointerLeft(1);
																																																																																								decreaseCellValue(1);
																																																																																								while((getCellValue() & 0xFF) != 0) {
																																																																																									movePointerRight(1);
																																																																																									increaseCellValue(1);
																																																																																									movePointerLeft(1);
																																																																																									decreaseCellValue(1);
																																																																																									while((getCellValue() & 0xFF) != 0) {
																																																																																										movePointerRight(1);
																																																																																										increaseCellValue(1);
																																																																																										movePointerLeft(1);
																																																																																										decreaseCellValue(1);
																																																																																										while((getCellValue() & 0xFF) != 0) {
																																																																																											movePointerRight(1);
																																																																																											increaseCellValue(1);
																																																																																											movePointerLeft(1);
																																																																																											decreaseCellValue(1);
																																																																																											while((getCellValue() & 0xFF) != 0) {
																																																																																												movePointerRight(1);
																																																																																												increaseCellValue(1);
																																																																																												movePointerLeft(1);
																																																																																												decreaseCellValue(1);
																																																																																												while((getCellValue() & 0xFF) != 0) {
																																																																																													movePointerRight(1);
																																																																																													increaseCellValue(14);
																																																																																													movePointerLeft(1);
																																																																																													decreaseCellValue(1);
																																																																																													while((getCellValue() & 0xFF) != 0) {
																																																																																														movePointerRight(1);
																																																																																														increaseCellValue(1);
																																																																																														movePointerLeft(1);
																																																																																														decreaseCellValue(1);
																																																																																														while((getCellValue() & 0xFF) != 0) {
																																																																																															movePointerRight(1);
																																																																																															increaseCellValue(1);
																																																																																															movePointerLeft(1);
																																																																																															decreaseCellValue(1);
																																																																																															while((getCellValue() & 0xFF) != 0) {
																																																																																																movePointerRight(1);
																																																																																																increaseCellValue(1);
																																																																																																movePointerLeft(1);
																																																																																																decreaseCellValue(1);
																																																																																																while((getCellValue() & 0xFF) != 0) {
																																																																																																	movePointerRight(1);
																																																																																																	increaseCellValue(1);
																																																																																																	movePointerLeft(1);
																																																																																																	decreaseCellValue(1);
																																																																																																	while((getCellValue() & 0xFF) != 0) {
																																																																																																		movePointerRight(1);
																																																																																																		increaseCellValue(1);
																																																																																																		movePointerLeft(1);
																																																																																																		decreaseCellValue(1);
																																																																																																		while((getCellValue() & 0xFF) != 0) {
																																																																																																			movePointerRight(1);
																																																																																																			increaseCellValue(14);
																																																																																																			movePointerLeft(1);
																																																																																																			decreaseCellValue(1);
																																																																																																			while((getCellValue() & 0xFF) != 0) {
																																																																																																				movePointerRight(1);
																																																																																																				increaseCellValue(1);
																																																																																																				movePointerLeft(1);
																																																																																																				decreaseCellValue(1);
																																																																																																				while((getCellValue() & 0xFF) != 0) {
																																																																																																					movePointerRight(1);
																																																																																																					increaseCellValue(1);
																																																																																																					movePointerLeft(1);
																																																																																																					decreaseCellValue(1);
																																																																																																					while((getCellValue() & 0xFF) != 0) {
																																																																																																						movePointerRight(1);
																																																																																																						increaseCellValue(1);
																																																																																																						movePointerLeft(1);
																																																																																																						decreaseCellValue(1);
																																																																																																						while((getCellValue() & 0xFF) != 0) {
																																																																																																							movePointerRight(1);
																																																																																																							increaseCellValue(1);
																																																																																																							movePointerLeft(1);
																																																																																																							decreaseCellValue(1);
																																																																																																							while((getCellValue() & 0xFF) != 0) {
																																																																																																								movePointerRight(1);
																																																																																																								increaseCellValue(1);
																																																																																																								movePointerLeft(1);
																																																																																																								decreaseCellValue(1);
																																																																																																								while((getCellValue() & 0xFF) != 0) {
																																																																																																									movePointerRight(1);
																																																																																																									increaseCellValue(1);
																																																																																																									movePointerLeft(1);
																																																																																																									decreaseCellValue(1);
																																																																																																									while((getCellValue() & 0xFF) != 0) {
																																																																																																										movePointerRight(1);
																																																																																																										increaseCellValue(1);
																																																																																																										movePointerLeft(1);
																																																																																																										decreaseCellValue(1);
																																																																																																										while((getCellValue() & 0xFF) != 0) {
																																																																																																											movePointerRight(1);
																																																																																																											increaseCellValue(1);
																																																																																																											movePointerLeft(1);
																																																																																																											decreaseCellValue(1);
																																																																																																											while((getCellValue() & 0xFF) != 0) {
																																																																																																												movePointerRight(1);
																																																																																																												increaseCellValue(1);
																																																																																																												movePointerLeft(1);
																																																																																																												decreaseCellValue(1);
																																																																																																												while((getCellValue() & 0xFF) != 0) {
																																																																																																													movePointerRight(1);
																																																																																																													increaseCellValue(1);
																																																																																																													movePointerLeft(1);
																																																																																																													decreaseCellValue(1);
																																																																																																													while((getCellValue() & 0xFF) != 0) {
																																																																																																														movePointerRight(1);
																																																																																																														increaseCellValue(1);
																																																																																																														movePointerLeft(1);
																																																																																																														decreaseCellValue(1);
																																																																																																														while((getCellValue() & 0xFF) != 0) {
																																																																																																															movePointerRight(1);
																																																																																																															increaseCellValue(1);
																																																																																																															movePointerLeft(1);
																																																																																																															decreaseCellValue(1);
																																																																																																															while((getCellValue() & 0xFF) != 0) {
																																																																																																																movePointerRight(2);
																																																																																																																increaseCellValue(5);
																																																																																																																while((getCellValue() & 0xFF) != 0) {
																																																																																																																	movePointerLeft(1);
																																																																																																																	decreaseCellValue(5);
																																																																																																																	movePointerRight(1);
																																																																																																																	decreaseCellValue(1);
																																																																																																																}
																																																																																																																movePointerLeft(2);
																																																																																																																decreaseCellValue(1);
																																																																																																																while((getCellValue() & 0xFF) != 0) {
																																																																																																																	movePointerRight(1);
																																																																																																																	increaseCellValue(1);
																																																																																																																	movePointerLeft(1);
																																																																																																																	decreaseCellValue(1);
																																																																																																																	while((getCellValue() & 0xFF) != 0) {
																																																																																																																		movePointerRight(1);
																																																																																																																		increaseCellValue(1);
																																																																																																																		movePointerLeft(1);
																																																																																																																		decreaseCellValue(1);
																																																																																																																		while((getCellValue() & 0xFF) != 0) {
																																																																																																																			movePointerRight(1);
																																																																																																																			increaseCellValue(1);
																																																																																																																			movePointerLeft(1);
																																																																																																																			decreaseCellValue(1);
																																																																																																																			while((getCellValue() & 0xFF) != 0) {
																																																																																																																				movePointerRight(1);
																																																																																																																				increaseCellValue(1);
																																																																																																																				movePointerLeft(1);
																																																																																																																				decreaseCellValue(1);
																																																																																																																				while((getCellValue() & 0xFF) != 0) {
																																																																																																																					movePointerRight(1);
																																																																																																																					increaseCellValue(1);
																																																																																																																					movePointerLeft(1);
																																																																																																																					decreaseCellValue(1);
																																																																																																																					while((getCellValue() & 0xFF) != 0) {
																																																																																																																						movePointerRight(1);
																																																																																																																						increaseCellValue(1);
																																																																																																																						movePointerLeft(1);
																																																																																																																						decreaseCellValue(1);
																																																																																																																						while((getCellValue() & 0xFF) != 0) {
																																																																																																																							movePointerRight(1);
																																																																																																																							increaseCellValue(1);
																																																																																																																							movePointerLeft(1);
																																																																																																																							decreaseCellValue(1);
																																																																																																																							while((getCellValue() & 0xFF) != 0) {
																																																																																																																								movePointerRight(1);
																																																																																																																								increaseCellValue(1);
																																																																																																																								movePointerLeft(1);
																																																																																																																								decreaseCellValue(1);
																																																																																																																								while((getCellValue() & 0xFF) != 0) {
																																																																																																																									movePointerRight(1);
																																																																																																																									increaseCellValue(1);
																																																																																																																									movePointerLeft(1);
																																																																																																																									decreaseCellValue(1);
																																																																																																																									while((getCellValue() & 0xFF) != 0) {
																																																																																																																										movePointerRight(1);
																																																																																																																										increaseCellValue(1);
																																																																																																																										movePointerLeft(1);
																																																																																																																										decreaseCellValue(1);
																																																																																																																										while((getCellValue() & 0xFF) != 0) {
																																																																																																																											movePointerRight(1);
																																																																																																																											increaseCellValue(1);
																																																																																																																											movePointerLeft(1);
																																																																																																																											decreaseCellValue(1);
																																																																																																																											while((getCellValue() & 0xFF) != 0) {
																																																																																																																												movePointerRight(1);
																																																																																																																												increaseCellValue(1);
																																																																																																																												movePointerLeft(1);
																																																																																																																												decreaseCellValue(1);
																																																																																																																												while((getCellValue() & 0xFF) != 0) {
																																																																																																																													movePointerRight(1);
																																																																																																																													increaseCellValue(14);
																																																																																																																													movePointerLeft(1);
																																																																																																																													decreaseCellValue(1);
																																																																																																																													while((getCellValue() & 0xFF) != 0) {
																																																																																																																														movePointerRight(1);
																																																																																																																														increaseCellValue(1);
																																																																																																																														movePointerLeft(1);
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
			outputCurrentCell();
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerLeft(1);
			inputIntoCurrentCell();
		}
		while((getCellValue() & 0xFF) != 0) {
			outputCurrentCell();
			outputCurrentCell();
		}
	}

	public static void main(String[] args) {
		new Rot13Cristofani();
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
