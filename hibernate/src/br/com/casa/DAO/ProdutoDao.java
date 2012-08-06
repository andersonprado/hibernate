package br.com.casa.DAO;

import org.hibernate.Session;

import br.com.casa.model.Produto;

public class ProdutoDao {
	private Session session;

	public ProdutoDao(Session session) {
		this.session = session;
	}

	public void salva(Produto p) {
		this.session.save(p);
	}

	public void remove(Produto p) {
		this.session.delete(p);
	}

	public Produto procura(long id) {
		return (Produto) this.session.load(Produto.class, id);
	}

	public void atualiza(Produto p) {
		this.session.update(p);

	}
}
