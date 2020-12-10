package func;

public class trainStatus {
	
	public String status_id;
	public long pnr,train_id;
	public int avai_seat,wait_seat,book_seat;
	public trainStatus() {
		
	}
	public trainStatus(String status_id,long pnr,long train_id,int avai_seat,int book_seat,int wait_seat) {
		this.avai_seat=avai_seat;
		this.book_seat=book_seat;
		this.pnr=pnr;
		this.status_id=status_id;
		this.wait_seat=wait_seat;
		this.train_id=train_id;
		
	}
}
