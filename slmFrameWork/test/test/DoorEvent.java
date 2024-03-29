package test;

import java.util.EventObject;

public class DoorEvent extends EventObject {
	// 表示门的状态，有“开”和“关”两种
	private String doorState = "";

	public DoorEvent(Object source, String doorState) {
		super(source);
		this.doorState = doorState;
	}

	public void setDoorState(String doorState) {
		this.doorState = doorState;
	}

	public String getDoorState() {
		return this.doorState;
	}
}
