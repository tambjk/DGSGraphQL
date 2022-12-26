package com.lbs.example.employeedirectory.queryspring.scalar;

import graphql.language.StringValue;
import graphql.scalars.ExtendedScalars;
import graphql.scalars.object.ObjectScalar;
import graphql.schema.Coercing;
import graphql.schema.CoercingParseLiteralException;
import graphql.schema.CoercingParseValueException;
import graphql.schema.CoercingSerializeException;
import graphql.schema.GraphQLScalarType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 * Created by Erman.Kaygusuzer on 27/10/2022
 */
@Configuration
public class DateScalarConfiguration {

	@Bean
	public GraphQLScalarType dateScalar() {
		return GraphQLScalarType.newScalar()
				.name("Date")
				.description("Java 8 LocalDate as scalar.")
				.coercing(new Coercing<Object, Object>() {
					@Override
					public String serialize(final Object dataFetcherResult) {
						if (dataFetcherResult instanceof LocalDate) {
							return dataFetcherResult.toString();
						} else {
							throw new CoercingSerializeException("Expected a LocalDate object.");
						}
					}

					@Override
					public LocalDate parseValue(final Object input) {
						try {
							if (input instanceof String) {
								return LocalDate.parse((String) input);
							} else {
								throw new CoercingParseValueException("Expected a String");
							}
						} catch (DateTimeParseException e) {
							throw new CoercingParseValueException(String.format("Not a valid date: '%s'.", input), e
							);
						}
					}

					@Override
					public LocalDate parseLiteral(final Object input) {
						if (input instanceof StringValue) {
							try {
								return LocalDate.parse(((StringValue) input).getValue());
							} catch (DateTimeParseException e) {
								throw new CoercingParseLiteralException(e);
							}
						} else {
							throw new CoercingParseLiteralException("Expected a StringValue.");
						}
					}
				}).build();
	}

	@Bean
	RuntimeWiringConfigurer configurer() {
		GraphQLScalarType scalarType = dateScalar();
		return (builder) -> builder.scalar(scalarType).scalar(ExtendedScalars.Object);
	}
}
