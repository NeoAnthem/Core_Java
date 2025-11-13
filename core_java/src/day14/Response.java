package day14;

public class Response<R> {
	
	// FIZZBUZZ
	private R msg;

	public R getMsg() {
		return msg;
	}

	public void setMsg(R msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Response [msg=" + msg + "]";
	}
	
	
	
}