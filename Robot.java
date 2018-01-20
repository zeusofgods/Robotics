public class Robot {
	
	private double cubeOnSwitch;
	private double cubeOnScale;
	private double tossOnSwitchClose = 17/20;
	private double tossOnScaleClose = 1/2;
	private double tossOnSwitchFar = 1/2;
	private double tossOnScaleFar = 7/20;
	private double singleClimb;
	private double dualClimb;
	
	public Robot(double cubeOnSwitch, double cubeOnScale, double singleClimb) {
		this.cubeOnSwitch = cubeOnSwitch;
		this.cubeOnScale = cubeOnScale;
		this.singleClimb = singleClimb;
		this.dualClimb = 0.75*singleClimb;
	}
	
	public String getCubeOnSwitch() {
		return (int)(cubeOnSwitch*100) + "%";
	}
	
	public String getCubeOnScale() {
		return (int)(cubeOnScale*100) + "%";
	}
	
	public String getTossOnSwitchClose() {
		return (int)(tossOnSwitchClose*100) + "%";
	}
	
	public String getTossOnScaleClose() {
		return (int)(tossOnScaleClose*100) + "%";
	}
	
	public String getTossOnSwitchFar() {
		return (int)(tossOnSwitchFar*100) + "%";
	}
	
	public String getTossOnScaleFar() {
		return (int)(tossOnScaleFar*100) + "%";
	}
	
	public String getSingleClimb() {
		return (int)(singleClimb*100) + "%";
	}
	
	public String getDualClimb() {
		return (int)(dualClimb*100) + "%";
	}
}
