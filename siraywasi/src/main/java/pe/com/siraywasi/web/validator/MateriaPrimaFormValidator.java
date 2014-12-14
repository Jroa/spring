package pe.com.siraywasi.web.validator;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import pe.com.siraywasi.service.MateriaPrimaService;
import pe.com.siraywasi.web.form.MateriaPrimaForm;

@Component
public class MateriaPrimaFormValidator implements Validator{

	@Autowired
	private MateriaPrimaService materiaPrimaService;
	
	@Override
	@SuppressWarnings("rawtypes")
	public boolean supports(Class clazz) {
		return MateriaPrimaForm.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		MateriaPrimaForm form = (MateriaPrimaForm)object;
		
		if(StringUtils.isEmpty(form.getNombreMateriaPrima()))
		{
			errors.rejectValue("nombreMateriaPrima", "materiaprima.nombremateriaprima.requerido");
		}
		
		if(form.getCantidad() <= 0){
			errors.rejectValue("cantidad", "materiaprima.cantidad.menor");
		}
		
		if(form.getCosto() <= 0){
			errors.rejectValue("costo", "materiaprima.costo.menor");
		}
	}

}
