package br.com.casa.execucao;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import br.com.casa.model.ItemPedido;
import br.com.casa.model.Pedido;
import br.com.casa.model.Produto;

public class GeraTabelas {
	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(Produto.class);
		cfg.addAnnotatedClass(ItemPedido.class);
		cfg.addAnnotatedClass(Pedido.class);
		SchemaExport se = new SchemaExport(cfg);
		se.create(true, true);

	}
}
