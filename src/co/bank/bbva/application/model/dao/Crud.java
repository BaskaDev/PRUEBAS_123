package co.bank.bbva.application.model.dao;
import java.util.ArrayList;

import co.bank.bbva.application.model.Contacto;

//implements JPA

public interface Crud<T> {
    boolean add(T entity);
    T read(int index);
    boolean update(int index, T entity);
    boolean delete(int index);
    ArrayList<Contacto> readAll();
}
