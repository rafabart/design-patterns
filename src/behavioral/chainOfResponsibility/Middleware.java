package behavioral.chainOfResponsibility;

public abstract class Middleware {

    private Middleware next;

    public Middleware linkWith(final Middleware next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(final String email, final String password);

    protected boolean checkNext(final String email, final String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}
