package unirios.avaliacao.dao;

import java.util.List;
import unirios.avaliacao.dao.PessoaDao;
import unirios.avaliacao.domain.Pessoa;

public interface PessoaDao {

	void save(Pessoa pessoa);

	void update(Pessoa pessoa);

	void delete(Long id);

	Pessoa findById(Long id);

	List<Pessoa> findAll();

}
