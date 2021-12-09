package unirios.avaliacao.dao;

import java.util.List;
import unirios.avaliacao.dao.PessoaJuridicaDao;
import unirios.avaliacao.domain.PessoaJuridica;

public interface PessoaJuridicaDao {

	void save(PessoaJuridica pessoajuridica);

	void update(PessoaJuridica pessoajuridica);

	void delete(Long id);

	PessoaJuridica findById(Long id);

	List<PessoaJuridica> findAll();

}
