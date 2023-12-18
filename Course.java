package MyAssignment;

   class Course {
    private String courseName;
    private String courseCode;
    private int courseUnit;
    private int courseScore;

    public Course(String courseName, String courseCode, int courseUnit, int courseScore) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseUnit = courseUnit;
        this.courseScore = courseScore;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getCourseUnit() {
        return courseUnit;
    }

    public int getCourseScore() {
        return courseScore;
    }

    public int calculateGradePoint() {
        if (isInRange(courseScore, 70, 100)) return 5;
        else if (isInRange(courseScore, 60, 69)) return 4;
        else if (isInRange(courseScore, 50, 59)) return 3;
        else if (isInRange(courseScore, 45, 49)) return 2;
        else if (isInRange(courseScore, 40, 44)) return 1;
        else return 0; // Fail
    }

    public String calculateGrade() {
        if (isInRange(courseScore, 70, 100)) return "A";
        else if (isInRange(courseScore, 60, 69)) return "B";
        else if (isInRange(courseScore, 50, 59)) return "C";
        else if (isInRange(courseScore, 45, 49)) return "D";
        else if (isInRange(courseScore, 40, 44)) return "E";
        else return "F"; // Fail
    }

    public int calculateGradeUnit() {
        return calculateGradePoint();
    }

    private boolean isInRange(int value, int lower, int upper) {
        return value >= lower && value <= upper;
    }
}
