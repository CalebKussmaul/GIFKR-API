package filter.base;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface ControlOverride {
	
	public enum ControlType {KEYFRAME, STATIC} 
	public static String NO_OVERRIDE = "NO_OVERRIDE";
	
	ControlType animationControl() default ControlType.KEYFRAME;
	String max() default NO_OVERRIDE;
	String min() default NO_OVERRIDE;
}
