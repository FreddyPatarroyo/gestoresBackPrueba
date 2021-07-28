package com.freddy.gestores.servicios;

import java.util.List;

import com.freddy.gestores.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente>findAll();
	
	public List<String>infoCliente();

}
