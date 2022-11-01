package co.edu.javeriana.as.personapp.jakarta.entities;

import co.edu.javeriana.as.personapp.jakarta.entities.Estudios;
import co.edu.javeriana.as.personapp.jakarta.entities.Telefono;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-10-31T23:46:54")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, Integer> cc;
    public static volatile ListAttribute<Persona, Estudios> estudiosList;
    public static volatile SingularAttribute<Persona, String> apellido;
    public static volatile SingularAttribute<Persona, String> genero;
    public static volatile ListAttribute<Persona, Telefono> telefonoList;
    public static volatile SingularAttribute<Persona, String> nombre;
    public static volatile SingularAttribute<Persona, Integer> edad;

}