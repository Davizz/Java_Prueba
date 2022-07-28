package com.ludo.bdd.crud.validation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {PasswordMatchValidator.class})
public @interface PasswordMatch {
	String message() default "Contraseña invalida";
	
	Class<?>[] groups() default{}; 
	
	Class<? extends Payload>[] payload() default {};
	String baseField(); 
	String matchField(); 
	
	
}
