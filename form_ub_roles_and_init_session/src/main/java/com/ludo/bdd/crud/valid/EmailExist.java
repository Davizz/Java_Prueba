package com.ludo.bdd.crud.valid;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { EmailExistValidator.class })
public @interface EmailExist {
	String message() default "Este email ya existe";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String email();

}
