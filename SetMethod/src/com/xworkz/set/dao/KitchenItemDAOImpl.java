package com.xworkz.set.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.sets.dto.KitchenItemsDTO;

public class KitchenItemDAOImpl implements KitchenItemDAO {

	private List<KitchenItemsDTO> list = new ArrayList<KitchenItemsDTO>();

	@Override
	public boolean saveUnique(KitchenItemsDTO dto) {
		boolean added = list.add(dto);
		System.out.println("dto :" + dto);
		System.out.println("dto was added " + added);
		return added;
	}

	@Override
	public Collection<KitchenItemsDTO> findAllSortbyUsedFor() {
		Collection<KitchenItemsDTO> tempCollection = new ArrayList<KitchenItemsDTO>();
		Iterator<KitchenItemsDTO> allocation = this.list.iterator();
		while (allocation.hasNext()) {
			KitchenItemsDTO sortbyUsedFor = allocation.next();

			tempCollection.add(sortbyUsedFor);
		}
		return tempCollection;
	}

	@Override
	public Collection<KitchenItemsDTO> findAllSortbyUsedForDesc() {
			return null;
	}

	@Override
	public Collection<KitchenItemsDTO> findAllSortbyName() {
		Object temp;
		Collection.sort(temp);
		System.out.println("Sorted by name");
		for(int i=0; i<((Collection<KitchenItemsDTO>) temp).size();i++)
			System.out.println(((Object) temp).get(i));
		return temp;
	}

	@Override
	public Collection<KitchenItemsDTO> findAllSortbyPriceDesc() {
		
		return null;
	}

}
