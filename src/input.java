import java.util.*;

public class input {
    private LinkedHashSet<String> team_list;
    private ArrayList<String> roundList;
    public  Scanner scan= new Scanner(System.in);



    public input(){
        team_list = new LinkedHashSet<>();
        roundList = new ArrayList<>();
    }

    public LinkedHashSet<String> getTeam_list() {
        return team_list;
    }

    public void setTeam_list(LinkedHashSet<String> team_list) {
        this.team_list = team_list;
    }

    public void addElement(String element){
        team_list.add(element);
    }

    public void addElementRoundList(String elemnt){
        roundList.add(elemnt);
    }

    public ArrayList<String> getRoundList() {
        return roundList;
    }

    public void setRoundList(ArrayList<String> roundList) {
        this.roundList = roundList;
    }

    public void takimEkle(){

            System.out.println("how many teams do you enter?");
            int numberOfTeams = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter "+ numberOfTeams +" team name");

            for (int i = 0; i<numberOfTeams;i++){
              //  System.out.println("Enter team name");
                String addTeam = scan.nextLine().trim();
// aynı isim girmeme kontrolü
                while (team_list.contains(addTeam) || addTeam.isEmpty()){
                    System.out.println("you enter same name again please try new name!"+i+" name left");
                    addTeam = scan.nextLine();
                }
                addElement(addTeam);
            }
    }

    public void printTeams(){
        for (String i: team_list){
            System.out.println(i);
        }
    }

    public void run(){
        takimEkle();
        printTeams();
    }

    public int randomNumber(){
        Random rndm = new Random();
        return rndm.nextInt(0,team_list.size());
    }
public  void randomMatchArray(){
int last = getTeam_list().size();


}







}
