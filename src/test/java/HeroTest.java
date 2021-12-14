import models.Hero;

import java.util.ArrayList;

public class HeroTest {
    private String mName;
    private int mAge;
    private int id;
    private String mSpecialPower;
    private String mWeakness;
    private boolean mPublished;
    private String mSquadMembership;

    public static ArrayList<Hero> mInstances = new ArrayList<Hero>();

    public Hero(String name, int age, String specialPower, String weakness, String squadMembership) {
        this.mName = name;
        this.mAge = age;
        this.mSpecialPower = specialPower;
        this.mWeakness = weakness;
        this.mPublished = false;
        this.mSquadMembership = squadMembership;

        mInstances.add(this);
        this.id = mInstances.size();
    }
}
