public class ResponseObj {
	String quarter;
	String target;
	String actual;

	public ResponseObj(String quarter, String target, String actual) {
		this.quarter = quarter;
		this.target = target;
		this.actual = actual;
	}

	public String getQuarter() {
		return quarter;
	}

	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getActual() {
		return actual;
	}

	public void setActual(String actual) {
		this.actual = actual;
	}

}
