package by.fxg.foodapi.v1.model.substances;

public interface INutrient extends ISubstance {
	
	abstract INutrient.NutrientType getNutrientType();
	
	/** Essential nutrients are nutrients that the body is unable to synthesize on its own or
	 *    synthesizes in insufficient quantities. Therefore they must be supplied with food.
	 *    Their absence from the diet can lead to deficiencies and health problems.
	 *  Non-Essential nutrients are nutrients that the body is able to synthesize on its own in
	 *    sufficient quantities. They do not have to come from food, as the body can produce them.
	 * @return true if nutrient is essential, false if not **/
	abstract boolean isEssentialNutrient();

	
	
	// FIXME: put somewhere in another place later
	public static enum NutrientType {
		UNSPECIFIED,
		AMINOACID,
		CARBOHYDRATE,
		FAT,
		FATTY_ACID,
		MICROELEMENT,
		MINERAL,
		PROTEIN,
		VITAMIN;
	}
}
