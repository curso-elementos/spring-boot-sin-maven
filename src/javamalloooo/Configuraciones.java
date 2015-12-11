/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamalloooo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Campitos Ley <campitos-ley.com>
 */
@Configuration
public class Configuraciones {
    
    @Bean
    Mensaje mensajear(){
        
        return new MensajeSimple();
    }
    
}
