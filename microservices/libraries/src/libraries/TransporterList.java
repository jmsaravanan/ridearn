package libraries;

import java.util.List;

public class TransporterList {
	DateTime atTime;
	List<Transporter> transporters;

	public DateTime getAtTime() {
		return atTime;
	}

	public void setAtTime(DateTime atTime) {
		this.atTime = atTime;
	}

	public List<Transporter> getTransporters() {
		return transporters;
	}

	public void setTransporters(List<Transporter> transporters) {
		this.transporters = transporters;
	}

	@Override
	public String toString() {
		return "TransporterList [atTime=" + atTime + ", transporterList=" + transporters + "]";
	}

}
