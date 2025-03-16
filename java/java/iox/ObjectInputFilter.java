package java.iox;

public class ObjectInputFilter {
    public enum Status {
        /**
         * The status is undecided, not allowed and not rejected.
         */
        UNDECIDED,
        /**
         * The status is allowed.
         */
        ALLOWED,
        /**
         * The status is rejected.
         */
        REJECTED;
    }
}
