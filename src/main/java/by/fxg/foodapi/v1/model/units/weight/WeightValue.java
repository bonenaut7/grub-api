package by.fxg.foodapi.v1.model.units.weight;

import by.fxg.foodapi.v1.model.units.ITypedMeasurmentValue;

public final class WeightValue implements ITypedMeasurmentValue<WeightValue, WeightUnit> {
	public static final WeightValue ZERO = new WeightValue(WeightUnit.GRAM, 0);
	
	private WeightUnit unit;
	private double value;
	
	private WeightValue(WeightUnit unit, double value) {
		this.unit = unit;
		this.value = value;
	}
	
	public static WeightValue of(WeightUnit unit, double value) {
		return new WeightValue(unit, value);
	}
	
	/** @return VolumeValue in Liters based on density kg*m3 **/
//	public VolumeValue toVolume(double densityKgM3) {
//		return VolumeValue.of(VolumeUnit.LITER, get(WeightUnit.KILOGRAM) / densityKgM3);
//	}
	
	//
	
	@Override
	public double get(WeightUnit unitType) {
		return getUnit().convertValue(get(), unitType);
	}

	@Override
	public double get() {
		return this.value;
	}

	@Override
	public WeightUnit getUnit() {
		return this.unit;
	}
	
	@Override
	public WeightValue setUnit(WeightUnit unitType) {
		this.unit = unitType;
		return this;
	}
	
	@Override
	public WeightValue convertToUnit(WeightUnit unitType) {
		return set(getUnit().convertValue(get(), unitType)).setUnit(unitType);
	}
	
	//

	@Override
	public WeightValue set(double value) {
		this.value = value;
		return this;
	}
	
	@Override
	public WeightValue set(WeightUnit unitType, double value) {
		return set(unitType.convertValue(value, getUnit()));
	}

	@Override
	public WeightValue set(WeightValue unit) {
		return set(unit.get(getUnit()));
	}

	@Override
	public WeightValue add(double value) {
		return set(get() + value);
	}

	@Override
	public WeightValue add(WeightUnit unitType, double value) {
		return set(get() + unitType.convertValue(value, getUnit()));
	}
	
	@Override
	public WeightValue add(WeightValue unit) {
		return set(get() + unit.get(getUnit()));
	}

	@Override
	public WeightValue sub(double value) {
		return set(get() + value);
	}
	
	@Override
	public WeightValue sub(WeightUnit unitType, double value) {
		return set(get() - unitType.convertValue(value, getUnit()));
	}

	@Override
	public WeightValue sub(WeightValue unit) {
		return set(get() - unit.get(getUnit()));
	}

	@Override
	public WeightValue scale(double value) {
		return set(get() * value);
	}

	@Override
	public WeightValue multiply(WeightValue unit) {
		return set(get() * unit.get(getUnit()));
	}

	@Override
	public WeightValue divide(WeightValue unit) {
		return set(get() / unit.get(getUnit()));
	}
	
	//

	@Override
	public WeightValue copy() {
		return new WeightValue(getUnit(), get());
	}

	@Override
	public WeightValue copyAs(WeightUnit unit) {
		return new WeightValue(unit, getUnit().convertValue(get(), unit));
	}

	@Override
	public WeightValue copyFrom(WeightValue unit) {
		this.unit = unit.unit;
		this.value = unit.value;
		return this;
	}
}
