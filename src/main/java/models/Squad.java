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

}
