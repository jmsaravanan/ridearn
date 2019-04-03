package libraries;

public class Transporter {
	int transporterId;
	Location startingLocation;
	Location destinationLocation;
	DateTime startingDateTime;
	DateTime reachingDateTime;
	String vehicleType;
	float rating;

	public int getTransporterId() {
		return transporterId;
	}

	public void setTransporterId(int transporterId) {
		this.transporterId = transporterId;
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

	public DateTime getReachingDateTime() {
		return reachingDateTime;
	}

	public void setReachingDateTime(DateTime reachingDateTime) {
		this.reachingDateTime = reachingDateTime;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Transporter [transporterId=" + transporterId + ", startingLocation=" + startingLocation
				+ ", destinationLocation=" + destinationLocation + ", startingDateTime=" + startingDateTime
				+ ", reachingDateTime=" + reachingDateTime + ", vehicleType=" + vehicleType + ", rating=" + rating
				+ "]";
	}

}
