package Dsa_Stack_queue.queue.employer;

import java.util.*;

public class Demerging {
    public static void main(String[] args) {
        Employer[] employerList = new Employer[10];
        employerList[0] = new Employer("Nguyen van A",true,"12/12/1988");
        employerList[1] = new Employer("Nguyen thi B",false,"15/12/1989");
        employerList[2] = new Employer("Nguyen van C",true,"12/12/1983");
        employerList[3] = new Employer("Nguyen thi D",false,"12/12/1991");
        employerList[4] = new Employer("Nguyen van E",true,"12/12/1997");
        employerList[5] = new Employer("Nguyen thi F",false,"12/12/1981");
        employerList[6] = new Employer("Nguyen van G",true,"12/12/1980");
        employerList[7] = new Employer("Nguyen thi H",false,"12/12/1989");
        employerList[8] = new Employer("Nguyen van K",true,"12/12/2000");
        employerList[9] = new Employer("Nguyen van L",true,"12/12/1995");
        DobComparator comparator = new DobComparator();
        Arrays.sort(employerList,comparator);
        showEmploy(employerList);

        Queue<Employer> maleList = new LinkedList<>();
        Queue<Employer> femaleList = new LinkedList<>();

        for (Employer employer : employerList) {
            if (employer.isMale()) {
                maleList.add(employer);
            } else femaleList.add(employer);
        }
        Queue<Employer> outputFile = new LinkedList<>();
        while (!femaleList.isEmpty()) {
            outputFile.add(femaleList.remove());
        }
        while (!maleList.isEmpty()) {
            outputFile.add(maleList.remove());
        }
        System.out.println(outputFile);
    }
    public static void showEmploy(Employer[] employerList) {
        for (Employer employer : employerList) {
            System.out.println(employer);
        }
    }

}
