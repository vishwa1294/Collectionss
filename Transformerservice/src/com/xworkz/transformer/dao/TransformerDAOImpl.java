package com.xworkz.transformer.dao;
import java.util.Collection;
import java.util.HashSet;

import com.xworkz.transformer.dto.TransformerDTO;

public class TransformerDAOImpl  implements TransformerDAO{
	private Collection<TransformerDTO>collection=new HashSet<TransformerDTO>();
	@Override
	public boolean save(TransformerDTO dto) {
		return this.collection.add(dto);
	}

}



