import behaviours.IReviewed;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed>parks;

    public ThemePark(){
        this.parks=new ArrayList<>();
    }

    public int parkCount(){
        return parks.size();
    }

    public void add(IReviewed park){
        parks.add(park);
    }

    public void clearAll(){
        parks.clear();
    }

}
