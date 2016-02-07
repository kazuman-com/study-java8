/**
 * 
 */
package lambda;

/**
 * @author —_–œ
 *
 */
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hoge hoge1 = () -> { System.out.println("hoge1"); };
		Hoge hoge2 = () -> System.out.println("hoge2");
		
		hoge1.print();
		hoge2.print();
	}

}
