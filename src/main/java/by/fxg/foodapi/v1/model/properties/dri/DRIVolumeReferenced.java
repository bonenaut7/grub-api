package by.fxg.foodapi.v1.model.properties.dri;
//package by.fxg.foodapi.model.properties.dri;
//
//import by.fxg.foodapi.model.units.volume.VolumeUnit;
//import by.fxg.foodapi.model.units.volume.VolumeValue;
//
//public class DRIVolumeReferenced extends DRIVolume {
//	private VolumeUnit referenceUnitType;
//	
//	public DRIVolumeReferenced(VolumeUnit referenceUnitType) {
//		this.referenceUnitType = referenceUnitType;
//	}
//
//	@Override
//	public DRIVolumeReferenced setIntake(DietaryReferenceIntakeType dietaryReferenceIntakeType, VolumeValue unit) {
//		if (dietaryReferenceIntakeType != null) {
//			values[dietaryReferenceIntakeType.ordinal()] = unit.convertToUnit(this.referenceUnitType);
//		}
//		return this;
//	}
//}
