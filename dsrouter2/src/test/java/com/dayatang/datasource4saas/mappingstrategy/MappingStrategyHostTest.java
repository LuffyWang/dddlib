package com.dayatang.datasource4saas.mappingstrategy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.dayatang.datasource4saas.dscreator.TenantDbMappingStrategy;

public class MappingStrategyHostTest extends AbstractTenantDbMappingStrategyTest {

	@Before
	public void setUp() throws Exception {
		instance = TenantDbMappingStrategy.HOST;
	}


	@Override
	@Test
	public void testGetHost() {
		assertEquals("aaa", instance.getHost("a", "xyz", mappings));
	}

}