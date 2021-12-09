package unirios.avaliacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import unirios.avaliacao.domain.PessoaFisica;
import unirios.avaliacao.services.PessoaFisicaService;

@Controller
@RequestMapping("/pessoafisicas")
public class PessoaFisicaController {
	
	@Autowired
	private PessoaFisicaService pessoafisicaService;

	@GetMapping("/cadastrar")
	public String cadastrar(PessoaFisica pessoafisica) {
		return "/pessoafisicas/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("pessoafisicas", pessoafisicaService.buscarTodos());
		return "/pessoafisica/lista";
	}

	@PostMapping("/salvar")
	public String salvar(PessoaFisica pessoafisica) {
		pessoafisicaService.salvar(pessoafisica);
		return "redirect:/pessoafisicas/cadastrar";
	}

	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("pessoafisica", pessoafisicaService.buscarPorId(id));
		return "/pessoafisica/cadastro";
	}
	
	@PostMapping("/editar")
	public String editar(PessoaFisica pessoafisica) {
		pessoafisicaService.editar(pessoafisica);
		return "redirect:/pessoafisicas/listar";
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		pessoafisicaService.excluir(id);
		return listar(model);
		 
	}
	
}