/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamalloooo;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.Update;
import org.springframework.stereotype.Component;

/**
 *
 * @author campitos
 */

public class DAOEmpleado {
    public  SessionFactory sessionFactory;
    public  Session session;
    public  Transaction transaction;
    public DAOEmpleado(){
     sessionFactory=   HibernateUtilidades.getSessionFactory();
     session=sessionFactory.openSession();
     transaction=session.beginTransaction();
    }
    private void cerrarTodo(){
        transaction.commit();
        session.close();
    }
    /*
  1.   GUARDAR
    */
    public void guardar(Empleado reservacion)throws Exception{
        session.save(reservacion);
        cerrarTodo();
    }
/*
    2. BUSCAR TODOS
    */
    ArrayList<Empleado> buscarTodos() throws Exception{
  ArrayList<Empleado> empleados=  (ArrayList<Empleado>) session.createCriteria(Empleado.class).list();
  cerrarTodo();
  
    return empleados;
    }
    /*
   3.  BUSCAR POR ID
    */
    public Empleado buscarPorId(Integer id) throws Exception{
 
      Empleado  c=(Empleado) session.createCriteria(Empleado.class).add(Restrictions.idEq(id)).uniqueResult();
      cerrarTodo();
  

         
    return c;
    }
    /*
    4. ACTUALIZAR
    */
    public void actualizar(Empleado c)throws Exception{
        

       
         session.update(c);
         cerrarTodo();
        
    }
    /*
    5. BORRAR
    */
     public void   borrar(Integer id)throws Exception{
        
Empleado c=new Empleado();
        c.setId(id); 
         session.delete(c);
         cerrarTodo();
         
    }
    
    
    
}   