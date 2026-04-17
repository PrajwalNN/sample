class Plant {
	void Name() {
		System.out.println("Lotus");
	}
}

class Leaf extends Plant {
	void color() {
		System.out.println("green");
	}
}

class Color extends Leaf {
	void color_P() {
		System.out.println("red");
	}
}

class Plant_info {
	public static void main (String[] args) {
		Color c = new Color();
		c.Name();
		c.color();
		c.color_P();
	}
}
