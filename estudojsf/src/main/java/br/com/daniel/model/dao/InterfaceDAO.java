
package br.com.daniel.model.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;


public interface InterfaceDAO<T> {
    void save(T entity);
    void update(T entity);
    void remove(T entity);
    void merge(T entity);
    T getEntity(Serializable id);
    T getEntityDetachedCriteria(DetachedCriteria criteria);
    List<T> getEntities();
    List<T> getListByDetachedCriteria(DetachedCriteria criteria);
}
