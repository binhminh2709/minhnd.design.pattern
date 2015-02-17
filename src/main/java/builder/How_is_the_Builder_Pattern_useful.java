package builder;

import org.junit.Test;

public class How_is_the_Builder_Pattern_useful {
    /**
     * When you want to create an object that has many fields, using constructors can become
     * unwieldy and confusing. Imagine the following class definition,
     * which could possibly be used for a veterinarian’s database
     * */
    
    /**
     * Listing 6-1: Contructing objects with the Builder Partters
     * */
    @Test
    public void legalBuild() {
        final Pet.Builder builder = new Pet.Builder();
        final Pet pet = builder.withAnimal(Animal.CAT).withPetName("Squidge").withOwnerName("Simon Smith")
                .withAddress("123 High Street").withTelephone("07777777770").withEmailAddress("simon@email.com")
                .build();
        // test pass - no exception thrown
    }
}
