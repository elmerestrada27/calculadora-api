package com.github.sanchezih.calculadora.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cientifica")
public class CalculadoraCientificaController {

	public CalculadoraCientificaController() {
	}

	@RequestMapping(value = "/cuadrado", method = RequestMethod.GET, params = { "operando1"})
	public Integer cuadrado(@RequestParam("operando1") Integer operando1) {
		return operando1*operando1;
	}
	
	@RequestMapping(value = "/factorial", method = RequestMethod.GET, params = { "operando1" })
	public double factorial(@RequestParam("operando1") Integer operando1) {
		double factorial=1;
		for (int i=operando1;i>0;i--){
			factorial=factorial*i;
		}
		return factorial;
	}

	@RequestMapping(value = "/primo", method = RequestMethod.GET, params = { "operando1"})
	public boolean primo(@RequestParam("operando1") Integer operando1) {
		boolean flag = true;
        for(int i = 2; i <= operando1/2; ++i){
        	if(operando1 % i == 0){
                flag = false;
                break;
            }
        }
	    return flag;
	}	
	
}