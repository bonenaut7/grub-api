package by.fxg.foodapi.v1.inbuilt;

import by.fxg.foodapi.v1.abstraction.substances.AbstractNutrientLipid;

public /*final*/ class NutrientLipidFreeCholesterol extends AbstractNutrientLipid {
	/** Here's some **magic**, we're not setting any naming or other
	 *    stuff, allowing everyone other set any parameters they want
	 *    because making I18n stuff or something like that in this api
	 *    just sounds at least horrible. Let it be LIGHTWEIGHT AND SMALL **/
	public NutrientLipidFreeCholesterol() {
		// Free Cholesterol is an essential nutrient.
		this.isEssentialNutrient = true;
	}
	
	@Override
	public final NutrientType getNutrientType() {
		// Both Fats and Fatty Acids are Lipids, but Lipids are
		//   doesn't have an own type of nutrient specified, but
		//   lipids are nutrients in fact.
		return NutrientType.UNSPECIFIED;
	}
}
