package by.fxg.foodapi.v1.model.units.volume;
//package by.fxg.foodapi.model.units.volume;
//
//public enum VolumeUnit {
//	// Metric
//	LITER				(	"L",		1.0E+3	),
//	MILLILITER			(	"mL",		1.0		),
//	
//	// US
//	FLUID_GALLON_US		(	"fl gal.",	3785.41	),
//	FLUID_OUNCE_US		(	"fl oz.",	473.176	),
//	FLUID_PINT_US		(	"pint",		473.176	),
//	CUP_US				(	"cup",		240.0	),
//	
//	// Imperial
//	FLUID_GALLON_UK		(	"fl gal.",	4546.09	),
//	FLUID_OUNCE_UK		(	"fl oz.",	28.4131	),
//	FLUID_PINT_UK		(	"pint",		568.261	),
//	CUP_UK				(	"cup",		250.0	),
//	
//	// Kitchenware
//	TABLESPOON			(	"tbsp.",	1.0		),
//	TEASPOON			(	"tsp.",		1.0		),
//	
//	;
//	
//	private final String suffix;
//	private final double milliliterValue;
//	
//	VolumeUnit(String suffix, double milliliterValue) {
//		this.suffix = suffix;
//		this.milliliterValue = milliliterValue;
//	}
//	
//	public String getSuffix() {
//		return this.suffix;
//	}
//	
//	public double convertValue(double weightValue, VolumeUnit convertToUnit) {
//		return (weightValue * this.milliliterValue) / convertToUnit.milliliterValue;
//	}
//}
