package example;

public class Main {
    public static void main(String[] args) throws Exception {

//        PersonConverter personConverter = new PersonConverter();
//
//        Person person = new Person();
//        person.setName("John Smith");
//        person.setAge(24);
//
//        PersonDto personDto = personConverter.mapPersonDomainToPersonDto(person);
//
//        System.out.println("after mapping personDto = " + personDto);
        PersonConverter personConverter = new PersonConverter();

        PersonDto personDto = new PersonDto();
        personDto.setFullName("John Smith");
        personDto.setCurrentAge(24);

        Person person = personConverter.mapPersonDtoToPersonDomain(personDto);

        System.out.println("after mapping person = " + person);
    }
}
