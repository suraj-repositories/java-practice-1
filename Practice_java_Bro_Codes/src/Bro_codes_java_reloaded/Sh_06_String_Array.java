package Bro_codes_java_reloaded;

public class Sh_06_String_Array {

	public static void main(String[] args) {
		
//		1-D array
	/*
		String[] cars = new String[3];
		
		cars[0] = "Nano";
		cars[1] = "suzuki";
		cars[2] = "Tesla";
		
		for (int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
	*/
		
//		2-D array
		
		String[][] cars = new String[3][3];
		cars[0][0] = "Camaro";
		cars[0][1] = "Corvette";
		cars[0][2] = "Silverado";
		cars[1][0] = "Mustang";
		cars[1][1] = "Ranger";
		cars[1][2] = "F-150";
		cars[2][0] = "Ferrari";
		cars[2][1] = "Lambo";
		cars[2][2] = "Tesla";
		
		/* ANOTHER WAY */
//		String[][] cars = { { "camaro","corvette","Silverado"},
//							{"Mustang","Ranger","F-150"},
//							{"Rerrari","Lambo","Tesla"}
//							};
		
		for(int i=0;i<cars.length;i++) {			// number of rows
			System.out.println();
			for(int j=0;j<cars[i].length;j++) {		// number of elements in row
				System.out.print(cars[i][j]+ "  ");
			}
		}

		
		

	}
}
