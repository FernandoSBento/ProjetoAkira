package util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import dao.DAOGenerico;
import entidades.Genero;

@FacesConverter("converterGenero")
public class ConverterGenero implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String id) {
		// TODO Auto-generated method stub
		if(id != null && id.trim().length()>0) {
			DAOGenerico<Genero> dao = new DAOGenerico<>(Genero.class);
			Genero genero = dao.buscarPorId(Long.parseLong(id));
			return genero;
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object object) {
		// TODO Auto-generated method stub
		if(object != null) {
			Genero genero = (Genero) object;
			return String.valueOf(genero.getId());
		}
		return null;
	}

}
