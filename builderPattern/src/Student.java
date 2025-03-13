public class Student {
    private String name;
    private int course;
    private boolean straightA;

    private Student(StudentBuilder studentBuilder) {
        name = studentBuilder.name;
        course = studentBuilder.course;
        straightA = studentBuilder.straightA;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public boolean isStraightA() {
        return straightA;
    }

    public static class StudentBuilder {
        private String name;
        private int course;
        private boolean straightA;


        public StudentBuilder(String name) {
            this.name = name;
        }


        public StudentBuilder setCourse(int course) {
            this.course = course;
            return this;
        }


        public StudentBuilder setStraightA(boolean straightA) {
            this.straightA = straightA;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}