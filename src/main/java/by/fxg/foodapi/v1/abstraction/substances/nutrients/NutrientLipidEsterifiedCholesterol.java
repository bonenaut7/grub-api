package by.fxg.foodapi.v1.abstraction.substances.nutrients;

import by.fxg.foodapi.v1.abstraction.substances.AbstractNutrientLipid;

/** Basically, Esterified Cholesterol is combination of Cholesterol and a Fatty Acid. **/
public class NutrientLipidEsterifiedCholesterol extends AbstractNutrientLipid {
	/** Fatty acid which is bound to the Cholesterol **/
	protected NutrientLipidFattyAcid componentBoundFattyAcid;
	
	@Override
	public final NutrientType getNutrientType() {
		// Both Fats and Fatty Acids are Lipids, but Lipids are
		//   doesn't have an own type of nutrient specified, but
		//   lipids are nutrients in fact.
		return NutrientType.UNSPECIFIED;
	}
	
	/** @return {@link NutrientLipidFattyAcid} which is bound to the cholesterol 
	 *    to make {@link NutrientLipidEsterifiedCholesterol} after all. **/
	public NutrientLipidFattyAcid getBoundFattyAcid() {
		return this.componentBoundFattyAcid;
	}
}
