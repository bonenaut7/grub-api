package by.fxg.foodapi.v1.model.properties;

import by.fxg.foodapi.v1.model.units.glycemicindex.GlycemicIndex;

public interface PropertyGlycemicIndex<UNIT extends GlycemicIndex> {
	GlycemicIndex getGlycemicIndex(UNIT amount);
}
