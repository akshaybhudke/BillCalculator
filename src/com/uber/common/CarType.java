package com.uber.common;

public enum CarType {
	
	SMALL(4),MEDIUM(8),LARGE(15);
	
	private int passangerCount;
    CarType(int passangerCount) {
        this.passangerCount = passangerCount;
    }
    public int getPassangerCount() {
		return passangerCount;
	}

}
