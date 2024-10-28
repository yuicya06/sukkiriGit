s

import java.util.*;

public class Main{
	


class Internship {
    int company;
    int start;
    int duration;

    Internship(int company, int start, int duration) {
        this.company = company;
        this.start = start;
        this.duration = duration;
    }
}

static class InternshipScheduler {

	public static int scheduleInternships(List<Internship> internships) {
        // 会社ごとにインターンをグループ化
        Map<Integer, List<Internship>> companyInternships = new HashMap<>();
        for (Internship internship : internships) {
            companyInternships.computeIfAbsent(internship.company, k -> new ArrayList<>()).add(internship);
        }

        Set<Integer> occupiedDays = new HashSet<>();
        int companiesApplied = 0;

        for (int company = 1; company <= companyInternships.size(); company++) {
            if (companyInternships.containsKey(company)) {
                boolean applied = false;
                for (Internship internship : companyInternships.get(company)) {
                    boolean canApply = true;
                    for (int day = internship.start; day < internship.start + internship.duration; day++) {
                        if (occupiedDays.contains(day)) {
                            canApply = false;
                            break;
                        }
                    }
                    if (canApply) {
                        for (int day = internship.start; day < internship.start + internship.duration; day++) {
                            occupiedDays.add(day);
                        }
                        applied = true;
                    }
                }
                if (applied) {
                    companiesApplied++;
                }
            }
        }

        return companiesApplied;
    }

    public static void main(String[] args) {
        List<Internship> internships = Arrays.asList(
            new Internship(1, 1, 2),
            new Internship(1, 6, 3),
            new Internship(2, 2, 2),
            new Internship(2, 5, 1),
            new Internship(3, 2, 7)
        );

        int result = scheduleInternships(internships);
        System.out.println("応募可能な会社数: " + result);
    }
}
}