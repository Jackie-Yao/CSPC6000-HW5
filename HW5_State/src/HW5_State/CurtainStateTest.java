package HW5_State;

public class CurtainStateTest {

	public static void main(String[] args) {
		// Initialize a curtain object - default closed
		
		CurtainContext Curtain = new CurtainContext();
		Curtain.PrintStatus();
		
		// close curtain doesn't change status
		Curtain.CloseCurtain();
		Curtain.PrintStatus();
		
		Curtain.CloseCurtain();		
		Curtain.PrintStatus();
			
		Curtain.OpenCurtain();
		Curtain.PrintStatus();
		
		Curtain.OpenCurtain();
		Curtain.PrintStatus();

	}

}
