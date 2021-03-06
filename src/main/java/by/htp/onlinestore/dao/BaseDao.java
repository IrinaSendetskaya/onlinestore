package by.htp.onlinestore.dao;

import java.util.List;

import by.htp.onlinestore.entity.Entity;

public interface BaseDao <T extends Entity>{
	
	void create(T entity);
	void update(T entity);
	void delete(T entity);
	T read (int id);
	List <T> readAll();               //все прочитать
	List<T> getAll(String where);   //по какому либо условию

}
