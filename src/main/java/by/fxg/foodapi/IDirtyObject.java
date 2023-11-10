package by.fxg.foodapi;

public interface IDirtyObject {
	default void markDirty() {
		if (!isDirty()) {
			setDirty(true);
		}
	}
	
	default void resetDirty() {
		if (isDirty()) {
			setDirty(false);
		}
	}
	
	boolean isDirty();
	void setDirty(boolean isDirty);
}
