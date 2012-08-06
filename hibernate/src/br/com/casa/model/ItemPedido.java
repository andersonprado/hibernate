package br.com.casa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="Item_Pedido")
public class ItemPedido implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id_item")
	private long id;
	@ForeignKey(name = "codPedido")
	private int codPedido;
	@Column(name = "cod_produto")
	@ForeignKey(name = "cod_produto" )
	private int codDoProduto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(int codPedido) {
		this.codPedido = codPedido;
	}

	public int getCodDoProduto() {
		return codDoProduto;
	}

	public void setCodDoProduto(int codDoProduto) {
		this.codDoProduto = codDoProduto;
	}

}
