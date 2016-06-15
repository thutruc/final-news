package edu.news.dao;

import java.util.List;

import edu.news.dao.exception.DAOException;

public interface GeneralDAO<T, E> {

	public List<T> selectAll() throws DAOException;

	public T merge(T object) throws DAOException;

	public boolean update(T object) throws DAOException;

	public boolean delete(T object) throws DAOException;

	public T findById(E key) throws DAOException;

	public E save(T object) throws DAOException;
}

