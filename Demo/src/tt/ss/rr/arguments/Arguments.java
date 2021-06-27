package tt.ss.rr.arguments;

/**
 * arguments參數的測試
 * 
 * @author Tyousaryuu
 *
 * 2021年6月23日
 */
public class Arguments {
	public static void main(String[] args) {
		System.out.println("program arguments:");
		if (args == null || args.length == 0) {
			System.out.println("\t" + "no input params");
		} else {
			for (String string : args) {// Run configurations/Arguments/Program arguments
										//  sample:1 2 3
				System.out.println("\t" + string);
			}
		}
	}
}
