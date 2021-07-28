package com.freddy.gestores.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.freddy.gestores.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, String> {
	@Query(value="SELECT CONCAT(PRIMER_NOMBRE,' ',SEGUNDO_NOMBRE, ' ', PRIMER_APELLIDO, ' ', SEGUNDO_APELLIDO) FROM  GCCOBRANZAS.COB_GESTOR cg", nativeQuery=true)
	public List<String> infoCliente();
}