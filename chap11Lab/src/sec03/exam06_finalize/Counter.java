package sec03.exam06_finalize;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
		
	}
	protected void finalize() throws Throwable{
		System.out.println(no + "¹ø °´Ã¼ÀÇ finallize°¡ ½ÇÇàµÊ");
	}
	
	
}
