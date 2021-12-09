package unirios.avaliacao.dao;

import java.util.List;
import unirios.avaliacao.dao.PessoaFisicaDao;
import unirios.avaliacao.domain.PessoaFisica;

public interface PessoaFisicaDao {

	void save(PessoaFisica pessoafisica);

	void update(PessoaFisica pessoafisica);

	void delete(Long id);

	PessoaFisica findById(Long id);

	List<PessoaFisica> findAll();

}
