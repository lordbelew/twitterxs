package fr.formation.twitterxs.errors;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Constraint(validatedBy = ConfirmPasswordValidator.class)
public @interface ConfirmPassword {

  String message() default "{E_PASSWORD_NOT_MATCH}";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}

