package ex1;

public class LowerBatteryWarning implements Observer{

	private static final int LOW_BATTERY = 30;
	private Battery battery;
	
	public LowerBatteryWarning(Battery battery) {
		this.battery = battery;
	}
	
	@Override
	public void update() {
		int level = battery.getLevel();
		if(level < LOW_BATTERY) {
			System.out.println("<Warning> Low Battery: " + level + " Compared with " + LOW_BATTERY);
		}
	}

}
