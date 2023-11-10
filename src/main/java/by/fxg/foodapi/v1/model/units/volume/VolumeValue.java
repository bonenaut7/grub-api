package by.fxg.foodapi.v1.model.units.volume;
//package by.fxg.foodapi.model.units.volume;
//
//import by.fxg.foodapi.model.units.ITypedMeasurmentValue;
//import by.fxg.foodapi.model.units.weight.WeightUnit;
//import by.fxg.foodapi.model.units.weight.WeightValue;
//
//public final class VolumeValue implements ITypedMeasurmentValue<VolumeValue, VolumeUnit> {
//	public static final VolumeValue ZERO = new VolumeValue(VolumeUnit.MILLILITER, 0);
//	
//	private VolumeUnit unit;
//	private double value;
//	
//	private VolumeValue(VolumeUnit unit, double value) {
//		this.unit = unit;
//		this.value = value;
//	}
//	
//	public static VolumeValue of(VolumeUnit unit, double value) {
//		return new VolumeValue(unit, value);
//	}
//	
//	/** @return WeightValue in Kilograms of volume, based on density kg*m3 **/
//	public WeightValue toWeight(double densityKgM3) {
//		return WeightValue.of(WeightUnit.KILOGRAM, get(VolumeUnit.LITER) * densityKgM3);
//	}
//	
//	//
//	
//	@Override
//	public double get(VolumeUnit unitType) {
//		return getUnit().convertValue(get(), unitType);
//	}
//
//	@Override
//	public double get() {
//		return this.value;
//	}
//
//	@Override
//	public VolumeUnit getUnit() {
//		return this.unit;
//	}
//	
//	@Override
//	public VolumeValue setUnit(VolumeUnit unitType) {
//		this.unit = unitType;
//		return this;
//	}
//	
//	@Override
//	public VolumeValue convertToUnit(VolumeUnit unitType) {
//		return set(getUnit().convertValue(get(), unitType)).setUnit(unitType);
//	}
//	
//	//
//
//	@Override
//	public VolumeValue set(double value) {
//		return set(value);
//	}
//	
//	@Override
//	public VolumeValue set(VolumeUnit unitType, double value) {
//		return set(unitType.convertValue(value, getUnit()));
//	}
//
//	@Override
//	public VolumeValue set(VolumeValue unit) {
//		return set(unit.get(getUnit()));
//	}
//
//	@Override
//	public VolumeValue add(double value) {
//		return set(get() + value);
//	}
//
//	@Override
//	public VolumeValue add(VolumeUnit unitType, double value) {
//		return set(get() + unitType.convertValue(value, getUnit()));
//	}
//	
//	@Override
//	public VolumeValue add(VolumeValue unit) {
//		return set(get() + unit.get(getUnit()));
//	}
//
//	@Override
//	public VolumeValue sub(double value) {
//		return set(get() + value);
//	}
//	
//	@Override
//	public VolumeValue sub(VolumeUnit unitType, double value) {
//		return set(get() - unitType.convertValue(value, getUnit()));
//	}
//
//	@Override
//	public VolumeValue sub(VolumeValue unit) {
//		return set(get() - unit.get(getUnit()));
//	}
//
//	@Override
//	public VolumeValue scale(double value) {
//		return set(get() * value);
//	}
//
//	@Override
//	public VolumeValue multiply(VolumeValue unit) {
//		return set(get() * unit.get(getUnit()));
//	}
//
//	@Override
//	public VolumeValue divide(VolumeValue unit) {
//		return set(get() / unit.get(getUnit()));
//	}
//	
//	//
//
//	@Override
//	public VolumeValue copy() {
//		return new VolumeValue(getUnit(), get());
//	}
//
//	@Override
//	public VolumeValue copyAs(VolumeUnit unit) {
//		return new VolumeValue(unit, getUnit().convertValue(get(), unit));
//	}
//
//	@Override
//	public VolumeValue copyFrom(VolumeValue unit) {
//		this.unit = unit.unit;
//		this.value = unit.value;
//		return this;
//	}
//}
