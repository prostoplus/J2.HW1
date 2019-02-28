public class Team {
    String name;
    Competitor[] participants;

    public Team(String name, Competitor... participants){
        this.name = name;
        this.participants = participants;
    }

    public void getAllParticipants(){
        for (Competitor a: this.participants){
            System.out.println(a.getName() + " | " + a.getType());
        }
    }

    public boolean getResultOfTest(Competitor a, Obstacle[] course){
        for (Obstacle o : course) {
            o.doIt(a);
            if (!a.isOnDistance()) return false;
        }
        return true;
    }

    public Competitor[] getAllSuccessfulParticipants(Obstacle[] course){
        Competitor[] result = new Competitor[this.participants.length];
        int i = 0;
        for (Competitor a: this.participants){
            if (this.getResultOfTest(a, course)){
                result[i] = a;
                i++;
            }
        }
        return  result;
    }

}