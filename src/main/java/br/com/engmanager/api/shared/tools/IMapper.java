package br.com.engmanager.api.shared.tools;

import br.com.engmanager.api.shared.tools.exception.MapperException;

public interface IMapper <E, D> {

	public E fromDtoToEntity(D dto) throws MapperException;
	public D fromEntityToDto(E entidade) throws MapperException;

}