import java.util.ArrayList;

public class MagazineLibrary {
    private ArrayList<Magazine> magazines;

    public MagazineLibrary(){
        this.magazines=new ArrayList<>(); 
    }

    public Magazine getMagazines(int index) {
        return new Magazine(this.magazines.get(index));
    }

    public void setMagazines(Magazine magazine,int index) {
        this.magazines.set(index, new Magazine(magazine));
    }

    public void addMagazine(Magazine m1){
        this.magazines.add(new Magazine(m1));
    }

}
