
package com.xworkz.set.dao;
import java.util.Collection;

import com.xworkz.sets.dto.KitchenItemsDTO;

public interface KitchenItemDAO {
	
	
	boolean saveUnique(KitchenItemsDTO dto);
	Collection<KitchenItemsDTO> findAllSortbyUsedFor();
	Collection<KitchenItemsDTO> findAllSortbyUsedForDesc();
	Collection<KitchenItemsDTO> findAllSortbyName();
	Collection<KitchenItemsDTO> findAllSortbyPriceDesc();

}
