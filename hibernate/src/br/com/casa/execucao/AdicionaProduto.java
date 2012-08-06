package br.com.casa.execucao;

import java.util.Calendar;

import org.hibernate.Session;

import br.com.casa.model.Produto;
import br.com.casa.util.HibernateUtil;

public class AdicionaProduto {

	public static void main(String[] args) {

		Produto p = new Produto();
		p.setNome("Caneta");
		p.setDescricao("caneta azul");
		Calendar data = Calendar.getInstance();
		data.set(Calendar.DATE, 11);
		data.set(Calendar.MONTH, Calendar.FEBRUARY);
		data.set(Calendar.YEAR, 2004);
		p.setDataInicioVenda(data);
		p.setPreco(100.50);

		Session session = new HibernateUtil().getSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		System.out.println("ID do produto: " + p.getId());

	}
}
