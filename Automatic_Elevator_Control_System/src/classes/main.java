package classes;

/**
 *
 * @author Group8
 */
public class main {

	protected static int max_person = 8;
	protected static double max_weight = 900.00;
	protected static String mail = "iit2020142@iiita.ac.in";

	public static void set_weight(double w) {
		max_weight = w;
	}

	public static void set_person(int person) {
		max_person = person;
	}

	public static void set_mail(String s) {
		mail = s;
	}

	public static double get_weight() {
		return max_weight;
	}

	public static int get_person() {
		return max_person;
	}

	public static String get_mail() {
		return mail;
	}

	public static void main(String[] args) {
		int p = get_person();
		System.out.println(p);
		// report_generate r = new report_generate(10, 23, 23, 12, false, false);
		emergencycall kirti = new emergencycall();
		kirti.run();
	}

}
