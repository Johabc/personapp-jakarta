/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.personapp.jakarta.beans.impl;

import co.edu.javeriana.as.personapp.jakarta.beans.AbstractFacade;
import co.edu.javeriana.as.personapp.jakarta.beans.EstudiosFacadeLocal;
import co.edu.javeriana.as.personapp.jakarta.entities.Estudios;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class EstudiosFacade extends AbstractFacade<Estudios> implements EstudiosFacadeLocal {

    @PersistenceContext(unitName = "persona_pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstudiosFacade() {
        super(Estudios.class);
    }
    
}
