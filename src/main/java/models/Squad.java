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

}
