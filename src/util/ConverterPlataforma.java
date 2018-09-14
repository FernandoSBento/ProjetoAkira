package util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import dao.DAOGenerico;
import entidades.Plataforma;

@FacesConverter("converterPlataforma")
public class ConverterPlataforma implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String id) {
		// TODO Auto-generated method stub
		if(id != null && id.trim().length()>0) {
			DAOGenerico<Plataforma> dao = new DAOGenerico<>(Plataforma.class);
			Plataforma plataforma = dao.buscarPorId(Long.parseLong(id));
			return plataforma;
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object object) {
		// TODO Auto-generated method stub
		if(object != null) {
			Plataforma plataforma = (Plataforma) object;
			return String.valueOf(plataforma.getId());
		}
		return null;
	}

}
