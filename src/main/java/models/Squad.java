package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Squad {
    //    private Hero mHero;
    private String mName;
    private String mCause;
    private int mMaxSize;
    private boolean mPublished;
    private int id;
    private LocalDateTime createdAt;
    private static ArrayList<Squad> mInstances = new ArrayList<Squad>();
    private static ArrayList<Hero> mHeroes = new ArrayList<Hero>();
    private List<Hero> squadHeroes = new ArrayList<>();

    public Squad(String name, String cause) {
        this.mName = name;
        this.mCause = cause;
        this.mMaxSize = 5;
        this.createdAt = LocalDateTime.now();
        this.mPublished = false;
        mInstances.add(this);
        this.id = mInstances.size();
    }
    public List<Hero> getSquadHeroes(){
        return this.squadHeroes;
    }

    public List<Hero> getHeroes(){
        return mHeroes;
    }

    public void setHeroes(Hero hero){
        mHeroes.add(hero);
    }

    public boolean getPublished(){
        return this.mPublished;
    }

    public boolean doesHeroExist(Hero hero){
        int counter = 0;
        for (Hero mHero : mHeroes) {
            if (mHero.getName().equals(hero.getName())) {
                counter++;
            }
        }

        return counter != 1;
    }


}
