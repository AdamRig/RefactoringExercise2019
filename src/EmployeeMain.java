
public class EmployeeMain {
	
	static EmployeeDetails empDetails = new EmployeeDetails();
	
	// main method
		public static void main(String args[]) {
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					empDetails.createAndShowGUI();
				}
			});
		}// end main

}
