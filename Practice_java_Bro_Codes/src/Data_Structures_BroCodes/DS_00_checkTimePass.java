package Data_Structures_BroCodes;

public class DS_00_checkTimePass {

	public static void main(String[] args) throws InterruptedException {

		long start = System.nanoTime();
		
		// -----------program---------------
		
		Thread.sleep(3000);
		
		// ---------------------------------
		
//		long duration = (System.nanoTime() - start);
//		System.out.println(duration +" nano sec");
		
		long durationInMilliSeconds = (System.nanoTime()-start)/1000000;
		System.out.println(durationInMilliSeconds +"ms");
	}

}
