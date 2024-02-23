package com.gerenciador.tarefas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TesteApiController {

  @GetMapping("/teste-api")
  public String teste() {
    return "Pelo menos uma vez...pelo menos uma vez... - Ouçam com atenção, jovens Cavaleiros de bronze...pelo amor na Terra...e pela justiça...estamos indo! Concentrando toda nossa vida e espírito! - Queimem agora nossos cosmos dourados! Atena, mostre-nos o raio de luz neste mundo de trevas!!!";
  }

  @GetMapping("/teste-api-bem-vindo")
  public String testeBemVindo(@RequestParam(name = "nome") String nome) {
      return "Olá "+nome+", Seja muito bem vindo! ";
  }
  
}
