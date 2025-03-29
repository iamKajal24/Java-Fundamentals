package OOPS;

enum Status {
	Running, Failed, Pending, Success;
}

public class EnumEx {

	public static void main(String[] args) {

		int i = 5;
		Status status = Status.Success;
		System.out.println(status.ordinal()); // ordinal -> atleast one value

		// for all Status
		Status[] ss = Status.values();
		for (Status s : ss) {
			System.out.println(s + " : " + s.ordinal());
		}

		// use if else
		Status s1 = status.Success;

		if (s1 == status.Running) {
			System.out.println("All good");
		} else if (s1 == status.Failed) {
			System.out.println("Try again");
		} else if (s1 == status.Pending) {
			System.out.println("please wait");
		} else {
			System.out.println("Done");
		}

		// use switch case

		switch (s1) {
		case Running:
			System.out.println("All good");
			break;
		case Failed:
			System.out.println("Try again");
			break;
		case Pending:
			System.out.println("please wait");
		default:
			System.out.println("Done");
			break;
		}

	}
}
