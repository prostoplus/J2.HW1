public class Course {

    String name;

    Obstacle[] obstacles;

    public Course(String name, Obstacle... obstacles) {
        this.name = name;
        this.obstacles = obstacles;
    }

    public boolean resultOfCourse(Team team) {
        Competitor[] result = team.getAllSuccessfulParticipants(this.obstacles);

        return result.length > 1;
    }

}