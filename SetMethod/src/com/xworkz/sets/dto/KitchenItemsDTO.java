
package com.xworkz.sets.dto;

import java.io.Serializable;

public class KitchenItemsDTO implements Serializable {

	private String name;
	private int price;
	private String usedFor;
	private String madeOf;

	public KitchenItemsDTO() {
		super();
	}

	public KitchenItemsDTO(String name, int price, String usedFor, String madeOf) {
		super();
		this.name = name;
		this.price = price;
		this.usedFor = usedFor;
		this.madeOf = madeOf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getUsedFor() {
		return usedFor;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	public String getMadeOf() {
		return madeOf;
	}

	public void setMadeOf(String madeOf) {
		this.madeOf = madeOf;
	}

	@Override
	public String toString() {
		return "KitchenItems [name=" + name + ", price=" + price + ", usedFor=" + usedFor + ", madeOf=" + madeOf + "]";
	}

	@Override
	public int hashCode() {

		return 1000;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KitchenItemsDTO other = (KitchenItemsDTO) obj;
		if (madeOf == null) {
			if (other.madeOf != null)
				return false;
		} else if (!madeOf.equals(other.madeOf))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (usedFor == null) {
			if (other.usedFor != null)
				return false;
		} else if (!usedFor.equals(other.usedFor))
			return false;
		return true;
	}

}
