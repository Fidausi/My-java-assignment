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
            if (courseScore >= 70 && courseScore <= 100) return 5;
            else if (courseScore >= 60 && courseScore <= 69) return 4;
            else if (courseScore >= 50 && courseScore <= 59) return 3;
            else if (courseScore >= 45 && courseScore <= 49) return 2;
            else if (courseScore >= 40 && courseScore <= 44) return 1;
            else return 0; // Fail
        }
    
        public String calculateGrade() {
            if (courseScore >= 70 && courseScore <= 100) return "A";
            else if (courseScore >= 60 && courseScore <= 69) return "B";
            else if (courseScore >= 50 && courseScore <= 59) return "C";
            else if (courseScore >= 45 && courseScore <= 49) return "D";
            else if (courseScore >= 40 && courseScore <= 44) return "E";
            else return "F"; // Fail
        }
    
        public int calculateGradeUnit() {
            return calculateGradePoint();
        }
    }

