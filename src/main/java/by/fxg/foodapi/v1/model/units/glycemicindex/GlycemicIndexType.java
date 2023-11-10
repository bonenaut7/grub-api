package by.fxg.foodapi.v1.model.units.glycemicindex;

public enum GlycemicIndexType {	
	LOW(56),
	MEDIUM(70),
	HIGH(101);
	
	private static final GlycemicIndexType[] values = values();
	private int threshold;

	GlycemicIndexType(int threshold) {
		this.threshold = threshold;
	}
	
	public int getThreshold() {
		return this.threshold;
	}
	
	public static GlycemicIndexType getType(double glycemicIndex) {
		final double clampedIndex = Math.max(GlycemicIndex.MIN_VALUE, Math.min(glycemicIndex, GlycemicIndex.MAX_VALUE));
		for (GlycemicIndexType glycemicIndexType : values) {
			if (clampedIndex < glycemicIndexType.threshold) {
				return glycemicIndexType;
			}
		}
		return MEDIUM;
	}
}
