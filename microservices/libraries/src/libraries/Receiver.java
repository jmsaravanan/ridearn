package libraries;

public class Receiver {
	int receiverId;
	String receiverName;
	String receiverAddress;
	String receiverLandmark;
	DateTime receiverTime;
	String receiverOTP;

	public int getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(int receiverId) {
		this.receiverId = receiverId;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverLandmark() {
		return receiverLandmark;
	}

	public void setReceiverLandmark(String receiverLandmark) {
		this.receiverLandmark = receiverLandmark;
	}

	public DateTime getReceiverTime() {
		return receiverTime;
	}

	public void setReceiverTime(DateTime receiverTime) {
		this.receiverTime = receiverTime;
	}

	public String getReceiverOTP() {
		return receiverOTP;
	}

	public void setReceiverOTP(String receiverOTP) {
		this.receiverOTP = receiverOTP;
	}

	@Override
	public String toString() {
		return "Receiver [receiverId=" + receiverId + ", receiverName=" + receiverName + ", receiverAddress="
				+ receiverAddress + ", receiverLandmark=" + receiverLandmark + ", receiverTime=" + receiverTime
				+ ", receiverOTP=" + receiverOTP + "]";
	}

}
