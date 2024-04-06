package br.com.sgci.controller.schema;

import java.util.List;

public class ResponsePagedCommom<T> {
	private List<T> data;
	private Long totalRecords;
	private int totalPages;
	private int pageSize;

	public ResponsePagedCommom(List<T> data, Long totalRecords, int totalPages, int pageSize) {
		this.data = data;
		this.totalRecords = totalRecords;
		this.totalPages = totalPages;
		this.pageSize = pageSize;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public Long getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(Long totalRecords) {
		this.totalRecords = totalRecords;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
