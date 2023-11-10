package by.fxg.foodapi.v1.model.units;

//TODO: Coefficients, Activity Units (ferments)
public interface ITypedMeasurmentValue<SELF, TYPE> extends IMeasurmentValue<SELF> {
	/** FIXME **/
	double get(TYPE unitType);
	
	@Override
	double get();
	
	/** FIXME **/
	TYPE getUnit();
	
	/** FIXME **/
	SELF setUnit(TYPE unitType);
	
	/** FIXME **/
	SELF convertToUnit(TYPE unitType);
	
	//
	
	@Override
	SELF set(double value);
	
	/** FIXME **/
	SELF set(TYPE unitType, double value);
	
	@Override
	SELF set(SELF unit);
	
	@Override
	SELF add(double value);
	
	/** FIXME **/
	SELF add(TYPE unitType, double value);
	
	@Override
	SELF add(SELF unit);
	
	@Override
	SELF sub(double value);
	
	/** FIXME **/
	SELF sub(TYPE unitType, double value);
	
	@Override
	SELF sub(SELF unit);
	
	@Override
	SELF scale(double value);
	
	@Override
	SELF multiply(SELF unit);
	
	@Override
	SELF divide(SELF unit);
	
	//
	
	/** @return new object that is copy of SELF **/
	@Override
	SELF copy();
	
	/** @return new object that is copy of SELF but with specified #unitType unit type **/
	SELF copyAs(TYPE unitType);
	
	/** Makes SELF copy of #unit by retrieving data from #unit without
	 *    making a new object (works like set(), but also merges unit type) **/
	@Override
	SELF copyFrom(SELF unit);
}
