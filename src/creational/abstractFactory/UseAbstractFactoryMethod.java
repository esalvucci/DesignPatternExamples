package creational.abstractFactory;

/**
 *  @author Enrico Salvucci
 *  Utility class to test Abstract Factory Method.
 *  Example from https://github.com/kamranahmedse
 *  /design-patterns-for-humans#-abstract-factory
 */
public final class UseAbstractFactoryMethod {

    /**
     * Default empty private constructor.
     */
    private UseAbstractFactoryMethod() {

    }

    /**
     *
     * @param args .
     */
    public static void main(final String... args) {

        HiringManager devManager = () -> (Interviewer) ()
                -> System.out.println("Asking about Design Patterns");

        /*
            Alternatively, without lambdas

            HiringManager devManager = new HiringManager() {
            @Override
            public Interviewer makeInterviewer() {
                return new Interviewer() {
                    @Override
                    public void askQuestion() {
                        System.out.println("Asking about Design Patterns");
                    }
                };
            }
        };*/

    }
}
