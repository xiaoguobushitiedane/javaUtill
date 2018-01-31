package com.utill.sort;

public class NumBer {

	private String name;
	private int rank;
	
	
	public NumBer(String name, int rank) {
		super();
		this.name = name;
		this.rank = rank;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the rank
	 */
	public int getRank() {
		return rank;
	}
	/**
	 * @param rank the rank to set
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NumBer [name=" + name + ", rank=" + rank + "]";
	}
	
	
}
