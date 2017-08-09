package nathaliareboucas.com.github.sistema_vendas.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import nathaliareboucas.com.github.sistema_vendas.model.Categoria;
import nathaliareboucas.com.github.sistema_vendas.repository.Categorias;
import nathaliareboucas.com.github.sistema_vendas.util.cdi.CDIServiceLocator;

@FacesConverter(forClass = Categoria.class)
public class CategoriaConverter implements Converter<Categoria> {

//	 @Inject
	private Categorias categorias;

	public CategoriaConverter() {
		categorias = CDIServiceLocator.getbean(Categorias.class);
	}

	@Override
	public Categoria getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		Categoria retorno = null;

		if (value != null) {
			Long id = new Long(value);
			retorno = categorias.porId(id);
		}
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Categoria value) {
		if (value != null) {
			return ((Categoria) value).getId().toString();
		}
		return "";
	}

}
