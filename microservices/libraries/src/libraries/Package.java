package libraries;

import java.awt.image.BufferedImage;

public class Package {

	int packageId;
	String dimensionType; // CM/Inches/foot etc
	String weight;
	String cost;
	String notes;
	BufferedImage pic;

	public int getPackageId() {
		return packageId;
	}

	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}

	public String getDimensionType() {
		return dimensionType;
	}

	public void setDimensionType(String dimensionType) {
		this.dimensionType = dimensionType;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public BufferedImage getPic() {
		return pic;
	}

	public void setPic(BufferedImage pic) {
		this.pic = pic;
	}

	@Override
	public String toString() {
		return "Package [packageId=" + packageId + ", dimensionType=" + dimensionType + ", weight=" + weight + ", cost="
				+ cost + ", notes=" + notes + "]";
	}

}
