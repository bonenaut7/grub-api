package by.fxg.foodapi.v1.model.instances;

import by.fxg.foodapi.v1.model.substances.ISubstance;
import by.fxg.foodapi.v1.model.units.weight.WeightValue;

public interface ISubstanceInstance<SUBSTANCE extends ISubstance> {
	SUBSTANCE getSubstance();
	WeightValue getValue();
}
