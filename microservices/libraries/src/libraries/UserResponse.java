package libraries;

enum ReasonType {
	TransporterReject, TransporterAccept, SenderReject, SenderAccept;
}

public class UserResponse {

	ReasonType responseType;
	String reason;

	public ReasonType getResponseType() {
		return responseType;
	}

	public void setResponseType(ReasonType responseType) {
		this.responseType = responseType;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "UserResponse [responseType=" + responseType + ", reason=" + reason + "]";
	}
}
