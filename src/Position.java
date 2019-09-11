
public class Position{
	private char row;
	private int  column;
	private static final char[] let = {'A','B','C','D','E','F','G','H','I','J'} ;
	public Position(char first, int num) {
		 row = first;
		 column = num;
	}
	public Position (int rindex, int cindex) {
		int bcordr = rindex++;
		row = let[bcordr];
		int newcindex = cindex+1;
		column = newcindex;
	}
	public char row () {
		return row ;
	}
	public int column() {
		return column;
	}
	public String toString() {
		int c = column();
		char r = row();
		String freturn = r+"-"+c;
		return freturn;
	}
	public int rowIndex() {
		boolean found = false;
		for (int i=0;found!= true;i++) {
			if(let[i]==row()) {
				found= true;
				return i;
			}
		}
		return 0;
	}
	public int columnIndex() {
		return column-1;
	}
}



