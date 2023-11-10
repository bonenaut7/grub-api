package by.fxg.foodapi.v1.model.units;

//TODO: Coefficients, Activity Units (ferments)
public interface IMeasurmentValue<SELF> {
	/** FIXME **/
	double get();

	//
	
	/** FIXME **/
	SELF set(double value);
	
	/** FIXME **/
	SELF set(SELF unit);
	
	/** FIXME **/
	SELF add(double value);
	
	/** FIXME **/
	SELF add(SELF unit);
	
	/** FIXME **/
	SELF sub(double value);
	
	/** FIXME **/
	SELF sub(SELF unit);
	
	/** FIXME **/
	SELF scale(double value);
	
	/** FIXME **/
	SELF multiply(SELF unit);
	
	/** FIXME **/
	SELF divide(SELF unit);
	
	//
	
	/** @return new object that is copy of SELF **/
	SELF copy();
	
	/** Makes SELF copy of #unit by retrieving data from #unit without
	 *    making a new object (works like set(), but also merges unit type) **/
	SELF copyFrom(SELF unit);
}
