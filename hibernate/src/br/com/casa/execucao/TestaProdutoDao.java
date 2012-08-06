package br.com.casa.execucao;

import javax.swing.JOptionPane;

import org.hibernate.Session;

import br.com.casa.DAO.ProdutoDao;
import br.com.casa.model.Produto;
import br.com.casa.util.HibernateUtil;

public class TestaProdutoDao {

	public static void main(String[] args) {
		Session session = new HibernateUtil().getSession();
		ProdutoDao dao = new ProdutoDao(session);

		boolean inicia;
		do {
			Boolean volta = false;
			inicia = true;
			int num = 0;
			do {
				volta = false;
				try {
					String esc = JOptionPane

							.showInputDialog("Digite o que vai fazer\n 1: Adiciona\n 2: Termina");

					num = Integer.parseInt(esc);
				} catch (NumberFormatException ex) {
					JOptionPane
							.showMessageDialog(null, "Digite apenas Numeros");
					volta = true;
				}

			} while (volta);

			switch (num) {
			case 1:
				Produto p = new Produto();
				String nome = JOptionPane
						.showInputDialog("Digite o nome do produto");
				String descricao = JOptionPane
						.showInputDialog("Digite o nome do Descrição");
				p.setNome(nome);
				p.setDescricao(descricao);
				session.beginTransaction();

				dao.salva(p);

				session.getTransaction().commit();
			
				break;
			case 2:
				inicia = false;
				break;
			}

		} while (inicia);
		session.close();
		JOptionPane.showMessageDialog(null, "Terminado");
	}
}
