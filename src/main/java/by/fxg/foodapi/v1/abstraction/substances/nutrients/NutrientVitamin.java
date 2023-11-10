package by.fxg.foodapi.v1.abstraction.substances.nutrients;

import by.fxg.foodapi.v1.abstraction.substances.AbstractNutrient;

public class NutrientVitamin extends AbstractNutrient {
	protected NutrientVitaminSolubilityType vitaminSolubilityType;
	
	// A, C, D, E, K 
	// B1 (Thiamin), B2 (Riboflavin), B3 (Niacin), B5 (Pantothenic Acid), B6 (Pyridoxine), B7 (Biotin), B9 (Folate / Folic Acid), B12 (Cobalamin)
	// Choline? Carotenoids?
	
	@Override
	public final NutrientType getNutrientType() {
		return NutrientType.VITAMIN;
	}
	
	
	public NutrientVitaminSolubilityType getSolubilityType() {
		return this.vitaminSolubilityType;
	}
}
