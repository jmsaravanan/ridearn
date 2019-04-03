package libraries;

public class ReceiverNotify {
	String mobile;
	String email;
	String info;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "ReceiverNotify [mobile=" + mobile + ", email=" + email + ", info=" + info + "]";
	}

}
