package libraries;

public class Sender {
	int senderId;
	Location startingLocation;
	Location destinationLocation;
	DateTime startingDateTime;
	float rating;

	public int getSenderId() {
		return senderId;
	}

	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	public Location getStartingLocation() {
		return startingLocation;
	}

	public void setStartingLocation(Location startingLocation) {
		this.startingLocation = startingLocation;
	}

	public Location getDestinationLocation() {
		return destinationLocation;
	}

	public void setDestinationLocation(Location destinationLocation) {
		this.destinationLocation = destinationLocation;
	}

	public DateTime getStartingDateTime() {
		return startingDateTime;
	}

	public void setStartingDateTime(DateTime startingDateTime) {
		this.startingDateTime = startingDateTime;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Sender [senderId=" + senderId + ", startingLocation=" + startingLocation + ", destinationLocation="
				+ destinationLocation + ", startingDateTime=" + startingDateTime + ", rating=" + rating + "]";
	}
}
