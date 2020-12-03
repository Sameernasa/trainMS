package func;

public class route {
	long train_id;
	int stop_no;
	String arr_time, dept_time,station_id;
	public route(long train_id,String station_id,int stop_no,String arr_time,String dept_time) {
		this.station_id=station_id;
		this.arr_time=arr_time;
		this.dept_time=dept_time;
		this.stop_no=stop_no;
		this.train_id=train_id;
		
	}
}
