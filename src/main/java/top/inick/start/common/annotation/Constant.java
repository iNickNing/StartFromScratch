package top.inick.start.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = {ConstantValidatorHandler.class})
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@Retention( RetentionPolicy.RUNTIME)
public @interface Constant {
	
	String message() default "{constraint.default.const.message}";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};

	String value();
}
