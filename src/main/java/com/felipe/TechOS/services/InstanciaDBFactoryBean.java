package com.felipe.TechOS.services;

import org.springframework.beans.factory.FactoryBean;

public class InstanciaDBFactoryBean {

	public class InstanciaDBFactoryBeanImpl implements FactoryBean<Void> {

		private final DBService dbService;

		public InstanciaDBFactoryBeanImpl(DBService dbService) {
			this.dbService = dbService;
		}

		public Void getObject() throws Exception {
			dbService.instanciaDB();
			return null;
		}

		public Class<?> getObjectType() {
			return Void.class;
		}
	}
}
