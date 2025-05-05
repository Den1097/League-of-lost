// import java.time.LocalDate;

public class Champion {
    static int number; 
    String Name;
    Role Role;
    int Difficulty;
    String Lane;
    // LocalDate releaseDate;
    
    public Champion(String name, Role role, int difficulty, String lane){
            number++;
            Name = name;
            Role = role;
            Difficulty = difficulty;
            Lane = lane;
    }

    public void setName(String name) {
        Name = name;
    }
    public void setDifficulty(int difficulty) {
        Difficulty = difficulty;
    }
    public void setLane(String lane) {
        Lane = lane;
    }
    public void setRole(Role role) {
        Role = role;
    }
    public int getDifficulty() {
        return Difficulty;
    }
    public String getLane() {
        return Lane;
    }
    public String getName() {
        return Name;
    }
    public Role getRole() {
        return Role;
    }
    public static int getNumber() {
        return number;
    }
}
