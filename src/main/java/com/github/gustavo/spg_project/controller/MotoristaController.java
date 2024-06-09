package com.github.gustavo.spg_project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.gustavo.spg_project.model.Motorista;
import com.github.gustavo.spg_project.repository.MotoristaRepository;
import com.github.gustavo.spg_project.dto.FormMotorista;

@Controller
@RequestMapping("motoristas")
public class MotoristaController {

    @Autowired
    private MotoristaRepository motoristaRepository;

    @GetMapping()
    public String list(Model model) {
        List<Motorista> motoristas = motoristaRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
        model.addAttribute("motoristas", motoristas);
        return "motorista/list";
    }

    @GetMapping("add")
    public String create(Model model) {
        model.addAttribute("motorista", new FormMotorista());
        return "motorista/form";
    }

    @PostMapping("save")
    public String save(@ModelAttribute FormMotorista motorista) {
        Motorista entity = motorista.toModel();
        motoristaRepository.save(entity);
        return "redirect:/motoristas";
    }

    @GetMapping("uptade/{id}")
    public String uptade(@PathVariable Long id, Model model) {
        Motorista entity = motoristaRepository.findById(id).orElse(new Motorista());
        FormMotorista motorista = new FormMotorista().toForm(entity);
        model.addAttribute("motorista", motorista);
        return "peixe/form";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable Long id) {
        motoristaRepository.deleteById(id);
        return "redirect:/motoristas";
    }
}