public class Tester {
	public static void main (String [] args) {
		battleShiptwo();
	}
	public static void battleShipone() {
		Position bruh = new Position('J',10 );
		Position bruhtwo = new Position('A', 1);
		System.out.println(bruh.toString());
		System.out.println(bruhtwo.toString());
	}
	public static void battleShiptwo() {
		Position bruh = new Position('J',10 );
		Position bruhtwo = new Position('A', 1);
		Position bruhthree = new Position ('E',5);
		Position bruhfour = new Position(9,9);
		System.out.println("EXPECTED: J,10,9,9,J-10");
		System.out.println("Row : "+bruh.row());
		System.out.println("Column : "+bruh.column());
		System.out.println("RowIndex : "+bruh.rowIndex());
		System.out.println("ColumnIndex : "+bruh.columnIndex());
		System.out.println("toString : "+bruh.toString()+"\n");
		
		System.out.println("Expected A,1,0,0,A-1");
		System.out.println("Row : "+bruhtwo.row());
		System.out.println("Column : "+bruhtwo.column());
		System.out.println("RowIndex : "+bruhtwo.rowIndex());
		System.out.println("ColumnIndex : "+bruhtwo.columnIndex());
		System.out.println("toString : "+bruhtwo.toString()+"\n");
		
		System.out.println("EXPECTED E,5,4,4,E-5");
		System.out.println("Row : "+bruhthree.row());
		System.out.println("Column : "+bruhthree.column());
		System.out.println("RowIndex : "+bruhthree.rowIndex());
		System.out.println("ColumnIndex : "+bruhthree.columnIndex());
		System.out.println("toString : "+bruhthree.toString()+"\n");
		
		System.out.println("Expected J,10,9,9,J-10");
		System.out.println("Row : "+bruhfour.row());
		System.out.println("Column : "+bruhfour.column());
		System.out.println("RowIndex : "+bruhfour.rowIndex());
		System.out.println("ColumnIndex : "+bruhfour.columnIndex());
		System.out.println("toString : "+bruhfour.toString());
		
	}
}