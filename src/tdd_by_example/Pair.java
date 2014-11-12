package tdd_by_example;

public class Pair {
	private String from;
	private String to;
	
	Pair(String from, String to){
		this.from = from;
		this.to = to;
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Pair pair = (Pair) o;
		if (from != null ? !from.equals(pair.from) : pair.from != null) return false;
		if (to != null ? !to.equals(pair.to) : pair.to != null) return false;
		return true;
	}

	public int hashCode() {
		return 0;
	}
}


// class Pair {
// 	private String from;
// 	private String to;

// 	Pair(String from, String to) {
// 		this.from = from;
// 		this.to = to;
// 	}

// 	public boolean equals(Object object) {
// 		Pair pair = (Pair) object;
// 		return from.equals(pair.from) && to.equals(pair.to);
// 	}

// 	public int hasCode() {
// 		return 0;
// 	}
// }

