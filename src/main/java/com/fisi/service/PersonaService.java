package com.fisi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisi.interfaceService.IPersonaService;
import com.fisi.interfaces.IPersona;
import com.fisi.modelo.Persona;

@Service
public class PersonaService implements IPersonaService {
	
	@Autowired
	private IPersona data;

	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {
		// TODO Auto-generated method stub
		
		return data.findById(id);
	}

	@Override
	public int save(Persona p) {
		// TODO Auto-generated method stub
		int res=0;
		Persona persona= data.save(p);
		if (!persona.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
