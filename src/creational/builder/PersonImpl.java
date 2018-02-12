package creational.builder;

/**
 * @author Enrico Salvucci, according to Mirko Viroli's example
 *
 */
public final class PersonImpl {

    /**
     * The name of the person.
     */
    private String name;

    /**
     * The surname of the person.
     */
    private String surname;

    /**
     * Boolean true if the perosn is married.
     */
    private boolean isMarried;

    /**
     * @param builder
     * private constructor of a person settings it's data.
     */
    private PersonImpl(final Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.isMarried = builder.married;
    }

    /**
     * Builder static class settings person data.
     */
    public static class Builder implements Person {

        /**
         * Person's name
         */
        private String name;

        /**
         * Person's surname
         */
        private String surname;

        /**
         * sets whether the person is married or not
         */
        private boolean married;

        /**
         * @return the builder itself
         */
        @Override
        public Builder setName(final String personName) {
            this.name = personName;
            return this;
        }

        /**
         * @return the Builder itself
         */
        @Override
        public Builder setSurname(final String personSurname) {
            this.surname = personSurname;
            return this;
        }

        /**
         * @return the Builder itself
         */
        @Override
        public Builder setMarried(final boolean isMarried) {
            this.married = isMarried;
            return this;
        }

    }

    /**
     * default toString.
     * @return Person's data as a String
     */
    public String toString() {
        return "Name: " + this.name
                + " Surname: " + this.surname
                + " - Is married? " + this.isMarried;
    }
}
