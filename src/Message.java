public class Message {
	
	private User sender;
    private User receiver;
    private String msg;
    private String time;
    
	public Message(User sender, User receiver, String msg, String time) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.msg = msg;
		this.time = time;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
