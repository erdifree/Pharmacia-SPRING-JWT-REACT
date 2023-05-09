package it.ErdisonDosti.converter;

import java.util.List;

/**
 * Questa interfaccia firma i metodi dei converter parametrizzati dai tipi
 * Entity e DTO.
 * @param <Entity>
 * @param <DTO>
 * 
 * @see AbstractConverter
 */
public interface Converter<Entity,DTO> {

	public Entity toEntity(DTO dto);
	
	public DTO toDTO(Entity entity);
	
	public List<DTO> toDTOList(Iterable<Entity> entityList);
	
	public List<Entity> toEntityList(Iterable<DTO> dtoList);

}