public class Copyright {
	private byte[] _array = new byte[0];
	private int _pointer = 0;
	
	public Copyright() {
		movePointerRight(1);
		increaseCellValue(8);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(8);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(2);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(6);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(8);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(4);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(2);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(2);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(2);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(2);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(5);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(4);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(2);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(2);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(5);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(6);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(3);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(2);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(3);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(5);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(7);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(5);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(6);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(4);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(6);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(8);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(4);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(2);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(2);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(2);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(2);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(5);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(4);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(2);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(2);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(8);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(9);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(3);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(9);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(9);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(3);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(2);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(2);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(8);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(9);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(7);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(6);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(7);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(4);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(5);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(3);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(4);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(5);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(4);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(5);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(8);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(8);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(5);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(7);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
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
		decreaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(2);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(4);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(1);
		outputCurrentCell();
		increaseCellValue(2);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(5);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(8);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(8);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(3);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(4);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(5);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
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
		decreaseCellValue(2);
		outputCurrentCell();
		increaseCellValue(3);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(2);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(3);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(1);
		outputCurrentCell();
		increaseCellValue(3);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(2);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(3);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(9);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(9);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(7);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(7);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(5);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(5);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(1);
		outputCurrentCell();
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(3);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(2);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(3);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		decreaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(8);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(9);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(6);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(4);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(1);
		outputCurrentCell();
		decreaseCellValue(3);
		outputCurrentCell();
		increaseCellValue(2);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(6);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(6);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(2);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(7);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(8);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(1);
		outputCurrentCell();
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
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(3);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(2);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(3);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(3);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		decreaseCellValue(2);
		outputCurrentCell();
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(9);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(9);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(3);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(2);
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
			movePointerLeft(1);
			increaseCellValue(8);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(3);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(7);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(8);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(2);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(3);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(4);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(2);
		outputCurrentCell();
		decreaseCellValue(2);
		outputCurrentCell();
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(2);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(2);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(4);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(5);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(2);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(5);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(6);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(3);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(6);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(7);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(3);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(4);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(9);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(9);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(7);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(7);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(2);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(5);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(5);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(3);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(3);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(2);
		outputCurrentCell();
		increaseCellValue(3);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(4);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(5);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(2);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(4);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(8);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(8);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(5);
		outputCurrentCell();
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
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(3);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(4);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(5);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(2);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(5);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(5);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(3);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(5);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(5);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(3);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(8);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(9);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		outputCurrentCell();
		decreaseCellValue(4);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(7);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(7);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(5);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(3);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(2);
		outputCurrentCell();
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(7);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(7);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(4);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(1);
		outputCurrentCell();
		increaseCellValue(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(8);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(8);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(5);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(7);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(7);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		increaseCellValue(4);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(3);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		decreaseCellValue(2);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(8);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(9);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(5);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(5);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(6);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(7);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			decreaseCellValue(7);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(3);
		outputCurrentCell();
	}

	public static void main(String[] args) {
		new Copyright();
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
