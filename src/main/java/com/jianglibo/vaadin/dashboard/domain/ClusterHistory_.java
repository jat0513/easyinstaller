package com.jianglibo.vaadin.dashboard.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-21T06:27:49.837+0800")
@StaticMetamodel(ClusterHistory.class)
public class ClusterHistory_ extends BaseEntity_ {
	public static volatile SingularAttribute<ClusterHistory, BoxGroup> boxGroup;
	public static volatile ListAttribute<ClusterHistory, BoxHistory> boxHistories;
	public static volatile SingularAttribute<ClusterHistory, Person> runner;
}