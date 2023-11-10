package by.fxg.foodapi.v1.model.properties.dri;

// For image reference: https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Dietary_Reference_Intakes.svg/1920px-Dietary_Reference_Intakes.svg.png
public enum DietaryReferenceIntakeType {

	/** Average daily level of intake estimated to meet the requirements
	 * 	  of 50% of healthy individuals.
	 * 	Usually used to assess the nutrient intakes of groups of people and
	 *    to plan nutritionally adequate diets for them.
	 * 	<br>(can also be used to assess the nutrient intakes of individuals)</br>
	 *  @implNote Deficiency zone, 50% Risk **/
	ESTIMATED_AVERAGE_REQUIREMENT,

	/** Recommended dietary allowance (RDA): Average daily level of
	 *    intake sufficient to meet the nutrient requirements of nearly
	 *    all (97�98%) healthy individuals.
	 *  <br>(often used to plan nutritionally adequate diets for individuals)</br>
	 *  @implNote Deficiency zone, 2.5% Risk **/
	RECOMMENDED_DIETARY_ALLOWANCE,
	
	/** Adequate Intake (AI): Intake at this level is assumed to ensure
	 * 	  nutritional adequacy.
	 * 	<br>(established when evidence is insufficient to develop an RDA)</br>
	 *  @implNote No zone, Unknown Risk **/
	ADEQUATE_INTAKE,
	
	/**	Maximum daily intake unlikely to cause adverse health effects.
	 *  @implNote Toxicity zone, 2.5% Risk **/
	TOLERABLE_UPPER_INTAKE_LEVEL,
	
	/** This is the highest level of exposure (the amount of substance a
	 *    person or animal receives) to a chemical at which no adverse
	 *    health or functional effects are observed.
	 *  <br>(used to determine safe exposure levels)</br>
	 *  @implNote Toxicity zone, ~10% Risk **/
	NO_OBSERVED_ADVERSE_EFFECT_LEVEL,
	
	/** This is the lowest level of exposure at which adverse health or
	 *    functional effects are observed. {@link #LOWEST_OBSERVED_ADVERSE_EFFECT_LEVEL}
	 *    may be higher than {@link #NO_OBSERVED_ADVERSE_EFFECT_LEVEL} and indicates
	 *    the level of exposure at which adverse effects occur, but they may be minor.
	 *  @implNote Toxicity zone, ~90% Risk **/
	LOWEST_OBSERVED_ADVERSE_EFFECT_LEVEL;
	
	//public static final DietaryReferenceIntakeType[] VALUES = values();
	public static final int SIZE = values().length;
}
