/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamalloooo;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Campitos Ley <campitos-ley.com>
 */
@Controller
@RequestMapping("/")
public class ControladorCliente {
    
    /*
    1. GUARDAR
    */
    @CrossOrigin
    @RequestMapping(value="/cliente/{nombre}/{email}/{paterno}", method=RequestMethod.POST, headers={"Accept=text/html"})
    @ResponseBody String guardar(@PathVariable String nombre, @PathVariable String email, @PathVariable String paterno )throws Exception{
        Cliente c=new Cliente();
        c.setEmail(email);
        c.setNombre(nombre);
        c.setPaterno(paterno);
        DAOCliente d=new DAOCliente();
        d.guardar(c);
        return "Registro guardado";
    }
    /*
    2. BUSCAR TODOS
    */
    @CrossOrigin
       @RequestMapping(value="/cliente", method=RequestMethod.GET, headers={"Accept=application/json"})
    @ResponseBody String buscarTodos()throws Exception{
      
        DAOCliente d=new DAOCliente();
       ArrayList<Cliente> clientes= d.buscarTodos();
       ObjectMapper maper=new ObjectMapper();
        return maper.writeValueAsString(clientes);
    }
    /*
    3. BUSCAR POR ID
    */
    @CrossOrigin
    @RequestMapping(value="/cliente/{id}", method=RequestMethod.GET, headers={"Accept=application/json"})
    @ResponseBody String buscarPorid(@PathVariable Integer id)throws Exception{
      
        DAOCliente d=new DAOCliente();
      Cliente c=d.buscarPorId(id);
       ObjectMapper maper=new ObjectMapper();
        return maper.writeValueAsString(c);
    }
    /*
    4. ACTUALIZAR
    */
    @CrossOrigin
     @RequestMapping(value="/cliente/{nombre}/{email}/{paterno}", method=RequestMethod.PUT, headers={"Accept=text/html"})
    @ResponseBody String actualizar(@PathVariable String nombre, @PathVariable String email, @PathVariable String paterno )throws Exception{
        Cliente c=new Cliente();
        c.setEmail(email);
        c.setNombre(nombre);
        c.setPaterno(paterno);
        DAOCliente d=new DAOCliente();
        d.actualizar(c);
        return "Registro actualizado";
    }
    
    /*
    5. BORRAR
    */
    @CrossOrigin
     @RequestMapping(value="/cliente/id", method=RequestMethod.DELETE, headers={"Accept=application/json"})
    @ResponseBody String borrar(@PathVariable Integer id)throws Exception{
      
        DAOCliente d=new DAOCliente();
         d.borrar(id);
    
        return "Registro borrado";
    }
    
    
}
