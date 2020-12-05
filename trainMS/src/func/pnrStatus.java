package func;
public class pnrStatus {
	public long pnr;
	public long train_id;
	public int age,seat_no;
	public String p_name,gender,reserve_status,u_id, status_id;
	public pnrStatus(long pnr,String p_name,int age,String gender,int seat_no,String reserve_status,String u_id,String status_id,long train_id) {
		this.age=age;
		this.gender=gender;
		this.p_name=p_name;
		this.pnr=pnr;
		this.reserve_status=reserve_status;
		this.seat_no=seat_no;
		this.status_id=status_id;
		this.train_id=train_id;
		this.u_id=u_id;
	}
}
