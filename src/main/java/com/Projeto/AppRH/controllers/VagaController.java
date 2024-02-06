package com.Projeto.AppRH.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Projeto.AppRH.models.Vaga;
import com.Projeto.AppRH.repository.CandidatoRepository;
import com.Projeto.AppRH.repository.VagaRepository;

import jakarta.validation.Valid;

@Controller
public class VagaController {
	
	private VagaRepository vr;
	private CandidatoRepository cr;
	
	//CADASTRAR VAGA
	@RequestMapping(value = "/cadastrarVaga", method = RequestMethod.GET)
	public String form() {
		return "vaga/formVaga";
	}
	
	@RequestMapping(value = "/cadastrarvaga", method = RequestMethod.POST)
	public String form(@Valid Vaga vaga, BindingResult result, RedirectAttributes attributes) {
		
		if(result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "Verifique os campos...");
			return "redirect:/cadastrarVaga";
		}		
		vr.save(vaga);
		attributes.addFlashAttribute("mensagem", "Vaga cadastrada com sucesso!");
		return "redirect:/cadastrarVaga";
	}

}
