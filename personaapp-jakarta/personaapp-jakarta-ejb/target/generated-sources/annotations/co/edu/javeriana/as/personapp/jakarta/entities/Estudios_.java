package co.edu.javeriana.as.personapp.jakarta.entities;

import co.edu.javeriana.as.personapp.jakarta.entities.EstudiosPK;
import co.edu.javeriana.as.personapp.jakarta.entities.Persona;
import co.edu.javeriana.as.personapp.jakarta.entities.Profesion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-10-31T23:46:54")
@StaticMetamodel(Estudios.class)
public class Estudios_ { 

    public static volatile SingularAttribute<Estudios, Date> fecha;
    public static volatile SingularAttribute<Estudios, Persona> persona;
    public static volatile SingularAttribute<Estudios, String> univer;
    public static volatile SingularAttribute<Estudios, EstudiosPK> estudiosPK;
    public static volatile SingularAttribute<Estudios, Profesion> profesion;

}