
package com.xworkz.games.dao;
import java.util.Collection;
import java.util.HashSet;
import com.xworkz.games.dto.GameDTO;
public class GameDAOImpl implements GameDAO {
	
	
	private Collection<GameDTO>collection=new HashSet<GameDTO>();
	@Override
	public boolean save(GameDTO dto) {
		return this.collection.add(dto);
	}

}
