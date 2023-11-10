package by.fxg.foodapi.v1.model.properties.dri;
//package by.fxg.foodapi.model.properties.dri;
//
//import by.fxg.foodapi.model.units.volume.VolumeValue;
//
//public class DRIVolume implements IDietaryReferenceIntake<VolumeValue> {
//	protected VolumeValue[] values = new VolumeValue[DietaryReferenceIntakeType.SIZE];
//
//	@Override
//	public VolumeValue getIntake(DietaryReferenceIntakeType dietaryReferenceIntakeType) {
//		return dietaryReferenceIntakeType != null ? values[dietaryReferenceIntakeType.ordinal()] : null;
//	}
//
//	@Override
//	public DRIVolume setIntake(DietaryReferenceIntakeType dietaryReferenceIntakeType, VolumeValue unit) {
//		if (dietaryReferenceIntakeType != null) {
//			values[dietaryReferenceIntakeType.ordinal()] = unit;
//		}
//		return this;
//	}
//}
