package 线程通信;

public class ShareResource {
	private String name;
	private String gender;
	
	//存储数据
	public void push(String name,String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	//消费
	public void popup() {
		System.out.println(this.name + "-" + this.gender);
	}
}
