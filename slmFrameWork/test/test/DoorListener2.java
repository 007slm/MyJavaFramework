package test;

public class DoorListener2 implements DoorListener {
	public void doorEvent(DoorEvent event) {
		if (event.getDoorState() != null && event.getDoorState().equals("open")) {
			System.out.println("门2打开，同时打开走廊的灯");
		} else {
			System.out.println("门2关闭，同时关闭走廊的灯");
		}
	}
}
