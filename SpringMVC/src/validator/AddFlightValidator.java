package validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import form.FlightForm;

@Component
public class AddFlightValidator extends LocalValidatorFactoryBean implements Validator {

	@Override
	public void validate(Object bean, Errors errors) {
		super.validate(bean, errors);
		FlightForm form = (FlightForm) bean;
		/*if(!(form.getCarrier().equals("JET Airways")))
				errors.rejectValue("carrier", "carrier.invalid");*/
	}
}
