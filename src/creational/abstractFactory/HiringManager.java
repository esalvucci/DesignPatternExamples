package creational.abstractFactory;

/**
 * Functional Interface representing the Hiring Manager and modelling the factory method itself.
 */
@FunctionalInterface
public interface HiringManager {

    // Factory Method
    // It could be implemented through an abstract class instead of a Functional Interface
    /**
     * @return the interviewr.
     */
    Interviewer makeInterviewer();

    /**
     * Default method printing the questions asked to the attendant
     */
    default void takeInterview() {
        this.makeInterviewer().askQuestion();
    }

}
