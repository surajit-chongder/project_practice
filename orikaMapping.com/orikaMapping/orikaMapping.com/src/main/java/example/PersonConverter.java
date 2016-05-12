package example;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class PersonConverter {
    private final static MapperFacade mapper;

    static {
        final MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.classMap(Person.class, PersonDto.class)
                .field("name", "fullName")
                .field("age", "currentAge")
                .byDefault()
                .register();
        mapper = mapperFactory.getMapperFacade();
    }

    public PersonDto mapPersonDomainToPersonDto(final Person person) {
        return mapper.map(person, PersonDto.class);
    }
    public Person mapPersonDtoToPersonDomain(final PersonDto personDto) {
        return mapper.map(personDto, Person.class);
    }
}