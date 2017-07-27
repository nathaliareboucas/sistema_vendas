package nathaliareboucas.com.github.sistema_vendas.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import nathaliareboucas.com.github.sistema_vendas.service.NegocioException;

@ManagedBean
@RequestScoped
public class CadastroPedidoBean {

	private List<Integer> itens;

	public CadastroPedidoBean() {
		itens = new ArrayList<>();
		itens.add(1);
	}

	public void salvar() {
		throw new NegocioException("Pedido não pode ser salvo pois ainda não foi implementado.");
	}

	public List<Integer> getItens() {
		return itens;
	}

}
