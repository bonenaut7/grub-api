package by.fxg.foodapi.v1.abstraction.substances.nutrients;

import static by.fxg.foodapi.v1.abstraction.substances.nutrients.NutrientLipidFatGroup.MONOUNSATURATED;
import static by.fxg.foodapi.v1.abstraction.substances.nutrients.NutrientLipidFatGroup.POLYUNSATURATED;
import static by.fxg.foodapi.v1.abstraction.substances.nutrients.NutrientLipidFatGroup.SATURATED;
import static by.fxg.foodapi.v1.abstraction.substances.nutrients.NutrientLipidFatGroup.UNSATURATED;

public enum NutrientLipidFattyAcidType {
	UNSPECIFIED(NutrientLipidFatGroup.UNSPECIFIED),			// Unspecified type of fat
	
	// Saturated fats
	SATURATED_UNSPECIFIED					(SATURATED),		// Unspecified saturated fat
	SATURATED_VLCFA_VeryLongChainFattyAcid	(SATURATED),		// Very long chain Fatty Acid
	SATURATED_LCFA_LongChainFattyAcid		(SATURATED),		// Long chain Fatty Acid
	SATURATED_MCFA_MediumChainFattyAcid		(SATURATED),		// Medium chain Fatty Acid
	SATURATED_SCFA_ShortChainFattyAcid		(SATURATED),		// Short chain Fatty Acid
	
	// Unsaturated fats
	UNSATURATED_UNSPECIFIED					(UNSATURATED),		// Unspecified unsaturated fat
	UNSATURATED_CFA_CisFattyAcid			(UNSATURATED),		// Unsaturated Cis Fatty Acid (Good)
	UNSATURATED_TFA_TransFattyAcid			(UNSATURATED),		// Unsaturated Trans Fatty Acid (Bad)
	UNSATURATED_O7FA_Omega7FattyAcid		(UNSATURATED),		// Unsaturated Omega-7 Fatty Acid
	
	// Poly-unsaturated fats (Sub-group of Unsaturated fats)
	POLYUNSATURATED_UNSPECIFIED				(POLYUNSATURATED),	// Unspecified polyunsaturated fat
	POLYUNSATURATED_O3FA_Omega3FattyAcid	(POLYUNSATURATED),	// Polyunsaturated Omega-3 Fatty Acid
	POLYUNSATURATED_O6FA_Omega6FattyAcid	(POLYUNSATURATED),	// Polyunsaturated Omega-6 Fatty Acid
	
	// Mono-unsaturated fats (Sub-group of Unsaturated fats)
	MONOUNSATURATED_UNSPECIFIED				(MONOUNSATURATED),	// Unspecified monounsaturated fat
	MONOUNSATURATED_O9FA_Omega9FattyAcid	(MONOUNSATURATED);	// Monounsaturated Omega-9 Fatty Acid
	
	private NutrientLipidFatGroup fatGroupType;
	
	NutrientLipidFattyAcidType(NutrientLipidFatGroup fatGroupType) {
		this.fatGroupType = fatGroupType;
	}
	
	public NutrientLipidFatGroup getFatGroupType() {
		return this.fatGroupType;
	}
}
