package by.fxg.foodapi.v1.model.units.energy;

import by.fxg.foodapi.v1.model.units.ITypedMeasurmentValue;

public final class EnergyValue implements ITypedMeasurmentValue<EnergyValue, EnergyUnit> {
	public static final EnergyValue ZERO = new EnergyValue(EnergyUnit.KILOCALORIE, 0);
	
	private EnergyUnit unit;
	private double value;
	
	private EnergyValue(EnergyUnit unit, double value) {
		this.unit = unit;
		this.value = value;
	}
	
	public static EnergyValue of(EnergyUnit unit, double value) {
		return new EnergyValue(unit, value);
	}
	
	//
	
	@Override
	public double get(EnergyUnit unitType) {
		return getUnit().convertValue(get(), unitType);
	}

	@Override
	public double get() {
		return this.value;
	}

	@Override
	public EnergyUnit getUnit() {
		return this.unit;
	}
	
	@Override
	public EnergyValue setUnit(EnergyUnit unitType) {
		this.unit = unitType;
		return this;
	}
	
	@Override
	public EnergyValue convertToUnit(EnergyUnit unitType) {
		return set(getUnit().convertValue(get(), unitType)).setUnit(unitType);
	}
	
	//

	@Override
	public EnergyValue set(double value) {
		return set(value);
	}
	
	@Override
	public EnergyValue set(EnergyUnit unitType, double value) {
		return set(unitType.convertValue(value, getUnit()));
	}

	@Override
	public EnergyValue set(EnergyValue unit) {
		return set(unit.get(getUnit()));
	}

	@Override
	public EnergyValue add(double value) {
		return set(get() + value);
	}

	@Override
	public EnergyValue add(EnergyUnit unitType, double value) {
		return set(get() + unitType.convertValue(value, getUnit()));
	}
	
	@Override
	public EnergyValue add(EnergyValue unit) {
		return set(get() + unit.get(getUnit()));
	}

	@Override
	public EnergyValue sub(double value) {
		return set(get() + value);
	}
	
	@Override
	public EnergyValue sub(EnergyUnit unitType, double value) {
		return set(get() - unitType.convertValue(value, getUnit()));
	}

	@Override
	public EnergyValue sub(EnergyValue unit) {
		return set(get() - unit.get(getUnit()));
	}

	@Override
	public EnergyValue scale(double value) {
		return set(get() * value);
	}

	@Override
	public EnergyValue multiply(EnergyValue unit) {
		return set(get() * unit.get(getUnit()));
	}

	@Override
	public EnergyValue divide(EnergyValue unit) {
		return set(get() / unit.get(getUnit()));
	}
	
	//

	@Override
	public EnergyValue copy() {
		return new EnergyValue(getUnit(), get());
	}

	@Override
	public EnergyValue copyAs(EnergyUnit unit) {
		return new EnergyValue(unit, getUnit().convertValue(get(), unit));
	}

	@Override
	public EnergyValue copyFrom(EnergyValue unit) {
		this.unit = unit.unit;
		this.value = unit.value;
		return this;
	}
}
