package by.fxg.foodapi.v1.model.units.glycemicindex;

import by.fxg.foodapi.v1.model.units.IMeasurmentValue;

public class GlycemicIndex implements IMeasurmentValue<GlycemicIndex> {
	public static final GlycemicIndex ZERO = null;
	public static final int MIN_VALUE = 0, MAX_VALUE = 100;
	
	protected double value;
	
	protected GlycemicIndex(double value) {
		this.value = Math.max(MIN_VALUE, Math.min(value, MAX_VALUE));
	}

	public static GlycemicIndex of(double value) {
		return new GlycemicIndex(value);
	}
	
	public GlycemicIndexType getType() { 
		return GlycemicIndexType.getType(get());
	}
	
	//
	
	@Override
	public double get() {
		return this.value;
	}

	@Override
	public GlycemicIndex set(double value) {
		this.value = Math.max(MIN_VALUE, Math.min(value, MAX_VALUE));
		return this;
	}

	@Override
	public GlycemicIndex set(GlycemicIndex unit) {
		return set(unit.get());
	}

	@Override
	public GlycemicIndex add(double value) {
		return set(get() + value);
	}

	@Override
	public GlycemicIndex add(GlycemicIndex unit) {
		return set(get() + unit.get());
	}

	@Override
	public GlycemicIndex sub(double value) {
		return set(get() - value);
	}

	@Override
	public GlycemicIndex sub(GlycemicIndex unit) {
		return set(get() - unit.get());
	}

	@Override
	public GlycemicIndex scale(double value) {
		return set(get() * value);
	}

	@Override
	public GlycemicIndex multiply(GlycemicIndex unit) {
		return set(get() * unit.get());
	}

	@Override
	public GlycemicIndex divide(GlycemicIndex unit) {
		return set(get() / unit.get());
	}

	@Override
	public GlycemicIndex copy() {
		return new GlycemicIndex(get());
	}

	@Override
	public GlycemicIndex copyFrom(GlycemicIndex unit) {
		return set(unit);
	}
}
