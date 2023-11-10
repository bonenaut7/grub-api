package by.fxg.foodapi.v1.abstraction.instances;

import by.fxg.foodapi.v1.model.instances.ISubstanceInstance;
import by.fxg.foodapi.v1.model.substances.ISubstance;
import by.fxg.foodapi.v1.model.units.IMeasurmentValue;
import by.fxg.foodapi.v1.model.units.weight.WeightValue;

public class SubstanceInstance<SUBSTANCE extends ISubstance, MV extends IMeasurmentValue<MV>> implements ISubstanceInstance<SUBSTANCE> {
	protected SUBSTANCE substance;
	protected WeightValue value;
	
	@Override
	public SUBSTANCE getSubstance() {
		return this.substance;
	}

	@Override
	public WeightValue getValue() {
		return this.value;
	}
}
