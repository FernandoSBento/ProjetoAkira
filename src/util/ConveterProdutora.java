package util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import dao.DAOGenerico;
import entidades.Produtora;

@FacesConverter("converterProdutora")
public class ConveterProdutora implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String id) {
		// TODO Auto-generated method stub
		if(id != null && id.trim().length()>0) {
			DAOGenerico<Produtora> dao = new DAOGenerico<>(Produtora.class);
			Produtora produtora = dao.buscarPorId(Long.parseLong(id));
			return produtora;
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object object) {
		// TODO Auto-generated method stub
		if(object != null) {
			Produtora produtora = (Produtora) object;
			return String.valueOf(produtora.getId());
		}
		return null;
	}

}
