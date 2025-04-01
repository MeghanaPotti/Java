package Java;


class Cosmopolitan {
	
	void status() {
		System.out.println("Cosmopolitan city");
	}
}

class Metropolitan extends Cosmopolitan {
	void status() {
		System.out.println("Metropolitan city");
	}
}

class Urban extends Metropolitan {
	void status() {
		System.out.println("Urban city");
	}
}

class Rural extends Urban {
	void status() {
		System.out.println("Rural village");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		 Rural object = new Rural();
		 object.status();
	}

}

