package by.fxg.foodapi.v1.model.units.weight;

public enum WeightUnit {
	// International System of Units (SI)
	TONNE		(	"t", 		1.0E+6		),
	KILOGRAM	(	"kg", 		1.0E+3		),
	GRAM		(	"g", 		1.0			),
	MILLIGRAM	(	"mg", 		1.0E-3		),
	MICROGRAM	(	"μg", 		1.0E-6		),
	NANOGRAM	(	"ng", 		1.0E-9		),
	
	// Imperial units
	STONE		(	"stone", 	6350.293	),
	POUND		(	"lb", 		453.5923	),
	OUNCE		(	"oz",		28.34952	),
	DRAM		(	"dr", 		3.696691	),
	SCRUPLE		(	"scruple", 	1.295978	),
	GRAIN		(	"gr",	 	0.064799	)
	
	;
	
	private final String suffix;
	private final double gramValue;
	
	WeightUnit(String suffix, double gramValue) {
		this.suffix = suffix;
		this.gramValue = gramValue;
	}
	
	public String getSuffix() {
		return this.suffix;
	}
	
	public double convertValue(double weightValue, WeightUnit convertToUnit) {
		return (weightValue * this.gramValue) / convertToUnit.gramValue;
	}
}
