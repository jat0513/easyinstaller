package com.jianglibo.vaadin.dashboard.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.jianglibo.vaadin.dashboard.annotation.VaadinGrid;
import com.jianglibo.vaadin.dashboard.annotation.VaadinTable;
import com.vaadin.ui.themes.ValoTheme;

@SuppressWarnings("serial")
@Entity
@Table(name = "cluster_history")
@VaadinTable(multiSelect = true, footerVisible = true, messagePrefix = "domain.custer_history.", styleNames = {
		ValoTheme.TABLE_BORDERLESS, ValoTheme.TABLE_NO_HORIZONTAL_LINES,
		ValoTheme.TABLE_COMPACT }, selectable = true, fullSize = true)
@VaadinGrid(multiSelect = true, messagePrefix = "domain.custer_history.", footerVisible = true, styleNames = {
		ValoTheme.TABLE_BORDERLESS, ValoTheme.TABLE_NO_HORIZONTAL_LINES,
		ValoTheme.TABLE_COMPACT }, selectable = true, fullSize = true)
public class ClusterHistory extends BaseEntity {

	@ManyToOne
	private BoxGroup boxGroup;

	@OneToMany(mappedBy = "clusterHistory")
	private List<BoxHistory> boxHistories;
	
	
	@ManyToOne
	@NotNull
	private Person runner;

	public BoxGroup getBoxGroup() {
		return boxGroup;
	}

	public void setBoxGroup(BoxGroup boxGroup) {
		this.boxGroup = boxGroup;
	}

	public List<BoxHistory> getBoxHistories() {
		return boxHistories;
	}

	public void setBoxHistories(List<BoxHistory> boxHistories) {
		this.boxHistories = boxHistories;
	}

	public Person getRunner() {
		return runner;
	}

	public void setRunner(Person runner) {
		this.runner = runner;
	}

	@Override
	public String getDisplayName() {
		return null;
	}

}