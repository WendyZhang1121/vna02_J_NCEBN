package vna02_J_NCEBN;

final class Flag {
	private boolean flag = true;
	public void toggle() { // Unsafe
		flag ^= true; // Same as flag = !flag;
	}
	public boolean getFlag() { // Unsafe 
		return flag;
	} 
	}
