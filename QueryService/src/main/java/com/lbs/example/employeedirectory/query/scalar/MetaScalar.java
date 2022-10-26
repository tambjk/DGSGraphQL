package com.lbs.example.employeedirectory.query.scalar;

import com.lbs.example.employeedirectory.domain.query.employee.CustomFieldQDto;
import com.netflix.graphql.dgs.DgsScalar;
import graphql.schema.Coercing;
import graphql.schema.CoercingParseLiteralException;
import graphql.schema.CoercingParseValueException;
import graphql.schema.CoercingSerializeException;

/**
 * Created by Erman.Kaygusuzer on 25/10/2022
 */

@DgsScalar(name = "Meta")
public class MetaScalar implements Coercing<CustomFieldQDto, String> {

	@Override
	public String serialize(Object o) throws CoercingSerializeException {
		return null;
	}

	@Override
	public CustomFieldQDto parseValue(Object o) throws CoercingParseValueException {
		return null;
	}

	@Override
	public CustomFieldQDto parseLiteral(Object o) throws CoercingParseLiteralException {
		return null;
	}
}
