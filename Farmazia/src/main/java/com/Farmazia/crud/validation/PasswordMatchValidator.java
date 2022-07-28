package com.Farmazia.crud.validation;

import java.lang.reflect.Field;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchValidator implements ConstraintValidator<PasswordMatch, Object> {
	private String baseField;
	private String matchField;

	@Override
	public void initialize(PasswordMatch p) {
		
		baseField = p.baseField();
		matchField = p.matchField();
	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		try {
			Object baseFieldValue = getFieldValue(value,baseField);
			Object matchFieldValue = getFieldValue(value,matchField);
			return(baseFieldValue!=null && baseFieldValue.equals(matchFieldValue));
		}catch(Exception e) {
			return false;
		}
	
	}

	private Object getFieldValue(Object value, String baseField2) throws Exception {
		Class<?> clase =  value.getClass();
		Field passwordField =clase.getDeclaredField(baseField2); 
		passwordField.setAccessible(true);
		return passwordField.get(value); 
		
		
	}
}
