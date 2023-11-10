package by.fxg.foodapi.v1.model.units.energy;

public enum EnergyUnit {
	CALORIE			(	"cal",		1.0E-3		),
	KILOCALORIE		(	"kcal",		1.0			),
	
	JOULE			(	"J",		4181		),
	KILOJOULE		(	"kJ",		4.181		),
	
	WATT_HOUR		(	"W*hr",		1.16222		), // :D
	ELECTRON_VOLT	(	"eV",		2.611E22	), // LOL
	
	;
	
//	public static final EnergyUnit
//		CAL = CALORIE,
//		KCAL = KILOCALORIE,
//		J = JOULE,
//		KJ = KILOJOULE;
	
	private final String suffix;
	private final double kcalValue;
	
	EnergyUnit(String suffix, double kcalValue) {
		this.suffix = suffix;
		this.kcalValue = kcalValue;
	}
	
	public String getSuffix() {
		return this.suffix;
	}
	
	public double convertValue(double weightValue, EnergyUnit convertToUnit) {
		return (weightValue * this.kcalValue) / convertToUnit.kcalValue;
	}
}
