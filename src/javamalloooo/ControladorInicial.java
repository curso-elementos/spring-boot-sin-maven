/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamalloooo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Campitos Ley <campitos-ley.com>
 */
@Controller
@RequestMapping("/")
public class ControladorInicial {
    @Autowired
    Mensaje mensaje;
    
    @RequestMapping(value="/mensajito", method=RequestMethod.GET, headers={"Accept=text/html"})
    @ResponseBody String hola() throws Exception{
  System.out.println("hay  "+mensaje.mensajear());
        return "Hola desde el spring boot sin mavensito, voy a llorar :'(";
    }
    @RequestMapping("/")
    public String holita(){
        return "holita.html";
    }
    
}
