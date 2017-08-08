package nathaliareboucas.com.github.sistema_vendas.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import nathaliareboucas.com.github.sistema_vendas.model.Categoria;
import nathaliareboucas.com.github.sistema_vendas.model.Produto;
import nathaliareboucas.com.github.sistema_vendas.repository.Categorias;

@Named
@ViewScoped
public class CadastroProdutoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Categorias categorias;

	private Produto produto;
	private List<Categoria> categoriasRaizes;
	private Categoria categoriaPai;

	public CadastroProdutoBean() {
		produto = new Produto();
	}

	public void inicializar() {
		System.out.println("Inicializando......");
		categoriasRaizes = categorias.raizes();
	}

	public void salvar() {
		System.out.println("Categoria pai selecionada: " + categoriaPai.getDescricao());
	}

	public Produto getProduto() {
		return produto;
	}

	public List<Categoria> getCategoriasRaizes() {
		return categoriasRaizes;
	}

	@NotNull
	public Categoria getCategoriaPai() {
		return categoriaPai;
	}

	public void setCategoriaPai(Categoria categoriaPai) {
		this.categoriaPai = categoriaPai;
	}

}
