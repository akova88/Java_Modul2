package Dsa_Stack_queue.queue.employer;

import java.util.Comparator;

public class DobComparator implements Comparator<Employer> {
    @Override
    public int compare(Employer e1, Employer e2) {
        return e1.getDOB().compareTo(e2.getDOB());
    }
}
