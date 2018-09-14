package util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import dao.DAOGenerico;
import entidades.Cliente;

@FacesConverter("converterCliente")
public class ConverterCliente implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String id) {
		// TODO Auto-generated method stub
		if(id != null && id.trim().length()>0) {
			DAOGenerico<Cliente> dao = new DAOGenerico<>(Cliente.class);
			Cliente cliente = dao.buscarPorId(Long.parseLong(id));
			return cliente;
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object object) {
		// TODO Auto-generated method stub
		if(object != null) {
			Cliente cliente = (Cliente) object;
			return String.valueOf(cliente.getId());
		}
		return null;
	}

}
