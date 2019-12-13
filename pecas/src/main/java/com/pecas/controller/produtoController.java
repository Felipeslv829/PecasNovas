package com.pecas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pecas.PecasRepository.PecasRepository;
import com.pecas.models.Produto;

@Controller
public class produtoController {
	
	@Autowired
	private PecasRepository er;
	
	@RequestMapping(value="/cadastrarProduto", method=RequestMethod.GET)
	public String form(){
		return"formProduto";
	}
	
	@RequestMapping(value="/cadastrarProduto", method=RequestMethod.POST)
	public String form(Produto produto){
		
		er.save(produto);
		
		return"redirect:/cadastrarProduto";
	}
	
	@RequestMapping("/produto")
	public ModelAndView listaProduto() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Produto> produto = er.findAll();
		mv.addObject("Produtos", produto);
		return mv;
	}


}
